
## Ex 1 - Setup
Crie um projeto Spring utilizando ao menos as dependências **Web** e **Jpa**.
Sua aplicação irá controlar projetos sustentáveis e precisará prestar manutenção nas seguintes entidades:

- Organização:
  - id - autoincremento
  - nome
  - contato
- Projeto:
  - id - autoincremento
  - nome
  - descrição
  - região
  - estimativa de redução de CO2
  - organização (utilizar relacionamento)

**Obs1:** Utilize as convenções e boas praticas de programação
**Obs2:** Atente-se ao mapeamento correto de cada entidade
**Obs3:** Não se esqueça de conectar à um banco de dados local


## Ex 2 - CRUD
Cria um CRUD para cada entidade.
Antes de salvar qualquer projeto é necessário validar se a organização atribuída realmente existe.

‌

Sugestões para cada endpoint:

- **Organização**
    _•	**POST** /organizations_ – cadastrar uma nova organização
    _•	**GET** /organizations_ – listar todas as organizações
    _•	**GET** /organizations/{id}_ – visualizar detalhes de uma organização
    _•	**PUT** /organizations/{id}_ – atualizar informações
    _•	**DELETE** /organizations/{id}_ – excluir
- **Projeto**
    _•	**POST** /projects_ – cadastrar um novo projeto sustentável
    _•	**GET** /projects_ – listar todos os projetos
    _•	**GET** /projects/{id}_ – visualizar detalhes de um projeto
    _•	**PUT** /projects/{id}_ – atualizar informações
    •	_**DELETE** /projects/{id}_ – excluir

‌

**Obs1:** Utilize as convenções e boas praticas de programação
**Obs2:** Esta etapa é a mais trabalhosa das atividades, onde será necessário criar classes de repositório, serviço e controlador para cada entidade
**Obs3:** Fica opcional a utilização de DTOs


## Ex 3 - Filtro de organizações
Ao buscar todas as organizações, deve ser possível realizar filtros opcionais por nome e contato.
Para isso utilize "_query params_" nos filtros do endpoint.

O comportamento é que seja possível encontrar organizações que contenham o filtro como parte do seu dado.

**Exemplo:**
    Para as organizações de nome "_Solaris_", "_VerdeVivo_" e "_NeoVerde_"
    Ao buscar pelo nome "_**verde**_" o resultado deverá ser: "_**Verde**Vivo_" e "_Neo**Verde**_"


## Ex 4 - Filtro de projetos
Ao buscar todos os projetos, deve ser possível realizar filtros opcionais por região e nome da organização do projeto.
Para isso utilize "_query params_" nos filtros do endpoint.

O comportamento é que seja possível encontrar projetos que contenham o filtro como parte do seu dado.

Exemplo:
Para as projetos da região "_Sul_", "_Sudeste_" e "_América do sul_"
Ao buscar pela região "_**sul**_" o resultado deverá ser: "**Sul**" e "_América do **sul**_"
