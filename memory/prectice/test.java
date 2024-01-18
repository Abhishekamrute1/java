package prectice;

public class test {
    public static void main(String[] args) {
        test s = new test();
        test.A d= s.new A();
        test.A.c f = d.new c();
        System.out.println(d.j);
        d.j = 40;
        System.out.println(d.j);
        double x = f.abhi();
        System.out.println(x);
        D q =new D();
        System.out.println(q.h);
        D.E v = q.new E();
        D.E.W X = v.new W();
        X.print();
    }
    class A{
        int j = 90;
        
            class c {
                     double abhi()
                     {
                        int h = 67;
                        System.out.println(h);
                       // abhi();
                        return 90.9;
                     }
            }
    }
}
class D{
    float h =90.958f;
    class E{
        class W {
            void print()
            {
                System.out.println("a+b");
            } 
        }
    }
}
