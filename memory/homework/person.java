package homework;

public class person 
{
 String name;
 int age;
 person(String x, int y)
 {
    name = x;
    age = y;
 }   
 public static void main(String[] args) 
 {
   person a =new person("ram", 20);
   person b= new person("rvi",30);
   person c= new person("svita", 30);
   System.out.println(a.name +"\n" +a.age);
   System.out.println(b.name + "\n" +b.age);
   System.out.println(c.name + "\n"+c.age);
 }
}
