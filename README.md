<div>
  <p align="center">
  <a href="https://github.com/vrochacaio/IncidenteZero/blob/main/LICENSE" target="_blank"><img src="https://img.shields.io/github/license/vrochacaio/IncidenteZero?style=for-the-badge" target="_blank"></a>
  <img src="https://img.shields.io/docker/v/vrochacaio/incidentezero-app/latest?style=for-the-badge">
  <img src="https://img.shields.io/badge/DATABASE-H2-blue?style=for-the-badge&logo=Databricks">
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
  </p>
</div>

</br>

<p align="center"><img src="https://imgur.com/oCwD12S.png" width="150" height="150">

### <p align=center>INCIDENTES ZERO
<p align=center>API REST

</br>
</br>

<p align=center>Interface de aplicação para gerenciamento de incidentes

</br>
</br>
</br>
</br>
</br>

## Sobre o Projeto
Esse desafio consiste em criar uma aplicação spring-boot para cadastro de incidentes. A aplicação deverá fornecer operações
REST que possibilitem o cadastro/manutenção/remoção de incidentes. Utilizado banco de dados "embeded" (H2) para persistência dos dados e Docker para subir um container do projeto.

### Construido com

* [Java 11]()
* [Docker]()
* [Spring Boot]()
* [Spring Web MVC]()
* [Spring Data JPA]()
* [Lombok]()
* [H2 DATABASE]()

</br>

## API Reference

* #### Cadastrar incidente
  ```http
  POST /incidents
  ```
  | Parameter | Type     | Description                |
  | :-------- | :------- | :------------------------- |
  | `name` | `string` | **Required** |
  | `description` | `string` | **Required** |

* #### Manutenção de incidente
  ```http
  PUT /incidents/${id}
  ```
  | Parameter | Type     | Description                |
  | :-------- | :------- | :------------------------- |
  | `name` | `string` | **Nullable** |
  | `description` | `string` | **Nullable** |

* #### Remoção de incidente
  ```http
  DELETE /incidents/${id}
  ```

</br>

## Começando
Para obter uma cópia local, siga as etapas seguintes.

### Pré-requisitos

* [Java 11]()
* [Maven 3.6]()
* [Docker]()

### Instalação

1. Clone o repositório
    ```
    $ git clone https://github.com/vrochacaio/IncidenteZero.git
    ```

2. Instalando com Maven
    ```
    $ mvn clean install
    ```

</br>

## Uso

1. Rodando o projeto com docker compose
    ```
    $ docker compose up -d
    ```

2. Pronto! Agora faça as requisições através dos [Endpoints](https://github.com/vrochacaio/IncidenteZero#api-reference)

</br>

## License
Distributed under the Apache License 2.0. See [LICENSE](https://github.com/vrochacaio/IncidenteZero/blob/main/LICENSE) for more information.

</br>

## Contato
Caio Rocha - [@CODIGO.ROCHA](https://linktr.ee/vrocha.caio)

Project Link: https://github.com/vrochacaio/IncidenteZero
