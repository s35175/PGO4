public class MenuItem {
    private String code;
    private String name;
    private double price;
    private String category;
    private static int productCount = 0;

    public MenuItem(String code, String name, double price, String category) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.category = category;
        productCount++;
    }

    public String getCode() { return code; }
    public double getPrice() { return price; }
    public static int getProductCount() { return productCount; }

    @Override
    public String toString() {
        return "MenuItem{code='" + code + "', name='" + name + "', price=" + price + ", category='" + category + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MenuItem menuItem = (MenuItem) obj;
        return code.equals(menuItem.code);
    }
}
