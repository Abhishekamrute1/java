package prectice;

public class MemoryAlocation {
    public static void main(String[] args) {
        int w = 30;
        System.out.println(w);
        a q = new a();
        System.out.println(a.s);
        int e = q.out();
        System.out.println(e);
        a.b r = q.new b();
        int t = r.d;
        System.out.println(t);
        r.print();
        c x = new c();
       // x.sum();
        System.out.println(x.sum());
    }
}
class a{
    static int s =50;
    int out(){
        System.out.println("i am out");
        return 20;
    }
   class b{
    int d= 20;
    void  print(){
        System.out.println("i am abhi");
    }
   } 
}
class c{
    int sum(){
        System.out.println("a+b");
        return 0;
    }
}