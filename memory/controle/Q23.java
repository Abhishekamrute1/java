package controle;
/*while purchasing certain items, a discount of 10% is offered if the quantity purchased is 
more than 100. If quantity and price per item are input through the keyboard, write a 
program to calculate the total expenses
 */
public class Q23 {
    public static void main(String[] args) {
        int quantity = 120;
        float price = 200;
        float total;
        if(quantity>100)
        {
           total =quantity*price;
           total= total-(total*0.1f);
        }
        else{
            total= quantity*price;
        }
        System.out.println("Total expenses is ="+total);
    }
}
