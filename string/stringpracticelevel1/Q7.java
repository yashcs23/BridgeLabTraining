package stringpracticelevel1;

import java.util.Scanner;

class Q7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        try{
            int n=Integer.parseInt(s);
            System.out.println(n);
        }catch(NumberFormatException e){
            System.out.println("Handled NFE");
        }catch(RuntimeException e){
            System.out.println("Handled RE");
        }
    }
}
