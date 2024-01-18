package controle;
/*A company insures its drivers in the following cases:
• If the driver is married
• If the driver is unmarried, male & above 30 years of age
• If the driver is unmarried, female & above 25 years of age */
public class Q27 {
    public static void main(String[] args) {
        int age = 25;
        char sex = 'M';
        char status ='U';
        if(status=='M'||status=='m')
        {
            System.out.println("driver is insures");
        }
        else if(age>30&&sex=='M'&&status=='u'||status=='U'&&sex=='m'&& age>30)
        {
            System.out.println("driver is insures");
        }
        else if(age>25&&sex=='F'&&status=='u'||status=='U'&&sex=='f'&&age>25)
        {
           System.out.println("driver is insures"); 
        }
        else
        {
            System.out.println("driver is not insures");
        }
    }
}
