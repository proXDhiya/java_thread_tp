import pkg.*;

public class mainClass {
    public static void main(String[] arg) {
        // Create a new object from class Etudiant
        Etudiant etudiant = new Etudiant();

        // Create a new object from class Secretaire
        Secretaire secretaire = new Secretaire();

        // Create a new object from class Enseignant
        Enseignant enseignant = new Enseignant();

        enseignant.ThreadEnseignant().start();
        etudiant.ThreadEtudiant().start();
        secretaire.ThreadSecretaire().start();   
    }
}
