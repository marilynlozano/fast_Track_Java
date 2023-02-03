package review2;

public interface Shopping {

    public abstract void buyItem();
    void returnItem();

}

abstract class Store implements Shopping{
    public abstract void openDoor();
}

class Walmart extends Store{
    @Override
    public void buyItem() {
        System.out.println("Buying item from walmart");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to walmart");
    }

    @Override
    public void openDoor() {
        System.out.println("Walmart door opening");
    }
}

class StoreRunner{
    public static void main(String[] args) {
//        Shopping shopping = new Shopping();
//        Store store = new Store();

        Walmart walmart = new Walmart();
        walmart.buyItem();
        walmart.openDoor();

        Shopping walmart2 = new Walmart();
        walmart2.buyItem();
//        walmart2.openDoor();
        ((Store)walmart2).openDoor();

        Store walmart3 = new Walmart();
        walmart3.buyItem();
        walmart3.openDoor();

    }
}