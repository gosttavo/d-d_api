# Projeto N2 - API D&D

## 🌟 Rotas Disponíveis

### 1. **Listar Classes**
- **Método:** `GET`
- **Endpoint:** `/classes`
- **Descrição:** Retorna a lista de classes disponíveis no sistema.
  
- **Response:**
  ```json
  [
    {
      "index": "barbarian",
      "name": "Barbarian",
      "url": "/api/classes/barbarian"
    }
  ]

### 2. **Sobre o Aluno**
- **Método:** `GET`
- **Endpoint:** `/sobre`
- **Descrição:** Retorna os dados sobre o aluno.
  
- **Response:**
  ```json
  {
      "codigo": "202222216",
      "projeto": "API D&D",
      "nome": "Gustavo Goulart"
  }

### 3. **Selecionar Classe**
- **Método:** `POST`
- **Endpoint:** `/class`
- **Descrição:** Retorna a classe escolhida pelo seu index.
  
- **Body Exemplo:**
  ```json
  {
    "index": "barbarian"
  }
  
- **Response:**
  ```json
  {
      "index": "barbarian",
      "name": "Barbarian",
      "url": "/api/classes/barbarian"
  }

## 🌟 Como usar

### 1. **Usando o docker**
- Tenha o Docker instalado na sua máquina.
- Navegue até o diretório do projeto e inicie o container com o comando:
```bash 
  docker-compose up --build
```
- Acesse a API em http://localhost:8080.
