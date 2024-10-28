
# Gestionnaire de Notes

Gestionnaire de Notes est une application Java simple qui permet de gérer les notes d’étudiants. Elle facilite la saisie des noms d’étudiants et de leurs notes dans différentes matières, tout en calculant les moyennes et en affichant des statistiques pour chaque matière.

## Fonctionnalités

- Saisie des noms d’étudiants et de leurs notes pour différentes matières.
- Calcul de la moyenne des notes pour chaque étudiant.
- Affichage des statistiques par matière : moyenne, meilleure note, et plus faible note.

## Prérequis

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (version 8 ou supérieure)
- Un IDE (ex: IntelliJ IDEA, Eclipse) ou un terminal pour exécuter le code Java.

## Installation

1. **Clonez le dépôt** :
   ```bash
   git clone https://github.com/votre-nom-utilisateur/GestionnaireNotes.git
   cd GestionnaireNotes
   ```

2. **Compilation** :
   Si vous êtes dans le répertoire du projet, compilez le code avec la commande suivante :
   ```bash
   javac GestionnaireNotes.java
   ```

3. **Exécution** :
   Exécutez le programme avec cette commande :
   ```bash
   java GestionnaireNotes
   ```

## Utilisation

1. Entrez le nombre d’étudiants et de matières quand le programme le demande.
2. Saisissez les noms et les notes pour chaque étudiant, en vous assurant que les notes sont entre 0 et 20.
3. Le programme calculera automatiquement :
   - La moyenne des notes pour chaque étudiant.
   - Les statistiques par matière : moyenne, meilleure note, et plus faible note.

## Exemple

Voici un exemple d'utilisation de l'application :

```
Entrez le nombre d'étudiants : 2
Entrez le nombre de matières : 3

Nom de l'étudiant 1 : Alice
Note pour la matière 1 (entre 0 et 20) : 15
Note pour la matière 2 (entre 0 et 20) : 18
Note pour la matière 3 (entre 0 et 20) : 16

Nom de l'étudiant 2 : Bob
Note pour la matière 1 (entre 0 et 20) : 12
Note pour la matière 2 (entre 0 et 20) : 14
Note pour la matière 3 (entre 0 et 20) : 13

--- Moyennes des étudiants ---
Moyenne de Alice : 16.33
Moyenne de Bob : 13.00

--- Statistiques par matière ---
Matière 1 : Moyenne = 13.5, Meilleure note = 15, Plus faible note = 12
Matière 2 : Moyenne = 16.0, Meilleure note = 18, Plus faible note = 14
Matière 3 : Moyenne = 14.5, Meilleure note = 16, Plus faible note = 13
```

## Auteur

- **Fred OLANGASSICKA** - [GitHub](https://github.com/FredOlang)

## Licence

Ce projet est sous licence MIT - voir le fichier [LICENSE](LICENSE) pour plus de détails.
