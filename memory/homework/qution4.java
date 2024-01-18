package homework;

public class qution4
{
    int age ;
    String name;
    float per;
    qution4(int x, String y, float z)
    {
        age = x;
        name =y;
        per = z;
    }
    public static void main(String[] args) 
    {
       qution4 abhi = new qution4(21,"abhishek", 70.5f);
      abhi.disply(abhi);
    }  
    void disply(qution4 ram)
    {
        System.out.println(ram.age);
        System.out.println(ram.name);
        System.out.println(ram.per);
    }
}
