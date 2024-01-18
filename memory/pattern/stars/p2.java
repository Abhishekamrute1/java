package pattern.stars;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            int n = sq.nextInt();
            for(int r =0;r<n;r++)
            {
                for(int c =0;c<n-r;c++)
                {
                     System.out.print("* ");
                }
                System.out.println();
            }
    }
        }
    
}
