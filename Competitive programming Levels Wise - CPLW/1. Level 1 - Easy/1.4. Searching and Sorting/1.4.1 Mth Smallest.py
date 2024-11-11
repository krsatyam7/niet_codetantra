import sys

Arr = [int(x) for x in sys.argv[1].split(',')]
M = int(sys.argv[2])
def MthSmallestElement(Arr, M):
    Arr.sort()
    return Arr[M-1]
print(MthSmallestElement(Arr, M))
