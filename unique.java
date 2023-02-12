import java.util.*;
public class unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,j;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(x[i]==x[j])
                break;
        }
        if(i==j)
        System.out.print(x[i]+" ");
    }
        
        }
    
}
