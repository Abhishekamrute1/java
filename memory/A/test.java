package A;

import java.util.Scanner;

public class test 
{
    public static void main(String[] args) {
      try (Scanner sq = new Scanner(System.in)) {
        int a = sq.nextInt();
        for(int r =0 ; r<a ; r++){
          for(int c=0 ; c<a ; c++){
            if(c==(a/2)||r==(a/2)||(r==0&&c>a/2)||(c==0&&r<a/2)||(c==a-1&&r>a/2)||(r==a-1&&c<a/2)){
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

