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
                    try {
                        sem3.acquire();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (NumSeance != -1) {
                        System.out.println(Signature());
                        System.out.println("Num Seance : " + AfficherNum(NumSeance));
                        System.out.println("Seance Type : " + AfficherSeance(SeanceType));
                    }

                    sem1.release();
                    state--;
                }
            }
        });        
        return t;
    }
}