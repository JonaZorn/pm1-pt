public class Datum {
    private int jahr, monat, tag;
    private static String folge = "jmt";
    private static char zeichen = '-'; 
    
    public Datum(){
        this(1);
    }
    public Datum(int jahr){
        this(jahr, 1);
    }
    public Datum(int jahr, int monat){
        this(jahr, monat, 1);
    }
    public Datum(int jahr, int monat, int tag){
        this.jahr = jahr;
        this.monat = monat;
        this.tag = tag;
    }
    public Datum(Datum d){
        this(d.jahr, d.monat, d.tag);
    }
    public int jahr(){
        return jahr;
    }
    public int monat(){
        return monat;
    }
    public int tag(){
        return tag;
    }
    public boolean equals(Datum d){
        return jahr == d.jahr && monat == d.monat && tag == d.tag;
    }
    public boolean istFrueher(Datum d) {
        if (jahr != d.jahr){ 
            return jahr < d.jahr;
        }
        if (monat != d.monat){
            return monat < d.monat;
        }
        return tag < d.tag;
    }
    public String toString(){
        String j = "" + jahr;
        String m = (monat < 10 ? "0" : "") + monat;
        String t = (tag < 10 ? "0" : "") + tag;
        if(folge.equals("jmt")){
            return  j + zeichen + m + zeichen + t;
        } else if (folge.equals("tmj")){
            return  t + zeichen + m + zeichen + j;
        } else {
            return  m + zeichen + t + zeichen + j;
        }
    }
    public String nameFuerMonat(){
            String [] monate = {Januar, Februar, Maerz, April, Mai, Juni, Juli,
                                August, September, Oktober, November, Dezember};
            int m = monat -1;
            return monat[m];
        }/*
        public static String setFormatTZ(){

        }

        public static String toString(){

        }*/

    public static void setFormatRF(String rf) { 
        Datum.rf = rf; 
    }
    public static void setFormatTZ(char tz) { 
        Datum.tz = tz; 
    }
}

