import pkg.*;

public class mainClass {
    public static void main(String[] arg) {
        // Create a new object from class Etudiant
        Etudiant etudiant = new Etudiant();

        // Create a new object from class Secretaire
        Secretaire secretaire = new Secretaire();

        // Create a new object from class Enseignant
        Enseignant enseignant = new Enseignant();
        
        secretaire.ThreadSecretaire().start();
        etudiant.ThreadEtudiant().start();
        enseignant.ThreadEnseignant().start();
        
        return;
    }
}
