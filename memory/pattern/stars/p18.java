package pattern.stars;
import java.util.Scanner;

public class p18 {
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            int a =sq.nextInt();
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<a;j++)
                {
                    if(j==i||j==a-1-i)
                    {
                        System.out.print(" *");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
