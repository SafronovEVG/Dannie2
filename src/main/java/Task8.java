public class Task8 {
    public static void main(String[] args) {
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int masha2 = (int) (masha * 1.1);
        int denis2 = (int) (denis * 1.1);
        int kristina2 = (int) (kristina * 1.1);
        int yearsMoneyMasha = (masha2 * 12) - (masha * 12);
        int yearsMoneyDenis = (denis2 * 12) - (denis * 12);
        int yearsMoneyKristina = (kristina2 * 12) - (kristina * 12);
        System.out.println("Маша теперь получает - " + masha2 + " годовой доход вырос на - " + yearsMoneyMasha + " рублей");
        System.out.println("Деним теперь получает - " + denis2 + " годовой доход вырос на - " + yearsMoneyDenis + " рублей");
        System.out.println("Кристина теперь получает - " + kristina2 + " годовой доход вырос на - " + yearsMoneyKristina + " рублей");
    }
}
