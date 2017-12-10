package Sweets;

 public class Cake extends Sweets {
     private int uniqueIdentificatorOfCake; // Поля класса

     // Конструктор
     public Cake(String name, int weight, int price, int uniqueIdentificatorOfCake) {
         super(name, weight, price);
         this.uniqueIdentificatorOfCake = uniqueIdentificatorOfCake;
     }

     public int getUniqueIdentificatorOfCake() {
         return uniqueIdentificatorOfCake;
     }

     public void setUniqueIdentificatorOfCake(int uniqueIdentificatorOfCake) {
         this.uniqueIdentificatorOfCake = uniqueIdentificatorOfCake;
     }

     @Override
     public String toString() {
         return "Cake is [ " +super.toString()+ "; uniqueIdentificatorOfCake = " +uniqueIdentificatorOfCake+" ]";
     }
 }
