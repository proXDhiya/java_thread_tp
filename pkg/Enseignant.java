package pkg;

public class Enseignant extends Ecole{
    // Instituation class
    public int AfficherNum(int num) { return num; }
    public String AfficherSeance(String str) { return str; }


    // Ecole class
    public int AvoirNum() { return 0; }
    public String AvoirSeance(int num) { return ""; }


    // Override Signature method
    @Override
    public String Signature() {
        return "Ensignant Signature";
    }


    // Thread logic
    public Thread ThreadEnseignant() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                if (NumSeance != -1)
                    AvoirSeance(NumSeance);
                if (NumSeance == 1)
                    ;
            }
        });
        return t;
    }
}
