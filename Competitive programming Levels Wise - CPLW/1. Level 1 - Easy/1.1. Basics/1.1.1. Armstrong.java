package q3341;
public class CTJ3341 {
    public static String checkArmstrong(int num) {
        String numStr = Integer.toString(num);
        int numDigits = numStr.length();
        int armstrongSum = 0;
        for (char digit : numStr.toCharArray()) {
            armstrongSum += Math.pow(Character.getNumericValue(digit), numDigits);
        }
        if (armstrongSum == num) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.println(checkArmstrong(num));
    }
}
