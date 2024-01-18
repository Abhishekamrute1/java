package homework;

public class qution1 
    {
        //creating the variale
     String stet_name ,capitola_nme;
     //cteare a methord
     qution1(String x,String y)
     {
        stet_name = x; 
        capitola_nme = y;
     }   
     public static void main(String[] args) 
     {
        //creatin the object
        qution1 a = new qution1("mp","Bhopal");
        qution1 b = new qution1("up","lakhnau");
        qution1 c = new qution1("Bihsr", "patna");
        // pritn the valu of the object using object nme.vatiaale name
        System.out.println(a.stet_name);
        System.out.println(a.capitola_nme);
        System.out.println(b.stet_name);
        System.out.println(b.capitola_nme);
        System.out.println(c.stet_name);
        System.out.println(c.capitola_nme);
        
        
     }
    
}
