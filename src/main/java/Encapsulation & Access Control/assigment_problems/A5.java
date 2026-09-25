public class A5 {
    private final String id;
    private final int[] prices;
    private int count;

    A5(String id, int size) {
        this.id = id;
        prices = new int[size];
        count = 0;
    }

    void addItem(int price) {
        if (count < prices.length) {
            prices[count] = price;
            count++;
        }
    }

    int getTotal() {
        int total = 0;

        for (int i = 0; i < count; i++)
            total = total + prices[i];

        return total;
    }

    int getItemCount() {
        return count;
    }

    public static void main(String[] args) {
        A5 cart = new A5("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println(cart.getTotal());
        System.out.println(cart.getItemCount());
    }
}