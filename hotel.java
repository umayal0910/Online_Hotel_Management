import java.util.Scanner;


public class hotel {
    static int user_no,c,r=1,i,ch,ac,non_ac,delux;
    static String cust_name,address;
    static long cust_phone_no;
    static Scanner s =new Scanner(System.in);
    public static void main(String[] args) {
        while(r==1){
            System.out.println("\n********* WELCOME TO ONLINE HOTEL BOOKING *********");
            System.out.println("\nPlease enter your choice:");
            System.out.println("\n1.Enter Customer Details");
            System.out.println("\n------------------------------------------------------");
            System.out.println("\n2.Booking Rooms");
            System.out.println("\n------------------------------------------------------");
            System.out.println("\n3.Order food Items");
            System.out.println("\n------------------------------------------------------");
            c=s.nextInt();
            switch(c){
                case 1:    //Customer details
                   System.out.println("\nEnter the No.of.Users:");
                   user_no=s.nextInt();
                   for(i=0;i<user_no;i++){
                       System.out.println("\nEnter the Customer Name:");
                       cust_name=s.next();
                       System.out.println("\nEnter the Customer Phone No:");
                       cust_phone_no=s.nextLong();
                       System.out.println("\nEnter Your Address:");
                       address=s.next();   
                    }
                   break;
                case 2:    //Room booking
                   System.out.println("\nEnter the No.of.Users:");
                   user_no=s.nextInt();
                   System.out.println("\n Types Of Rooms available:::");
                   System.out.println("\n1.Non-AC Room\n2.AC Room\n3.Delux Room");
                   System.out.println("Enter your option:");
                   ch=s.nextInt();
                   switch(ch){
                        case 1:   //Non-Ac Room booking
                           Non_Ac n = new Non_Ac();
                           n.details();
                           for(i=0;i<user_no;i++)
                           {
                                n.no_of_days(1000);
                                n.payment(200);
                                System.out.println("Room Available,Booked Successfully!!!!");
                                n.get_owner_room_no();
                                n.get_total_amt();
                                System.out.println("Customer name: "+cust_name);
                                System.out.println("Customer phone no: "+cust_phone_no);
                           }
                           break;
                        case 2:    //AC room booking
                           Ac ac = new Ac();
                           ac.details();
                           for(i=0;i<user_no;i++)
                           {
                                ac.no_of_days(1850);
                                ac.payment(350);
                                System.out.println("Room Available,Booked Successfully!!!!");
                                ac.get_owner_room_no();
                                ac.get_total_amt();
                                System.out.println("Customer name: "+cust_name);
                                System.out.println("Customer phone no: "+cust_phone_no);
                           }
                           break;
                        case 3:  //Delux room booking
                            Delux d = new Delux();
                            d.details();
                            for(i=0;i<user_no;i++){
                                d.no_of_days(2500);
                                d.payment(500);
                                System.out.println("Room Available,Booked Successfully!!!!");
                                d.get_owner_room_no();
                                d.get_total_amt();
                                System.out.println("Customer name: "+cust_name);
                                System.out.println("Customer phone no: "+cust_phone_no);
                            }
                            break;
                        default:
                            break;
                    }break;

                case 3:   //Ordering food
                System.out.println("\nEnter the No.of.Users:");
                user_no=s.nextInt();
                Ordered orderItem =new Ordered();
                System.out.println("\n Types Of Food available:::");
                System.out.println("\n1.Noodles\n2.Rice & Dal\n3.Dosa\n4.Chapathi");
                System.out.println("Enter your option:");
                ch=s.nextInt();
                orderItem.details();
                switch(ch){
                     case 1: //order noodles
                        for(i=0;i<user_no;i++)
                        {
                            orderItem.payment(120);
                            System.out.println("Ordered Successfully!!!!");
                            System.out.println("\nIf you want order some coffee and cold drinks!!!");
                            orderItem.get_coffee(98);
                            orderItem.get_drinks(145);
                            orderItem.get_booking_id();
                            orderItem.get_total_amt();
                        }
                        break;
                     case 2://order rice and dal
                        for(i=0;i<user_no;i++)
                        {
                            orderItem.payment(200);
                            System.out.println("Ordered Successfully!!!!");
                            System.out.println("\nIf you want order some coffee and cold drinks!!!");
                            orderItem.get_coffee(98);
                            orderItem.get_drinks(145);
                            orderItem.get_booking_id();
                            orderItem.get_total_amt();
                        }
                        break;                        
                     case 3:   //order dosa
                        for(i=0;i<user_no;i++)
                        {
                            orderItem.payment(80);
                            System.out.println("Ordered Successfully!!!!");
                            System.out.println("\nIf you want order some coffee and cold drinks!!!");
                            orderItem.get_coffee(98);
                            orderItem.get_drinks(145);
                            orderItem.get_booking_id();
                            orderItem.get_total_amt();
                        }
                        break;

                     case 4:   //order chapathi
                        for(i=0;i<user_no;i++)
                        {
                            orderItem.payment(110);
                            System.out.println("Ordered Successfully!!!!");
                            System.out.println("\nIf you want order some coffee and cold drinks!!!");
                            orderItem.get_coffee(98);
                            orderItem.get_drinks(145);
                            orderItem.get_booking_id();
                            orderItem.get_total_amt();
                        }
                        break;

                     default:
                         break;
                }
                break;
                
                default:
                   break;

            }
        }
        s.close();
    }
}
