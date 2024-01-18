package controle;
// Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
public class Q17 {
public static void main(String[] args) {
    int a = 25; 
    int b = 22;
    int c = 21;
    if(a==b&&b==c&&c==a)
    {
        System.out.println("triangle is equilaterel");
    }
    else if(a==b||b==c||c==a)
    {
        System.out.println("triangle is isosceles");
    }
    else
    {
        System.out.println("triangle is scalene");
    }
   // String d =a==b&&b==c&&c==a ? "triangle is equilaterel"  :a==b||b==c||c==a?"triangle is isosceles" :"triangle is scalene";
   // System.out.println(d);
}    
}
