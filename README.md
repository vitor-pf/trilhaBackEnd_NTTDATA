# trilhaBackEnd_NTTDATA

## DESAFIO 1
#### a) Com suas palavras defina o que é um sistema de controle de versões (VCS)?

O *VCS - Version Control System* (mais conhecido como Sistema de Controle de Versão), é um software instalável no computador para o gerenciamento de arquivos, aonde controla-se todas suas alterações do projeto, e essas versões modificadas são armazenadas num repositório online, como o GitHub ou Bitbucket.
O software para o gerenciamento de versão mais conhecido como GIT, tem duas versões: a gráfica que ajuda na visualização dos galhos no projeto e o terminal de linha de comando que é mais utilizado por ser rápido.
O *VCS* é muito utilizada pela equipe de *TI (Tecnologia da Informação)*, mas também não impede de ser usado por outros profissionais. O TI, utiliza para os trabalhos em equipe ou individuais, sendo assim, cada membro é responsável por aquele usuário, isso ajuda a identifica detalhes em cada galho (nó ou ponto) do projeto, permitindo voltar nesse ponto específico e assim alterar essa história sem modifica o projeto posterior. 
  

#### b) Cite 5 vantagens em utilizar um VCS: 

#### 1 - Histórico completo
Um projeto nasce pequeno, mas pode crescer futuramente e o CVS nos ajuda a analisar e modificar cada ponto na sua história. 
#### 2 - Rastreabilidade do projeto
O membro é único no projeto e isso facilita na identificação do ponto.  
#### 3 - Trabalho em equipe
O projeto por ser muito grande e formado por diversas pessoas, o CVS ajuda dividir as tarefas e muito mais.
#### 4 - Segurança
O projeto por ter vários membros em determinadas etapas, mostra como a segurança é grande, por ter apenas pessoas autorizadas e com nível de hierarquia.
#### 5 - Compartilhar o projeto na comunidade
É possível compartilhar e implantar partes do projeto em diversas comunidades. 


#### c) Cite 3 exemplos de VCS:

1 - Git
2 - Mercurial
3 - SVN


## DESAFIO 2
#### a) Com suas palavras defina o que é programação orientada a objetos (POO) e cite seus pilares?
O *POO - Programa Orientada a Objetos*, é um paradigma de desenvolvimento de sistemas para algumas linguagens de programação, como Java, C#, Ruby ou Python.
A *UML (Unified Modeling Language)* Linguagem de Modelagem Unificada, ajuda no POO a elabora o projeto e identifica pontos como: Classes, Atributos e Funções.
O POO, é método mais utilizado na programação em relação a outros paradigmas, no caso do procedural, a forma de escrita e leitura em sequência, sendo diferente do POO. Esse tipo de paradigma consiste em 4 pilares como: Herança, Encapsulamento, Polimorfismo e Abstração.
Os pilares do POO, permite um excelente trabalho no desenvolvimento, onde trás diversas melhorias para o projeto, como: flexibilidade, reutilização, segurança, escalonamento e entre outros.


#### b) Exemplifique e explique um cenário de abstração;  
*Exemplo:* O carro herda automóvel que vem do tipoDeTransporte. 
A abstração ou interface, é quando uma ou mais atributos, ou métodos existem em outras classes, ou seja, essa semelhança acaba se tornando interface, assim que é implantada apenas naquela classe sem herdar para outra.


#### c) Exemplifique e explique um cenário de encapsulamento;
*Exemplo:* Podemos dizer que temos 2 tipos canetas (azul com e sem tampa), sendo que um dos métodos apenas escreve e o outro retira a tampa e escreve, mas o outro não tem autorização, esse método fica encapsulo.
O encapsulamento permite criar uma camada de segurança, aonde apenas métodos autorizados podem modificar.


#### e) Exemplifique e explique um cenário de polimorfismo;
*Exemplo:* Um grupo de caneta com varias funcionalidades, o diferencial consta no método, sendo que um pode ter a função apagar.
O polimorfismo pode ter mais de um objeto diferente para objetivo final, essas funções implantam a mesma funcionalidade, mas o método é diferente apenas com algo a mais.


