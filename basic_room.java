import java.util.Random;

public class basic_room {
    int tot_amt=0;
    public void info(){
        System.out.println("\nIt has 2 windows, a single bed, a bathroom");
    }
    
    public void payment(int amount){
        tot_amt +=amount;
        System.out.println("\nThe booking amount for room is "+tot_amt);
    }
    public void get_owner_room_no(){
        Random rand = new Random();
        System.out.println("Your room no is:"+rand.nextInt(30));
    }
}
