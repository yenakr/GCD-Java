import java.io.*;
import java.util.Scanner;

public class GCD {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Write 1st integer: ");
        int one = scanner.nextInt();

        System.out.print("Write 2nd integer: ");
        int two = scanner.nextInt();

        int result = hcf(one, two);
        System.out.println("GCD: " + result);

        scanner.close();
  }

  public static int hcf(int n1, int n2) {
      if (n2 != 0) return hcf(n2, n1 % n2);
      else return n1;
  }
}
