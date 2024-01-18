package pattern.stars;

import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {
            int n =as.nextInt();
      for(int r=1;r<=n;r+=2)
      {
             for(int c=1;c<=r;c+=2){
             if(r%2!=0){
                System.out.print(" "+r); 
             }
             
      }
      System.out.println();
        }
    }
    
    
}
}
