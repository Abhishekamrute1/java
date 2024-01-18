package pattern.stars;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            int a = sq.nextInt();
            for(int i=0;i<a;i++){
                for(int c=0;c<i;c++){
                  System.out.print(" ");
                }
                for(int c=i;c<a;c++){
                  System.out.print(" *");
                }
                System.out.println();
              }
                for(int r =0;r<a;r++)
                {
                  for(int c =0;c<a-r;c++)
                  {
                      System.out.print(" ");
                  }
                  for(int c =0;c<=r;c++)
                  {
                      System.out.print("* ");
                  }
                  System.out.println();
              }
        }
    }
    
}
