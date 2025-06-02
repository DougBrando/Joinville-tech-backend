## Ex 1 - Setup

Crie um projeto Spring utilizando ao menos as dependências **Web** e **Jpa**.
Sua aplicação irá controlar coleta de lixo eletrônico e precisará prestar manutenção nas seguintes entidades:

- Lixo eletronico:
  - id - autoincremento
  - tipo do lixo
  - descrição
- Ponto de coleta:
  - id - autoincremento
  - nome
  - endereço
  - dia de coleta
  - materiais aceitos no ponto de coleta (Utilizar relacionamento)
- Materiais do ponto de coleta:
  - id - autoincremento
  - ponto de coleta (Utilizar relacionamento)
  - lixo eletrônico (Utilizar relacionamento)
  - capacidade máxima

**Obs1:** Utilize as convenções e boas praticas de programação
**Obs2:** Atente-se ao mapeamento correto de cada entidade
**Obs3:** Não se esqueça de conectar em um banco de dados local


## Ex 2 - CRUD de Lixo eletrônico
Criar CRUD para a entidade Lixo eletrônico utilizando DTOs.
Sugestões para cada endpoint:

**Endpoints**

- **POST** _/electronic-waste_
- **GET** _/electronic-waste_
- **GET** _/electronic-waste/{id}_
- **PUT** _/electronic-waste/{id}_
- **DELETE** _/electronic-waste/{id}_

Utilize adequadamente os padrões REST e MVC.
Não se esqueça do tratamento de exceções, status de resposta e seus métodos HTTP.

**Obs1:** Utilize as convenções e boas praticas de programação
**Obs2:** Esta etapa é a mais trabalhosa das atividades, onde será necessário criar classes de repositório, serviço e controlador para cada entidade


## Ex 3 - CRUD de Pontos de coleta
Criar CRUD para a entidade Pontos de coleta e seus materiais aceitos utilizando DTOs.
Os materiais aceitos no ponto de coleta deve ter um relacionamento "OneToMany" e toda manutenção deve ser feita por meio da classe "Ponto de coleta".

**Endpoints**

- **POST** _/collection-points_
- **GET** _/collection-points_
- **GET** _/collection-points/{id}_
- **PUT** _/collection-points/{id}_
- **DELETE** _/collection-points/{id}_

Utilize adequadamente os padrões REST e MVC.
Não se esqueça do tratamento de exceções, status de resposta e seus métodos HTTP.

**Obs1:** Utilize as convenções e boas praticas de programação
**Obs2:** Esta etapa é a mais trabalhosa das atividades, onde será necessário criar classes de repositório, serviço e controlador para cada entidade


##  Ex 4 - Consultar pontos de coleta
Criar endpoint para consultar pontos de coleta pelo nome do lixo eletrônico aceito

Endpoint:

- **GET** _/collection-points/electronic-waste/name/{name}_

O comportamento é que seja possível encontrar pontos de coleta que aceite lixo eletrônico que contenham o filtro como parte do seu dado.

Exemplo:
Para lixos eletrônicos "Celular", "Bateria de celular", "Impressora" e "Notebook".
Ao buscar pela região "**celular**" o resultado deverá ser: "**Celular**" e "Bateria de **celular**"
