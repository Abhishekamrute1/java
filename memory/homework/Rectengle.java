package homework;

public class Rectengle 
{
 int area_of_rectangle(int x, int y) 
 {
    int ans = x*y;
    return ans;
 }  
 int perameter_of_rectangle(int x, int y)
 {
    int valu = 2*(x+y);
    return valu;
 }
 public static void main(String[] args) 
 {
  Rectengle a =new Rectengle();
  int  b = a.area_of_rectangle(5, 4);
 int c = a.perameter_of_rectangle(5,4 );
 System.out.println(b);
 System.out.println(c);

 }
}
