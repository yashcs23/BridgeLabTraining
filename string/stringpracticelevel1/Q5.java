package stringpracticelevel1;

import java.util.Scanner;

class Q5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        try{
            System.out.println(s.charAt(s.length()));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Handled SIOOBE");
        }
    }
}
