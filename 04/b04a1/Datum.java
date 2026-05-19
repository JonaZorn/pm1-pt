//Mein erster Versuch
public class Datum{
    public static int istSchaltjahr(int j){
        boolean istSchaltjahr = (j < 1583 & j % 4 == 0) | (j >= 1583 & (j % 400 == 0 | (j % 4 == 0 & j % 100 != 0)));
        int erg = istSchaltjahr ? 1:0;
        return erg;
    
    }

}
    

