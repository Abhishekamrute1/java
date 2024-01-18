package controle;

import java.util.Scanner;

// write a program to check wether a number is negetive ,positive or zero
public class Q4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter number");
            int a = sc.nextInt();
      /* if(a>0)
            {
                System.out.println("posetivr no.");
            }
            else if(a==0)
            {
                System.out.println("zero");
            }
            else
            {
                System.out.println("negetive no");
            }*/
            String c= a>0?"posetivr no." :a==0 ?"zero" :"negetive no";
            System.out.println(c);
        }
    }
    
}
