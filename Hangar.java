public class Hangar {
    public static void main(String[] args) {
        Car car1  = new Car("Seat", 200 );
        System.out.println(car1.doStuff());

        Boat boat1 = new Boat("White Ocean", 8000);
        System.out.println(boat1.doStuff());
    }
}