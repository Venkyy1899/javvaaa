import java.util.*;
class tax
{
public static void main(String args [])
{
int a;
System.out.println("Enter the tax of a person= ");
Scanner sc =new Scanner(System.in);
a=sc.nextInt();

if(a<0)
System.out.println("invalid! Income must be in positive");
if(a>=0 && a<=150000)
System.out.println("For income " +a  +"no tax required");
if(a>=150001 && a<=300000)
System.out.println("For income " +a  + " tax is " +(a*0.1));
if(a>=300001 && a<=500000)
System.out.println("For income " +a  +" tax is " +(a*0.2));
if(a>500001)
System.out.println("For income " +a  +" tax is " +(a*0.3));

}
}
