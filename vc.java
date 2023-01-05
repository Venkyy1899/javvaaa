import java.util.*;
class vc
{
public static void main(String [] args)
{
char c='i';
System.out.println("Enter a letter: ");
Scanner sc = new Scanner(System.in);
c = sc.next().charAt(0);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
System.out.println(c +" is a vowel");
else
System.out.println(c +" is a consonent");
}
}
class cv
{
public static void main(String [] args)
{
System.out.println("Hello Mani");
}
}
