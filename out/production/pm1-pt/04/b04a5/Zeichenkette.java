public class Zeichenkette{
    public static String verkuerze(String s, int n){
        int r1 = s.length();
        if((n + n) < (r1 - 5)){
         String s1 = s.substring(0,n);
         String s2 = s.substring(r1 - n ,r1);
         String zeichen = "[...]";
         String zurück = s1 + zeichen + s2;
        return zurück;
        }
        return s;
    }
}