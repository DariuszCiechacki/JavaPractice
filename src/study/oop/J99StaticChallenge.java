package study.oop;

class Item {
    public static int numItems = 0;
    final int ID;

    public Item(int Id) {
        ID = Id;
    }

    public static int getNextId() {
        return Item.numItems++;
    }

    public static Item getItem() {
        int id = Item.getNextId();
        Item item = new Item(id);
        return item;
    }

    public static void printNumbItems() {
        System.out.println("Num items: " + Item.numItems);
    }
}

public class J99StaticChallenge {
//dsadsa
}
