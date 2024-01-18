package pattern.stars;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            int a = sq.nextInt();
            for(int i=0;i<a-1;i++){
                for(int c=0;c<=i;c++){
                    System.out.print(" *");
                }
                for(int c=i;c<a-2;c++){
                    System.out.print("  ");
                }
                for(int c =i;c<a-1;c++){
                    System.out.print("  ");
                }
                 for(int c=0;c<=i;c++){
                    System.out.print(" *");
                }
                System.out.println();
            }
            for(int i=0;i<a;i++)
            {
                for(int c=i;c<a;c++){
                    System.out.print(" *");
                }
                for(int c=0;c<i;c++){
                    System.out.print("  ");
                }
                 for(int c=0;c<i-1;c++){
                    System.out.print("  ");
                }
                for(int c=i;c<a;c++){
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
    }
}
