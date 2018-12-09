# Introduction

Aujourd'hui nous allons vous parlez de design patterns, et plus précisement du pattern MVC : Model View Controller.
Ce dernier appartient à la famille des patterns d'architecture.

## Son but ?

Séparer les données de l'application de l'interface utilisateur. Pour cela, ce pattern requiert donc l'implémentation de 3 couches :

- **Model :** C'est dans cette partie que seront traités les données propres à l'application ainsi que l'interaction avec la base de données. 
- **View :** Elle réprésente l'interface utilisateur, cette vue ne procède à aucun traitement, elle se contente _d'afficher_ les données fournit par le modèle. 
- **Controller :** Va permettre de _déclencher_ les actions de l'utilisateur (lors d'un clic sur un bouton par exemple). C'est cette partie qui va permettre de coordonner les action entre la vue et le modèle.

