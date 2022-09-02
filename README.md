## :boy: Sobre mim
* :star: Meu nome é Leonel de Sousa Siqueira.
* :briefcase: Trabalho com desenvolvimento de sistemas há mais de 8 anos.
* :mortar_board: Sou formado em engenharia de computação/software [UniEVANGÉLICA](https://www4.unievangelica.edu.br/).

## :snowflake: Sobre o projeto
### Nesse projeto nós iremos desenvolver o exemplo do curso sobre microservices com Spring Boot.

Seguindo a playList 'Spring Boot Microservices' do canal: [DevDojo](https://www.youtube.com/watch?v=wuu80nCpjdA&list=PL62G310vn6nH_iMQoPMhIlK_ey1npyUUl&index=3).

<p>Spring Boot Microservices 01 - Setup Inicial: Nesse vídeo foi uma aplicação spring boot juntamento com alguns recursos de Course.</p>
<p>Spring Boot Microservices 02 - Modularizando o Projeto: Nesse vídeo foi moduralizado o projeto core para poder ser usando como dependência</p>
<p>Spring Boot Microservices 03 - Service discovery Eureka e Gateway Zuul: Nesse vídeo foi configurado o Eureka juntamente com o Gateway Zuul</p>
<p>Spring Boot Microservices 04 - Authentication Service Signed and Encrypted JWT (JWS+JWE) pt 01: Iniciado a configuração de segurança com o JWT</p>
<p>Spring Boot Microservices 05 - Authentication Service Signed and Encrypted JWT (JWS+JWE) pt 02: Continuando a configuração de segurança com o JWT/Token</p>
<p>Spring Boot Microservices 06 - Moving token to a separate module: Organizando os modulos do token</p>
<p>Spring Boot Microservices 07 - Authorization Filter Pt 01: Nesse vídeo foi iniciado as configurações de autorizações entre dos serviços</p>
<p>Spring Boot Microservices 08 - Authorization Filter pt 02: Nessa aula foi finalizado a configuração de segurança para os depois modulos</p>
<p>Spring Boot Microservices 09 - Swagger Documentation: Nesse vídeo foi organizado toda a documentação do projeto auth/course</p>

## Passoa para executar o projeto:
### 1ª - Executar o docker-compose que está dentro da pasta course para subir o banco.
```
$ docker-compose up
```
### 2ª - Criar o banco de dados.
```
SQL: CREATE DATABASE devdojo;
```

### 3ª - Execute as aplicações na segunte ordem.
* discovery
* gateway
* auth
* course

### 4ª - Agora será necessário polular as tabelas application_user/course, ex:.
```
SQL: INSERT INTO application_user (password, role, username) VALUES ('$2a$10$QPxuI0xtsPmXACwFFL93..vadYCQ6zbC0Oj9NIGwYoEQFU3Zft2fa', 'ADMIN', 'Leonel');
SQL: INSERT INTO course (title) VALUES ('Boot Camp 1');
SQL: INSERT INTO course (title) VALUES ('Boot Camp 2');
SQL: INSERT INTO course (title) VALUES ('Boot Camp 3');
```




## :rocket: Minhas Skills
### Experiências com desenvolvimentos
![Java](https://img.shields.io/badge/-Java-333333?style=flat&logo=Java&logoColor=007396)
![PostgreSQL](https://img.shields.io/badge/-PostgreSQL-333333?style=flat&logo=postgresql)
![Spring](https://img.shields.io/badge/-Spring-333333?style=flat&logo=spring)
![React](https://img.shields.io/badge/-React-333333?style=flat&logo=react)
![MySQL](https://img.shields.io/badge/-MySQL-333333?style=flat&logo=mysql)
### IDEs de Desenvolvimento
![NetBeans](https://img.shields.io/badge/-NetBeans-333333?style=flat&logo=apachenetbeanside)
![Eclipse](https://img.shields.io/badge/-Eclipse-333333?style=flat&logo=eclipse-ide&logoColor=2C2255)
![Visual Studio Code](https://img.shields.io/badge/-Visual%20Studio%20Code-333333?style=flat&logo=visual-studio-code&logoColor=007ACC)
### DevOps
![Git](https://img.shields.io/badge/-Git-333333?style=social&logo=git)
![GitLab](https://img.shields.io/badge/-GitLab-333333?style=social&logo=gitlab)
![GitHub](https://img.shields.io/badge/-GitHub-333333?style=social&logo=github)

## :earth_americas: Onde me encontrar
[![Gmail](https://img.shields.io/badge/-Gmail-d3d3d3?style=flat-square&labelColor=006bed&logo=Gmail&logoColor=white)](mailto:leonel55sousa@gmail.com)
[![Linkedin](https://img.shields.io/badge/-Linkedin-d3d3d3?style=flat-square&labelColor=blue&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/leonel-de-sousa-siqueira-85866749/)
[![Instagram](https://img.shields.io/badge/-Instagram-d3d3d3?style=flat-square&labelColor=DF0174&logo=instagram&logoColor=white)](https://www.instagram.com/leonelsousas/)
[![Linkedin](https://img.shields.io/badge/-Facebook-d3d3d3?style=flat-square&labelColor=3b5998&logo=facebook&logoColor=white)](https://www.facebook.com/leonel.siqueira.395/)
[![Youtube](https://img.shields.io/badge/-Youtube-d3d3d3?style=flat-square&labelColor=ff0020&logo=youtube&logoColor=white)](https://www.youtube.com/channel/UCTtQi-lpQU-KjTjdCsjKyhQ)