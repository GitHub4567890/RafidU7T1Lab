import java.util.ArrayList;
public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Bob");
        Cat cat2 = new Cat("Professional Bob");
        Cat cat3 = new Cat("Furnished Bob");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Patient Bob");
        Cat replacedCat = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replacedCat);

        cat4.setName("Patient Bob Meow");
    }
}