package pkg;
abstract class Ecole implements Instituation {
    public static int NumSeance = -1;
    public static String SeanceType = "vide";

    public String Signature() { return ""; }
    
    abstract public int AvoirNum();
    abstract public String AvoirSeance(int num);
}
