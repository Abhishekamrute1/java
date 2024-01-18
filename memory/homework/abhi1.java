package homework;

public class abhi1 
{
    int tichers , student;
    abhi1(int a,int b)
    {
        tichers = a;
        student =b;
    } 
  
    void class1(abhi1 s)
    {
        System.out.println("tichers in class1 ="+s.tichers);
        System.out.println("student in class1 ="+s.student);
    }
   public static void main(String[] args)
  {
       abhi1 a = new abhi1(2, 50);
       abhi s = new abhi(200,5000);
       a.class1(a);
       s.college(s);   
   }
}
 
 class abhi
    {
        int tichers,student;
        abhi(int x,int y)
        {
            tichers=x;
            student = y;
        }
        void college(abhi c)
        {
            System.out.println("in the college we have total strenth of tichers is ="+c.tichers);
            System.out.println("in the college we have total strenth of students is ="+c.student);
        }    
}
