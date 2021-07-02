# Essentiel Spring Boot

Avec Kahina Ioualitene, partez à la découverte du framework Spring et de son module Spring Boot, pour le développement d'applications Java. À l'aide d'exemples pratiques, vous verrez comment injecter des dépendances puis vous lancer dans une application Spring. Vous aborderez le principe d'autoconfiguration et vous apprendrez à utiliser les starters et différents types de contrôleurs. Vous testerez et vous superviserez vos applications avec JUnit et Spring Boot Actuator, avant d'exécuter des beans au démarrage. À la fin de cette formation, vous aurez acquis toutes les bases pour mettre en œuvre Spring Boot.

## Le Noyau de Spring
![noyau Spring](images/noyau_spring.png)

## Définition de Spring Boot
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

## La Configuration des Métadonnées en Spring Boot
![configuration des métadonnées](images/configuration_metadonnees_spring_boot.png)

## La Configuration avec les Classe Java
Pour cela, nous utilisons le plus souvent les annotations suivantes:
1. <code>@Configuration</code>: cette annotion indique à **Spring boot** qu'il s'agit d'une classe de configuration.
2. <code>@Bean</code>: celle ci indique precède une méthode qui crée des objets Java
3. <code>@Autowired</code> elle permet de faire les **Injection de dependance** en 
   ![configuration classe](images/configuration_classe_java.png)

## La Configuration avec les Annotation Spring Boot
1. <code>@Component</code>: elle marque une classe java en tant que Bean pour les mecanismes d'analyse spring puissent l'ajouter au context de l"application. elle a plusieurs dérivées: **@Repository**, **@Service**, **@Controller**
2. <code>@Repository</code>: qui est utilisée sur les classes(Interfaces) java qui manipulent ou accèdent directement aux bases de données.
3. <code>@Service</code>: elle marque une classe java qui effectue des traitements métiers.
4. <code>@Controller</code>: est utilisée pour indiquer que la classe est un controller **Spring Boot**
5. <code>@ComponentScan</code>: qui est utilisée pour indiquer à **Spring Boot** les **packages java** qu'il faut utilisés pour trouver les composants **Spring**
   
![annotation spring](images/configurationAvecAnnotationSpring.png)