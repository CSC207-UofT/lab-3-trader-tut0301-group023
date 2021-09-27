public class Car implements Tradable, Drivable {
    private int maxSpeed;
    public Car() {
        this.maxSpeed = 100;

    }

    @Override
    public int getPrice() {
        return 1000;
    }

    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 100;
    }

    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 100;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}