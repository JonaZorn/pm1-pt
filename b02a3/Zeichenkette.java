public class Zeichenkette {
    public static String grussMitZeit(int u, String n){
        String m = "Guten Morgen, ";
        String a = "Guten Abend, ";
        String t = "Guten Tag, ";
        if(u <= 12){
            String ausgabe = m + n + "!";
            return ausgabe;
        } if(u <= 18){
            String ausgabe = t + n + "!";
            return ausgabe;
        } else {
            String ausgabe = a + n + "!";
            return ausgabe;
        }
    }
    public static String zitronenEis(int n){
        String l = "leckeres ";
        String e = "Zitroneneis";
        String s = "";
        String z = "";
        String r = "";
        int i = 0;
        while (i < n) {
            z = z + "Z";
            s = s + "super";
            r = s + l + z + e;
            i = i + 1;
            }
        return r;
    }
}