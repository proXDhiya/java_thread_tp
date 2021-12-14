package pkg;
import java.util.concurrent.*;

abstract class Ecole implements Instituation {
    // global var
    public static int NumSeance = -1;
    public static String SeanceType = "vide";

    public String Signature() { return ""; }
    
    abstract public int AvoirNum();
    abstract public String AvoirSeance(int num);

    // make three semaphore for three thread
    Semaphore sem1 = new Semaphore(1);
    Semaphore sem2 = new Semaphore(0);
    Semaphore sem3 = new Semaphore(0);
}
