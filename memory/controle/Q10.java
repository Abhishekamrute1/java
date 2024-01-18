package controle;

import java.util.Scanner;

// write a program to input any charector and check whether it is alphabet , digit or special charecter
public class Q10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter charector");
            char a =sc.next().charAt(1);
            if(a>='a'&&a<='z')
            {
                System.out.println("ti is a alphabet");
            }
            else if(a>='A'&&a<='Z')
            {
                System.out.println("ti is a alphabet");
            }
            else if(a>='0'&&a<='9')
            {
                System.out.println("it is a digit");
            }
            else 
            {
                System.out.println("it is a special charecter");
            }
      // String c= a>='a'&&a<='z'? "ti is a alphabet":a>='A'&&a<='Z' ?"ti is a alphabet":a>='0'&&a<='9'?"it is a digit" :"it is a special charecter";
            //System.out.println(c);
        }
    }
}
