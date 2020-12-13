package loopsarrays;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter inches:");
        double input1 = scanner.nextDouble();
        double met = input1 * 0.0254 ;
        System.out.print(met);
    }


}
