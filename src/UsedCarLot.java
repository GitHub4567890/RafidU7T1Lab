import java.util.ArrayList;
public class UsedCarLot {
    ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public void addCar(Car aaa) {
        inventory.add(aaa);
    }

    public boolean swap(int one, int two) {
        if (inventory.size() <= one || inventory.size() <= two) {
            return false;
        }
        Car swap = inventory.get(one);
        inventory.set(one, inventory.get(two));
        inventory.set(two, swap);
        return true;
    }

    public ArrayList getInventory() {
        return inventory;
    }
}