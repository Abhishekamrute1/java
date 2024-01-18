package controle;

import java.util.Scanner;

// write a program to check wether a number is even or odd
public class Q6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            int a = sc.nextInt();
      /* if(a%2==0)
            {
                System.out.println("number is even");
            }
            else{
                System.out.println("number is odd");
            }*/
            String c =a%2==0 ? "number is even":"number is odd";
            System.out.println(c);
        }
    }
    
}
