public class DNA{
    public static String komplement(String a){
        String e = "";
        for(int i = 0; i < a.length(); i++){
            char b = a.charAt(i);
            if(b == 'A'){
                 e += 'T';
            } else if(b == 'T'){
                 e += 'A';
            } else if(b == 'C'){
                 e += 'G';
            } else {
                 e += 'C';
            }
        }
        return e;
    }

    public static void main(String[] args) {
    System.out.println(komplement("TGACCCTATGC"));
    }
}