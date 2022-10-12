package q24216;

public class StringBuilderDemo {

  public static void main(String args[]) {
    String s = new String("AB");
    System.out.print("In Strings before concatenation Hash Code is: ");
    System.out.println(s.hashCode());
    s += "C";
    System.out.println(
      "In Strings after concatenation Hash Code is: " + s.hashCode()
    );
    StringBuilder sb = new StringBuilder("AB");
    // print hash code before concatenating
    System.out.println(
      "In StringBuilder before concatenation Hash Code is: " + sb.hashCode()
    );
    // add string C to AB
    sb.append("C");
    // print hash code after concatenating
    System.out.println(
      "In StringBuilder after concatenation Hash Code is: " + sb.hashCode()
    );
    // and observe the output

  }
}
