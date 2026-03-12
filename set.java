import java.io.*;
import java.util.*;

class set
{
public static void main(String args[])
{
HashSet<String> set1 = new HashSet<String>();
HashSet<String> set2 = new HashSet<String>();
String str;
int n,i;

Scanner sc = new Scanner(System.in);

System.out.println("Enter no. of countries:");
n = sc.nextInt();

System.out.println("Enter the name of countries:");
for(i=0;i<n;i++)
{
str = sc.next();
set1.add(str);
}

System.out.println("Hashset 1:");
System.out.println(set1);

System.out.println("Enter no. of countries:");
n = sc.nextInt();

System.out.println("Enter the name of countries:");
for(i=0;i<n;i++)
{
str = sc.next();
set2.add(str);
}

System.out.println("Hashset 2:");
System.out.println(set2);

HashSet<String> a = new HashSet<String>(set1);
a.addAll(set2);
System.out.println("Union of country set : " + a);

HashSet<String> b = new HashSet<String>(set1);
b.retainAll(set2);
System.out.println("Intersection of country set : " + b);

HashSet<String> c = new HashSet<String>(set1);
c.removeAll(set2);
System.out.println("Difference of country set : " + c);
}
}
