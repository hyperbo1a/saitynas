package lt.viko.eif.asinkevic.menu;

import lt.viko.eif.asinkevic.db.DBLoader;
import lt.viko.eif.asinkevic.util.GenericPrint;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    /**
     * Database and XML function menu
     */
    public static void showMenu() {
        System.out.println("Make a selection");
        System.out.println("-----------------");
        System.out.printf("| 1)  %10s \n", " Uzkraut Reisus");
        System.out.printf("| 2)  %10s \n", " Uzkraut Autobusus");
        System.out.printf("| 3)  %10s \n", " Uzkraut Vairuotojus");
        System.out.printf("| 4)  %10s \n", " Uzkraut Uzsakovus");
        System.out.printf("| 5)  %10s \n", " Uzkraut Reisus XML ");
        System.out.printf("| 6)  %10s \n", " Uzkraut XML i objektus ");
        System.out.printf("| 7)  %7s \n", " Quit ");

    }



    /**
     * Awaits User Input
     *
     * @return returns selection
     */
    public static int selection() {
        Scanner UserInput = new Scanner(System.in);

        return UserInput.nextInt();
    }



    /**
     * User selection Switch that calls selected function
     */
    public static void menuSelected() {
        GenericPrint Printable = new GenericPrint();
        int Input = selection();
        switch (Input) {

            case 1:
                Printable.Print(Objects.requireNonNull(DBLoader.ListReisas()));

                showMenu();
                menuSelected();
                break;
            case 2:
                Printable.Print(Objects.requireNonNull(DBLoader.ListAutobusas()));
                showMenu();
                menuSelected();
                break;
            case 3:
                Printable.Print(Objects.requireNonNull(DBLoader.ListVairuotojas()));
                showMenu();
                menuSelected();
                break;
            case 4:
                Printable.Print(Objects.requireNonNull(DBLoader.ListUzsakovas()));
                showMenu();
                menuSelected();
                break;
            case 5:

                System.out.println(DBLoader.ListReisasXML());
                showMenu();
                menuSelected();
                break;
            case 6:
                DBLoader.ListXMLToObject();
                showMenu();
                menuSelected();
                break;
            case 7:
                StartMenu.showMenu();
                StartMenu.menuSelected();
                break;
            default:
                System.out.println("Neteisingas ivedimas");
                showMenu();
                break;

        }
    }
}
