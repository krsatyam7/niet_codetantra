#include <stdio.h>
#include <stdlib.h>

#define NUM_QUEUES 3
#define QUANTUM_0 8
#define QUANTUM_1 16
#define QUANTUM_2 32

typedef struct Process {
    int pid;
    int arrival_time;
    int burst_time;
    int remaining_time;
    int waiting_time;
    int last_ready_time;
    int completion_time;
} Process;

typedef struct Node {
    Process *process;
    struct Node *next;
} Node;

typedef struct Queue {
    Node *front;
    Node *rear;
} Queue;

void init_queue(Queue *q) {
    q->front = q->rear = NULL;
}

int is_empty(Queue *q) {
    return q->front == NULL;
}

void enqueue(Queue *q, Process *p) {
    Node *new_node = malloc(sizeof(Node));
    new_node->process = p;
    new_node->next = NULL;

    if (is_empty(q)) {
        q->front = q->rear = new_node;
    } else {
        q->rear->next = new_node;
        q->rear = new_node;
    }
}

Process *dequeue(Queue *q) {
    if (is_empty(q)) return NULL;

    Node *temp = q->front;
    Process *p = temp->process;
    q->front = temp->next;

    if (q->front == NULL) {
        q->rear = NULL;
    }

    free(temp);
    return p;
}

int all_queues_empty(Queue *queues, int num_queues) {
    for (int i = 0; i < num_queues; i++) {
        if (!is_empty(&queues[i])) {
            return 0;
        }
    }
    return 1;
}

void add_arrivals(int current_time, int *index, Process *processes, int n, Queue *queues) {
    while (*index < n && processes[*index].arrival_time <= current_time) {
        Process *p = &processes[*index];
        p->remaining_time = p->burst_time;
        p->waiting_time = 0;
        p->last_ready_time = p->arrival_time;
        enqueue(&queues[0], p);
        (*index)++;
    }
}

int compare_arrival(const void *a, const void *b) {
    const Process *p1 = (const Process *)a;
    const Process *p2 = (const Process *)b;
    return p1->arrival_time - p2->arrival_time;
}

int main() {
    int n;
    printf("Enter number of processes: ");
    scanf("%d", &n);

    Process *processes = malloc(n * sizeof(Process));

    for (int i = 0; i < n; i++) {
        processes[i].pid = i + 1;
        printf("Enter arrival time and burst time for process %d: ", i + 1);
        scanf("%d %d", &processes[i].arrival_time, &processes[i].burst_time);
    }

    qsort(processes, n, sizeof(Process), compare_arrival);

    Queue queues[NUM_QUEUES];
    for (int i = 0; i < NUM_QUEUES; i++) {
        init_queue(&queues[i]);
    }

    int quantum[NUM_QUEUES] = {QUANTUM_0, QUANTUM_1, QUANTUM_2};
    int current_time = 0, index = 0;

    add_arrivals(current_time, &index, processes, n, queues);

    while (index < n || !all_queues_empty(queues, NUM_QUEUES)) {
        add_arrivals(current_time, &index, processes, n, queues);

        if (all_queues_empty(queues, NUM_QUEUES)) {
            current_time = processes[index].arrival_time;
            continue;
        }

        int q_index;
        for (q_index = 0; q_index < NUM_QUEUES; q_index++) {
            if (!is_empty(&queues[q_index])) break;
        }

        Process *p = dequeue(&queues[q_index]);
        p->waiting_time += (current_time - p->last_ready_time);

        int time_slice = (p->remaining_time < quantum[q_index])
                             ? p->remaining_time
                             : quantum[q_index];

        int next_arrival = -1;
        if (index < n && processes[index].arrival_time < current_time + time_slice) {
            next_arrival = processes[index].arrival_time;
        }

        if (next_arrival != -1) {
            int run_time = next_arrival - current_time;
            p->remaining_time -= run_time;
            current_time = next_arrival;
            enqueue(&queues[q_index], p);
            p->last_ready_time = current_time;
        } else {
            current_time += time_slice;
            p->remaining_time -= time_slice;

            if (p->remaining_time == 0) {
                p->completion_time = current_time;
            } else {
                if (q_index < NUM_QUEUES - 1) {
                    enqueue(&queues[q_index + 1], p);
                } else {
                    enqueue(&queues[q_index], p);
                }
                p->last_ready_time = current_time;
            }
        }
    }

    float total_waiting = 0, total_turnaround = 0;

    printf("PID→Arrival\tBurst\tWaiting\tCompletion\tTurnaround\n");
    for (int i = 0; i < n; i++) {
        int turnaround = processes[i].completion_time - processes[i].arrival_time;
        total_waiting += processes[i].waiting_time;
        total_turnaround += turnaround;

        printf("%d\t%d\t%d\t%d\t%d\t%d\n",
               processes[i].pid,
               processes[i].arrival_time,
               processes[i].burst_time,
               processes[i].waiting_time,
               processes[i].completion_time,
               turnaround);
    }

    printf("Average Waiting Time: %.2f\n", total_waiting / n);
    printf("Average Turnaround Time: %.2f\n", total_turnaround / n);

    free(processes);
    return 0;
}
