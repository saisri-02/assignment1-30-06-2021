import java.util.*;
class Replace
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);    
int n, a,b,s =0, c= 1, r = 0;
System.out.println("Enter n number");
n = sc.nextInt();
System.out.println("Enter a value ");
a= sc.nextInt();
System.out.println("Enter b value ");
b= sc.nextInt();
while(n != 0)
{
r = n%10;
if(r == a)
{
r = b;
}           
s = r * c + s;
c = c* 10;
n = n/10;
}
System.out.print("Replaced number= " +s);
}
}