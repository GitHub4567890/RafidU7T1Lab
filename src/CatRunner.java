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
        System.out.println(cat4.getName());
        System.out.println(cats);

        for (int i = 0; i <= cats.size() - 1; i++) {
            String catName = cats.get(i).getName();
            cats.get(i).setName(catName.toUpperCase());
        }
        System.out.println(cats);

        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}