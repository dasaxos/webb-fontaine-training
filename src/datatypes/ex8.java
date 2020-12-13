package datatypes;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers:");
        float f1 = scanner.nextFloat();

        if (f1 == 0) {
            System.out.println(0);
        } else if (f1 < 1 && f1 > 0 ) {
            System.out.println("small");
        }else if (f1 < 0) {
            System.out.println("negative");
        }else if (f1 > 0 && f1 < 1000000){
            System.out.println("positive");
        }else {
            System.out.println("large");
        }

    }
}
