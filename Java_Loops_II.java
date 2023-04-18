import java.util.*;
public class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int adda=a,sum=0;
            for (int k = 0; k < n; k++) {
                
                int pwr=(int)Math.pow(2,k);
                int m=b*pwr;
               
                adda=adda+m;
                System.out.print(adda+" ");

            }
            System.out.println(" ");
          
        }
        in.close();
    }
    
}
