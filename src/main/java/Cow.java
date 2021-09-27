public class Cow implements Tradable, Domesticatable{

    /**
     * Return the price of the cow.
     *
     * @return the price.
     */
    @Override
    public int getPrice() {
        return 7;
    }

    /**
     * Return the sound made by this creature.
     *
     * @return The sound made by this creature.
     **/
    @Override
    public String sound() {
        return "Moo";
    }
}
