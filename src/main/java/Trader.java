/* This file contains a single class, Trader, which has been implemented
 * for you. Read through the Trader code and the documentation to understand
 * what it does.
 *
 * Handle the TODOs in the main method as needed.
 */

import java.util.*;


public class Trader {
    private ArrayList<Tradable> inventory;
    private ArrayList<Tradable> wishlist;
    private int money;


    /**
     * Construct a Trader, randomly giving them both an inventory and
     * a wishlist using the items in item_list.
     *
     * @param item_list A List of Tradable objects that may be placed in
     *                  either this Trader's inventory or wishlist.
     */
    public Trader(List<Tradable> item_list) {
        // Select a random number between [20, 120) for money
        Random randomizer = new Random();
        this.money = randomizer.nextInt(100) + 20;

        // Select a random subset of item_list for the inventory
        // and wishlist.
        ArrayList<Tradable> copy = new ArrayList<Tradable>(item_list);
        Collections.shuffle(copy);

        int max_size = (copy.size() - 1) / 2;
        int num_inventory_items = randomizer.nextInt(max_size) + 1;
        int num_wishlist_items = randomizer.nextInt(max_size) + 1;

        // Add the relevant items to the inventory and wishlist
        this.inventory = new ArrayList<>(copy.subList(0, num_inventory_items));
        this.wishlist = new ArrayList<>(copy.subList(num_inventory_items,
                num_inventory_items + num_wishlist_items));
    }

    /**
     * Exchange money from other to this Trader according to the price of item,
     * if other has enough money. Otherwise, returns False.
     *
     * @return True if the exchange was completed.
     */
    public boolean exchangeMoney(Trader other, Tradable item) {
        if (item.getPrice() <= other.money) {
            other.money -= item.getPrice();
            this.money += item.getPrice();
            return true;
        }
        return false;
    }

    /**
     * Attempt to sell all items that are in both this Trader's inventory
     * and in other's wishlist.
     *
     * @return True iff at least one item was sold from this Trader to other
     */
    public boolean sellTo(Trader other) {
        boolean sold_at_least_one = false;
        List<Tradable> temp = new ArrayList<>();

        for (Tradable item : this.inventory) {
            if (other.wishlist.contains(item) && exchangeMoney(other, item)) {
                temp.add(item);
                sold_at_least_one = true;
            }
        }

        this.inventory.removeAll(temp);
        other.inventory.addAll(temp);
        other.wishlist.removeAll(temp);

        return sold_at_least_one;
    }

    /**
     * Buy items from other.
     *
     * @return True iff at least one item was bought from other.
     */
    public boolean buyFrom(Trader other) {
        return other.sellTo(this);
    }

    public static void main(String[] args) {
        /* After writing your own Tradable object, add an instance
         * (or multiple instances of it) to the all_items list below.
         */
        List<Tradable> all_items = Arrays.asList(
                new Horse(),
                new Horse(),
                new Horse()
                // TODO: Add Tradable objects here!
        );

        /* Below, we've created two Traders. Their money, inventory, and
         * wishlists are randomly generated (see the constructor above).
         */
        Trader trader1 = new Trader(all_items);
        Trader trader2 = new Trader(all_items);

        System.out.println("Trader 1 details:\n" + trader1);
        System.out.println("Trader 2 details:\n" + trader2);

        int i = 1;
        while (trader2.buyFrom(trader1) || trader1.buyFrom(trader2)) {
            System.out.println("=== Trade iteration " + i + "results ===");
            System.out.println("Trader 1 details:\n" + trader1);
            System.out.println("Trader 2 details:\n" + trader2);
            i++;
        }
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder("-- Inventory --\n");

        for (Tradable item : this.inventory) {
            details.append(item.toString()).append("\n");
        }

        details.append("-- Wishlist --\n");
        for (Tradable item : this.wishlist) {
            details.append(item.toString()).append("\n");
        }

        return details.toString();
    }

}