import java.util.*;
public class missingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,j;
        n=sc.nextInt();
        arr=new int[n];
        for(i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
           for(j=arr[i]+1;j<arr[i+1];j++)
           {
            System.out.print(j+" ");
           }
        }

    }
    
}