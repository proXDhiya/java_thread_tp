package pkg;
abstract class Ecole implements Instituation {
    public int AfficherNum(int num) {
        return 0;
    }

    public int AfficherSeance(String str) {
        return 0;
    }

    public String Signature() {
        return "Nan";
    }

    abstract public int AvoirNum();
    abstract public String AvoirSeance(int num);
}
