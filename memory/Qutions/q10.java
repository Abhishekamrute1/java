package Qutions;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter two no ");
            int a= sc.nextInt();
            int b= sc.nextInt();
            System.out.println(" opretion key to (addition) + no. enter +"+" (subtraction) - the no. enter -"+ "(multipication) * the no. enter * "+"(Division) / no to enter / "+ "(modulo or remainder)% the no. enter %");
            char c=sc.next().charAt(1);
            switch(c){
                case '+': System.out.println(a+b);
                break;
                case '-': System.out.println(a-b);
                break;
                case '*': System.out.println(a*b);
                break;
                case '/': System.out.println(a/b);
                break;
                case '%': System.out.println(a%b);
                break;
                default : System.out.println("enter a wrong opretion key");
            }
        }
    }
}
