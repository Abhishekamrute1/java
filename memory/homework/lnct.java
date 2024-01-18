package homework;

public class lnct 
{
   static int totall_s = 5000;
    int total_tichers = 200;
  class main1
  {
    static int totall_s = 2000;
    int total_tichers = 100;
    void cs()
    {
      String hod = "mehta sir";
      System.out.println("lnct main1 cs hod is ="+hod);
    }
    void ec()
    {
      String hod = "neha mame";
      System.out.println("lnct main1 ec hod is ="+hod);
    }
  } 
  class excilenc
  {
     static int totall_s = 3000;
     int total_tichers = 100;
     void cs()
     {
      String hod  = "narendra sir";
       System.out.println("lnct excilenc cs hod is ="+hod);
     }
      void ec()
    {
      String hod = "sarma sir";
       System.out.println("lnct excilenc ec hod is ="+hod);
    }
  } 
public static void main(String[] args) 
  {
     lnct a = new lnct();
     main1 b = a.new main1();
     excilenc f = a. new excilenc();
     System.out.println(b.total_tichers);
     System.out.println(main1.totall_s);
     System.out.println(f.total_tichers);
     System.out.println(excilenc.totall_s);
     jnct c = new jnct();
    jnct. main1 d = c.new main1();
    jnct.excilenc e = c. new excilenc();
    System.out.println(d.total_tichers);
    System.out.println(jnct.main1.totall_s);
    System.out.println(c.total_tichers);
    System.out.println(jnct.main1.totall_s);
    d.cs();
    d.ec();
    e.cs();
    e.ec();
    b.cs();
    b.ec();
    f.cs();
    f.ec();
  }
}
class jnct
{
static int totall_s = 3000;
  int total_tichers = 150;
    class main1
    {
      static int totall_s = 1000;
       int total_tichers = 50;
       void cs()
       {
        String hod = "mahima mame";
        System.out.println("jnct main1 cs hod is ="+hod);
       }
       void ec()
       {
        String hod = "mahendra sir";
        System.out.println("jnct main1 ec hod is ="+hod);
       }
    }
    class excilenc
    {
      static int totall_s = 2000;
       int total_tichers = 100;
        void cs()
       {
        String hod = "sukla sir";
        System.out.println("jnct excilenc cs hod is ="+hod);
       }
       void ec()
       {
        String hod = "tripathi sir";
        System.out.println("jnct excilenc ec hod is ="+hod);
       }
    }
}
