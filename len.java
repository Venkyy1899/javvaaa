import java.util.*;
class len
{
public static void main(String args [])
{
String a;
int b,i,count=0;
System.out.println("Enter a String= ");
Scanner sc =new Scanner(System.in);
a=sc.nextLine();
b=a.length();
for(i=0;i<b;i++)
System.out.println("The length of the string " +(a.charAt(i)) +b);
}
}
