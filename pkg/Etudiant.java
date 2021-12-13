package pkg;

public class Etudiant extends Ecole{
    // Instituation class
    public int AfficherNum(int num) { return num; }
    public String AfficherSeance(String str) { return str; }


    // Ecole class
    public int AvoirNum() { return 0; }
    public String AvoirSeance(int num) { return ""; }


    // Thread logic
    public Thread ThreadEtudiant = new Thread(new Runnable() {
        @Override
        public void run() {
            if (Instituation.NumSeance != -0) {
                System.out.println(Signature());
                System.out.println(AfficherNum(Instituation.NumSeance));
                System.out.println(AfficherSeance(Instituation.SeanceType));
            }
            
        }
    });
}
