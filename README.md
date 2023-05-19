<h1 align="center"> Randomjokes </h1>

This project is a Get Random jokes that allows users to browse random jokes.

## Framework And Language used in Project
-  * ![SpringBoot](https://img.shields.io/badge/Framework-SpringBoot-green)
- * ![Java](https://img.shields.io/badge/Language-Java%208%20or%20higher-yellow)

## Dependencies
- SpringWeb
- Spring Boot Dev Tool

## Data Flow 
- In this project, We create four layers.

>## **Controller** :-
    - In controller layer we handle CRUD operatiom by http request.
    - In controller I use bussiness logic we add jokes in arrayList.
    - we have use  random API as a data source.

>## Endpoints
The following endpoints are available:

- POST /jokes: Save a joke.
- GET /jokes: Get a random joke.
 
## Project Summery
The jokes collection is initialized with a few jokes. These jokes will be included in the random selection when retrieving a joke. You can add more jokes by using the save endpoint.

Please note that this API is for entertainment purposes only and the jokes may not be suitable for all audiences. Use it responsibly.
