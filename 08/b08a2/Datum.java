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
        switch(mfn){
            case "Januar":
                return 1;
            case "Februar":
                return 2;
            case "Maerz":
                return 3;
            case "April":
                return 4;
            case "Mai":
                return 5;
            case "Juni":
                return 6;
            case "Juli":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "Oktober":
                return 10;
            case "November":
                return 11;
            case "Dezember":
                return 12;
        }

        String[] mn ={};
        int a = 0;        
        while (a < mn.length && !mfn.equals(mn[a])) {
            a++;
        } 
        return a++;
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
    public int istSchaltjahr(Datum d){
        boolean jn = jahr % 4 == 0 & (jahr < 1583 || jahr % 400 == 0 || jahr % 100 != 0);    

        switch(monat){
            case 1:
                return 31;
            case 2:
                return (jn ? 29 : 28);
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
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