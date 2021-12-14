package pkg;

public class Enseignant extends Ecole{
    // Instituation class
    public int AfficherNum(int num) { return num; }
    public String AfficherSeance(String str) { return str; }


    // Ecole class
    public int AvoirNum() { return 0; }
    public String AvoirSeance(int num) {
        if (num == 1) return "Seance course";
        if (num == 2) return "Seance TD";
        if (num == 3) return "Seance TP";
        return "Error";
    }


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
                int state = 5;
                while(state != 0) {
                    if (NumSeance != -1)
                        SeanceType = AvoirSeance(NumSeance);
                    if (SeanceType != "Error")
                        state = 1;
                    state--;
                }
            }
        });
        return t;
    }
}
