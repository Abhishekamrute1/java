package homework;

public class mpnagar 
{
//     public static void main(String[] args) 
//     {
//      mpnagar b = new mpnagar();
//      zone1 a = b.new zone1();
//      System.out.println(a.x); 
//     }
// class zone1
//   {
//     String x = "manohar";
//   }
public static void main(String[] args) 
{
 ashis a = new ashis();
 System.out.println(ashis.x);
 ashis.x = 40;
 System.out.println(a.y);
 System.out.println(ashis.x);
 a.y = 50;
 System.out.println(a.y);   
}

}
class ashis
{
  static int x = 90;
  int y = 60;
}

