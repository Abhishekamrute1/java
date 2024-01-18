package controle;
/*The current year and the year in which the employee joined the organization are 
entered through the keyboard. If the number of years for which the employee has served 
the organization is greater than 3 then a bonus of Rs. 2500/- is given to the employee. If 
the years of service are not greater than 3, then the program should do nothing
 */
public class Q24 {
    public static void main(String[] args) {
        int joinigyear=2020;
        int currentyear=2023;
        int yow = currentyear - joinigyear ;
        if(yow>=3)
        {
            System.out.println("bonus given to employee = 2500rs");
        }
        else{
            System.out.println("no bonus");
        }
    }
}
