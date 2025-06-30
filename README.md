# BTG Pactual Software Engineer Challenge

## Overview  
Develop a microservice application to process orders and generate reports by consuming messages from a RabbitMQ queue.

## Key Tasks  
- Create a work plan with task breakdown and time estimates.  
- Design and implement a database (PostgreSQL, MySQL, or MongoDB).  
- Build a microservice that listens to RabbitMQ messages containing order data, stores them, and supports querying.  
- Develop a REST API to:  
  - Retrieve the total value of an order.  
  - Retrieve the count of orders per customer.  
  - List all orders made by a customer.

## Example Message Structure  
```json
{
  "codigoPedido": 1001,
  "codigoCliente": 1,
  "itens": [
    { "produto": "lápis", "quantidade": 100, "preco": 1.10 },
    { "produto": "caderno", "quantidade": 10, "preco": 1.00 }
  ]
}
