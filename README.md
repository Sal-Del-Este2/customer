<H1>Se incluyo</H1>
Pruebas Post, Get y Del de Postman
La base de datos para importar

<H1>Base de datos</H1>

1) base de datos en MySql

se creo una base de datos detallada en el archivo mysql.txt

<H1>crear los 3 micros servicios de customer, product y sales</H1>

en Spring Initializr, esta pagina https://start.spring.io/ se creo lo siguiente
Project: Gradle-Groovy
Lenguaje: Java
Spring Boot: 3.5.0
Packaging: Jar
Java:17
dependencias: Spring Web, Lombok, Spring data jpa, Mysql driver

<H1>Error</H1>
se presento el error "Error al obtener clientes: TypeError: Failed to fetch"

se levanto el index.html con live server
Se resolvio agregardo la anotación @CrossOrigin en el controller
@CrossOrigin(origins = {"http://127.0.0.1:5500", "http://localhost:5500"})

<H1> funcional</H1>
micros servicios de customer y el index.crud.html