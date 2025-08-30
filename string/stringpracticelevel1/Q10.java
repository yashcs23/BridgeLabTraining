package stringpracticelevel1;

import java.util.Scanner;

class Q10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r1="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z') r1+=(char)(c+32);
            else r1+=c;
        }
        String r2=s.toLowerCase();
        boolean b=true;
        if(r1.length()!=r2.length()) b=false;
        else{
            for(int i=0;i<r1.length();i++){
                if(r1.charAt(i)!=r2.charAt(i)){ b=false; break; }
            }
        }
        System.out.println("By charAt: " + r1);
        System.out.println("By built-in: " + r2);
        System.out.println("Equal: " + b);
    }
}
