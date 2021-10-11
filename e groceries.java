import java.util.*;
public class MyClass 
{
   static int count;
    int add;
    String name;
    int custid;
   static int choice;
   public void display()
   {
       System.out.println("..................................................................");
       System.out.println("----------------------WELCOME TO E-GROCERIES-----------------------");
       System.out.println("....................................................................");
       System.out.println("::::::::::::::#One Stop!! For All Your Home Essentials:::::::::::::");
       System.out.println("----------------------------------------------------------------------");
       System.out.println("please login to your account to start your shopping!!!");
       login();
   }
   public void login()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name::");
       String name = sc.nextLine();
       Scanner fc = new Scanner(System.in);
       System.out.println("Enter your customer id( ENTER ONLY DIGITS)");
       int custid = fc.nextInt();
       System.out.println(" LOGIN  SUCCESSFULL:) ");
       System.out.println("Welome Mr/Ms"+"....."+"...."+name+"......"+"and your custmer id is"+"...."+custid);
       System.out.println("....................................................");
    }
    public void services()
    {
       System.out.println("------------------------------------------------------------");
       System.out.println("1.Vegetables");
       System.out.println("2.Dairy products");
       System.out.println("3.Fruits");
       System.out.println("4.Beverages");
       System.out.println("5.Pulses");;
       System.out.println("6.Personal Care"); 
       System.out.println("7.Bill");
       System.out.println("8.LogOut");
    }
    public void vegetables()
    {
       String[] veg = {"carrot","cucumber","spinach","Broccoli","Bottleguard","BitterGuard"};
          

         for(int i=0;i<=veg.length-1;i++)
         {
            System.out.println(veg[i]);
         }
        Scanner oi = new Scanner(System.in);
         System.out.println("select an item to add in your cart");
        String item = oi.nextLine();
        count++;
        System.out.println(item+".."+"added to your cart");
    }
    public void dairyproducts()
    {
       String[] dia = {"milk","ghee","butter","paneer","cheese","ice cream"};
    
           for(int j=0;j<=dia.length-1;j++)
                 {
                        System.out.println(dia[j]);
                 }
                    Scanner fg = new Scanner(System.in);
                    System.out.println("select an item to add in your cart ");
                    String add = fg.nextLine();
                    count++;
                    System.out.println(add+".."+"added to your cart");
    }
    public void fruits()
    {
        String[] fru = {"banana","grapes","apple","guava","papaya","oranges"};
        
            for(int i=0;i<=fru.length-1;i++)
                   {
                       System.out.println(fru[i]);
                   }
                   Scanner pl = new Scanner(System.in);
                   System.out.println("select an item to add in your cart ");
                   String g = pl.nextLine();
                   count++;
                   System.out.println(g+"..."+"added to your cart");
    }
    public void beverages()
    {
      String[] bev = {"pepsi","sprite","thums-up","limca","fizz","pulpy orange"};
    
           for(int k=0;k<=bev.length-1;k++)
                   {
                        System.out.println(bev[k]);
                    }
                    Scanner uy = new Scanner(System.in);
                    System.out.println("select an item to add in your cart ");
                    String product =uy.nextLine();
                    count++;
                    System.out.println(product+".."+"added to your cart");
    }
    public void pulsus()
    {
      String[] pul = {"Dry beans","faba beans","Lentils","cowpeas","chickpeas","Dry peas"};
      
             for(int m =0;m<=pul.length-1;m++)
                    {
                     System.out.println(pul[m]);
                    }
                    Scanner er = new Scanner(System.in);
                    System.out.println("select an item to add in your cart");
                    String gram = er.nextLine();
                     count++;
                     System.out.println(gram+"..."+"added in our cart");
    }
    public void cosmetics()
    {
      String[] cos = {"moisturiser","shampoos","tooth-paste","detergents","soaps"};
      
          for(int a =0;a<=cos.length-1;a++)
                     {
                        System.out.println(cos[a]);
                     }
                     Scanner bv = new Scanner(System.in);
                     System.out.println("select an item to add in your cart");
                     String ess = bv.nextLine();
                     count++;
                     System.out.println(ess+".."+"added in your cart");
    }
     
     public void bill()
    {
      System.out.println("-------------------INVOICE-----------------------");
      System.out.println(".................................................");
       add = count*10;
      System.out.println("your total bill is RS/-"+"  "+add);
      System.out.println("......its an add to cart! KINDA DAY:)");
      System.exit(0);
    }
     
     public void logout()
     {
      System.out.println(".......THANK YOU!!!");
      System.out.println(" VISIT AGAIN........");
      System.out.println("------------------------------------------------");
      System.exit(0);
     }

      public static void main(String[] args)
    {
        MyClass e = new MyClass();
        e.display();
         do
         {
             e.services();
           Scanner we = new Scanner(System.in);
           System.out.println("select an option");
           int choice = we.nextInt();
          switch(choice)
          {
           case  1 :   System.out.println("------------------------------------------------------");
                       e.vegetables();
                       break;
                    
          case   2 :  System.out.println("------------------------------------------------------");
                      e.dairyproducts();
                      break;
                    
         case   3 :   System.out.println("---------------------------------------------------------");
                      e.fruits();
                      break;
                   
        case    4 :   System.out.println("--------------------------------------------------------");
                      e.beverages();
                       break;
                    
        case    5 :  System.out.println("---------------------------------------------");
                      e.pulsus();
                       break;
                     
        case    6 :  System.out.println("-------------------------------------------------------");
                     e.cosmetics();
                     break;
        
        case   7  :  e.bill();
                     System.out.println("----------------------------------------------");
                     break;

        case    8 :  System.out.println("---------------------------------------------------");
                      e.logout();
                      break;
        
        default   : System.out.println("Sorry you have Entered a invalid option!!....TRY AGAIN"); 
                    break;
                    
        }
    }while(choice!=8);
                    
    }
}