#### d) Exemplifique e explique um cenário de herança;
*Exemplo:* O filho pode herdar característica do pai, assim como do avô e bisavô, algo simples como, a cor dos olhos.
O nome já diz, herdar algo de um pai. Em POO, podemos reutilizar atributos ou métodos e repassar para outros filhos, sendo assim, temos um conjunto de elementos que a semelham-se.


#### f) Cite 5 vantagens da POO;
1 - Segurança no sistema
2 - Reutilização de código
3 - Escalonamento no sistema
4 - Facilidade para ler, modifica e depurar o código
5 - Manutenção do código


## DESAFIO 3
#### O que é o protocolo de comunicação HTTP e como ele funciona; 
O HTTP (Hypertext Transfer Protocol) é um protocolo na camada de aplicação, é responsavel pela comunicação entre o cliente e servidor.
Ele trabalho com 2 protocolos TCP (responsável pela transferencia) e IP (endereço absoluto). O TCP/IP utiliza um pedido ao servidor (request) e devolve um resposta (response), normalmente esse retorno é um arquivo HTML ou JSON, aonde contém todas as informações da aplicação, como: textos, imagens e outros.
Toda conexão enviada ao servidor e encerrada com uma resposta, geralmente, as informações contém um padrão (method, path, version, code, status e entre outros) para que o request e response possa trata-los. Enfim, gerando um ciclo para cada requisição.


1 - O usuário em seu navegador (celular, computador ou outro dispositivo) acessa uma URL de uma página.
2 - Essa conexão é enviada para o servidor utilizando o TCP/IP, e será tratada com as informações recebidas (também pode acontecer outras requisições internas, como para API de terceiros), e assim devolver uma resposta com um corpo padrão.
3 - E assim, o navegador renderiza a resposta solicitada.

#### O que é REST, e qual é a sua relação com o protocolo HTTP;
O REST ou RESTful (Representational State Transfer) é conjunto de definição que ajuda na requisição HTTP, ou seja, é uma boa prática no desenvolvimento de sistema. Essa arquitetura utiliza uma URL para se comunicar entre cliente-servidor, estado, cache, interface uniforme, sistema em camadas e código sob demanda.
O REST eleva o nivel da aplicação por performace, segurança e escalável.

#### O que é Web API, e qual é a sua relação com REST;
A API (Application Programming Interface) é um conjunto de interface (compartilha parte da aplicação) para terceiro, ou seja, uma porta do sistema se comunica com outros sistemas.


#### Todos os métodos do REST são:
GET: leitura de dados no host;
HEAD: É o metadados, é informação de um arquivo, no caso foto, câmera usada, data de criação da fotografia, formato, tamanho do arquivo e etc. 
POST: Salvar dados no servidor;
PUT: Atualizar informação;
DELETE: Deletar informação;
TRACE: Permite que o servidor veja o que está sendo recebido na outra extremidade (rastreamento da aplicação);
OPTIONS: Representa um pedido de informação sobre as opções de comunicação disponíveis;
CONNECT: Usa uma proxy que pode mudar dinamicamente para ser um túnel SSL;

#### O que é Swagger?
O Swagger é uma ferramenta para desenvolver APIs, ou seja, permite que você descreva uma estrutura de API de forma facilitada, deixando a documentação fácil tanto humano ou máquina.


## DESAFIO 4
#### O que é JDBC?
A JDBC (Java Database Connectivity) é uma API que tem como principal objetivo facilitar o acesso de aplicação Java ao banco de dados.
A API contém um adaptador (driver), sendo possível se conectar em vários bancos de dados e com poucas configurações conseguimos inserir comando SQL.
O driver é o principal responsável pela comunicação com o banco. Existem tipos de driver JDBC, o Ponte JDBC-ODBC, Driver API-Nativo, Driver Nativo e o Driver de Protocolo de Rede.

#### O que é ORM, cite 3 exemplos?
O ORM (Object Relational Mapper), é uma técnica de mapeamento objeto relacional que permite fazer uma relação das classes (Orientado Objeto) com as tabelas (banco de dados). Essa técnica nos permite criar instruções entre classes diretas para tabela do banco de dados, sendo assim, ganhando produtividade e segurança, pois deixa de digitar comando SQL.

