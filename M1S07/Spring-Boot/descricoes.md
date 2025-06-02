## Ex 1 - SETUP
Crie um projeto Spring para gerenciamento de uma rota de coleta seletiva.
**Obs:** Fique à vontade para dar nome o projeto.


## Ex 2 - Entidades
A primeira implementação do projeto:

Crie as classes:

1. _**Rota**_
   A classe deve conter ao menos os atributos:
   1. ID (sequencial)
   2. Descrição
   3. Área de abrangência (Rua, bairro, região, etc)
   4. Percentual de eficiência
2. _**Coletor**_
   A classe deve conter ao menos os atributos:
   1. ID (sequencial)
   2. Nome
   3. Descrição

**!!! IMPORTANTE !!!**

1. A classe deve conter um método estático para controlar a sequencia dos IDs.
2. A classe deve estar devidamente encapsulada.
3. O atributo ID não deve possuir um método "`set`".

## Ex 3 - Classes de serviço
Com todas as nossas classes de entidades criadas:

Crie uma classe _Service_ para manter a regra de negócio das entidades:

- Cadastro de Rotas
- Consulta todas as Rotas
- Cadastro de Coletores
- Consultar todos os Coletores

**Observação:**
Pode ser utilizada uma única classe de serviços, ficando opcional a criação de um _Service_ para cada entidade.

**!!! Atenção !!!**

Para concluir o exercício será necessário realizar adequações nas classes _Rota_ e _Coletor_:

- Utilize um atributo estático e privado para o armazenamento dos cadastros
  - crie um método "`get`"
  - crie um método responsável pela inclusão

## Ex 4 - Controladores
Com todas os services criados:

Crie uma classe _Controller_ responsável por cada entidade (rotas e coletores).
O controlador deve conter métodos para:

- Cadastrar novos registros **(POST)**
- Consultar todos os registros **(GET)**

### **!!! Atenção !!!**

Utilize a injeção de dependências para usar a classe _Service_


## Ex 5 - Contrato
Crie um novo _Controller_ para registrar os contratos entre os coletores e as rotas. É necessário existam os endpoints:

- Registro de contratos **(POST)**
  - Requisitos:
    - ID do coletor no _Path Param_;
    - Lista de IDs de rotas no _RequestBody_.
- Consulta de contratos **(GET)**
  - Requisitos:
    - Retornar todas as informações do contrato, incluindo todas as informações do coletor e suas rotas

‌

Para concluir o exercício será necessário realizar adequações no projeto:

- Criar métodos de busca por ID, para coletores e rotas em sua classe de serviço correspondente
- Criar uma classe _Contrato_:
  - ID (incrementado automáticamente)
  - Coletor
  - Rotas (lista de rotas)
- Criar um _Service_ de contratos:
  - Criar método para consultar todos
  - Criar método para registro:
    - Deve utilizar injeção de dependências para buscar coletor e rotas por ID
    - Validar se coletores e rotas existem
    - Salvar contratos em uma lista estática (como realizado nos demais casos)

‌

**Obs1:** A regra de negócios deverá sempre ser utilizada no _Service_, não utilize o controlador para realizar buscas ou inserções.

**Obs2:** Todas as entidade e as classe de serviços possuem lógicas similares. Atenção na geração dos IDs, encapsulamento e armazenamento em atributos estáticos.
