package controle;
/*Write a program to check whether a triangle is valid or not, when the three angles of 
the triangle are entered through the keyboard. A triangle is valid if the sum of all the three 
angles is equal to 180 degrees */
public class Q30 {
    public static void main(String[] args) {
        int a = 50;
        int b = 40;
        int c = 60;
        int sum = a + b + c;
        if(sum==180)
        {
            System.out.println("tringle is valid");
        }
        else
        {
            System.out.println("tringle is not valid");
        }
    }
}
