package homework;

public class bhopal {
    class mp_nagar{
        void chetak()
        {
            System.out.println("chetak");
        }
        void joty()
        {
            System.out.println("joty");
        }
    }
    class ashoka{
        void prabhat(){
            System.out.println("parabhat");
        }
         void parihar(){
            System.out.println("prihar");
         }
    }
    public static void main(String[] args) {
        bhopal a = new bhopal();
        bhopal. mp_nagar b = a.new mp_nagar();
        b.chetak();
        b.joty();
        bhopal.ashoka c = a.new ashoka();
        c.prabhat();
        c.parihar();
        betul d = new betul();
        betul.jh e = d.new jh();
        betul.vvm f = d.new vvm();
        e.jhs();
        f.vvms();
        
    }
    
}
class betul{
    class jh
    {
        void jhs(){
            System.out.println("jh betul");
        }

    }
    class vvm{
        void vvms()
        {
            System.out.println("vvm betul");
        }
    }
}