package prectice;

public class STUDENT 
{
  java.lang.String name;
  int roll_no;
  STUDENT(java.lang.String string ,int b)
  {
    name = string;
    roll_no = b;
  }   
  public static void main(String[] args) 
  {
    STUDENT s = new STUDENT("john", 2);
    System.out.println("name of student is = "+s.name);
    System.out.println("roll no of student is = "+s.roll_no); 
  }
}