#### O que é JPA e qual é a sua relação com os ORM’s?
A JPA (Java Persistence API), não é um framework de ORM, mas foi a partir dele que surgiu as especificações para os ORMs. A JPA é uma série de regras para implementar em um projeto com ORM, ou seja, um padrão para os frameworks.
Os frameworks de ORMs, como o Hibernate e Eclipse Link:
O Hibernate foi o primeiro ORM do mercado e é mais utilizado no momento. Mas surgiu outros, como o Eclipse Link, todos com as mesmas especificações do JPA.

#### O que é Spring Data?
O Spring Data, é um projeto que facilita e incorporar uma série funcionalidades para aplicação com banco de dados.
Em termos práticos, o projeto Spring Data vem para facilitar e dar produtividade em funcionalidade básica de uma aplicação como CRUD (Create-Read-Update-Delete). Além de implementações específicas para cada banco de dados, também conta com uma funcionalidade de ordenação, paginação e um métodos para pesquisa.

#### O que caracteriza um projeto “CRUD básico”?
O CRUD (Create, Read, Update, Delete) é abreviação das palavras de operações básicas do banco de dados, normalmente essas operações não envolvem processos matemáticos, mas facilita a aplicação final.
C: Create - criar um novo registro.
R: Read - ler as informações de um registro.
U: Update - atualizar os dados do registro.
D: Delete - apagar um registro. 

Também é possível criar uma exclusão reversível, onde a informação não é deletada, mas sim, criado de segurança uma cópia ou mudado seu status.


## DESAFIO 5
#### Defina  com  suas  palavras  qual  é  a  responsabilidade  das  camadas  vistas  até  agora, entity, controller, repository e service.
O MVC (model, view e controller), é um padrão desenvolvimento de software.

A camada *Controller* é responsável pela gestão do sistema inteiro, é nele que passa todas informações e tomada de decisões, ou seja, o controller é a principal camada para o funcionamento do sistema.

O controller também tem como um auxílio o *Service* para ajuda nas demandas do sistema, é ele que repassa ou executar uma ordem o controller relacionado a regra do negócio.

A *model (Entety)* se concentrar todas as entidades ou tabelas do negócio, é parte mais lógica próxima do banco de dados, sendo assim, possível a persistência dos dados.

O *Repository* é a última camada ao banco de dados, é sendo responsável pelo CRUD ( create, read, update e delete), ou seja, somente ele pode executar as operações do banco de dados.


## DESAFIO 6
#### O que significa DTO, e qual sua importância? 
O DTO (Data Transfer Object), o principal objetivo do padrão é reduzir viagens de ida e volta ao servidor, ele é usado para transferir dados entre subsistemas de uma aplicação em forma de objeto.

O dto contém vários benefícios entre eles:
Reduz a sobrecarga na rede, já o encapsulamento traduz a estrutura do objeto e os dados para um formato específico e muito mais.
O dto é a principal porta de entrada e saída de dados, sendo possível controlar rigorosamente todo o fluxo na aplicação. Ou seja, uma simples classe, mas muito importante na questão performance e segurança.


## DESAFIO 8
#### a) O que são exceptions?
As Exceptions (exceções) em sistemas, serve para prevenir algo incomum na lógica da aplicação, ou seja, em um sistema de login pode acontecer diversas falhas acarentando em exceções graves no sistema.
Essas exceções podem e devem ser tratadas com métodos prontos ou personalizados, e direcionados de forma correta para o usuário. 

#### b) Qual é o funcionamento do try, catch e finally?
O try, serve para testar o código, ou seja, o sistema deve funcionar somente desta forma sem erros.
Já o catch, funciona para pegar o possível erro esperado, e direcionar o tratamento correto para aquela exceção especifica ou geral.
No caso do Finally, serve para continuar o sistema independentemente da falha.

