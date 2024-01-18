package controle;

import java.util.Scanner;

// Write a program to count total number of notes in given amount
public class Q14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter amount");
            int a = sc.nextInt();
            int note500 = 0,note200 = 0,note100 = 0,note50 = 0 ,note20 = 0,note10 = 0;
            if(a>=10)
            {
                if(a>=500)
                {
                    note500= a/500;
                    a = a -(note500*500);
                }
                if(a>=200)
                {
                    note200= a/200;
                    a = a -(note200*200);
                }
                if(a>=100)
                {
                    note100 = a/100;
                    a = a -(note100*100);
                }
                if(a>=50)
                {
                    note50= a/50;
                    a= a-(note50*50);
                }
                if(a>=20)
                {
                    note20 = a/20;
                    a = a- ( note20*20);
                }
                if(a>=10)
                {
                    note10= a/10;
                    a= a- (note10*10);
                }
                System.out.println("totel note is =");
                System.out.println("500 = "+note500);
                System.out.println("200 ="+note200);
                System.out.println("100 ="+note100);
                System.out.println("50 ="+note50);
                System.out.println("20 ="+note20);
                System.out.println("10 ="+note10);
            }
            else
            {
                System.out.println("enter the amount abow 10");
            }
        }
    }
}
