package arraypracticelevel2;
import java.util.Scanner;

class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double h[]=new double[n];
        double w[]=new double[n];
        double b[]=new double[n];
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            h[i]=sc.nextDouble();
            w[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            b[i]=w[i]/(h[i]*h[i]);
            if(b[i]<=18.4) s[i]="Underweight";
            else if(b[i]<=24.9) s[i]="Normal";
            else if(b[i]<=39.9) s[i]="Overweight";
            else s[i]="Obese";
        }
        for(int i=0;i<n;i++){
            System.out.println("H:"+h[i]+" W:"+w[i]+" BMI:"+b[i]+" "+s[i]);
        }
    }
}
