package datatypes;

import java.util.Scanner;

public class datatypesdemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature via F:");

        int input = scanner.nextInt();
        int cel = (input - 32) * 5 / 9 ;
        System.out.println(cel);

    }
}

