import java.util.Scanner;

public class GestionnaireNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie du nombre d'étudiants et de matières
        System.out.print("Entrez le nombre d'étudiants : ");
        int nombreEtudiants = scanner.nextInt();
        System.out.print("Entrez le nombre de matières : ");
        int nombreMatieres = scanner.nextInt();

        String[] etudiants = new String[nombreEtudiants];
        double[][] notes = new double[nombreEtudiants][nombreMatieres];

        // Saisie des noms et notes des étudiants avec contrôle des valeurs
        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.print("Nom de l'étudiant " + (i + 1) + " : ");
            etudiants[i] = scanner.next();

            for (int j = 0; j < nombreMatieres; j++) {
                double note;
                do {
                    System.out.print("Note pour la matière " + (j + 1) + " (entre 0 et 20) : ");
                    note = scanner.nextDouble();
                    if (note < 0 || note > 20) {
                        System.out.println("Erreur : la note doit être entre 0 et 20.");
                    }
                } while (note < 0 || note > 20);
                notes[i][j] = note;
            }
        }

        // Calcul des moyennes pour chaque étudiant
        System.out.println("\n--- Moyennes des étudiants ---");
        for (int i = 0; i < nombreEtudiants; i++) {
            double somme = 0;
            for (int j = 0; j < nombreMatieres; j++) {
                somme += notes[i][j];
            }
            double moyenne = somme / nombreMatieres;
            System.out.println("Moyenne de " + etudiants[i] + " : " + moyenne);
        }

        // Calcul des statistiques par matière (meilleure et plus faible note)
        System.out.println("\n--- Statistiques par matière ---");
        for (int j = 0; j < nombreMatieres; j++) {
            double sommeMatiere = 0;
            double meilleureNote = notes[0][j];
            double plusFaibleNote = notes[0][j];

            for (int i = 0; i < nombreEtudiants; i++) {
                sommeMatiere += notes[i][j];
                if (notes[i][j] > meilleureNote) {
                    meilleureNote = notes[i][j];
                }
                if (notes[i][j] < plusFaibleNote) {
                    plusFaibleNote = notes[i][j];
                }
            }

            double moyenneMatiere = sommeMatiere / nombreEtudiants;
            System.out.println("Matière " + (j + 1) + " : Moyenne = " + moyenneMatiere 
                               + ", Meilleure note = " + meilleureNote 
                               + ", Plus faible note = " + plusFaibleNote);
        }
    }
}
