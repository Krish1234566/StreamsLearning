import java.util.Objects;

public class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product p = (Product) o;
        return price == p.price && name.equals(p.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " : " + price;
    }
}

