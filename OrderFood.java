import java.util.Random;

public class OrderFood {
    int total_amt=0;
    public void payment(int amount){
        total_amt +=amount;
        System.out.println("\nThe Amount is "+total_amt);
    }
    public void get_booking_id(){
        System.out.println("Thank you for your order!!!!");
        Random rand = new Random();
        System.out.println("Your ordered id no is:"+rand.nextInt(50));
    }
}
