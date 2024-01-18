package prectice;

public class object3 {
class num
{
    int x = 23;
    int y = 20;
    int add()
    {
        int sum;
        sum = x + y;
        return sum;
    }
}  
public static void main(String[] args) {
    object3 A = new object3();
    object3.num B= A.new num();
   int x = B.add();
   System.out.println(x);
   charector C = new charector();
   C.swap();
}  
}
class charector
{
    char a = 'N';
    char b = 'S';
    void swap()
    {
        char c ;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}