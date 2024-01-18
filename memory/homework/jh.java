package homework;

public class jh 
{
   class science
   {
     static int students =  1000;
     int tichers = 50;
     void bsc()
     {
      
     } 
     void msc()
     {

     }
   }   
  class art 
  {
    static int student = 700;
    int tichers = 50;
    void ba()
    {
      
    }
    void ma()
    {

    }
  }
  public static void main(String[] args) 
  {
    jh a = new jh();
    science b = a. new science();
    art c = a. new art();
    VVM d = new VVM();
   VVM.science e = d.new science();
   VVM.comers f = d.new comers();
   System.out.println(b.tichers);
   System.out.println(science.students);
   System.out.println(c.tichers);
   System.out.println(art.student);
   System.out.println(e.tichers);
   System.out.println(VVM.science.student);
   System.out.println(f.tichers);
   System.out.println(VVM.comers.student);
  }
}
class VVM
{
  class science 
  {
    static int student = 600;
    int tichers = 30;
    void bsc()
    {

    }
    void msc()
    {

    }
  }
  class comers
  {
    static int student = 400;
    int tichers = 20;
    void bcom()
    {

    }
  }
}
