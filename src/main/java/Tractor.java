public class Tractor implements Drivable, Tradable{
    private int maxSpeed;

    public Tractor() { this.maxSpeed = 100;}

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 1000;
    }


}
