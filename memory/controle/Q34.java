package controle;
/*A library charges a fine for every book returned late. For first 5 days the fine is 50 
paise, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees. If you return the 
book after 30 days your membership will be cancelled. Write a program to accept the 
number of days the member is late to return the book and display the fine or the 
appropriate message */
public class Q34 {
    public static void main(String[] args) {
         int days = 31;
         float fine = 0;
         if(days>0 && days<=5)
         {
           fine = 0.50f*days;
         }
         else if(days>=6&&days<=10)
         {
            fine = 1*days;
         }
         else if(days>10)
         {
            if(days>30)
            {
                 System.out.println("you mambership is cancelled");
            }
            fine = 5*days;         
         }
         System.out.println("your fine is ="+fine);
    }
}