#### c) Qual a relação entre “try, catch e finally” e “throws”? 
O try, catch e o finally, serve para testar, tratar e continuar o sistema, normalmente sendo obrigado pela palavra throws no método, ou seja, sem ele ocorre erro de compilação na aplicação.
A palavra throws na escrita do método, obriga o tratamento daquelas exceções no código.

#### d) Para que serve a annotation @ExceptionHandler?
A anotação ExceptionHandler nos permite manipular uma exceção para um controller, ou seja, criar exceção personalizada para o sistema.

#### e) Para que serve o comando throw?
O throw serve para lança um exceção.

#### f) Para que serve a annotation @ControllerAdvice?
A anotação ControllerAdvice é um interceptador de exceção para qualquer parte do sistema, ou seja, um nível superior ao ExceptionHandler e com todos os métodos gerais.


## DESAFIO 9
#### a) O que é um padrão de projeto e por que nós os utilizamos?
O padrão de projeto é uma série de sugestões para o desenvolvimento de software. Essas sugestões foram criadas para facilitar, padronizar, reaproveitar e compartilhar o código, sendo assim, reconhecida por toda a comunidade.
Os padrões de projetos contém 3 categorias, criação, estrutural e comportamental.
Essas categorias contém 23 sugestões para facilitar o código, todas utilizam os conceitos SOLID junto com POO.
Criação: abstract factory, builder, factory method, prototype, singleton.
Estrutural: adapter, bridge, composite, decorator, facade, flyweight, proxy.
Comportamental: chain of responsibility, command, interpreter, iterator, mediator, memento, observer, state, strategy, template method, visitor.

#### b) Cite e explique com suas palavras:
#### I. Um dos padrões de criação;
Abstract factory - Criação: Permite a criação de grupos de objetos relacionados ou dependentes por meio de interface e sem que a classe principal seja especificada, sendo assim, possível alterar sem danos a aplicação.
#### II. Um dos padrões estruturais;
Adapter - Estrutural: 
Atua como um conversor entre objetos irreconhecíveis. Ele captura chamadas para um objeto e as deixam reconhecíveis tanto em formato como interface para este segundo objeto.
#### III. Um dos padrões comportamentais;
Observer - Comportamental: É um objeto um-para-muitos de modo que quando um objeto muda o estado, todos seus dependentes são notificados e atualizados automaticamente.

#### c) Explique o conceito de arquitetura de software e seu proposito;
Os conceitos de arquitetura de software teve origem com base na área da construção civil, esses modelos surgiram para melhorar as funções e relacionamentos em subsistemas com esses projetos, visando diversos aspectos no software. O profissional que projeta o software deve ser capaz de identicar diversos pontos, entre eles: linguagem de programação, modelo arquitetura (MVC, Microsserviços, P2P e outros), servidores, banco de dados, plataformas operacionais.

#### I. Qual arquitetura estamos seguindo até o momento? Justifique sua resposta.
Arquitetura em MVC - O projeto contém diversas camadas na aplicação. O controllers (dtos, services, exceptions), model (entities, repositories). Cada um com sua responsabilidade na aplicação. 

#### g) O que significa a sigla SOLID?
 
S-Single Responsiblity Principle (Princípio da responsabilidade única), uma classe deve ter uma única tarefa para executar.

O-Open-Closed Principle (Princípio Aberto-Fechado), uma classe deve estar abertos para extensão, mas fechados para modificação.

L-Liskov Substitution Principle (Princípio da substituição de Liskov), uma classe derivada deve ser substituível por sua classe base.

I-Interface Segregation Principle (Princípio da Segregação da Interface), uma classe não deve forçar implementar interface que não vai utilizar.

D-Dependency Inversion Principle (Princípio da inversão da dependência), uma classe de alto ou baixo nível devem depender da abstração.


#### h) Quais princípios foram utilizados no projeto até o momento? Explique.
Os princípios utilizados foram:
Princípio da responsabilidade única - SwaggerConfig, Controllers, Services (Mapper), Exceptions.

Princípio Aberto-Fechado - Repositories.

Princípio da substituição de Liskov - Exceptions.

Princípio da Segregação da Interface - Repositories.

Princípio da inversão da dependência - Services.

