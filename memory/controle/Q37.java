package controle;
//Write a java program that accepts three numbers from the user and check if numbers are in "increasing" or "decreasing" order
public class Q37 {
    public static void main(String[] args) {
        int a = 45;
        int b = 46;
        int c = 56;
        if(a<b&&b<c)
        {
            System.out.println("numbers are in increasing order");
        }
        else if(a>b&&b>c)
        {
            System.out.println("numbers are in decreasing order");
        }
        else
        {
            System.out.println("not in increasing order and not in decreasing order ");
        }
    }
}
