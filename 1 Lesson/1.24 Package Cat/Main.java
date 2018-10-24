public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat ();
        Cat cat2 = new Cat ();

        cat1.name = "Sam";
        cat1.weight = 4;
        cat1.color = "black";
        cat1.sex = "male";
        cat1.age = 1;

        cat1.pasport();
        cat1.updates();
        cat1.voice();
        cat1.eat();
        cat1.updates();
        cat1.voice();

        cat2.name = "Fiona";
        cat2.weight = 6;
        cat2.color = "ginger";
        cat2.sex = "female";
        cat2.age = 3;

        cat2.pasport();
        cat2.updates();
        cat2.voice();
        cat2.eat();
        cat2.voice();
        cat2.eat();
        cat2.updates();

    }
}
