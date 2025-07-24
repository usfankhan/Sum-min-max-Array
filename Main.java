
import java.util.*;
public class Main{
    public static int sum(int A[]){
        int min=A[0],max=A[0];
        
        System.out.println("CALCULATING");
        for(int i=1;i<A.length;i++){
            if(A[i]<min){
                min=A[i];
        }
            if(A[i]>max){
                max=A[i];
        }
        }
    return max+min;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int A[]=new int[4];
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        System.out.println(sum(A));
    }
}
