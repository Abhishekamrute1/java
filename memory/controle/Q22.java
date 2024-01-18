package controle;
/*Write a program to input electricity unit charges and calculate total electricity bill 
according to the given condition:
• For first 50 units Rs. 0.50/unit
• For next 150 units Rs. 0.75/unit
• For next 250 units Rs. 1.20/unit
• For unit above 250 Rs. 1.50/unit
• An additional surcharge of 20% is added to the bill */
public class Q22 {
    public static void main(String[] args) {
        int unit = 86;
        float ebill,tebill;
        if(unit<=50)
        {
            ebill = unit*0.50f;
        }
        else if(unit<=150)
        {
          ebill = unit*0.75f;   
        }
        else if(unit<=250)
        {
             ebill = unit*1.20f;
        }
        else
        {
             ebill = unit*1.50f;
        }
        tebill = (ebill*0.20f)+ebill;
        System.out.println("total electricity bill ="+tebill);
    }
}
