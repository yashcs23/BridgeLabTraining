package stringpracticelevel1;

import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr1=new char[s.length()];
        for(int i=0;i<s.length();i++) arr1[i]=s.charAt(i);
        char[] arr2=s.toCharArray();
        boolean b=true;
        if(arr1.length!=arr2.length) b=false;
        else{
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){ b=false; break; }
            }
        }
        System.out.println("Equal arrays: " + b);
    }
}
