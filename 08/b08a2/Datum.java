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
     


    
    public String nameFuerMonat(Datum d){
        String[] mn ={"Januar",  "Februar", "Maerz", "April", "Mai", "Juni", "Juli", 
             "August", "September", "Oktober", "November", "Dezember"};
             int aus = monat - 1;
             return mn[aus];
    }
    public static int monatFuerName(String mfn){
        String[] mn ={"Januar",  "Februar", "Maerz", "April", "Mai", "Juni", "Juli", 
                      "August", "September", "Oktober", "November", "Dezember"};
        int a = 0;        
        while (a < mn.length && !mfn.equals(mn[a])) {
            a++;
        } 
        a = a + 1;
        return a;
    }
    public String toString(){
        String j = "" + jahr;
        String m = (monat < 10 ? "0" : "") + monat;
        String t = (tag < 10 ? "0" : "") + tag;
        String mn = nameFuerMonat(this);

        if (zeichen == '0') {
            if(folge.equals("jmt")){
                return  j + " " + mn + " " + t;
            } else if (folge.equals("tmj")){
                return  t + ". " + mn + " " + j;
            } else {
                return  mn + " " + t + ". " + j;
            }
        }
        
        if(folge.equals("jmt")){
            return  j + zeichen + m + zeichen + t;
        } else if (folge.equals("tmj")){
            return  t + zeichen + m + zeichen + j;
        } else {
            return  m + zeichen + t + zeichen + j;
        }
    } 



    //ist neu
    public boolean istSchaltjahr(Datum d){
        return jahr % 4 == 0 & (jahr < 1583 || jahr % 400 == 0 || jahr % 100 != 0);    
    }

    public int tageInMonat(Datum d) {
    if (monat < 1 || monat > 12) {
        throw new IllegalArgumentException("ungueltiger Wert fuer Monat: " + monat);
    }
    if (jahr < 1) {
        throw new IllegalArgumentException("ungueltiger Wert fuer Jahr: " + jahr);
    }

    boolean schaltjahr = jahr % 4 == 0 && (jahr < 1583 || jahr % 400 == 0 || jahr % 100 != 0);

    if (monat == 2) {
            return schaltjahr ? 29 : 28;
        } else if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
            return 30;
        } else {
            return 31;
        }
    }





    public static void setFormatRF(String rf) { 
        Datum.folge = rf; 
    }
    public static void setFormatTZ(char tz) { 
        Datum.zeichen = tz; 
    }
}

