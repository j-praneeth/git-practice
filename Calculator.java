import java.util.Scanner;

public class Calculator {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }

    public static int prod(int a,int b){
        return a*b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
    public static int mod(int a, int b) {
        return a % b;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a & b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a, b);
        int diff=sub(a,b);
        int prod = prod(a,b);
        int div = div(a,b);
        int mod = mod(a,b);
        System.out.println("The sum is:"+sum);
        System.out.println("The diff is:"+diff);
        System.out.println("The product is: "+prod);
        System.out.println("The division is: "+div);
        System.out.println("The mod is:"+mod);


    }
}
