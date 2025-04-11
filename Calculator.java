import java.util.Scanner;

public class Calculator {
    public static int addition(int a, int b){
        return a+b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = addition(a, b);
        System.out.println("The sum is: " + sum);

    }
}
