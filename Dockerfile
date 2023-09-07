FROM maven:3.8.3-openjdk-17

# Copia tu archivo JAR de la aplicación al contenedor (asegúrate de tener el archivo JAR en el mismo directorio que el Dockerfile)
COPY "./target/docker-app-0.0.1-SNAPSHOT.jar" "docker-app-0.0.1-SNAPSHOT.jar"

EXPOSE 8081

# Comando para ejecutar la aplicación cuando se inicia el contenedor
ENTRYPOINT ["java","-jar","docker-app-0.0.1-SNAPSHOT.jar"]