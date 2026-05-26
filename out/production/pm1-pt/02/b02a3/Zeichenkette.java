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
    //Altervatieve
    return "Guten " + (u < 12 ? "Morgen, ": 
            (u < 18 ? "Tag, ": "Abend, ")) + "name" + "!";

    public static String zitronenEis(int n){
        String l = "leckeres ";
        String e = "Zitroneneis";
        int i = 0;
        while (i < n) {
            z = "Z" + e;
            s = "super" + l;
            i = i + 1;
            }
        return s + z;
    }
}