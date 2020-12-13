package datatypes;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        int input3 = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(input3 * i);
        }


    }

}

