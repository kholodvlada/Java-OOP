public class Cat {

    String name;
    String sex;
    String color;
    String catcondition = "hungry"; //all cat's are hungry default
    int age;
    double weight;


    void eat() {
        System.out.println("Cat is eating");
        this.weight++;
        catcondition = "full";
    }

    void voice() {
        System.out.print("Cat say: ");
        if (catcondition == "hungry") {
            System.out.println("Meow, feed me, human!");
        } else {
            System.out.println("Prrr, I`m full, thx human"); //what`s mean I`m full
        }
    }

    void updates() {
        System.out.println("This cat is " + catcondition);
        System.out.println("Actual weight is " + weight + " kg");
    }

    void pasport() {
        System.out.println("");
        System.out.println("Cat`s BIO");
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Color " + color);
        System.out.println("");

    }
}
