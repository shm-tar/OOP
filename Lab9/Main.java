import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

    public static void main(final String[] args) throws IOException
    {

        show();
        Scanner s = new Scanner(System.in);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Container storage = new Container();

        int a=0;
        final int end=11;
        while(a != end)
        {
            a=s.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Enter your element:");
                    storage.add(read.readLine());
                    break;
                case 2:
                    if (storage.remove(read.readLine())) {

                        System.out.println("Element was deleted");
                    } else {

                        System.out.println("No such element present");
                    }

                    break;
                case 3:
                    storage.clear();
                    System.out.println("Container was deleted");
                    break;
                case 4:
                    System.out.println(storage.toString());
                    break;
/*                case 5:
                    storage.sort((String[]) storage.toArray());
                    System.out.println(storage.toString());
                    break;*/
                case 5:
                    System.out.print("Exit");
                    break;
                default : break;
            }
        }
        s.close();
    }
    public static void show() {
        System.out.println("Menu:");
        System.out.println("1 -> Element Addition");
        System.out.println("2 -> Element Deletion");
        System.out.println("3 -> Clear All");
        System.out.println("4 -> All Elements");
        System.out.println("5 -> Exit");
    }
}
