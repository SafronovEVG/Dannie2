public class Task5 {
    public static void main(String[] arg) {
        short tin = 120;
        short whiteTin = 2;
        short brownTin = 4;
        int classes = tin / (whiteTin + brownTin);
        int allWhiteTine = classes * whiteTin;
        int allBrownTine = classes * brownTin;
        System.out.println("В школе, где " + classes + " классов, нужно " + allBrownTine + " банок коричневой и " + allWhiteTine + " банок белой краски");
    }
}
