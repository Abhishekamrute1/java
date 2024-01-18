import java.util.Scanner;

public class a2 {
    //how to take daynamic input

    public static void main(String[] args) {
        try (Scanner sq = new Scanner(System.in)) {
            System.out.println("enter the size of array");
            int size = sq.nextInt();
            // creating of empty array object
            String[] arr=new String[size];
            //input elements insize on array
            for(int i = 0;i<size;i++){
                System.err.println("enter the elements:");
                sq.nextLine();
                arr[i]=sq.nextLine();
            }
            //display array elements
            for(String a : arr){
                System.out.println(a);
            }
        }
    }
}
