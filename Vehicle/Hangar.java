public class Hangar {

    public static void main(String[] args) {

        Car renault = new Car("Renault", 15000);
        Boat titanic = new Boat("Titanic", 150);

        System.out.println(renault.doStuff());
        System.out.println(titanic.doStuff());

    }
}