import java.util.Scanner;

public class Delux extends basic_room
{
    private static int day_amt = 0;
    Scanner s=new Scanner(System.in);
    public void details()
    {
        System.out.println("\n*****DELUX ROOMS*****");
        info();
        System.out.println("This delux rooms along with the basic amenities has a double cot bed , wi-fi connection");
        System.out.println("The price for Delux room per day is RS.2500");
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
