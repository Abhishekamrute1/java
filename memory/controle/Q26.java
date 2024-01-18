package controle;
/*The marks obtained by a student in 5 different subjects are input through the 
keyboard. The student gets a division as per the following rules: Write a program to 
calculate the division obtained by the student
• Percentage above or equal to 60 - First division
• Percentage between 50 and 59 - Second division
• Percentage between 40 and 49 - Third division
• Percentage less than 40 – Fail */
public class Q26 {
    public static void main(String[] args) {
        float maths = 86.6f;
        float physics = 67.5f;
        float cemistry = 85.6f;
        float hindi = 70.0f;
        float english = 86.0f;
        float per = (maths +physics +cemistry+ hindi+ english)/5.0f;
         System.out.println("your percentage is ="+per);
         if(per>=60)
         {
            System.out.println("frist division");
         }
         else if(per>=50&&per<=59)
         {
            System.out.println("second division");
         }
         else if(per>=40&&per<=49)
         {
            System.out.println("third division");
         }
         else
         {
            System.out.println("fail");
         }
    }
}
