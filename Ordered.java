import java.util.Scanner;

public class Ordered extends OrderFood
{
    private static int coff_amt = 0,drinks_amt=0;
    Scanner s=new Scanner(System.in);
    public void details(){
        System.out.println("\nWe welcome you to our hotel!");
        System.out.println("We have all the varities of food. You can order the food of your choice!!");
        System.out.println("The cost not too costly!");
    }

    public void get_coffee(int amt)
    {
        int coff_count;
        System.out.println("\nHow many coffee do you want?!:");
        coff_count = s.nextInt();
        coff_amt=coff_count*amt;
        System.out.println("Amount for " +coff_count+ " coffee is " +coff_amt);
    }

    public void get_drinks(int amt)
    {
        int drinks_count;
        System.out.println("\nHow many cold drinks do you want?!:");
        drinks_count = s.nextInt();
        drinks_amt=drinks_count*amt;
        System.out.println("Amount for " +drinks_count+ " cold drinks is " +drinks_amt);
    }

    public void get_total_amt(){
        int final_amt;
        final_amt = coff_amt+drinks_amt+total_amt;
        System.out.println("\nThe total amount you need to pay is:"+final_amt);
        System.out.println("~~~~~~~~~~~~~Thank you for your order!!!!~~~~~~~~~~~~~");
    }
}
       
