package q11117;
public class Box {
        float l, b, h;
        // Declare variables
        public Box(float l, float b, float h) {
                this.l = l;
                this.b = b;
                this.h = h;
        }
        public float volume() {
                return l*b*h;
        }
        public int compare(Box b) {
                if(volume() > b.volume()) return 1;
                else if(volume() == b.volume()) return 0;
                else return 2;
        }
        public static void main(String args[]) {
                int flag;
                Box box1 = new Box(Float.parseFloat(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2]));
                Box box2 = new Box(Float.parseFloat(args[3]), Float.parseFloat(args[4]), Float.parseFloat(args[5]));
                flag = box1.compare(box2);
                if (flag == 1)
                        System.out.println("box1 is larger than box2");
                else if (flag == 0)
                        System.out.println("box1 is same size as box2");
                else
                        System.out.println("box1 is smaller than box2");
        }
}
