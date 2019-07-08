public class ParkingLot  {

    public static void main (String[] args) throws Exception {
        Car [] cars = new Car[5];

        for (int i = 0; i<cars.length; i++) {
            cars[i] = new Car();

        }
        cars[0].setCurrentSpeed(4009);
        //cars[0].setCurrentSpeed(90);
        System.out.println("Current speed " + cars[0].getCurrentSpeed());


        System.out.println("Number of doors is " +cars[1].getDoorNumber());
        cars[1].setDoorNumber(10);
        cars[1].setDoorNumber(5);
        System.out.println("Number of doors is " +cars[1].getDoorNumber());

    }
}
