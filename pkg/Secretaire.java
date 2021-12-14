package pkg;

public class Secretaire extends Ecole{
    // Instituation class
    public int AfficherNum(int num) { return num; }
    public String AfficherSeance(String str) { return str; }


    // Ecole class
    public int AvoirNum() {
        // cerate a reandom number between 1 and 3
        return (int) (Math.random() * 3) + 1;
    }
    public String AvoirSeance(int num) { return ""; }

    @Override
    public String Signature() { return "Secretaire Signature"; }

    // Thread logic
    public Thread ThreadSecretaire() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int state = 5;
                while(state != 0) {
                    System.out.println(Signature());
                    NumSeance = AvoirNum();
                    state--;
                }
            }
        });
        return t;
    }
}
