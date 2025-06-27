# Ex 1 - Setup do projeto
Crie um projeto Spring utilizando ao menos as dependências **Web**, **Jpa** e **Security**.

Sua aplicação irá controlar projetos sustentáveis e precisará prestar manutenção nas seguintes entidades:

Organização:

- id - autoincremento
- nome
- contato

Usuário:

- id - autoincremento
- nome
- nome de usuário (username)
- senha
- perfil -> Com 2 valores possíveis: ADMIN e USER

**Obs1:** Não se esqueça de conectar à um banco de dados local
**Obs2:** Utilize as convenções e boas praticas de programação
**Obs3:** Atente-se ao mapeamento correto de cada entidade

# Ex 2 - Setup do Spring Security
Realize as configurações iniciais referentes ao Security.
Estas configurações podem envolver a criação beans e classes referentes à usuários.

É necessário a criação prévia de um usuário com perfil ADMIN. Pode ser criado via SQL ou no próprio service

Sugestões para endpoint de login:

- **POST** _/auth_
- **POST** _/login_

**Permissões:**

- Login: público

Ex 3 - CRUD de Usuário e Login
Crie um CRUD para usuários.

**Endpoints**

- **POST** _/users_ – cadastrar um novo usuário
- **GET** _/users_ – listar todos os usuários
- **GET** _/users/{id}_ – visualizar detalhes de um usuário
- **PUT** _/users/{id}_ – atualizar informações
- **DELETE** _/users/{id}_ – excluir

**Permissões:**

- Consultas, cadastro, edição e exclusão: apenas para usuários ADMIN

# Ex 4 - CRUD de Orgnização
Crie um CRUD para organização.

**Endpoints**

- **POST** _/organizations_ – cadastrar uma nova organização
- **GET** _/organizations_ – listar todas as organizações
- **GET** _/organizations/{id}_ – visualizar detalhes de uma organização
- **PUT** _/organizations/{id}_ – atualizar informações
- **DELETE** _/organizations/{id}_ – excluir

**Permissões:**

- Cadastro, edição e exclusão: apenas para usuários ADMIN
- Consultas: usuários USER e ADMIN
