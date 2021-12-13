package pkg;
abstract class Ecole implements Instituation {
    static public String Signature() { return ""; }
    
    abstract public int AvoirNum();
    abstract public String AvoirSeance(int num);
}
