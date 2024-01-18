package controle;

import java.util.Scanner;

//write a program to check whether a character is uppercase or lowercase alphabet
public class Q11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("enter charector");
            char a = sc.next().charAt(1);
            if(a>='A'&&a<='Z')
            {
                System.out.println("it is uppercase alphabet");
            }
            else if(a>='a'&&a<='z')
            {
                System.out.println("it is lowercase alphabet");
            }
            else 
            {
                System.out.println(" not a alphabet");
            }
            //String c= a>='A'&&a<='Z'?"it is uppercase alphabet" :a>='a'&&a<='z'?"it is lowercase alphabet" :" not a alphabet";
      // System.out.println(c);
        }
    }
}
