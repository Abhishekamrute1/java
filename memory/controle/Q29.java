package controle;
/*. If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to 
determine the youngest of the three */
public class Q29 {
    public static void main(String[] args)
 {
    int rage= 25;
    int sage = 26;
    int  aage= 22;
    if(rage<sage&&rage<aage)
    {
        System.out.println("ram is youngest");
    }
    else if(sage<rage&&sage<aage)
   {
       System.out.println("shyam is youngest");
   }
else
   {
     System.out.println("ajay is youngest");
   }   
 }
}
