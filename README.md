# 📚 literAlura

Este es un programa en Java basado en Spring Boot que permite gestionar libros y autores de manera eficiente. La aplicación facilita la búsqueda, registro y listado de libros y autores, con funcionalidades avanzadas para listar autores vivos en un año específico y libros por idioma. Fue realizado en base al 
"Challenge ONE | Java | Back End | Gestión de Libros y Autores".

## ✨ Características

-📖 Búsqueda de libros por título.
-📝 Registro y listado de libros y autores en la base de datos.
-🎭 Listado de autores vivos en un año específico.
-🌐 Filtrado de libros por idioma.
-🔄 Evita duplicados en la base de datos al procesar la información de libros y autores.

## 📋 Requisitos

-☕ Java 11 o superior.
-🛠️ Spring Boot 2.6.4.
-🗄️ Base de datos SQL compatible (PostgreSQL, MySQL, MariaDB, SQL Server, H2).
-📦 Maven para la gestión de dependencias.

## 🚀 Instalación

1. **Clona el repositorio:**
    ```bash
    git clone https://github.com/tu_usuario/literAlura.git
    ```
2. **Navega al directorio del proyecto:**
    ```bash
    cd literAlura
    ```
3. **Configura tu base de datos en el archivo application.properties.** spring.datasource.url=jdbc:postgresql://localhost:5432/nombre_de_tu_base_de_datos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update

## 🛠️ Uso

1. **Compila y ejecuta el programa en tu IDE:**
    - Abre el proyecto en tu IDE preferido.
    - Ejecuta la clase LiteraturaApplication.
      
2. **Interfaz de Usuario:**
    - Al iniciar la aplicación, se mostrará un menú en la consola con las siguientes opciones:
      Bienvenidos a literAlura
        Elija una opción:
        1 - Buscar libro por título
        2 - Listar libros registrados
        3 - Listar autores registrados
        4 - Listar autores vivos en un determinado año
        5 - Listar libros por idioma
        0 - Salir
   - Selecciona la opción deseada ingresando el número correspondiente y sigue las instrucciones en pantalla.

## 🌐 Conéctate conmigo

¿Listo para compartir tus impresiones o sugerencias? ¡Hablemos! Puedes seguirme en [LinkedIn](https://www.linkedin.com/in/manuel-jesus-quispe-chavez/) y [TikTok](https://www.tiktok.com/@jesusqch1)


