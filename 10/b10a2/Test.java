public class Test {
    public static void main(String[] args) {
        Frau f1 = new Frau("Erika Musterfrau", 30, 170, 60);
        Mann m1 = new Mann("Max Mustermann", 41, 187, 79);
        Mann m2 = new Mann("Cristiano Ronaldo", 41, 187, 79);

        System.out.println(f1);
        System.out.println(m1);
        System.out.println(m2);

        System.out.println("Anzahl Menschen gesamt: " + Mensch.anzahl());
        System.out.println("Anzahl Frauen: " + Frau.anzahl());
        System.out.println("Anzahl Maenner: " + Mann.anzahl());

        System.out.println("Volljaehrigkeitsalter (statisch, ohne Instanz): "
                + Mensch.volljaehrigkeitsAlter());

        f1.setAlter(17);
        System.out.println(f1.name() + " volljaehrig? " + f1.istVolljaehrig());

        f1.setGroesse(180);
        f1.setGewicht(65);
        System.out.println("Neue angebliche Groesse: " + f1.groesse());
        System.out.println("Neues angebliches Gewicht: " + f1.gewicht());
    }
}