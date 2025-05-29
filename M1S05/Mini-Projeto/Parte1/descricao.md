# M1S05 - Mini-Projeto - 1. Objetivo e Criação do Projeto

**Projeto**: **Mapeamento de Áreas Verdes de Joinville**

**Objetivo**: Criar um sistema que ajude os moradores e turistas a localizar e obter informações sobre os parques e áreas verdes de Joinville.

**Descrição**: O aplicativo permitirá que os usuários visualizem as áreas verdes, como parques e praças, em Joinville, com informações como nome, localização, tipo de vegetação (árvores, arbustos, grama), horários de funcionamento e atividades disponíveis (caminhada, ciclismo, futebol, vôlei, quadras de areia, piquenique, parquinho infantil, pedalinho, etc.). O sistema deve permitir a adição de novas áreas verdes pelos usuários e a avaliação delas com base em critérios sustentáveis (como quantidade de árvores, qualidade do ar, ausência de poluição sonora, coleta de resíduos, facilidade de chegar utilizando transporte público).

**Detalhamento técnico**: O aplicativo deve apresentar interação com o usuário através do terminal (utilizando classe Scanner). Deve apresentar um menu interativo listando as opções em cada etapa de interação, por exemplo:

“Digite a opção que deseja acessar:
1- Listar Áreas Verdes
2- Avaliar Área Verde
3- Ver detalhe de uma Área Verde
4- Cadastrar nova Área Verde”

Em cada operação, o sistema deve solicitar as informações necessárias ao usuário para prosseguir. Se for cadastro, deve solicitar os dados para inserir uma nova Área Verde; se for Avaliação, deve solicitar um identificador da Área Verde que deseja avaliar e, caso encontre um registro correspondente, solicitar uma nota para cada critério (1 a 5); se for “Listar Áreas Verdes”, deve simplesmente listar todas as Áreas Verdes cadastradas, exibindo para cada uma os dados: Nome, Tipo de vegetação e Média das avaliações; se for “Ver detalhe de uma Área Verde”, deve solicitar um identificador e, se existir, exibir os dados detalhados daquela Área Verde (todos).

Entidades mínimas necessárias:
Classe **AreaVerde**: Representa uma área verde com atributos como id, nome, localização (coordenadas geográficas), tipo de vegetação(árvores, arbustos, gramado), horários de funcionamento, atividades disponíveis, lista de avaliações. Além dos getters e setters, deve possuir método que calcule a média de todas as avaliações. Também deve possuir métodos que retornem textualmente (String) os dados de Listagem e de Detalhe.

Classe **Localizacao**: Representa a localização da área verde. Deve possuir atributos de coordenadas geográficas (latitude e longitude) e o identificador da Área Verde que representa. Deve possuir método que represente textualmente seus dados (toString).

Classe **Avaliacao**: Representa uma avaliação de usuário para alguma área verde. Deve possuir atributos que representam as notas para cada critério, como quantidade de árvores, qualidade do ar, ausência de poluição sonora, coleta de resíduos, facilidade de chegar utilizando transporte público. Também deve possuir um atributo que armazene o identificador de qual Área Verde está sendo avaliada. Além dos getters e setters, deve possuir método para cálculo da média de todos os critérios.

O sistema também deve ter classe(s) para servir como Repositório de dados, que devem possuir atributo estático representando uma lista de entidades cadastradas. Por exemplo: AreaVerdeRepository, possuindo um atributo estático “List<AreaVerde> AREAS_VERDES”; LocalizacaoRepository, possuindo um atributo estático “List<Localizacao> LOCALIZACOES”; AvaliacaoRepository, possuindo um atributo estático “List<Avaliacao> AVALIACOES“.
