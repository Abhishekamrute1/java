package controle;
/*Write a program to calculate the salary as per the following table
Gender Year of Service Qualifications Salary
Male  >= 10   Post - Graduate 15000
      >= 10          Graduate 10000
      < 10    Post - Graduate 10000
      < 10           Graduate 7000
Female >= 10  Post - Graduate 12000
       >= 10         Graduate 9000
       < 10   Post - Graduate 10000
       < 10          Graduate 6000 */
public class Q28 {
    public static void main(String[] args) {
        int wfc = 9;
        char sex = 'f';
        char qua = 'G';
        if(sex=='m'&&wfc>=10&&qua>='p'||sex=='M'&&wfc>=10&&qua=='P')
        {
            System.out.println("salary is 15000");
        }
        else if(sex=='m'&&wfc>=10&&qua=='g'||sex=='M'&&wfc>=10&&qua=='G')
        {
              System.out.println("salary is 10000");
        }
        else if(sex=='m'&&wfc<10&&qua>='p'||sex=='M'&&wfc<10&&qua=='P')
        {
             System.out.println("salary is 10000");
        }
         else if(sex=='m'&&wfc<10&&qua=='g'||sex=='M'&&wfc<10&&qua=='G')
         {
            System.out.println("salary is 7000");
         }
         else if(sex=='f'&&wfc>=10&&qua>='p'||sex=='F'&&wfc>=10&&qua=='P')
         {
            System.out.println("salary is 12000");
         }
        else if(sex=='f'&&wfc>=10&&qua=='g'||sex=='F'&&wfc>=10&&qua=='G')
        {
              System.out.println("salary is 9000");
        }
        else if(sex=='f'&&wfc<10&&qua>='p'||sex=='F'&&wfc<10&&qua=='P')
        {
             System.out.println("salary is 10000");
        }
          else 
         {
            System.out.println("salary is 6000");
         }
    }
}
