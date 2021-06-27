import java.util.Scanner;

public class Non_Ac extends basic_room{
    private static int day_amt = 0;
    Scanner s=new Scanner(System.in);
    public void details(){
        System.out.println("\n*****NON-AC ROOMS*****");
        info();
        System.out.println("This Non-ac rooms along with the basic amenities has two fans");
        System.out.println("The price for Non-AC room per day is RS.1000");
    }

    public void no_of_days(int amt)
    {
        int day;
        System.out.println("\nEnter the no.of.days you want to stay:");
        day = s.nextInt();
        day_amt=day *amt;
        System.out.println("Amount for " +day+ " days is " +day_amt);
    }

    public void get_total_amt(){
        int final_amt;
        final_amt = day_amt+tot_amt;
        System.out.println("\nThe total amount you need to pay is:"+final_amt);
        System.out.println("~~~~~~~~~~~~~Thank you for booking in our hotel!!!!~~~~~~~~~~~~~");
    }
}
