import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers you want to add: ");
        int num1 = scanner.nextInt();

        //System.out.println("Enter 2nd number: ");
        int num2 = scanner.nextInt();

        int sum = add(num1, num2);

        System.out.println(sum);

        scanner.close();
    }//end main

    public static int add(int num1, int num2)
    {
        return num1 + num2;
    }
}//end class