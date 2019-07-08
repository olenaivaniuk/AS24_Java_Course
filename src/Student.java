public class Student extends Human{

    boolean takesNote;
    boolean practices;

    void learn(){
        super.learn();
        takesNote = true;
        practices = true;
    }

    Student(String name, String eyeColor) {
        super(name);
        this.eyeColor = eyeColor;
        takesNote = false;
        practices = false;
    }


    void drinks(int alcoholAmountML) throws InterruptedException {
        for(int i = 1; i< alcoholAmountML; i++) {
            System.out.println(name + " drinks ");
            alcoholInBlood++;
            System.out.println(name + " has " + alcoholInBlood + " ml alcohol in blood");
            Thread.sleep(4000);
            if(alcoholInBlood > 5) {
                System.out.println(name + " is unconciouse");
            }
        }
        System.out.println("Nie wieder Alkohol");
    }

    void drinks(String brandName) throws InterruptedException {

        System.out.println("I like to drink " + brandName);
    }

    void printLearnStatus() {
        super.printLearnStatus();

        if(takesNote) {
            System.out.println("I read books");
        } else {
            System.out.println("I DID NOT read books");
        }

        if(practices) {
            System.out.println("I watch Doku");
        } else {
            System.out.println("I DID NOT watch Doku");
        }
    }


}