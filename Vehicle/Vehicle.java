public abstract class Vehicle {

    private String brand;
    private int kilometers;

    public Vehicle(String brandValue, int kilometersValue) {
        this.brand = brandValue;
        this.kilometers = kilometersValue;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setKilometers(int newKilometers) {
        this.kilometers = newKilometers;
    }

    public abstract String doStuff();

}