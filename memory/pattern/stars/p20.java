package pattern.stars;
import java.util.Scanner;
public class p20 {
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            int a=sq.nextInt();
            for(int i=1;i<=a;i+=2)
            {
                for(int j=1;j<=i;j+=2)
                if(i%2!=0)
                {
                    System.out.print(" "+i);
                }
                System.out.println();
            }
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<a-i-1;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    }

