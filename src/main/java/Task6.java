public class Task6 {
    public static void main(String[] args) {
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int agge = 4 * 70;
        int allWeight = banana + milk + iceCream + agge;
        float kilo = (float) allWeight / 1000;
        System.out.println("Общий вес завтрака в граммах - " + allWeight);
        System.out.println("Общий вес завтрака в килограммах - " + kilo);
    }
}
