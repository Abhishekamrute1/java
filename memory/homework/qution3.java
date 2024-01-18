package homework;

public class qution3 
{
 public static void main(String[] args) {
   // creating a local variabalm a (a is treagles base) and b (b is treagles height)
    int a=3;
    int b =5;
    //creating a object 
    qution3 c = new qution3();
    //colling a function and pasing the valu
    c.area_of_treagle(a, b);
 }  
 // creating the non statik peramitraide function
 void area_of_treagle(int x,int y)
 {
    float ans = (float) (x*y)/2;
    System.out.println(ans);
 } 
}
