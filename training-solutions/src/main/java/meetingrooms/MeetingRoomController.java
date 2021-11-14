package meetingrooms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MeetingRoomController {
    private final Office office = new Office();

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }

    public void readOffice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg a tárgyaló nevét: ");
        String name = scanner.nextLine();
        System.out.print("Add meg a tárgyaló hosszát egész méterben: ");
        int length = scanner.nextInt();
        System.out.print("Add meg a tárgyaló szélességét egész méterben: ");
        int width = scanner.nextInt();
        scanner.nextLine();
        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }

    public void printMenu() {
        List<String> menu = Arrays.asList(
                "1. Tárgyaló rögzítése",
                "2. Tárgyalók sorrendben",
                "3. Tárgyalók visszafele sorrendben",
                "4. Minden második tárgyaló",
                "5. Területek",
                "6. Keresés pontos név alapján",
                "7. Keresés névtöredék alapján",
                "8. Keresés terület alapján",
                "9. Kilépés\n"
        );

        System.out.println();
        for (String menuItem : menu) {
            System.out.println(menuItem);
        }
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int button;
        do {
            printMenu();
            System.out.print("Válassz egy menüpontot: ");
            button = scanner.nextInt();
            scanner.nextLine();
            switch (button) {
                case 1:
                    readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;
                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    System.out.print("Add meg a keresendő tágyaló nevét: ");
                    String name = scanner.nextLine();
                    office.printMeetingRoomsWithName(name);
                    break;
                case 7:
                    System.out.print("Add meg a keresendő tárgyaló névtöredékét: ");
                    String part = scanner.nextLine();
                    office.printMeetingRoomsContains(part);
                    break;
                case 8:
                    System.out.print("Add meg a tárgyaló területét: ");
                    int area = scanner.nextInt();
                    scanner.nextLine();
                    office.printAreasLargerThan(area);
                    break;
                default:
            }
        } while (button != 9);
    }
}