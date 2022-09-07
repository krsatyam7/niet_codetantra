package q10886;

class Factorial{
        public static void main(String[] args){
                int result = 1;
                for (int i = Integer.parseInt(args[0]); i > 1; i--){
                        result *= i;
                }

                // System.out.println("Cmd Args : " + args[0]);
                System.out.println("Factorial of " + args[0] + " is "+ result);
        }
}
