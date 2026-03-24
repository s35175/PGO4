import java.util.ArrayList;

public class Order {
    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<MenuItem> items;
    private boolean paid;
    private static int nextOrderNumber = 1000;

    public Order(CafeCustomer customer) {
        this.orderNumber = getNextOrderNumber();
        this.customer = customer;
        this.items = new ArrayList<>();
        this.paid = false;
    }

    public static int getNextOrderNumber() { return nextOrderNumber++; }
    public void addItem(MenuItem item) { items.add(item); }
    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) total += item.getPrice();
        return total;
    }
    public int countItems() { return items.size(); }
    public void markAsPaid() { this.paid = true; }

    @Override
    public String toString() {
        return "Order{orderNumber=" + orderNumber + ", customer=" + customer.getFullName() + 
               ", itemsCount=" + countItems() + ", total=" + calculateTotal() + ", paid=" + paid + "}";
    }
}
