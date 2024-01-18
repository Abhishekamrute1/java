package pattern.stars;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {
            int n =as.nextInt();
      for(int r=1;r<=n;r++)
      {
             for(int c=1;c<=r;c++)
            {
                System.out.print(" *");
            }
            System.out.println();
      }
        }
    }
}
