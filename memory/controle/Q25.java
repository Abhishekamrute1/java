package controle;
/*. If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of 
basic salary. If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 
98% of basic salary. If the employee's salary is input through the keyboard write a program 
to find his gross salary */
public class Q25 {
  public static void main(String[] args) {
    int bsalary = 5000;
     float salary,tsalary;
     if(bsalary<1500)
     {
        salary = (bsalary*0.10f)+(bsalary*0.90f);
     }
     else{
        salary = 500+(bsalary*0.98f);
     }
     tsalary = salary + bsalary;
     System.out.println("Gross salary is ="+tsalary);
  }  
}
