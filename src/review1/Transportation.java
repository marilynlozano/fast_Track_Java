package review1;

public class Transportation {

    int numberOfPassengers;
    int fuelCapacity;
    Company company;
    static int a = 5;

    public Transportation(int numberOfPassengers, int fuelCapacity) {
        this.numberOfPassengers = numberOfPassengers;
        this.fuelCapacity = fuelCapacity;
    }
}

class Car extends Transportation{
    static int a = 10;
    public Car(int numberOfPassengers, int fuelCapacity){
        super(numberOfPassengers, fuelCapacity);
    }
}

// Car is a Transportation
// Car has a Company

class Main {
    public static void main(String[] args) {
       //System.out.println(new Car(4, 50).company.name);

        Car car = new Car(4, 30);
        car.company = new Company("Java");
        System.out.println(car.company.name);

        System.out.println(Transportation.a);
        System.out.println(Car.a);
    }
}

class AirPlane extends Transportation{
    public AirPlane(int numberOfPassengers, int fuelCapacity) {
        super(numberOfPassengers, fuelCapacity);
    }
}

class Company {
    String name;
    int numberOfEmployees;

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, int numberOfEmployees) {
        this(name);
        this.numberOfEmployees = numberOfEmployees;
    }
}