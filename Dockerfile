# On utilise Java 21 (votre version installée)
FROM eclipse-temurin:21-jdk-jammy

# Dossier de travail dans le conteneur
WORKDIR /app

# On copie le fichier JAR que vous avez généré avec .\mvnw clean package
# L'étoile * permet de trouver le fichier automatiquement dans target/
COPY target/*.jar app.jar

# On expose le port 8080 (port par défaut de Spring Boot)
EXPOSE 8080

# Commande pour lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
