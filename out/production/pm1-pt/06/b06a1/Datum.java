public class Datum {
    private int jahr, monat, tag;
    private static String folge = "jmt";
    private static char zeichen = '-';
    
    public Datum(){
        this(1,1,1);
    }
    public Datum(int jahr){
        this(jahr, 1, 1);
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
        if (jahr != d.jahr) return jahr < d.jahr;
        if (monat != d.monat) return monat < d.monat;
        return tag < d.tag;
    }
    public String toString(){
        String j = "" + jahr;
        String m = (monat < 10 ? "0" : "") + monat;
        String t = (tag < 10 ? "0" : "") + tag;
        String ausgabe = "";
        if(folge.equals("jmt")){
            ausgabe = j + zeichen + m + zeichen + t;
        } else if (folge.equals("tmj")){
            ausgabe = t + zeichen + m + zeichen + j;
        } else {
            ausgabe = m + zeichen + t + zeichen + j;
        }
        return ausgabe;
    }
    public static void setFormatRF(String rf) { folge = rf; }
    public static void setFormatTZ(char tz) { zeichen = tz; }
    }

