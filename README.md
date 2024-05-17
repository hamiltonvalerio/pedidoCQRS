<p align="center">
  <img src="https://raw.githubusercontent.com/PKief/vscode-material-icon-theme/ec559a9f6bfd399b82bb44393651661b08aaf7ba/icons/folder-markdown-open.svg" width="100" alt="project-logo">
</p>
<p align="center">
    <h1 align="center">CQRS</h1>
</p>
<p align="center">
    <em><code>► API simples para entendimento do CQRS com Spring Boot </code></em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/license/hamiltonvalerio/pedidoCQRS?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
	<img src="https://img.shields.io/github/last-commit/hamiltonvalerio/pedidoCQRS?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/hamiltonvalerio/pedidoCQRS?style=default&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/hamiltonvalerio/pedidoCQRS?style=default&color=0080ff" alt="repo-language-count">
<p>
<p align="center">
	<!-- default option, no dependency badges. -->
</p>

<br><!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary><br>

- [ Overview](#-overview)
- [ Features](#-features)
- [ Repository Structure](#-repository-structure)
- [ Modules](#-modules)
- [ Getting Started](#-getting-started)
  - [ Installation](#-installation)
  - [ Usage](#-usage)
  - [ Tests](#-tests)
- [ Contributing](#-contributing)
- [ License](#-license)
- [ Acknowledgments](#-acknowledgments)
</details>
<hr>

##  Overview

<code>API simples para entendimento do CQRS com Spring Boot. 
Command Query Responsibility Segregation (CQRS) é um padrão de arquitetura que separa as operações de leitura (queries) e escrita (commands) de um sistema, para melhorar a escalabilidade, segurança e manutenção. Esse padrão é especialmente útil em sistemas complexos e de alta performance, onde as operações de leitura e escrita têm requisitos diferentes.
No caso deste exemplo está criado apenas em uma api, mas em relação a escalabilidade e manutenção, por exemplo,  separaríamos em dois microsserviços, um para commands e outro para queries.

ESTRUTURA:
► Commands são responsáveis por alterar o estado do sistema, como criar, atualizar ou deletar um pedido.
► Queries são responsáveis por retornar informações do sistema, como listar todos os pedidos ou buscar um pedido específico.
► Infraestrutura: Configuração e repositórios. Spring Boot, Spring Data JPA, H2 Database, OpenAPI</code>
</code>

---

##  Features

<code>► Spring Boot, Spring Data JPA, H2 Database, OpenAPI</code>

---

##  Repository Structure

```sh
└── pedidoCQRS/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src
        ├── main
        └── test
```

---

##  Modules

<details closed><summary>.</summary>

| File                                                                           | Summary                         |
| ---                                                                            | ---                             |
| [mvnw](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/mvnw)         | <code>► INSERT-TEXT-HERE</code> |
| [mvnw.cmd](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/mvnw.cmd) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>src.test.java.br.eti.valerio.pedido.pedidoCQRS</summary>

| File                                                                                                                                                                        | Summary                         |
| ---                                                                                                                                                                         | ---                             |
| [PedidoCqrsApplicationTests.java](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/src/test/java/br/eti/valerio/pedido/pedidoCQRS/PedidoCqrsApplicationTests.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>src.main.java.br.eti.valerio.pedido.pedidoCQRS</summary>

| File                                                                                                                                                              | Summary                         |
| ---                                                                                                                                                               | ---                             |
| [PedidoCqrsApplication.java](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/src/main/java/br/eti/valerio/pedido/pedidoCQRS/PedidoCqrsApplication.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>src.main.java.br.eti.valerio.pedido.pedidoCQRS.config</summary>

| File                                                                                                                                                                         | Summary                         |
| ---                                                                                                                                                                          | ---                             |
| [PedidoCQRSOpenApiConfig.java](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/src/main/java/br/eti/valerio/pedido/pedidoCQRS/config/PedidoCQRSOpenApiConfig.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>src.main.java.br.eti.valerio.pedido.pedidoCQRS.entity</summary>

| File                                                                                                                                       | Summary                         |
| ---                                                                                                                                        | ---                             |
| [Pedido.java](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/src/main/java/br/eti/valerio/pedido/pedidoCQRS/entity/Pedido.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>src.main.java.br.eti.valerio.pedido.pedidoCQRS.command</summary>

| File                                                                                                                                                                    | Summary                         |
| ---                                                                                                                                                                     | ---                             |
| [CriaPedidoCommand.java](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/src/main/java/br/eti/valerio/pedido/pedidoCQRS/command/CriaPedidoCommand.java)       | <code>► INSERT-TEXT-HERE</code> |
| [PedidoCommandService.java](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/src/main/java/br/eti/valerio/pedido/pedidoCQRS/command/PedidoCommandService.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>src.main.java.br.eti.valerio.pedido.pedidoCQRS.controller</summary>

| File                                                                                                                                                               | Summary                         |
| ---                                                                                                                                                                | ---                             |
| [PedidoController.java](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/src/main/java/br/eti/valerio/pedido/pedidoCQRS/controller/PedidoController.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>src.main.java.br.eti.valerio.pedido.pedidoCQRS.repository</summary>

| File                                                                                                                                                               | Summary                         |
| ---                                                                                                                                                                | ---                             |
| [PedidoRepository.java](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/src/main/java/br/eti/valerio/pedido/pedidoCQRS/repository/PedidoRepository.java) | <code>► INSERT-TEXT-HERE</code> |

</details>

<details closed><summary>src.main.java.br.eti.valerio.pedido.pedidoCQRS.query</summary>

| File                                                                                                                                                              | Summary                         |
| ---                                                                                                                                                               | ---                             |
| [PedidoQueryService.java](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/src/main/java/br/eti/valerio/pedido/pedidoCQRS/query/PedidoQueryService.java) | <code>► INSERT-TEXT-HERE</code> |
| [GetPedidoQuery.java](https://github.com/hamiltonvalerio/pedidoCQRS/blob/master/src/main/java/br/eti/valerio/pedido/pedidoCQRS/query/GetPedidoQuery.java)         | <code>► INSERT-TEXT-HERE</code> |

</details>

---

##  Getting Started

**System Requirements:**

* **Java**: `version x.y.z`

###  Installation

<h4>From <code>source</code></h4>

> 1. Clone the pedidoCQRS repository:
>
> ```console
> $ git clone https://github.com/hamiltonvalerio/pedidoCQRS
> ```
>
> 2. Change to the project directory:
> ```console
> $ cd pedidoCQRS
> ```
>
> 3. Install the dependencies:
> ```console
> $ mvn clean install
> ```

###  Usage

<h4>From <code>source</code></h4>

> Run pedidoCQRS using the command below:
> ```console
> $ java -jar target/myapp.jar
> ```

###  Tests

> Run the test suite using the command below:
> ```console
> $ mvn test
> ```

---

##  Contributing

Contributions are welcome! Here are several ways you can contribute:

- **[Report Issues](https://github.com/hamiltonvalerio/pedidoCQRS/issues)**: Submit bugs found or log feature requests for the `pedidoCQRS` project.
- **[Submit Pull Requests](https://github.com/hamiltonvalerio/pedidoCQRS/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.
- **[Join the Discussions](https://github.com/hamiltonvalerio/pedidoCQRS/discussions)**: Share your insights, provide feedback, or ask questions.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/hamiltonvalerio/pedidoCQRS
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="center">
   <a href="https://github.com{/hamiltonvalerio/pedidoCQRS/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=hamiltonvalerio/pedidoCQRS">
   </a>
</p>
</details>

---

##  License

This project is protected under the [GNU AGPLv3](https://choosealicense.com/licenses/agpl-3.0/#) License. For more details, refer to the [LICENSE](https://choosealicense.com/licenses/) file.

---

##  Acknowledgments

- List any resources, contributors, inspiration, etc. here.

[**Return**](#-overview)

---
