package homework;

public class Q4 
{
    int virat,gill;
    Q4(int a, int s)
    {
      virat = a;
      gill = s;
    }
  void india(Q4 india)
  {
    System.out.println("virat kohli "+ india.virat);
    System.out.println("shubhman gile "+india.gill);
  }   
 

  public static void main(String[] args) {
    Q4 india = new Q4(88, 92);
    Q5 shrilanka =  new Q5(5,1);
    india.india(india);
    shrilanka.shrilanka(shrilanka);
  }
}
 class Q5 {
    int shami,boomra;
    Q5(int x , int y)
    {
        shami = x;
        boomra = y;
    }
     void shrilanka(Q5 shrilaka)
  {
    System.out.println("mohamad shami vikets "+shrilaka.shami);
    System.out.println("boomra viket "+shrilaka.boomra);
  }

    
}
