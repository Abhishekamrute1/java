package prectice;

public class crecet 
{
 int virat,gill;
 crecet()
 {

 }
 crecet(int x,int y)
 {
    virat= x;
    gill =y;
 }
 void indid()
 {
    crecet india = new crecet(88, 92);
    System.out.println("virats run ="+india.virat);
    System.out.println("gills run = "+india.gill);
 }
 public static void main(String[] args)
{
    crecet a = new crecet();
    a.indid();
    crecet1.shrilanka();
}
    
}
class crecet1 
{
  int boomra,shami;
  crecet1(int x,int y)
  {
    boomra= x;
    shami = y;
  }
   static void shrilanka()
  {
    crecet1 shrilanka = new crecet1(1, 5);
    System.out.println("boomras vikets =" +shrilanka.boomra);
    System.out.println("shamis vikets ="+shrilanka.shami);
  }
    
}