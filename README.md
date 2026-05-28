# API REST - Java + Spring Boot + JWT Authorization

## 📚 Sobre o Projeto

Este projeto foi desenvolvido durante os estudos do curso **Santander 2026 - Java Backend**, disponibilizado pela plataforma [DIO (Digital Innovation One)](https://www.dio.me).

A ideia inicial do projeto foi baseada nas funcionalidades apresentadas durante as aulas, principalmente:

- Consulta de CEP
- Criação de usuários
- Estruturação de uma API REST com Spring Boot

Após a conclusão da base proposta no curso, o projeto foi evoluído com novas funcionalidades e melhorias de segurança.

---

# 🚀 Melhorias Implementadas

Além das funcionalidades ensinadas no curso, foi implementado um sistema completo de:

- 🔐 Autenticação com JWT
- 🛡️ Authorization (controle de acesso por roles)
- 🚫 Tratamento personalizado de acesso negado
- 👤 Usuários com permissões diferentes (ADMIN / USER)
- 🔑 Proteção de endpoints privados

O objetivo dessas melhorias foi transformar o projeto em algo mais próximo de um cenário real de mercado, aplicando conceitos modernos de segurança utilizando Spring Security + JWT.

---

# 🛠️ Tecnologias Utilizadas

- Java 26
- Spring Boot 3
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- H2 Database
- OpenFeign
- Maven
- Swagger/OpenAPI

---

# 🔐 Segurança da Aplicação

O projeto utiliza autenticação baseada em token JWT.

Após realizar login, o usuário recebe um token que deve ser enviado nas próximas requisições protegidas.

Exemplo:

```http
Authorization: Bearer SEU_TOKEN
```

---

# 👥 Controle de Acesso

O sistema possui controle de permissões baseado em roles.

Exemplo:

- `ROLE_ADMIN`
- `ROLE_USER`

Endpoints específicos podem ser acessados apenas por administradores.

---

# 📦 Funcionalidades

## ✅ Usuários

- Criar usuário
- Login
- Geração de token JWT
- Controle de permissões

## ✅ CEP

- Consulta de CEP utilizando API externa
- Integração com OpenFeign

## ✅ Segurança

- Rotas públicas e privadas
- Filtro JWT
- Tratamento de acesso negado
- Authorization por roles

---

# 📖 Documentação da API

Swagger disponível em:

```http
http://localhost:8080/swagger-ui.html
```

ou

```http
http://localhost:8080/swagger-ui/index.html
```

---

# ▶️ Como Executar o Projeto

## Clonar o repositório

```bash
git clone URL_DO_REPOSITORIO
```

## Entrar na pasta do projeto

```bash
cd nome-do-projeto
```

## Executar a aplicação

```bash
mvn spring-boot:run
```

---

# 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em:

- Aprendizado prático de Spring Boot
- Evolução da arquitetura ensinada no curso
- Implementação de autenticação e autorização
- Simulação de boas práticas utilizadas no mercado

---

# 👨‍💻 Autor

Desenvolvido por **Marlon Oliveira** durante os estudos do programa **Santander 2026 - Java Backend** na plataforma [DIO (Digital Innovation One)](https://www.dio.me).
