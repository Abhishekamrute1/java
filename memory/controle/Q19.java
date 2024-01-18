package controle;
//Write a program to calculate profit or loss
public class Q19 {
    public static void main(String[] args) {
        int sp = 1400;
        int cp = 1200;
        int p,l;
        if(sp>cp)
        {
            p = sp-cp;
            System.out.println("profit ="+p);
        }
        else if(sp<cp)
        {
            l = cp -sp;
            System.out.println("loss = "+l);
        }
        else
        {
            System.out.println("no profit no loss");
        }
    }
}
