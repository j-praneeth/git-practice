import java.util.Scanner;

public class Calculator {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a & b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a, b);
        int diff=sub(a,b);
        System.out.println("The sum is:"+sum);
        System.out.println("The difference is:"diff);


    }
}
