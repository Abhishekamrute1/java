package controle;
/*. Write a program to input marks of five subjects Physics, Chemistry, Biology, 
Mathematics and Computer. Calculate percentage and grade according to following:
• Percentage >= 90% : Grade A
• Percentage >= 80% : Grade B
• Percentage >= 70% : Grade C
• Percentage >= 60% : Grade D
• Percentage >= 40% : Grade E
• Percentage < 40% : Grade F*/
public class Q20 {
    public static void main(String[] args) {
        float p = 80.5f;
        float c = 65.2f;
        float b = 75.3f;
        float ma = 85.6f;
        float co = 75.8f;
        float per = (p + c + b + ma + co)/5;
        if(per>40)
        {
          System.out.println("your gret is");
          if(per>=90)
          {
              System.out.println("A");
          }
          else if(per>=80)
          {
              System.out.println("B");
          }
          else if(per>=70)
          {
              System.out.println("C");
          }
          else if(per>= 60)
          {
              System.out.println("D");
          }
          else
          {
            System.out.println("E");
          }
        }
        else
        {
          System.out.println("you are fall");
        }
    }
}
