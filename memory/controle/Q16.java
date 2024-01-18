package controle;
//Write a program to input all sides of a triangle and check whether triangle is valid or not
public class Q16 {
    public static void main(String[] args) {
        int a = 25;
        int b = 36;
        int c = 25;
     if((a+b)>c&&(b+c)>a&&(a+c)>b)
     {
        System.out.println("triangle is valid");
     }
     else{
        System.out.println("triangle is not valid");
     }
    // String d= (a+b)>c&&(b+c)>a&&(a+c)>b ?"triangle is valid" :"triangle is not valid";
   //  System.out.println(d);
    }
    
}
