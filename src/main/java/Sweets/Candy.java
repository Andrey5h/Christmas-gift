package Sweets;

public class Candy extends Sweets {
private int uniqueIdentifierOfCandy; // Поля класса

    // Конструктор
    public Candy(String name, int weight, int price, int uniqueIdentifierOfCandy) {
        super(name, weight, price);
        this.uniqueIdentifierOfCandy = uniqueIdentifierOfCandy;

    }

    public int getUniqueIdentifierOfCandy() {
        return uniqueIdentifierOfCandy;
    }

    public void setUniqueIdentifierOfCandy(int uniqueIdentifierOfCandy) {
        this.uniqueIdentifierOfCandy = uniqueIdentifierOfCandy;
    }

    @Override
    public String toString() {
        return  "Candy is [ " +super.toString()+ "; uniqueIdentifierOfCandy = " +uniqueIdentifierOfCandy + " ]";
    }
}


