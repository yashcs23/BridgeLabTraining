package stringpracticelevel1;

import java.util.Scanner;

class Q4 {
    public static void main(String[] args){
        try{
            String s=null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("Handled NPE");
        }
    }
}
