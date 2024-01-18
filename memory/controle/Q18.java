package controle;
//Write a program to find all roots of a quadratic equation
public class Q18 {
    public static void main(String[] args) {
        int a = 20;
        int b =30;
        int c = 10;
       double discriminamt = 0 , root1 ,root2;
       discriminamt =b*b-4*a*c;
       if(discriminamt>0)
       {
        root1 = (-b + Math.sqrt(discriminamt))/(2*a);
        root2 = (-b - Math.sqrt(discriminamt))/(2*a);
        System.out.println("root1 = "+root1+" and root2 = "+root2);
       }
       else if(discriminamt==0)
       {
        root1=root2= -b / (2*a);
        System.out.println("root1= root2= "+root1);
       }
       else
       {
         double real = -b/(2*a);
         double imaginary = Math.sqrt(-discriminamt)/(2*a);
         System.out.println("root1= "+real +imaginary);
         System.out.println("root2= "+ real+imaginary);
       }
    }
}
