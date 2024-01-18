package controle;

import java.util.Scanner;

//write a program to finde maximum between three numbers
public class Q3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter ther number");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
      /*  if (a>b && a>c)
            {
                System.out.println(a+" is greter then "+b+c);
            }
            else if(b>a && b>c)
            {
                System.out.println(b +" is greter than"+a+c);
            }
            else
            {
                System.out.println(c+"is greter than"+a +b);
            }*/
            String d = a>b && a>c?"a is greter then b ad c" :b>a && b>c?"b is greter than a and c" :"c is greter than a and b";
            System.out.println(d);
        }
    }
}
