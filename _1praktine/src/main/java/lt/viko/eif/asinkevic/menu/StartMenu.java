package lt.viko.eif.asinkevic.menu;

import lt.viko.eif.asinkevic.socket.JavaServer;
import java.util.Scanner;
import lt.viko.eif.asinkevic.socket.JavaClient;
import lt.viko.eif.asinkevic.db.DBLoader;

public class StartMenu {
    /**
     * Shows menu for selection
     */
    public static void showMenu() {
        System.out.println("Make a selection");
        System.out.println("-----------------");
        //System.out.printf("| 1)  %10s \n", " Load Students");
        System.out.printf("| 1)  %10s \n", " Ijungt Serveri");
        System.out.printf("| 2)  %10s \n", " Ijungt Clienta");
        System.out.printf("| 3)  %10s \n", " Uzkraut Duomenu baze");
        System.out.printf("| 4)  %10s \n", " Parodyt Duomenu bazes meniu");
        System.out.printf("| 5)  %7s \n", " Grizti ");

    }

    /**
     * Awaits user input
     * @return returns user input as integer
     */
    public static int selection() {
        Scanner UserInput = new Scanner(System.in);

        return UserInput.nextInt();
    }

    /**
     *  Menu function selection using switch case
     */
    public static void menuSelected() {
        int Input = selection();
        switch (Input) {
            case 1:
                JavaServer.startServer();

                break;
            case 2:
                JavaClient.startClient();

                break;
            case 3:
                DBLoader.SetupDB();
                Menu.showMenu();
                Menu.menuSelected();
                break;
            case 4:

                Menu.showMenu();
                Menu.menuSelected();
                break;

            case 5:
                System.out.println("END!");
                System.exit(0);
                break;
            default:
                System.out.println("Neteisingas ivedimas");
                showMenu();
                break;

        }
    }
}
