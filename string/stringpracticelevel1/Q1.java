package stringpracticelevel1;

import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean b = true;
        if(s1.length()!=s2.length()) b=false;
        else{
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){ b=false; break; }
            }
        }
        System.out.println("By charAt: " + b);
        System.out.println("By equals: " + s1.equals(s2));
    }
}
