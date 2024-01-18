package pattern.stars;

import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            int a = sq.nextInt();
            for(int r=1;r<=a;r++)
              {
                for(int c=0;c<a-r;c++)
                {
                    System.out.print("  ");
                }
                for(int c=1;c<=r;c++)
                {
                    System.out.print(" "+r);
                }
                for(int c=1;c<=r-1;c++)
                {
                    System.out.print(" "+r);
                }
                System.out.println();
            }
        }
    }
}
