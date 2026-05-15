public class Zeit{
    public static int tage(int z){
        return z / 1440;

    }
    public static int stunden(int z) {
        int restMinuten = z % 1440; 
        return restMinuten / 60;
    }
    public static int minuten(int z) {
        return z % 60;
    }
    public static String dauer(int z) {
        return z + " Minuten: " + tage(z) + ":" + stunden(z) + ":" + minuten(z);
    }
}