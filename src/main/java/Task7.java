public class Task7 {
    public static void main(String[] args) {
        int allWeight = 7;
        float small = (float) 0.250;
        float big = (float) 0.5;
        int time1 = (int) (allWeight / small);
        int time2 = (int) (allWeight / big);
        System.out.println(time1 + " дней");
        System.out.println(time2 + " дней");
        int average=(time1+time2)/2;
        System.out.println("В средне потребуеться ");
    }
}
