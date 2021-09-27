public class Skateboard implements Tradable, Drivable {
    private int maxSpeed;

    public Skateboard(int maxSpeed) { this.maxSpeed = maxSpeed; }

    @Override
    public void upgradeSpeed() { this.maxSpeed += 2; }

    @Override
    public void downgradeSpeed() {this.maxSpeed--; }

    @Override
    public int getMaxSpeed() { return this.maxSpeed; }

    @Override
    public int getPrice() { return 30; }

    @Override
    public String toString() {
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed + ")";
    }
}
