package homework;

public class ClassAndObject {
    static int a = 20;
    char s = 'A';
    int out(){
        System.out.println(s);
        return a;
    }
    public static void main(String[] args) {
        ClassAndObject d = new ClassAndObject();
        System.out.println(d.out());
        ClassAndObject.A f = d.new A();
        System.out.println(A.g);
        System.out.println(f.sum());
        ClassAndObject.A.B g = f.new B();
        g.show();
        C h =new C();
        System.out.println(C.j);
        h.print();
        C.D i = h.new D();
        System.out.println(C.D.k);
        i.pri();
    }
    class A {
        static float g =30.2f;
        double h = 20.33;
        double sum(){
             double ans;
             ans = g+h;
            return ans;
        }
        class B {
            String h ="abhishek";
            void show(){
                System.out.println(h);
            }
        }
    }
}
class C {
    static long j = 2;
    void print(){
        System.out.println("i am C");
    }
    class D{
      static String k = "khushi";
      void pri(){
        System.out.println("i am D");
      }
}
}