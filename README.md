# SnakeJava

Squelette initial d'un Snake en Java 17, organisé en packages et prêt pour Maven.

## Prérequis
- JDK 17+
- Maven 3.8+

## Compiler
```bash
mvn clean compile
```

## Lancer les tests
```bash
mvn test
```

## Lancer l'application
```bash
mvn exec:java -Dexec.mainClass="com.snake.Main"
```
Pour cette commande, ajoutez le plugin Maven Exec si nécessaire, ou lancez `com.snake.Main` depuis votre IDE.

## Conventions
- `Position` est immuable.
- La tête du serpent est `body.get(0)`.
- `x` augmente vers la droite ; `y` augmente vers le bas.
- Les méthodes encore incomplètes sont marquées `TODO`.
- Toute modification d'une signature publique doit être validée par le responsable technique.
# SnakeJava
# SnakeJava
