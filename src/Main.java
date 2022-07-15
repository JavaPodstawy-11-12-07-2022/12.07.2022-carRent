import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Scanner scanner = new Scanner(System.in);

        String choose;
        do {
            GUI.showMenu();
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    GUI.showCars(db.cars);
                    break;
                case "2":
                    System.out.println("Podaj numer rejestracyjny:");
                    GUI.showRentResult(db.rentCar(scanner.nextLine()));
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Nieprawilowy wybor !!");
                    break;
            }
        } while (!choose.equals("3"));
    }
}
