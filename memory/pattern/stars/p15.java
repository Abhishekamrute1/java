package pattern.stars;

import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            int a =sq.nextInt();
            for(int r=0;r<a;r++)
            {
                for(int c=0;c<a-r;c++)
                {
                     System.out.print("  ");
                }
                for(int c=0;c<=r;c++)
                {
                    if(c==0||r==a-1||c==r){
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
