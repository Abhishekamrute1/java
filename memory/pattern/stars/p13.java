package pattern.stars;
import java.util.Scanner;
public class p13 {
    public static void main(String[] args) {
     try (Scanner sq = new Scanner(System.in)) {
        int a = sq.nextInt();
        for(int r=1;r<=a;r++){
            for(int c=1;c<=a;c++){
            if(r==1||r==a||c==1||c==a){
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
