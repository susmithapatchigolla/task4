package task4;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class queue {
    public static void main(String args[])
    {

    Queue<Integer> a = new LinkedList<>(); 
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    for(int i=0;i<n;i++)
    {
        int index=ob.nextInt();
        
        if(index==1)
        {
            int item=ob.nextInt();
            a.add(item);
        }
        else if(index==2)
        {
            a.remove();
        }
        else if(index==3)
        {
            int head = a.peek(); 
            System.out.println(head);
        }
    }

  
    }
}

