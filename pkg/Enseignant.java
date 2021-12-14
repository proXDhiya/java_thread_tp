package pkg;

public class Enseignant extends Ecole{
    // Instituation class
    public int AfficherNum(int num) { return num; }
    public String AfficherSeance(String str) { return str; }
    // Ecole class
    public int AvoirNum() { return 0; }


    // Enseignant implementation AvoirSeance
    public String AvoirSeance(int num) {
        if (num == 1) return "Seance course";
        if (num == 2) return "Seance TD";
        return "Seance TP";
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
                int state = 1;
                do {
                    // critical section
                    if (NumSeance != -1) SeanceType = AvoirSeance(NumSeance);
                }while(state++ != 5);
            }
        });
        return t;
    }
}
