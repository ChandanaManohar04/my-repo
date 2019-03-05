import java.util.Scanner;

public class FibonacciNum {
    public static void main(String args[]) {

        int prev = 0;
        int curr = 1;
        int next = 0;
        int no = 0;

        Scanner sc = new Scanner(System.in);

        fibNum(sc, prev, curr, next, no);
    }

    public static int fibNum(Scanner sc, int prev, int curr, int next, int no) {
        prev = 0;
        curr = 1;
        next = 0;
        no = 0;

        System.out.println("Please enter the number ");
        no = sc.nextInt();
        if(no>30)
        {
            System.out.println("ENTER THE NUMBER WITHIN 30");
            return 0;
        }

        int[] farr = new int[no];
        farr[0] = prev;
        farr[1] = curr;

        int count = 2;
        while (count < no) {
            next = prev + curr;
            farr[count] = next;
            count++;

            prev = curr;
            curr = next;

        }
        System.out.println("You entered" + " " + no + " " + "as Input");
        for (int i : farr) {
            System.out.printf("%d ", +i);

        }

        System.out.println();
        System.out.println("Do you want to continue the series?");
        Scanner sp = new Scanner(System.in);
        String s = sp.next();
        System.out.println();
        if (s.equals("yes")) {
            return fibNum(sc, prev, curr, next, no);

        } else
            return 0;


    }


}

