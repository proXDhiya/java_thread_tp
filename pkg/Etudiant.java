package pkg;

public class Etudiant extends Ecole{
    // Instituation class
    public int AfficherNum(int num) { return num; }
    public String AfficherSeance(String str) { return str; }


    // Ecole class
    public int AvoirNum() { return 0; }
    public String AvoirSeance(int num) { return ""; }


    // Etudiant ovrride signature
    @Override
    public String Signature() { return "Etudiant Signature"; }


    // Thread logic
    public Thread ThreadEtudiant() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int state = 3;
                while (state != 0) {
                    if (NumSeance != -1) {
                        System.out.println(Signature());
                        System.out.println(AfficherNum(NumSeance));
                        System.out.println(AfficherSeance(SeanceType));
                        state = 1;
                    }
                    state--;
                }
            }
        });
        return t;
    }
}
