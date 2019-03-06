import java.util.Scanner;

public class Factorial {

    public static int fact(int n) {

        int result = 1;

        if (n == 1)
            return 1;

        while (n > 1) {
            result = result * (n);
            n--;

        }

        return result;
}


    public static void main(String args[]) {
        int n = 0;
        int result = 0;

        System.out.println("Enter the value of number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        result = fact(n);
        System.out.println(result);

    }
}

