import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How many stations would you like to add ? - ");
        byte blank = (byte) in.nextInt();

        for (int a = 0; a < blank; a++) {

            System.out.println("Enter your station");

            String st = in.next();
            TicketOffice reg = new TicketOffice();
            while (!reg.station(st)){
                System.out.println("Incorrect input. Enter your station correctly");
                st = in.next();
            }
            System.out.println("Enter arrival");
            String arrival = in.next();
            while(!reg.arrival(arrival)){
                System.out.println("Incorrect input. Enter your arrival time correctly(4 symbols: e. g. 12.04)");
                arrival = in.next();
            }
            System.out.println("Enter departure");
            String dep = in.next();
            while(!reg.departure(dep)){
                System.out.println("Incorrect input. Enter your arrival time correctly(4 symbols: e. g. 12.04)");
                dep = in.next();
            }
            System.out.println("Enter free seats");
            String fseats = in.next();
            while(!reg.fseats(fseats)){
                System.out.println("Incorrect input. Enter 1 digit");
                fseats = in.next();
            }

            System.out.println("Enter a day");
            String day = in.next();

            while (!reg.day(day)){
                System.out.println("Incorrect input. Enter the day correctly");
                day = in.next();
            }

            System.out.println("Enter train number");
            String numb = in.next();
            while(!reg.trainNb(numb)){
                System.out.println("Incorrect input. Enter the train number - 5 symbols: letters and numbers");
                numb = in.next();
            }

        }
    }
}
