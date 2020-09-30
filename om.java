import java.lang.*;
import java.util.Scanner;
class om
{public static void main(String args[])
{
Scanner kb=new Scanner(System.in);
int n,s=2,t=3;
do{

System.out.print("Enter the any no=====>\t");
 n=kb.nextInt();
System.out.print(1);
for(int i=1;i<s;i++)
System.out.print(" ");
System.out.print(n/2);
for(int i=1;i<=s;i++)
System.out.print("  ");
System.out.print(n);
for(int i=1;i<s;i++)
System.out.println(" ");
System.out.print(1);
for(int i=1;i<s;i++)
System.out.print(" ");
System.out.print(n/2);
for(int i=1;i<=s;i++)
System.out.print("  ");
System.out.print(n);
for(int i=1;i<=s;i++)
System.out.println(" ");
System.out.print(1);
for(int i=1;i<s;i++)
System.out.print(" ");
System.out.print(n/2);
for(int i=1;i<=s;i++)
System.out.print("  ");
System.out.println(n);
s++;

}while(n!=0);
}
}