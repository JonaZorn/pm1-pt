public class Zeit{
    public static String istSchaltjahr(int j){
        if(j < 1583){
            if(j % 4 == 0){
                return "Das Jahr " + j + " ist im Julianischer Kalender ein Schaltjahr.";
                }   return "Das Jahr " + j + " ist ein Jahr im Julianischer Kalender.";
            } if(j >= 1583){
                if(j % 4 == 0){
                    if(j % 100 == 0 && j % 400 == 0){
                        return "Das Jahr " + j + " ist im Gregorianischer Kalender ein Schaltjahr.";
                    }
                }
            } else {
            return "Das Jahr "+ j +" ist ein Jahr im Gregorianischer Kalender";
        }
        return "Das Jahr "+ j +" ist ein Jahr im Gregorianischer Kalender";
    }
}