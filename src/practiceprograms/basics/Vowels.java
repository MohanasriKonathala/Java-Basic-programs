package basicprograms;

public class VowelAndConsonant {
    void vowcon(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println(c+"is vowel");
        }
        else{
            System.out.println(c+"is consonant");
        }
    }
    public static void main(String[] args) {
        VowelAndConsonant vc = new VowelAndConsonant();
        vc.vowcon('e');
        vc.vowcon('d');
    }
}
