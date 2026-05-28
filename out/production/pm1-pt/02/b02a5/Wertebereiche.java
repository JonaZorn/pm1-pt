public class Wertebereiche{
//Intervall [0;100].
    public static String a(int x){
        if(x <= 0 || x >= 100){
            return "Zahl x = "+ x +" ist kleiner als 0 oder größer als 100 und leigt nicht im Intervall.";
        } else {
            return "Zahl x = "+ x +" liegt im Intervall von 0 bis 100.";
        }
    }

//Intervall [-20;20] und [4;8].
    public static String b(int x){
        if(x < -20 || (x >= 4 && x <= 8) || x > 20 ){
            return "Die Zahl x = "+ x +" ist kleiner als -20, größer als 20 oder im Bereich [4;8].";
        } else {
            return "Zahl x = "+ x +" liegt im Intervall von -20 bis 20.";
        }
    }

// x gerade oder ungerade.
    public static String c(int x){
        if(x % 2 == 0){
            return "Die Zahl x = "+ x +" ist gerade.";
        } else {
            return "Die Zahl x = "+ x +" ist ungerade.";
        }
    }

// Ist x < y oder x, y > 12.
    public static String d(int x, int y){
        if(x < y ){
            return "Die Zahlen x = "+ x +" ist kleiner als y = "+ y +".";
        } if (x > 12 && y > 12){
            return "Die beiden Zahlen x = "+ x +" und y = "+ y +" sind größer als 12.";
        } else {
            return "Die Zahlen sind keins von beiden.";
        }
    }
}