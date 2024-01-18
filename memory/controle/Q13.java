package controle;

import java.util.Scanner;

// . Write a program to input month number and print month Name
public class Q13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter month number");
            int a = sc.nextInt();
            if (a<=12 && a>=1)
            {
                if(a==1)
                    System.out.println("january");
                else if(a==2)
                    System.out.println("february");
                else if(a==3)
                System.out.println("march");
                else if(a==4)
                System.out.println("april");
                else if(a==5)
                System.out.println("may");
                else if(a==6)
                System.out.println("june");
                else if(a==7)
                System.out.println("july");
                else if(a==8)
                System.out.println("august");
                else if(a==9)
                System.out.println("september");
                else if(a==10)
                System.out.println("october");
                else if(a==11)
                System.out.println("november");
                else
                System.out.println("december");
            }
            else
            System.out.println("inveled input");
      // String c=a<=12 && a>=1 ?a==1 ? "january":a==2 ? "february":a==3 ? "march":a==4 ?"april" :a==5 ?"may" :a==6?"june" :a==7?"july" :a==8 ?"august" : a==9?"september" :a==10 ?"october" :a==11 ?"november" : "december":"inveled input";
      // System.out.println(c);
        }
    }
}
