package homework;

public class object2 {
    static void add()
    {
        System.out.println("add");
    }
    void abhi()
    {
        System.out.println("abhi");
    }
    public static void main(String[] args) {
        object2 a = new object2();
         add();
        a.abhi();
      object2. am b = a.new am();
     object2.am.c x = b.new c();
      H d = new H();
      x.sum();
      H.k e = d.new k();
      e.sum();
      System.out.println(d.k);

    }
    class am
    {
       class c {
             void sum(){
                System.out.println("a+b");
             }
       }
    }
}
class H{
    int k = 2;
    class k {
          void sum(){
                System.out.println("a+b");
    }
}
}