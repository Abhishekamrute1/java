package pattern.stars;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            int a=sq.nextInt();
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("* ");
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
