# Projeto N2 - API D&D

## 🌟 Rotas Disponíveis

### 1. **Listar Classes**
- **Método:** `GET`
- **Endpoint:** `/classes`
- **Descrição:** Retorna a lista de classes disponíveis no sistema.

### 2. **Sobre o Aluno**
- **Método:** `GET`
- **Endpoint:** `/sobre`
- **Descrição:** Retorna os dados sobre o aluno.

### 3. **Selecionar Classe**
- **Método:** `POST`
- **Endpoint:** `/class`
- **Descrição:** Retorna a classe escolhida pelo seu index.
- **Body Exemplo:**
  ```json
  {
    "index": "barbarian"
  }

## 🌟 Como usar

### 1. **Usando o docker**
- Tenha o Docker instalado na sua máquina.
- Navegue até o diretório do projeto e inicie o container com o comando:
```bash 
  docker-compose up --build
```
- Acesse a API em http://localhost:8080.
