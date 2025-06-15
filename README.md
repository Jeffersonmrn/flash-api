# ⚡ STAR Labs Order Management API

Sistema completo de gestão de pedidos incluindo autenticação com JWT, controle de estoque, relatórios financeiros e documentação Swagger.

## 📌 Tecnologias

- Java 21
- Spring Boot 3.5
- Spring Security (JWT)
- Spring Data JPA
- PostgreSQL
- Maven
- Swagger (OpenAPI 3)
- JUnit

## 📦 Funcionalidades

✅ Cadastro, edição e remoção de usuários  
✅ Autenticação e registro com token JWT  
✅ Cadastro e listagem de produtos e categorias  
✅ Controle de estoque automático por status do pedido  
✅ Lançamento e gestão de pedidos com itens e pagamento  
✅ Relatórios por status, por usuário e balanço geral  
✅ Documentação Swagger pronta para testes  
✅ Retorno de mensagens de erro padronizadas

## 🧪 Dados de exemplo

O projeto inclui um script SQL com base populada, incluindo:

- 3 usuários
- 3 categorias
- 5 produtos
- 3 pedidos (com itens e pagamentos)
- Estoque inicial configurado


---

## 🔐 Autenticação

Token deve ser enviado em chamadas autenticadas no header: Authorization: Bearer SEU_TOKEN

### POST `/auth/register` - Registro

```json
{
  "name": "Barry Allen2",
  "email": "barry@labs2.com",
  "phone": "988888888",
  "password": "123456"
}
```

### POST `/auth/login` - Login

```json
{
  "email": "admin@starlabs.com",
  "password": "123456"
}
```

---

## 👤 Usuários

### GET `/users`  
Retorna todos os usuários.

### PUT `/users/{id}`  
Atualiza os dados de um usuário.

```json
{
  "name": "Nevasca",
  "email": "nevasca.gelot@starlabs.com",
  "phone": "977557765"
}
```

### PUT `/users/{id}/password`  
Atualiza a senha do usuário.

```json
{
  "oldPassword": "123457",
  "newPassword": "123458"
}
```

### DELETE `/users/{id}`  
Remove um usuário pelo ID.

---

## 📦 Produtos

### GET `/products`  
Retorna todos os produtos.

### POST `/products`  
Cria um novo produto.

```json
{
  "name": "Traje do Flash",
  "description": "Alta tecnologia STAR Labs",
  "price": 4500.0,
  "imgUrl": "",
  "categoryIds": [1]
}
```

### PUT `/products/{id}`  
Atualiza um produto existente.

```json
{
  "name": "Traje Quântico Avançado",
  "description": "Nova versão do traje criado na STAR Labs com tecnologia temporal.",
  "price": 7200.0,
  "imgUrl": "",
  "categoryIds": [2]
}
```

---

## 🗂️ Categorias

### GET `/categories`  
Retorna todas as categorias.

### POST `/categories`  
Cria uma nova categoria.

```json
{
  "name": "Tecnologia de Ponta STAR Labs"
}
```

### PUT `/categories/{id}`  
Atualiza uma categoria existente.

```json
{
  "name": "Equipamentos para a Nevasca"
}
```

---

## 📑 Pedidos

### GET `/orders`  
Retorna todos os pedidos.

### GET `/users/{id}/orders`  
Retorna todos os pedidos de um usuário.

### GET `/orders/status?status=1`  
Retorna pedidos filtrando por status.

### POST `/orders`  
Cria um novo pedido.

```json
{
  "orderStatus": 2,
  "clientId": 1,
  "items": [
    {
      "productId": 2,
      "quantity": 1,
      "price": 1800.0,
      "paymentMethod": 2
    }
  ]
}
```

### PUT `/orders/{id}/status`  
Atualiza o status de um pedido.

```json
{
  "orderStatus": 1
}
```

### DELETE `/orders/{id}`  
Remove um pedido pelo ID.

---

## 📊 Relatórios

### GET `/orders/report/balance`  
Retorna o balanço geral entre estoque e pedidos aprovados.

### GET `/orders/report/total-by-status`  
Retorna o valor total de pedidos agrupados por status.

### GET `/orders/report/total-by-user?userId=1`  
Retorna o total de pedidos de um usuário agrupados por status.

---

## ✅ Swagger UI

Documentação disponível em:  
📎 [`http://localhost:8080/swagger-ui/index.html`](http://localhost:8080/swagger-ui/index.html)

---

## Contribuição

Fique à vontade para enviar PRs, sugerir melhorias ou tirar dúvidas.  
Este projeto é uma base de aprendizado com foco em boas práticas REST + segurança + relatórios.

---
