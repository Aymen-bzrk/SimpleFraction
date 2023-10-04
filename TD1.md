# Compléments de programmation - TD 1
Nom, Prénom, No Etudiant, Nc
     > Bouzerkoune, Aymen, 22308171, 14
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions** (cf. [Utilisation d'assertions](https://koor.fr/Java/Tutorial/java_assert.wp)).
À chaque étape, consultez le statut des fichiers du projet (`git status`) ainsi que l'historique (`git log`).

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > ReadMe: this will add a file to the repository where you can put your description of the project.
    > Gitignore: pour indique à Git les fichiers à ignorer lors de la livraison du projet sur le dépôt GitHub.
    > license: on ajoutons une license permetre au autre de utiliser notre projet pour l'améliorer etc...

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`) (cf. [Personnalisation de Git](https://git-scm.com/book/fr/v2/Personnalisation-de-Git-Configuration-de-Git));
    ```bash
    # git config --global user.name "Aymen Bouzerkoune" && git config --global user.email "aymen-bzrk@outlook.com"

    ```
1. Initialisez le dépôt `git` local pour le projet (cf. [Démarrer un dépôt Git](https://git-scm.com/book/fr/v2/Les-bases-de-Git-D%C3%A9marrer-un-d%C3%A9p%C3%B4t-Git));
    ```bash
    # init git
    ```
1. Dans votre IDE, créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet (cf. [Méthode `main`](https://docs.oracle.com/javase/specs/jls/se19/html/jls-12.html#jls-12.1.4));
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements (cf. [Enregistrer des modifications dans le dépôt](https://git-scm.com/book/fr/v2/Les-bases-de-Git-Enregistrer-des-modifications-dans-le-d%C3%A9p%C3%B4t));
    ```bash
    # git add
    # git commit 
    ```
1. Ajoutez la méthode `toString` à la classe `Fraction` (cf. [`Object.toString`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Object.html#toString())) qui retournera la chaîne `"Je suis une fraction."` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
        public String toString() {
        return "Je suis une fraction.";
    }
    ```
1. Publiez vos modifications sur le dépôt distant (cf. [Travailler avec des dépôts distants](https://git-scm.com/book/fr/v2/Les-bases-de-Git-Travailler-avec-des-d%C3%A9p%C3%B4ts-distants));
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    # git commit
    # git push origin main
    ```
1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > touch README.md
     apres on va ajoueter l'explication de projet 
     git add README.md
     git commit -m "Add README.md"
     git push origin main
1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    # git pull origin main
    ```
1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (cf. [`.gitignore` pour Java](https://github.com/github/gitignore/blob/main/Java.gitignore));
    ```bash
    # add .gitignore    
    # git commit -m "Add .gitignore to ignore build artifacts and logs
    # git push origin main 
    ```
1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    # git rm -r .Fichier_configuration/
    # git commit -m "supprimer conf IDE"
    # echo '.Fichier_configuration/' >> .gitignore
    # git add .gitignore
    # git commit -m "Add IDE configuration files to .gitignore"
    # git push origin main

    ```
    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    # Copier ici les modifications de `.gitignore`
    ```
1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    # Pour configurer l'accès par clé publique/clé privée à une forge comme GitHub, commencez par vérifier si vous avez déjà des clés SSH. Si non, générez une paire de clés. Ajoutez ensuite votre clé publique à votre compte GitHub dans les paramètres de clés SSH. Enfin, testez la connexion SSH pour confirmer que tout fonctionne correctement. Une fois configuré, vous pourrez utiliser SSH pour interagir avec la forge de manière sécurisée et sans nécessité de connexion constante.

## Partie II (à faire durant le TD) : compléter la classe `Fraction`
Dans cet partie, vous compléterez les classes `Fraction` et `Main`.
Un exemple d'interface pour une telle classe est donné par la classe [`Fraction`](http://commons.apache.org/proper/commons-math/javadocs/api-3.6.1/org/apache/commons/math3/fraction/Fraction.html) de la bibliothèque [Apache Commons Math](http://commons.apache.org/math/).

Vous respecterez les consignes ci-dessous :
* chaque méthode de `Fraction` sera testée dans `Main` **avec des assertions** (cf. [Utilisation d'assertions](https://koor.fr/Java/Tutorial/java_assert.wp));
* à la fin de chaque question, consultez le statut des fichiers du projet (`git status`) ainsi que l'historique (`git log`) puis validez les changements.

1. Ajoutez les attributs représentants le numérateur et le dénominateur (nombres entiers).
    ```Java
    // private int p;
       private int q;
    ```
1. Ajoutez les constructeurs (cf. [Constructor Declarations](https://docs.oracle.com/javase/specs/jls/se19/html/jls-8.html#jls-8.8)) suivants :
    * initialisation avec un numérateur et un dénominateur,
    * initialisation avec juste le numérateur (dénominateur égal à _1_),
    * initialisation sans argument (numérateur égal _0_ et dénominateur égal à _1_),
    ```Java
    // Assertions pour tester les constructeurs (avec toString)

    * public Fraction(int p, int q) {
        this.p = p;
        this.q = q;
    }
    * public Fraction(int q) {
        this.q = 1;
    }
    * public Fraction() {
        this.p = 0;
        this.q = 1;
    }
    ```
1. Ajoutez les fractions constantes ZERO (0, 1) et UN (1, 1) (cf. [Constants in Java](https://www.baeldung.com/java-constants-good-practices)),
    ```Java
    //     public static final Fraction Zero=new fraction();
           public static final Fraction un=new fraction(1);
    ```
1. Ajoutez une méthode de consultation du numérateur et du dénominateur (par convention, en Java, une méthode retournant la valeur de l'attribut `anAttribute` est nommée `getAnAttribute`),
    ```Java
    //     public int getNumerator() {
        return p;
    }
         public int getDenominator() {
        return q;
    }
    ```
1. Ajoutez une méthode de consultation de la valeur sous la forme d'un nombre en virgule flottante (méthode `doubleValue()`) (cf. [`java.lang.Number`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Number.html)),
   ```Java
    // Assertions pour tester la conversion
    ```
1. Ajoutez une méthode permettant l'addition de deux fractions (la méthode `add` prend en paramètre *une* fraction et *retourne* la somme de la fraction courante et du paramètre),
   ```Java
    // Assertions pour tester l'addition
    ```
1. Ajoutez le test d'égalité entre fractions (deux fractions sont égales si elles représentent la même fraction réduite) (cf. [`java.lang.Object.equals`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object))),
   ```Java
    // Assertions pour tester l'égalité
        public boolean equals(Object obj) {
        if (this == obj) {
        return true;
    }
        if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Fraction other = (Fraction) obj;
        assert this.q != 0 && other.q != 0 : "Le dénominateur ne peut pas être zéro.";
        return this.p == other.p && this.q == other.q;
}
    ```
1. Ajoutez la comparaison de fractions selon l'ordre naturel (cf. [`java.lang.Comparable`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Comparable.html)).
   ```Java
    // Assertions pour tester la comparaison
    ```
1. Faites hériter votre classe `Fraction` de la classe [`java.lang.Number`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Number.html) et complétez les méthodes
   ```Java
    // Vérifiez avec le code ci-dessous
    Number aNumber = java.math.BigDecimal.ONE;
    Number anotherNumber = new Fraction(1, 2);
    assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
    ```

## Partie III (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    > windows
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    # Get-help Get-Process
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        # dir "chemin de rep " /s /o:s /h
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        # find /c /v "" "chemoin de rep"
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        # findstr /i "uneVariable" "\Main.java"
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        # findstr /s /i "uneVariable" "\chemin\*.java"
        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        # dir /s /b README.md
        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        # fc Fichier1.txt Fichier2.txt
        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > Connexion sécurisée aux serveurs distants.
    * `screen`/`tmux`
        > Gestion de sessions de terminal multiplexées.
    * `curl`/[HTTPie](https://httpie.org/)
        > Envoi de requêtes HTTP en ligne de commande.
    * [jq](https://stedolan.github.io/jq/)
        > Traitement de données JSON en ligne de commande.

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > inteliji IDEA

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > Accédez au menu 
Sélectionnez Paramètres.
Sous Éditeur et sélectionnez Encodages de fichiers.
Vous verrez une option pour ncodage par défaut où vous pouvez vérifier l'encodage global du projet.
Vous pouvez également vérifier l'encodage pour un fichier spécifique en utilisant le menu Fichier et en sélectionnant Encodage de fichier.
1. Comment choisir le JDK à utiliser dans un projet ?
    > Ouvrez ou créez votre projet.
      Accédez aux paramètres du projet via "File" > "Project Structure."
      Sous "Project," choisissez le JDK dans la liste déroulante ou ajoutez-en un nouveau en spécifiant son emplacement.
      Configurez le niveau de compatibilité Java si nécessaire.
      Appliquez les modifications en cliquant sur ok.
1. Comment préciser la version Java des sources dans un projet ?
    > Répondre ici
1. Comment ajouter une bibliothèque externe dans un projet ?
    > Accédez à "File" > "Project Structure."
     Sous "Libraries," cliquez sur plus pour ajouter une bibliothèque Java.
     Configurez la bibliothèque en ajoutant les fichiers JAR ou en recherchant la bibliothèque Maven.
     Appliquez les modifications en cliquant sur ok La bibliothèque est prête à être utilisée dans votre projet.
1. Comment reformater un fichier source Java ?
    > Ouvrez le fichier Java.
      Utilisez la commande "Reformat Code" (Reformater le code) avec un raccourci clavier ou le menu contextuel.
      Personnalisez les règles de reformatage si nécessaire dans les paramètres "Code Style."
      Appliquez le reformatage en utilisant la commande.
      Enregistrez le fichier reformatté.
1. Comment trouver la déclaration d'une variable ou méthode ?
    > Placez le curseur sur le nom de la variable ou de la méthode.
      Cliquez avec le bouton droit de la souris et choisissez "Go to" (Aller à) dans le menu contextuel.
      Sélectionnez l'option appropriée, telle que "Declaration" (Déclaration) pour trouver la déclaration, ou d'autres options en 
      fonction de ce que vous recherchez.
      IntelliJ IDEA vous conduit directement à la déclaration ou à l'emplacement où la variable ou la méthode est définie.
      Vous pouvez naviguer entre les déclarations en utilisant les raccourcis clavier Ctrl + B  pour avancer et Ctrl + Alt + B pour 
      revenir en arrière.
1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Accédez aux paramètres de l'éditeur via "File" > "Settings" (ou "Preferences" sur macOS).
      Sélectionnez "Editor" > "Live Templates."
      Choisissez le langage de programmation pertinent (par exemple, Java).
      Ajoutz un nouveau Live Template en spécifiant un nom et le code à insérer.
      Utilisez des variables ($variable$) pour définir les parties modifiables du code.
      Configurez les variables pour préciser leur contenu.
      Pour insérer le snippet, tapez le raccourci que vous avez défini, puis utilisez la touche "Tab" pour naviguer entre les parties 
      modifiables du code.
      Cela facilite l'insertion rapide de blocs de code prédéfinis dans votre code source IntelliJ IDEA en utilisant des Live Templates 
      personnalisés.
1. Comment renommer une classe dans l'ensemble du projet ?
    > Accédez aux paramètres de l'éditeur via "File" > "Settings" (ou "Preferences" sur macOS).
      Sélectionnez "Editor" > "Live Templates."
      Choisissez le langage de programmation pertinent (par exemple, Java).
      Ajoutz un nouveau Live Template en spécifiant un nom et le code à insérer.
      Utilisez des variables ($variable$) pour définir les parties modifiables du code.
      Configurez les variables pour préciser leur contenu.
      Pour insérer le snippet, tapez le raccourci que vous avez défini, puis utilisez la touche "Tab" pour naviguer entre        les parties modifiables du code.
      Cela facilite l'insertion rapide de blocs de code prédéfinis dans votre code source IntelliJ IDEA en utilisant des         Live Templates personnalisés.
1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    > java Main arg1 arg2
1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > Démarrez le débogage (Shift+F9).
      Utilisez la vue "Debugger" pour voir les variables et les valeurs.
1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > IDE (IntelliJ IDEA, Eclipse) : Pour écrire et gérer le code.
    > Débogage et profilage : Pour détecter et résoudre les problèmes.
    > Gestion des dépendances (Maven, Gradle) : Pour gérer les bibliothèques.
