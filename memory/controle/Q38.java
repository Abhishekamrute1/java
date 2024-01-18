package controle;

import java.util.Scanner;

// Write a Java program to create a simple calculator
public class Q38 {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
          System.out.println("enter two no ");
          int a= sc.nextInt();
          int b= sc.nextInt();
          System.out.println(" opretion key to (addition) + the no. enter 1");
          System.out.println(" (subtraction) - the no. enter 2");
          System.out.println("(multipication) * the no. enter 3 ");
          System.out.println("(Division) / no to enter 4 ");
          System.out.println("(modulo or remainder)% the no. enter 5");
          int c=sc.nextInt();
          if(c==1)
          System.out.println("anser is ="+(a+b));
          else if(c==2)
           System.out.println("anser is ="+(a-b));
          else if(c==3)
            System.out.println("anser is ="+(a*b));
          else if(c==4)
            System.out.println("anser is ="+(a/b));
          else if(c==5)
            System.out.println("anser is ="+(a%b));
          else
          System.out.println("enter a wrong opretion key");
        }
    }
}
