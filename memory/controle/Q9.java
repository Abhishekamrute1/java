package controle;

import java.util.Scanner;

//write a program to input any alphabet and chack wethwr it is vowel or consonant
public class Q9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter alphabet");
            char c = sc.next().charAt(1);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                System.out.println("it is a vowel");
            }
            else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                System.out.println("it is a vowel");
            }
            else
            {
                System.out.println("ti si a consonant");
            }
     //  String a =c=='A'||c=='E'||c=='I'||c=='O'||c=='U' ?"it is a vowel" :c=='a'||c=='e'||c=='i'||c=='o'||c=='u' ?"it is a vowel" :"ti si a consonant";
            //System.out.println(a);
        }
    }
}
