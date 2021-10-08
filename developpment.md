# Pré-requis

Pour builder et exécuter cette API, vous devez utiliser (pour l'instant, la cible étant Java 11):

- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven 3](https://maven.apache.org)
- une base de données H2

# Modules :

- [rcfactory-billing-service](git@github.com:chaouredha/rcfactory-billing-service.git)
- [rcfactory-customer-service](git@github.com:chaouredha/rcfactory-customer-service.git)
- [rcfactory-eureka-service](git@github.com:chaouredha/rcfactory-eureka-service.git)
- [rcfactory-configuration-service](git@github.com:chaouredha/rcfactory-configuration-service.git)
- [rcfactory-configuration](git@github.com:chaouredha/rcfactory-configuration.git)
- [rcfactory-gateway](git@github.com:chaouredha/rcfactory-gateway.git)

# Urls Swagger

- [Local](http://localhost:8083/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/)

# Integration

Le job integration se trouve ici:

https://github.com/chaouredha/rcfactory-customer-service/actions

- Architectures :
  ![img.png](img.png)
