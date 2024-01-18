package pattern.stars;

public class rectangle {
    public static void main(String[] args) {
        int n =5;
        int a=1;
       for(int r=0;r<n;r++)
       {
         for(int c=0;c<=a;c++)
        {
            System.out.print(" *");
        }
        System.out.println();
        a++;
       }
    }
    
}
