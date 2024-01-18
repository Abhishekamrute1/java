package pattern.stars;

import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
          int a=sq.nextInt();
           for(int r=0;r<a;r++)
                  {
                    for(int c =0;c<a-r;c++)
                    {
                        System.out.print(" ");
                    }
                    for(int c=0;c<=r;c++)
                    {
                      // System.out.print("* ");
                      if(c==r||r==a-1||c==0){
                        System.out.print("* ");
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
