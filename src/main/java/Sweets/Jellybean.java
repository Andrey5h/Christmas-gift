package Sweets;

public class Jellybean extends Sweets {

    private int uniqueIdentificatorOfJellybean; // Поля класса

    // Конструктор
    public Jellybean(String name, int weight, int price, int uniqueIdentificatorOfJellybean) {
        super(name, weight, price);
        this.uniqueIdentificatorOfJellybean = uniqueIdentificatorOfJellybean;
    }

    public int getUniqueIdentificatorOfJellybean() {
        return uniqueIdentificatorOfJellybean;
    }

    public void setUniqueIdentificatorOfJellybean(int uniqueIdentificatorOfJellybean) {
        this.uniqueIdentificatorOfJellybean = uniqueIdentificatorOfJellybean;
    }

    @Override
    public String toString() {
        return "Jellybeen is [ " +super.toString() + "; uniqueIdentificatorOfJellybean = " + uniqueIdentificatorOfJellybean + " ]";
    }
}
