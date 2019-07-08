
public class Human {
    String eyeColor;
    String name;
    int age;
    Sex sex;
    int friendsNo;
    boolean readsBook;
    boolean watchDoku;
    boolean stomachIsFull;
    double alcoholInBlood;


    Human() {
        alcoholInBlood = 0;
        age = 0;
        eyeColor = "Black";
    }


    Human(String name) {
        this();
        this.name = name;
    }




    void learn() {
        System.out.println(name + " says: I am learning now");
        readsBook = true;
    }

    void eats() {
        stomachIsFull = true;
    }

    void drinks() throws InterruptedException {
        System.out.println(name + "says I do not drink!!!");
    }

    void drinks(int value) throws InterruptedException {
        System.out.println(name + " says I drink " + value + " ml alcohol!");
    }

    void printMe() {
        System.out.println("My name is "+ name + " I am "+ age + " years old");
        System.out.println("My eye color is "+ eyeColor );
        System.out.println("Amount of alcohol is my blood is " +alcoholInBlood + " ml");

    }

    void printLearnStatus() {
        if(readsBook) {
            System.out.println("I read books");
        } else {
            System.out.println("I DID NOT read books");
        }

        if(watchDoku) {
            System.out.println("I watch Doku");
        } else {
            System.out.println("I DID NOT watch Doku");
        }
    }

}

enum Sex {
    FEMALE, MALE, DIVERSE;

}
