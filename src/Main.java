public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Car1", 4);
        Car car2 = new Car("Car2", 4);

        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle1 = new Bicycle("bicycle2", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Transport[] transports = {
                car1,
                car2,
                truck1,
                truck2,
                bicycle1,
                bicycle2
        };

        for (Transport t: transports){
            t.servers();
            System.out.println( );
        }
    }
}