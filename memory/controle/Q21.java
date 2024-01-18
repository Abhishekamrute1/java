package controle;
/*Write a program to input basic salary of an employee and calculate its Gross salary 
according to following:
• Basic Salary <= 10000 : HRA = 20%, DA = 80%
• Basic Salary <= 20000 : HRA = 25%, DA = 90%
• Basic Salary > 20000 : HRA = 30%, DA = 95% */
public class Q21 {
    public static void main(String[] args) {
       int bs = 5000;
       float hr, da, gs;
       if(bs<=10000)
       {
         hr = bs* 0.2f;
         da = bs* 0.8f;
         gs= bs+hr+da;
       } 
       else if(bs<=20000)
       {
        hr = bs* 0.25f;
        da = bs* 0.9f;
        gs = bs + hr + da;
       }
       else
       {
        hr = bs* 0.3f;
        da = bs*0.95f;
        gs = bs + hr + da;
       }
       System.out.println("Gross salary ="+gs);
    }
}
