package datatypes;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers:");
        int ioe = scanner.nextInt();

        if ( ioe % 2 == 0 ){
            System.out.println("Even Number");
            System.out.println("Bye");
        }else {
            System.out.println("Odd Number");
            System.out.println("Bye");
        }


    }
}
