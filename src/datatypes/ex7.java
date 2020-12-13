package datatypes;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers:");
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();

        if (i1 > i2 && i1 >i3) {
            System.out.println(i1);
        }
        else if (i2 > i1 && i2 > i3) {
            System.out.println(i2);
        }
        else {
            System.out.println(i3);
        }


    }
}
