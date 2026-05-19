//Mein erster Versuch
public class Datum{
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

//a
     public static String istSchaltjahrA(int j){
        if(j < 1583){
            if(j % 4 == 0){
                return "Das Jahr " + j + " ist im Julianischer Kalender ein Schaltjahr.";
                } 
            return "Das Jahr " + j + " ist ein Jahr im Julianischer Kalender.";
            } if(j >= 1583){
                if(j % 4 == 0){
                    if(j % 100 == 0) {
                        if (j % 400 == 0){
                            return "Das Jahr " + j + " ist im Gregorianischer Kalender ein Schaltjahr.";
                        }
                    }
                }
            } else {
            return "Das Jahr "+ j +" ist ein Jahr im Gregorianischer Kalender";
        }
        return "Das Jahr "+ j +" ist ein Jahr im Gregorianischer Kalender";
    }

//b
     public static String istSchaltjahrB(int j){
        boolean istSchaltjahrB = (j < 1583 && j % 4 == 0) || (j >= 1583 && (j % 400 == 0 || (j % 4 == 0 && j % 100 != 0)));
        return "Das Jahr " + j + (istSchaltjahrB ? " ist ein Schaltjahr" : " ist kein Schaltjahr");
    }
    
//c
     public static String istSchaltjahrC(int j){
        if(j < 1583){
            if(j % 4 == 0){
                return "Das Jahr " + j + " ist im Julianischer Kalender ein Schaltjahr.";
                }   return "Das Jahr " + j + " ist ein Jahr im Julianischer Kalender.";
            } else {
                if(j >= 1583 && (j % 400 == 0 || (j % 4 == 0 && j % 100 != 0))){
                    return "Das Jahr " + j + " ist im Gregorianischer Kalender ein Schaltjahr.";
                    } else {
                    return "Das Jahr "+ j +" ist ein Jahr im Gregorianischer Kalender";
                } 
        } 
       
    }
}