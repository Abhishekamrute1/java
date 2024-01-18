package pattern.stars;
import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            int n=sq.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==(n/2)||j==(n/2)){
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
