public class ClassForObjectCar {
    private int currentGear;
    private String color;
    private String make;
    private int numberOfDoors;
    private int maxSpeed;
    private boolean doorIsOpen;
    private int currentSpeed;

    public ClassForObjectCar(int currentGear, String color, String make, int numberOfDoors, int maxSpeed, boolean doorIsOpen, int currentSpeed) {
        this.currentGear = currentGear;
        this.color = color;
        this.make = make;
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
        this.doorIsOpen = doorIsOpen;
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isDoorIsOpen() {
        return doorIsOpen;
    }

    public void setDoorIsOpen(boolean doorIsOpen) {
        this.doorIsOpen = doorIsOpen;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    void changeSpeed(int speed) {
        this.currentSpeed = speed;
    }

    void openTheDoor() {
        this.doorIsOpen = true;
    }

    void breake() {
        this.currentSpeed = 0;
    }

    void changeColor(String color) {
        this.color = color;
    }

    int paymentForHightSpeed (int currentSpeed, int maxAlowedSpeed) {
        int pay = 0;
        if(currentSpeed >= maxAlowedSpeed) {
            pay = 200;
        }
        else
            pay = 0;
        return pay;
    }


}
