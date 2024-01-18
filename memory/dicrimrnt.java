public class dicrimrnt 
{
public static void main(String[] args) 
{
 int x=2;
 int y = 3;
 int z = 5;
//  int ans = x++ * -y + --z + x / -y + (x * --y / z--) - z;
//  int ans = x++ * y + z + (++x / -y) + (x * -y / --z) - ++z * x / y / -z; 
//  int ans = x++ * -y + --z +x / -y + (x * --y / z--) - z / x / -y  * +z - x-- + ++y ;
 int ans = x * y + z + ++x / --y +((x * --y / z--) - z * -y / -x ) + x + y + z;
 System.out.println(ans);   
}
}

