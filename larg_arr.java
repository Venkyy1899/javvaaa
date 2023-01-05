import java.util.*;
import java.util.Collections;
class larg_arr
{
public static void main(String [] args)
{
int a,i,n;
System.out.println("Enter  the size an array");
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
System.out.println(" To print N th largest number  Enter the value of  n");
n=sc.nextInt();
int [] array=new int[a];
for(i=0;i<a;i++){
System.out.println("Enter " +(i+1) +" numer=");
array[i]=sc.nextInt();
}
System.out.println("The array elements are = ");
for(i=0;i<a;i++){
System.out.println(+array[i] +" ");
}
//System.out.println("The "  +i + "  number is " +array[n-1] +" ");
// SORTING
System.out.println(" The sorted array is ");
//Arrays.sort(array);
Arrays.sort(array, Collections.reverseOrder());
for(i=0;i<a;i++){
System.out.println(+array[i] +" ");
}
System.out.println("The "  + i  + " largest number is " +Arrays.toString(array) +" ");
}
}
// REVERSE SORTING
//  Arrays.sort(arr, Collections.reverseOrder());
        
