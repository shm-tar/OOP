import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ExampleCollection
{
    // Collection using ArrayList
    static Collection col = new ArrayList();

    static String Station;
    static String Arrival;
    static String Departure;
    static String FSeats;
    static String Seats;
    static String Days;
    static String Number;
    static String Add;

    public static void main(String[] args) {
        // Creating the collection
        Collection col1 = createFirstCollection();


        System.out.println("============= Going through the collection");
        for(Object o : col1) {
            System.out.println("Item: " + o);
        }

        // Going through using Iterator
        System.out.println("============= Going through using Iterator");
        for (Iterator it = col1.iterator(); it.hasNext(); ) {
            String s = (String)it.next();
            System.out.println("Item:" + s);
        }

        // Deleting the collection's element
        col1.remove(Arrival);
        System.out.println("============= Deleting => " + Arrival);
        for(Object o : col1) {
            System.out.println("Item: " + o);
        }

        // Adding an element
        Add = "What you wish to add";
        col1.add(Add);
        System.out.println("============= Adding => " + Add);
        for(Object o : col1) {
            System.out.println("Item: " + o);
        }

        //Finding element in collection
        System.out.println("============= Finding element " + Station);
        int index = 0;
        for(Object o : col1) {
            if (o == Station)
                System.out.println("Item found on index: " + (index+1));
        }

        // Deleting all elements using Iterator
        System.out.println("============= Deleting using Iterator");
        while(!col1.isEmpty()) {
            Iterator it = col1.iterator();
            Object o = it.next();
            System.out.println("Deleting: " + o);
            // Deleting the element
            it.remove();
        }
    }

    // Collection
    public static Collection createFirstCollection() {

        /*Scanner in = new Scanner(System.in);

        System.out.print("Station: ");
        Station = in.nextLine();

        System.out.print("Arrival: ");
        Arrival = in.nextLine();

        System.out.print("Departure: ");
        Departure = in.nextLine();

        System.out.print("FSeats: ");
        FSeats = in.nextLine();

        System.out.print("Seats: ");
        Seats = in.nextLine();

        System.out.print("Days: ");
        Days = in.nextLine();

        System.out.print("Number: ");
        Number = in.nextLine();*/

        Station = "Lviv";
        Arrival = "12:05";
        Departure = "12:10";
        FSeats = "4";
        Seats = "50";
        Days = "Fridays";
        Number = "254";

        // Adding to collection
        col.add(Station);
        col.add(Arrival);
        col.add(Departure);
        col.add(FSeats);
        col.add(Seats);
        col.add(Days);
        col.add(Number);
        return col;
    }
}
