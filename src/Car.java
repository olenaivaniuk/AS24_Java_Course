public class Car {


    private int doorNumber;
    boolean sunroof;
    String make;

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) throws Exception{
        try {
        if(doorNumber > 0 && doorNumber <=7) {
            this.doorNumber = doorNumber;
        }
        else {
            throw new Exception("Door number " + doorNumber + " is invalid");

        }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    int horsepower;
    private int currentSpeed;
    boolean sunroofIsOpen;

     public int getCurrentSpeed() {
        return currentSpeed;
    }


    void setCurrentSpeed(int speed) throws Exception {
        try {
            if (speed >= 0 && speed < 300) {
                currentSpeed = speed;
            } else {
                throw new Exception("Speed " + speed + " is invalid");
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

        void carBreak () {
        currentSpeed = 0;
    }
    void openSunroof () {
        sunroofIsOpen = true;
    }




    public static void main(String[] args) throws Exception{
        Car maxCar;

        maxCar = new Car();

        maxCar.doorNumber = 2;
        maxCar.setCurrentSpeed(50);

        System.out.println("The current speed is " + maxCar.currentSpeed);

        maxCar.openSunroof();
        if (maxCar.sunroofIsOpen) {
            System.out.println("The roof is open");
        }

        else {
            System.out.println("The sunroof is closed");
        }

        maxCar.carBreak();
        System.out.print("The car is breaking and the speed is " + maxCar.currentSpeed);


    }
}




