package pkg;
abstract class Ecole implements Instituation {
    public String Signature() {
        return "Nan";
    }

    abstract public int AvoirNum();
    abstract public String AvoirSeance(int num);
}
