package homework;

public class qution2 
{
 public static void main(String[] args) {
    // creat a local variabal 
    int x = 5;
    //creating a object 
    qution2 b = new qution2();
     // calling non static function and pasing the valu
     b.valum_of_cube(x);

 } 
 //creatin non statik peramitraisd function 
 void valum_of_cube(int a)
 {
    //calculeting valum
    int ans = a*a*a;
    //print the output
    System.out.println("volume of cube="+ans);
} 
 
}
