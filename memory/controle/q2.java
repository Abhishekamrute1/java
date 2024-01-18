package controle;

import java.util.Scanner;

//write a program to find maximum between two numbers
public class q2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter tow nombers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b)
            {
                System.out.println(a+"is maximum to"+b);
            }
            else if(a<b)
            {
                System.out.println(b+"is maximum to"+a);
            }
            else
            {
                System.out.println("bothe are equal");
            }
            String c = a>b?a+"is maximum to"+b :a<b?b+"is maximum to"+a :a+" equal to"+b;
            System.out.println(c);
        }
    }
}
