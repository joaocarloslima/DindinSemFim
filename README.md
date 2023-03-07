# Dindin Sem Fim

Uma API para o app de controle de gastos pessoais.

## Endpoint

- Despesas
    - [Cadastrar](#cadastrar-despesa)
    - [Mostrar detalhes](#detalhar-despesa)
    - Apagar
    - Atualizar
    - Listar todas
- Contas
- Categorias

---

### Cadastrar Despesa

`POST` /api/despesa

**Campos da requisição**

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|---
|valor | decimal | sim | o valor da despesa, deve ser maior que zero
|data|data|sim| a data da despesa
|categoria_id | int | sim | código de uma categoria previamente cadastrada
|conta_id |int |int | o código de uma conta previamente cadastrada
|descricao|texto|não| um texto sobre a despesa com no máximo de 255 caracteres

**Exemplo de corpo de requisição**

```js
{
    valor: 100.00,
    data: '2023-02-28',
    categoria_id: 1,
    conta_id: 1,
    descricao: 'cinema'
}
```

**Códigos de Resposta**

| código | descrição
|-|-
| 201 | despesa cadastrada com sucesso
| 400 | os campos enviados são inválidos

---

### Detalhar Despesa

`GET` /api/despesa/{id}

**Exemplo de Corpo da Resposta**

```js
{
    valor: 100.00,
    data: '2023-02-28',
    categoria: {
        categoria_id: 1,
        nome: 'lazer',
    },
    conta: {
        conta_id: 1,
        nome: 'itaú',
    }
    descricao: 'cinema'
}
```

**Códigos de Resposta**

| código | descrição
|-|-
| 200 | dados retornados com sucesso
| 404 | não existe despesa com o id informado