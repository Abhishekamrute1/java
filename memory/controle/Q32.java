package controle;
/*Given the length and breadth of a rectangle, write a program to find whether the area 
of the rectangle is greater than its perimeter. For example, the area of the rectangle with 
length = 5 and breadth = 4 area is greater than its perimeter */
public class Q32 {
    public static void main(String[] args) {
        int l = 5;
        int b = 4;
        int pera = 2 * (l+b);
        int area = l*b;
        if(area<pera)
        {
            System.out.println("perimeter is greater than area");
        }
        else
        {
            System.out.println("area is greater than perimeter");
        }
    }
}
