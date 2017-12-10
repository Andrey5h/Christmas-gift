package Sweets;

public abstract class Sweets {

    private String name;  // Поля класса
    private int weight; // Поля класса
    private int price; // Поля класса

    // Конструктор
    public Sweets(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name = " +name + "; Weight = " +weight+ "; Price = " +price;
    }
}
