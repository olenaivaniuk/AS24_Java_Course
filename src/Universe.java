public class Universe {

    public static void main(String str[]) throws InterruptedException {
        Student std1 = new Student("iva", "brown");


        std1.eats();
        std1.learn();
        std1.drinks(10);
        std1.printMe();
        System.out.println(std1.name + "says: I am a student, Before I learn I am like this: ");
        std1.printLearnStatus();
        std1.learn();
        std1.printLearnStatus();


        Student std2 = new Student("Max", "blueGrayish");
        std2.drinks("Paulaner");
        std2.printMe();

        Human human1 = new Human();
        human1.name = "Olena";
        human1.drinks(10);
        human1.printMe();
        System.out.println(human1.name + " says: I am a human, Before I learn I am like this: ");
        human1.printLearnStatus();
        human1.learn();
        human1.printLearnStatus();

    }
}