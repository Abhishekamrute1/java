package prectice;

public class pan 
{
 java.lang.String pan_name;
 int pan_pric;
  void pan1(java.lang.String string,int y)
  {
    pan_name = string;
    pan_pric =y;
  }
  void out1(pan c)
  {
    System.out.println("name of pan = "+c.pan_name);
    System.out.println("pan pric is = "+c.pan_pric);
  }
  public static void main(String[] args) 
  {
   pan a= new pan();
   a.pan1("goldex", 10);
   car b = new car();
   b.cars("TARE", 1800000);         
   a.out1(a);
   b.out(b);
  }
}
class car
{
    java.lang.String cars_name;
    int cars_pric;
    void cars(java.lang.String string, int y)
    {
        cars_name =string;
        cars_pric = y;
    }
    void out(car d)
    {
        System.out.println("cars name = "+d.cars_name);
        System.out.println("cars pric is = "+d.cars_pric);
    }
}
