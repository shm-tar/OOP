package sample;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        show();

        LinkedList LinkedList = new LinkedList();
        LinkedList LinkedList1 = new LinkedList();
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        while(!("6".equals(line))) {
            //LinkedList LinkedList1 = new LinkedList();
            if ("1".equals(line)) {
                System.out.println("Please fill your personal card co-worker:");
                System.out.println("Station: ");
                String station = new String();
                station = scan.nextLine();
                System.out.println("Arrival: ");
                String arrival = new String();
                arrival = scan.nextLine();
                System.out.println("Departure: ");
                String departure = new String();
                departure = scan.nextLine();
                System.out.println("Free Seats");
                String fseats = new String();
                fseats = scan.nextLine();
                System.out.println("Number");
                String number = new String();
                number = scan.nextLine();
                System.out.println("Your ticket has been successfully created.");

                LinkedList.setT1(station);
                LinkedList.setT2(arrival);
                LinkedList.setT3(departure);
                LinkedList.setT4(fseats);
                LinkedList.setT5(number);
                LinkedList1.add(LinkedList);


            }
            else if("2".equals(line)){
                System.out.println("Your index:");
                int b = scan.nextInt();
                System.out.println(LinkedList1.get(b));
            }

            else if("3".equals(line)){
                System.out.println("Your index:");
                int a = scan.nextInt();
                LinkedList1.delete(a);
            }
            else if("4".equals(line)){
                System.out.println(LinkedList1.size());

            }
            else if("5".equals(line)){
                System.out.println(LinkedList1.toString());
            }
            System.out.print("New command: ");
            line = scan.nextLine();
        }

    }
    public static void show(){
        System.out.println("Help:\n" +
                "1 -> Fill in the ticket\n" +
                "2 -> Return ticket by index\n" +
                "3 -> Delete element by index\n" +
                "4 -> Return size\n" +
                "5 -> Return list with your tickets\n"+
                "6 -> Exit");
    }
}
