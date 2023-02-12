import java.util.Scanner;
import java.util.Arrays;
public class inventoryArray{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i;
    String productList[]={"mobiles","computers","tv","laptop"};
    int length=productList.length;
    int productCount[]={100,200,300,250};
    String productDetails[]={"iphone 12 - 128 GB, 60000RS/-","Acer - 512 GB, 50000Rs/-","LG - 43 inches, 30000Rs/-",
    "Asus - 512 GB, Rs35000/-"};
    for(i=0;i<length;i++)
    {
        for(i=0;i<length;i++)
        {
        System.out.println(productList[i]+" - "+productCount[i]);
    }
}
System.out.println();
System.out.println("Enter 1 for mobiles:");
System.out.println("Enter 2 for computers:");
System.out.println("Enter 3 for tv:");
System.out.println("Enter 4 for laptop:");
int enter=sc.nextInt();
if(enter==1)
System.out.println(productDetails[0]);
else if(enter==2)
System.out.println(productDetails[1]);
else if(enter==3)
System.out.println(productDetails[2]);
else if(enter==4)
System.out.println(productDetails[3]);
else
System.out.println("product not found");
System.out.println();
System.out.println("enter for discount:");
int discount=sc.nextInt();
if(enter==1)
System.out.println("10% discount for "+productDetails[0]);
else if(enter==2)
System.out.println("12% discount for "+productDetails[1]);
else if(enter==3)
System.out.println("15% discount for "+productDetails[2]);
else if(enter==4)
System.out.println("16% discount for "+productDetails[3]);
else
System.out.println("product not found");
System.out.println("\nproducts are sold");
int soldproducts=50;
for(i=0;i<length;i++)
{
    System.out.println(productCount[i]-soldproducts+" "+productList[i]);
}
System.out.println("\nnew products arrived");
int addproducts=10;
for(i=0;i<length;i++)
{
    System.out.println(productCount[i]+addproducts+" "+productList[i]);
}
}
}