interface Servicing {
    int getServiceTime();
}

class Car implements Servicing {
    public int getServiceTime() { return 120; }
}

class Bike implements Servicing {
    public int getServiceTime() { return 45; }
}

public class ServiceDemo {
    public static void main(String[] args) {
        Servicing car = new Car();
        Servicing bike = new Bike();
        System.out.println("Car service time: " + car.getServiceTime() + " minutes");
        System.out.println("Bike service time: " + bike.getServiceTime() + " minutes");
    }
}