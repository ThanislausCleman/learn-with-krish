package Factory_Pattern;

public class SedanCar extends Car{

    SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building a Sedan Car.");
    }

}