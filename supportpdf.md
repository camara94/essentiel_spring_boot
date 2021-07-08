# Essentiel Spring Boot

## Auteur: CAMARA Laby Damaro
sources: 
 1. [https://github.com/camara94/essentiel_spring_boot](https://github.com/camara94/essentiel_spring_boot)
 2. [linkedin Learning](https://www.linkedin.com/learning/l-essentiel-de-spring-boot/bienvenue-dans-l-essentiel-de-spring-boot)
 3. [Openclassrooms](https://openclassrooms.com/fr/courses/6900101-creez-une-application-java-avec-spring-boot)

Dans cours PDF,nous allons découvir ensemble le framework Spring et de son module Spring Boot, pour le développement d'applications Java. À l'aide d'exemples pratiques, nous verrons comment injecter des dépendances puis nous verrons comment lancer une application Spring. nous aborderons le principe d'autoconfiguration et nous apprendrons l'utilisation utilisation des **starters** et **différents types de contrôleurs**. Nous testerons et nous superviserons nos applications avec **JUnit et Spring Boot Actuator**, avant d'exécuter des beans au démarrage. À la fin de cette formation, nous aurons acquis toutes les bases pour mettre en œuvre Spring Boot.



## Le Noyau de Spring
![noyau Spring](images/noyau_spring.png)

## Définition de Spring Boot
Spring Framework et Spring Boot ! Spring Framework et Spring Boot offrent un environnement de développement solide et efficace, qui va vous simplifier la vie. La gestion des dépendances, la configuration, la gestion des propriétés et le déploiement seront bientôt des jeux d'enfants !
![definition spring boot](images/definition_spring_boot.png)

## Les Avantages d'utiliser Spring Boot
![avantage spring boot](images/avantage_spring_boot.png)

## Les Inversion de Contrôle en Spring Boot
![ioc en spring boot](images/ioc_spring_boot.png)

## Les Avantages de l'Inversion de Contrôle
![avantage de ioc](images/avantage_inversion_de_controle.png)

## L'Inversion de Contrôle en Spring Boot avec les Beans
![beans](images/bean_spring_boot.png)

## Le conteneur IOC de Spring Boot (ApplicationContext)
![applicationContext](images/application_context_spring_boot.png)

## Le Fonctionnement du Conteneur IOC de Spring Boot
![fonctionnement IOC spring boot](images/fonctionnement_ioc_spring_boot.png)


## Illustration De L'IOC en Spring
Ici nous allons créer quatre classe(A, B, C, Main) pour illustrer l'inversion de contrôl avec spring boot.
Avant de créer les classes, il faut ajouter cette dépendance la section **dependances** dans le fichier **pom.xml**
dans un projet **maven** si ce n'est pas directement un projet spring par defaut.
![pom](images/spring-context.png)
### Classe A
![a](images/a.png)
### Classe B
![a](images/b.png)
### Classe C
![a](images/c.png)
### Classe Main
L' **ApplicationContext** est l'interface centrale au sein d'une application Spring qui est utilisée pour fournir des informations de configuration à l'application. Il implémente l'interface BeanFactory. Par conséquent, ApplicationContext inclut toutes les fonctionnalités de BeanFactory.
C'est pourquoi ici, ici nous n'avons pas bésoin faire des instanciation avec le mot clés **new**, et **spring boot** s'en charge automatiquement grâce à **ApplicationContext** 
![a](images/main.png)

## La Configuration des Métadonnées en Spring Boot
En Spring Boot, on peut procéder la configuration de trois manières à savoir:
![configuration des métadonnées](images/configuration_metadonnees_spring_boot.png)

## La Configuration avec les Classe Java
Pour cela, nous utilisons le plus souvent les annotations suivantes:
1. <code>@Configuration</code>: cette annotion indique à **Spring boot** qu'il s'agit d'une classe de configuration.
2. <code>@Bean</code>: celle ci indique precède une méthode qui crée des objets Java
3. <code>@Autowired</code> elle permet de faire les **Injection de dependance** en 
   ![configuration classe](images/configuration_classe_java.png)
![config](images/config.png)

## La Configuration avec les Annotation Spring Boot
1. <code>@Component</code>: elle marque une classe java en tant que Bean pour les mecanismes d'analyse spring puis l'ajouter au context de l'application. elle a plusieurs dérivées: **@Repository**, **@Service**, **@Controller**
2. <code>@Repository</code>: qui est utilisée sur les classes(Interfaces) java qui manipulent ou accèdent directement aux bases de données.
3. <code>@Service</code>: elle marque une classe java qui effectue des traitements métiers.
4. <code>@Controller</code>: est utilisée pour indiquer que la classe est un controller **Spring Boot**
5. <code>@ComponentScan</code>: qui est utilisée pour indiquer à **Spring Boot** les **packages java** qu'il faut utilisés pour trouver les composants **Spring**
   

![annotation spring](images/configurationAvecAnnotationSpring.png)

## Comment créer une Application Spring Boot
La  façon la plus simple est d'utilisée le site [Spring Initializr](https://start.spring.io)
![Spring Initializr](images/comment_creer_app_spring_boot.png)

![factorie](images/factorie.png)

## Comment Proceder avec Spring Initializr
Le formulaire de spring initializr nous permet choisir:
* le type de projet: **Maven**, **Gradle**
* le language à utiliser: **Java**, **Kotlin**, **Groovy**
* la version de spring boot à utiliser
* le nom du package qu'on veut utiliser: (group)
* le nom du projet: (artifact)
* le packaging: **jar** ou **war**
* les dependances qu'on souhaite ajouter à notre 
Lorqu'on clique sur le bouton **générate** il va enrégistrer le projet dans  notre PC sous format zip<br/>
![spring initializr](images/initializr1.png)
![spring initializr](images/initializr1.png)


## Comment Proceder Avec Les IDE
1. on peut utiliser IDE STS
2. on peut aussi utiliser IDE Eclise avec le plugin STS
3. on peut utiliser IDE Intelij ....
   et  la  procedure est la même que celle qu'on a utilise precedemment avec **Spring Initializr**, quelques captures d'écran pourraient illustrer mon propos

![create spring projet](images/idecreateprojet1.png)
![create spring projet](images/idecreateprojet2.png)
![create spring projet](images/idecreateprojet3.png)


## Une Dependance Starter Spring Boot
**Une Dependance Starter Spring** est une qui est une dependance qui lui même contenant plusieurs dependances **retrocompatibles**.
L'un des points forts de Spring Boot est qu'il trouve lui même les dependances compatibles entre elles.

## Quelques Fichiers de Configurations 
1. l'un des fichiers imports est **pom.xml** qui permet de:
   * lister toutes les dependances d'une application **Spring Boot**
   * ajouter d'autres dependances à notre application
   * modifier le nom, la description
   * configurer le build, les propriétés
   * ...
    ![pom](images/pomxml.png)
2. nous avons aussi le fichier **application.properties** qu'on peut modifier son extension en **yaml** si nous le souhaitons bien, ce fichier permet également de faire des configuration aussi telles que:
   * changement de port
   * configuration de base de données
   * ...
    ![app](images/applicationproperties.png)

## AutoConfiguration En Spring Boot
![autoConfiguration](images/autoconfiguration_spring_boot1.png)
![autoConfiguration](images/autoconfiguration_spring_boot2.png)
![autoConfiguration](images/autoconfiguration_spring_boot3.png)

## Connaître Les AutoConfigurations en Spring Boot
![auto 1](images/condition_autoconfiguration_spring_boot1.png)
![auto 1](images/condition_autoconfiguration_spring_boot2.png)

## Starter Spring Boot
![starter spring boot](images/starter_spring_boot1.png)

## Quelques Starter Spring Boot
![quelques starter](images/starter_spring_boot2.png)

## Le Modele MVC En Spring Boot
![mvc 1](images/mvc_spring_boot1.png)

## Spring MVC
![mvc 2](images/mvc_spring_boot2.png)

## Contôller en Spring Boot
![mvc 3](images/mvc_spring_boot3.png)

## CommandLineRunner
![commande Runner](images/commandRunner.png)
![commande Runner](images/commandRunner2.png)
![console](images/console.png)

## Conclusion
![conclusion](images/conclusion.png)