import java.util.Scanner;
    public class Zeichenkette {
        public static boolean istPalindromLoop(String s) {
            int l = 0;
            int r = s.length() - 1;
            while (l < r) {
                if (Character.toLowerCase(s.charAt(l)) != 
                    Character.toLowerCase(s.charAt(r))) {
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }
        
        public static boolean istPalindromRek(String s, int l, int r) {
            if (l >= r) return true;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
            return istPalindromRek(s, l, r);
        }
        
        public static boolean istPalindromRek(String s) {
            return istPalindromRek(s, 0, s.length() - 1);
        }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Wort eingeben: ");
            String e = sc.nextLine();
            System.out.println("Mit Loop: " + istPalindromLoop(e));
            System.out.println("Mit Rek: " + istPalindromRek(e));
            
            sc.close();
    }
}