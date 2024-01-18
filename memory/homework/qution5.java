package homework;

public class qution5 
{
 String name;
 int age;
 char gender;
 String colleg_name;
 qution5(String x,int y, char z,String a)
 {
    name = x;
    age = y;
    gender = z;
    colleg_name = a;
 }   
 public static void main(String[] args) 
 {
   qution5 abhi = new qution5("abhishek", 21, 'M', "J.H. college");  
   abhi.disply(abhi);
   qution5 ram =new qution5("ram",20 , 'm', "LNCT");
   abhi.disply(ram);
 }
 void disply(qution5 sara)
 {
    System.out.println(sara.name);
    System.out.println(sara.age);
    System.err.println(sara.gender);
    System.out.println(sara.colleg_name);
 }
}
