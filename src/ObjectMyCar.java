public class ObjectMyCar {
    public static void main(String str[])  {

        ClassForObjectCar myBmw = new ClassForObjectCar(2, "Light blue", "Alpine", 5, 250, true, 120);
        /*myBmw.setColor("Blue");
        myBmw.setCurrentSpeed(100);
        myBmw.setDoorIsOpen(true); */
        myBmw.breake();
        System.out.println("Current speed is " + myBmw.getCurrentSpeed());

        myBmw.changeColor("Red");
        System.out.println("Color of my car is " + myBmw.getColor());

        myBmw.changeSpeed(200);
        System.out.println("Speed is " + myBmw.getCurrentSpeed());

        myBmw.openTheDoor();
        myBmw.setDoorIsOpen(false);
        if(myBmw.isDoorIsOpen()== true) {
            System.out.println("The doors are open");
        }
        else
            System.out.println("The doors are closed");

        myBmw.setMake("Mercedes-Benz");
        System.out.println("Make of my car is " + myBmw.getMake());

        System.out.println("You need to pay "+ myBmw.paymentForHightSpeed(240,130));


    }
}
