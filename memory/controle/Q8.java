package controle;

import java.util.Scanner;

// write a program to check wether a character is alphabet or not
public class Q8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the charecter");
            char a = sc.next().charAt(1);
            if(a>='A' && a<='Z')
            {
                System.out.println("is a alphabet");
            }
            else if(a>='a' && a<='z')
            {
                System.out.println("is a alphabet");
            }
            else
            {
                System.out.println("not a alphabet");
            }
      // String c=a>='A' && a<='Z' ? "is a alphabet": a>='a' && a<='z'? "is a alphabet": "not a alphabet";
      // System.out.println(c);
        }
       }
}
