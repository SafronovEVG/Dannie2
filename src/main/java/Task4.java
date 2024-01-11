public class Task4 {
    public static void main(String[] args) {
        int x = 16;
        int y = x * 30; //производимость в час
        float time20min = (float) 20 / 60;
        int day = 24;
        int freDay = 24 * 3;
        int month = 24 * 30;
        float time1 = y * time20min;
        int time2 = y * day;
        int time3 = y * freDay;
        int time4 = y * month;
        System.out.println("За " + time20min + " часа,машина произвела " + time1 + " бутылок");
        System.out.println("За " + day + " часа,машина произвела " + time2 + " бутылок");
        System.out.println("За " + freDay + " часа,машина произвела " + time3 + " бутылок");
        System.out.println("За " + month + " часа,машина произвела " + time4 + " бутылок");
    }
}
