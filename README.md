RM557484 - Leonardo Faria Salazar

RM555997 - Caio Marques

RM556325 - Felipe Camargo

RM557068 - Alexsandro Macedo

RM558640 - Caio Amarante

# 🎯 Projeto: API de Brinquedos - Spring Boot + Oracle

Este projeto foi desenvolvido como parte do Checkpoint 2 da disciplina de Programação com Persistência, do curso de Análise e Desenvolvimento de Sistemas (FIAP). O objetivo é criar uma API RESTful utilizando Spring Boot com persistência em banco de dados Oracle, permitindo realizar operações CRUD sobre brinquedos destinados a crianças de até 14 anos.

---

## 💡 Objetivo

Desenvolver uma API que permita:
- Criar (POST) brinquedos
- Listar (GET) todos os brinquedos
- Atualizar (PUT) brinquedos
- Deletar (DELETE) brinquedos

Utilizando:
- **Spring Boot (Java)**
- **Maven**
- **Banco Oracle (ORACLE_FIAP via SQL Developer)**
- **Postman** para testes de endpoints

---

## 🧸 Atributos da entidade `Brinquedo`

A entidade `Brinquedo` possui os seguintes atributos:

- `id` (Long)
- `nome` (String)
- `tipo` (String)
- `classificacao` (String)
- `tamanho` (String)
- `preco` (Double)

---

## 🔗 Endpoints da API

| Método | Rota               | Descrição                  |
|--------|--------------------|----------------------------|
| POST   | /brinquedos        | Cadastrar um brinquedo     |
| GET    | /brinquedos        | Listar todos os brinquedos |
| PUT    | /brinquedos/{id}   | Atualizar um brinquedo     |
| DELETE | /brinquedos/{id}   | Deletar um brinquedo       |

## Spring da aplicação
![image](https://github.com/user-attachments/assets/dfafe874-3f4d-4045-81af-92060b28eb38)

---

## 🧪 Exemplo de JSON para POST

```json
{
  "nome": "Boneca Mágica",
  "tipo": "Educativo",
  "classificacao": "4+",
  "tamanho": "Pequeno",
  "preco": 89.90
}
