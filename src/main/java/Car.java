public class Car implements Tradable, Drivable{

    public String name;
    private int price;
    private int maximumSpeed;

    /**
     * Set up a Car with the given name, price, and the maximum speed
     *
     * @param name          The name of the car
     * @param price         The price of the car
     * @param maximumSpeed  The maximum speed of the car
     */
    public Car(String name, int price, int maximumSpeed){
        this.name = name;
        this.price = price;
        this.maximumSpeed = maximumSpeed;
    }

    /**
     * Return the price of the car
     *
     * @return  the price of the car
     */
    @Override
    public int getPrice(){
        return this.price;
    }

    /**
     * Upgrade the maximum speed of the car with the given number n
     */
    @Override
    public void upgradeSpeed() {
        this.maximumSpeed ++;
    }


    /**
     * Downgrade the maximum speed of the car with the given number n
     */
    @Override
    public void downgradeSpeed(){
        this.maximumSpeed --;
    }

    /*
    Missing documentation
     */
    @Override
    public int getMaxSpeed() {
        return this.maximumSpeed;
    }
}
