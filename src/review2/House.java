package review2;

import java.util.ArrayList;

public class House <T> {

    String location;
    int zipcode;

    void openDoor(T t){

    }

}


class Runner{
    public static void main(String[] args) {
        House<Double> house = new House<>();
        house.openDoor(6.6);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
    }
}
