public class Database {
    Car[] cars = new Car[5];

    Database() {
        this.cars[0] = new Car("BMW", "3", 300.00, "KR11");
        this.cars[1] = new Car("Audi", "A3", 200.00, "KR22");
        this.cars[2] = new Car("Toyota", "Corolla", 150.00, "KR33");
        this.cars[3] = new Car("Kia", "Seed", 150.00, "KR44");
        this.cars[4] = new Car("BMW", "5", 350.00, "KR55");
    }

    boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate)) {
                if(!car.isRent()) {
                    car.setRent(true);
                    return true;
                }
                break;
            }
        }

        return false;
    }
}
