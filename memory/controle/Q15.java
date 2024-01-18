package controle;
// Write a program to input angles of a triangle and check whether triangle is valid or not
public class Q15 {
public static void main(String[] args) {
    int a =50;
    int b = 0;
    int c = 80;
    int sum = a+b+c;
    if(a>0 && b>0 && c>0)
    {
       if(sum==180)
       {
        System.out.println("triangle is valid");
       }
       else{
        System.out.println("triangle is not valid");
       }
    }
    else 
    {
        System.out.println("enter a angeles abow 0");
    }
   // String d =a>0 && b>0 && c>0 ?sum==180 ?"triangle is valid" :"triangle is not valid" :"enter a angeles abow 0";
   // System.out.println(d);
}    
}
