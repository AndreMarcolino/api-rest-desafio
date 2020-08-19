# Documentação da API REST

### Consultar clientes
GET, //andrefellipe-test-app.herokuapp.com/clientes (200 OK)
```
{
  _id: string;
  name: string;
  cpf: string;
  address: string;
}
```

### Inserir clientes
POST, //andrefellipe-test-app.herokuapp.com/clientes
```
{
  name: string;
  cpf: string;
  address: string;
}
```

### Alterar clientes
PUT, //andrefellipe-test-app.herokuapp.com/clientes
```
{
  name: string;
  cpf: string;
  address: string;
}
```

### Deletar clientes
DELETE, //andrefellipe-test-app.herokuapp.com/clientes/{idCliente}
