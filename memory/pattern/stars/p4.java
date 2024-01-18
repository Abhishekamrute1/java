package pattern.stars;

import java.util.Scanner;

public abstract class p4{
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            int a = sq.nextInt();
            for(int r=0;r<a;r++){
               for(int c =0;c<a;c++){
                if(r==0||r==a-1||c==0||c==a-1){
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
