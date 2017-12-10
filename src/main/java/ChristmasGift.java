import Sweets.Cake;
import Sweets.Candy;
import Sweets.Jellybean;
import Sweets.Sweets;

public class ChristmasGift {
    public static void main(String[] args) {
        Candy candy = new Candy("Candy", 150, 800, 1);
        Jellybean jellybean = new Jellybean("Jellybeen", 50, 500, 2);
        Cake cake = new Cake("Cake", 500, 1200, 3);
        Sweets[] box = {cake, candy, jellybean};
        for (Sweets somePar : box) {
            System.out.println(somePar.toString());
        }
        //Сумма подарка
        int a = cake.getPrice() + candy.getPrice() + jellybean.getPrice();
        System.out.println("Price of ChristmasGift = " + a +" $");
        //Вес подарка
        int b = cake.getWeight() + candy.getWeight() + jellybean.getWeight();
        System.out.println("Weight of ChristmasGift = " + b+ " Кг");

    }
}
