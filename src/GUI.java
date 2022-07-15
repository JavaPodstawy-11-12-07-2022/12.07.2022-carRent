public class GUI {
    public static void showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
    }

    public static void showCars(Car[] cars) {
        for(Car car : cars) {
            StringBuilder sb = new StringBuilder();
            sb.append(car.getBrand())
                    .append(" ")
                    .append(car.getModel())
                    .append(" Cena: ")
                    .append(car.getPrice())
                    .append(" Rejestracja: ")
                    .append(car.getPlate())
                    .append(" ");
            if(car.isRent()) {
                sb.append("Zajety");
            } else {
                sb.append("Wolny");
            }
            System.out.println(sb.toString());
        }
    }

    public static void showRentResult(boolean rentResult) {
        if(rentResult) {
            System.out.println("Wypozyczono auto !!");
        } else {
            System.out.println("Nie ma takiego auta lub jest juz wypozyczone !!");
        }
    }
}
