public class icrimet {
public static void main(String[] args) 
   {
   // int x = 2;
  //  System.out.println(x++);
  //System.out.println(x);
     int x= 5;
     int y= 6;
     //int sum = x++ + x + y++ + y 
    //int sum = x + x + x++ + y +  y++ ;
    int sum = x + y++ + y + x + (x++ + x )+ y++ + y;  
    System.out.println(sum);   
    }
    
}
