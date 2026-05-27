public class Zeichenkette{
    public static String einfuegung(String s, String t, int p){
        int r1 = s.length();
        if(p <= r1){
         String s1 = s.substring(0,p);
         String s2 = s.substring(p ,r1);
        return s1 + t + s2;
        }
        return s + t + "        Zahl ist zu groß!";
    }
    public static String rueckwaerts (String t) {
        int l = 0;
        String wort = "";
        for (l = t.length(); l > 0; l--) {
            char c1 = t.charAt(l - 1);
            wort = wort + c1;
        }
        return wort;
    }
}