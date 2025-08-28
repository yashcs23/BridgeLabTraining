package arraypracticelevel2;
import java.util.Scanner;

class q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p[]=new int[n];
        int c[]=new int[n];
        int m[]=new int[n];
        double per[]=new double[n];
        char g[]=new char[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
            if(p[i]<0){i--;continue;}
            c[i]=sc.nextInt();
            if(c[i]<0){i--;continue;}
            m[i]=sc.nextInt();
            if(m[i]<0){i--;continue;}
        }
        for(int i=0;i<n;i++){
            per[i]=(p[i]+c[i]+m[i])/3.0;
            if(per[i]>=80) g[i]='A';
            else if(per[i]>=70) g[i]='B';
            else if(per[i]>=60) g[i]='C';
            else if(per[i]>=50) g[i]='D';
            else if(per[i]>=40) g[i]='E';
            else g[i]='R';
        }
        for(int i=0;i<n;i++){
            System.out.println("P:"+p[i]+" C:"+c[i]+" M:"+m[i]+" %:"+per[i]+" G:"+g[i]);
        }
    }
}
