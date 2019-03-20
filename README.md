# LearnScala

# Devellopement en cours. 

Reproduction du sujet effectué pour carrefour.
Actuellement : Création de la liste des dates et parcours des 7 derniers jours.
Puis, rassemblement des datas dans un fichier unique contenant seulement ce qu'il faut exploiter.
Lecture du fichier commun, rassemblement des même produits (KO pour le moment) et filtrage des 100 plus important pour le chiffre d'affaire et la quantité vendu.

## Problème rencontré

### Environnement

Scala peut être très capricieux suivant la version de l'IDE et le JDK utilisé.
Contournement : 

Utilisation de l'IDE indiqués sur le tutoriel suivant et la version du JDK proposé :
http://www.topjavatutorial.com/scala/scala-development-with-eclipse/

## Point important appris

### Gestion des List / array

Scala est bien différent de Java concernant les listes de valeurs. La meilleure méthode pour mettre des valeurs en array et filtrer est la suivante :

case class Row(var firstName: String, var lastName: String, var city: String)

var rows = List(new Row("Oscar", "Wilde", "London"),
                new Row("Otto",  "Swift", "Berlin"),
                new Row("Carl",  "Swift", "Paris"),
                new Row("Hans",  "Swift", "Dublin"),
                new Row("Hugo",  "Swift", "Sligo"))

rows.sortBy(_.lastName)

### Déclaration d'une fonction

def transactionReader( a: String, i:String) = {
