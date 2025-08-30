package stringpracticelevel1;

import java.util.Scanner;

class Q6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        try{
            System.out.println(s.substring(3,1));
        }catch(IllegalArgumentException e){
            System.out.println("Handled IAE");
        }catch(RuntimeException e){
            System.out.println("Handled RE");
        }
    }
}
