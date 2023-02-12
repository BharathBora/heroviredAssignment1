import java.util.Scanner;
class productList{
    String product1="Mobiles";
    String product2="Computer";
    String product3="TV";
    String product4="Laptops";
}
class productCount extends productList{
    int product1=300;
    int product2=250;
    int product3=150;
    int product4=200;
}
class productDetails extends productList{
    String product1="iphone 12 - 128 GB, 60000RS/-";
    String product2="Acer - 512 GB, 50000Rs/-";
    String product3="LG smart led - 43 inches, 30000RS/-";
    String product4="Asus - 512 GB, Rs35000/-";
}
public class invertoryClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sold=100;
        int added=100;
        productList list=new productList();
        productCount count=new productCount();
        productDetails details=new productDetails();
        System.out.println(list.product1+" - "+count.product1);
        System.out.println(list.product2+" - "+count.product2);
        System.out.println(list.product3+" - "+count.product3);
        System.out.println(list.product4+" - "+count.product4);
        System.out.println();
        System.out.println(list.product1+" - "+details.product1);
        System.out.println(list.product2+" - "+details.product2);
        System.out.println(list.product3+" - "+details.product3);
        System.out.println(list.product4+" - "+details.product4);
       
        // edit productDetails
        details.product1=" \n20% Discount on mobiles ";
        System.out.println(details.product1);
        //details.product2=" \n10% Discount on computers ";
        //System.out.println(details.product2);
        //details.product3=" \n40% Discount on TV's ";
        //System.out.println(details.product3);
        //details.product4=" \n30% Discount on laptops ";
        //System.out.println(details.product4); 
        System.out.println(); 
    
        add(added,count.product1);
        add(added,count.product2);
        add(added,count.product3);
        add(added,count.product4);
        System.out.println();
        sold(sold,count.product1);
        sold(sold,count.product2);
        sold(sold,count.product3);
        sold(sold,count.product4);
    }
    public static void add(int a,int b){
        System.out.println("Added Products - "+(a+b));
    }
    public static void sold(int a,int b){
        System.out.println("sold Products - "+(a-b));
    }
}
