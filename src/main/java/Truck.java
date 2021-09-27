public class Truck implements Tradable, Drivable {

    private int maxSpeed;

    private int PRICE;

    public Truck(){
        this.maxSpeed = 100;
        this.PRICE = 30000;
    }
    @Override
    public void upgradeSpeed(){
        this.maxSpeed++;
    }
    @Override
    public void downgradeSpeed(){
        this.maxSpeed--;
    }
    @Override
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    @Override
    public int getPrice() {
        return this.PRICE;
    }
}
