package datatypes;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");



        if (scanner.hasNextDouble()) {
            double mek = scanner.nextDouble();
            System.out.println("Please enter operator:");
            char oprt = scanner.next().charAt(0);
            System.out.println("Please enter second number:");
            double erku = scanner.nextDouble();

            if (erku == 0) {
                System.out.println("You can't divide number to 0");
            } else {
                switch (oprt) {
                    case '+':
                        System.out.println(mek + erku);
                        break;
                    case '-':
                        System.out.println(mek - erku);
                        break;
                    case '*':
                        System.out.println(mek * erku);
                        break;
                    case '/':
                        System.out.println(mek / erku);
                        break;
                    default:
                        System.out.println("please write an operator + - / or *");
                        break;
                }
            }
        }else {
            System.out.println("invalid input");
        }

        }

}
