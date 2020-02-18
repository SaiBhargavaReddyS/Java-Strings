//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

//import java.util.*;
class SecondHighest
{
    public static void main(String args[]) {
    //to print the second highest number in an array
    //the normal way using Arrays and Arrays.sort
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    ArrayList<Integer> b= new ArrayList<Integer>();
    for(int i=0;i<n;i++)
    {
    a[i]=s.nextInt();
    b.add(a[i]);
    }
    s.close();
    Arrays.sort(a);
    System.out.print(a[n-2]);
    Collections.sort(b);
    //using arraylist to store
    System.out.print("\n\n"+b.get(n-2));


}
}