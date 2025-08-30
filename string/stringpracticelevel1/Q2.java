package stringpracticelevel1;

import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int st = sc.nextInt();
        int en = sc.nextInt();
        String sub="";
        for(int i=st;i<en;i++) sub+=s.charAt(i);
        String sub2=s.substring(st,en);
        boolean b=true;
        if(sub.length()!=sub2.length()) b=false;
        else{
            for(int i=0;i<sub.length();i++){
                if(sub.charAt(i)!=sub2.charAt(i)){ b=false; break; }
            }
        }
        System.out.println("By charAt: " + sub);
        System.out.println("By substring: " + sub2);
        System.out.println("Equal: " + b);
    }
}
