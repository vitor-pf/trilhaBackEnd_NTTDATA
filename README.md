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


## DESAFIO 10
#### a) O que você entende por Spring Framework?
O projeto Spring é um framework com diversos módulos (Spring Boot, MVC, Data, Security) para facilitar a criação de uma aplicação, e foi construído com os conceitos de Inversão de Controle e Injeção de Dependências são peças principais do framework.
O Spring contém diversos módulos para criar várias aplicações web, desktop e entre outras. 

#### b) Cite 3 exemplos de ferramentas Spring e suas respectivas finalidades;
Spring Boot - É o módulo start do sistema, ou seja, um pacote todo configurado para aplicação.
Spring Data - É um módulo para manipular aos dados.
Spring Security - É um módulo para cuidar da seguração da aplicação, ou seja, gerencia os acessos do sistema.

#### c) Quais ferramentas do Spring foram utilizadas na trilha até o momento?
Spring Boot, Spring MVC, Spring DATA.

#### d) Cite 5 vantagens em utilizar Spring;
1 - Projeto inicial completo pronto para rodar aplicação.
2 - Diversos módulos separados para construir qualquer aplicação.
3 - Facilidade na manutenção e com uma grande comunidade para diversas soluções de problemas.
4 - Desenvolvimento rápido e fácil com uso das anotações e padrões.
5 - Framework fortemente reconhecido no mercado em todos os níveis.

#### e) Descreva os passos de criação de uma Web API Spring boot, com conexão com SQL Server;
1 - Inicie o projeto em https://start.spring.io/.
2 - Adicione as dependências Spring Data JPA e MS SQL Server Driver.
3 - Configure o arquivo application.properties com os dados do banco.
4 - Construa a aplicação.

#### f) Qual a funcionalidade do pom.xml?
O pom.xml (Project Object Model), é um arquivo gerenciado pelo Maven que contém todas as informações do projeto, ou seja, configurações, dependências e dados gerais da aplicação.

#### g) Qual a funcionalidade do applications.properties?
O applications.properties é o arquivo configuração da aplicação, diferente da anotação @Configuration.
Esse arquivo contém configurações de ambientes, ou seja, produção, desenvolvimento, teste e entre outros.

#### h) Qual o propósito das Annotations?
O Spring adotou alguns padrões para sinalizar o desenvolvedor, e para utilizar esses padrões prontos do framework é preciso adicionar algumas annotations já existentes.

#### i) Cite 10 annotations, com suas respectivas finalidades e descreva ou desenhe um cenário exemplificando a sua utilização;
1 - @SpringBootApplication - Anotação utilizada em cima da classe principal.
    Utilizada em classe principal do projeto.

2 - @Configuration - Anotação utilizada em cima das classes configurações.
    Utilizada em classes separadas para configuração especificas. exem.: SwaggerConfig.

3 - @RestController - Anotação utilizada em cima das classes para criar os controladores.
    Utilizada em classes separadas para criar um controlador na API REST.

4 - @RequestMapping - Anotação utilizada em cima das classes para mapeia o endereço na API REST.
    Utilizada em classes separadas dentro do @RessController para mapeia requisições REST.

5 - @Service - Anotação utilizada em cima das classes para criar um serviço ou lógica para o controlador.
    Utilizada em classes separadas para determinados serviços.

6 - @Entity - Anotação utilizada em cima das classes para criar uma entidade no banco com os atributos.
    Utilizada em classes separadas para representar uma entidade no banco de dados.

7 - @Repository - Anotação utilizada em cima das classes para relacionas as entidades ao JPA e suas funções.
    Utilizada em classes separadas normalmente relacionadas as entidades para realizar operações no banco.

8 - @Query - Anotação utilizada em cima das funções do @Repository para criar consultas personalizadas ao banco (JPQL).
    Utilizada em classes do @Repository para personalizar uma consulta no banco.

9 - @Autowired - Anotação utilizada em cima dos atributos ou construtores para criar uma injeção de dependência.
    Utilizada em classes para injetar aquela dependência no projeto.

10- @ExcepetionHandler - Anotação utilizada em cima das funções do @ControllerAdvice para manipular aquela exceção especifica.
    Utilizada em classes do @ControllerAdvice para manipular de exceção.

#### j) O que é um advice em Spring? Quais os tipos de advice para o Spring?
O advice em Spring é uma programação orientado a aspectos, ou seja, uma parte do sistema que deseja se comportamentar de outra forma, esse aspecto pode ser executado antes, depois ou durante a aplicação.
Before advice - Essa anotação executa uma função antes da chamada.
After advice - Essa anotação executa uma função depois da chamada, podendo ter Throwing como falha ou Returning para o sucesso na execução.
Around advice - Essa anotação executa uma função junto com chamada invocada, podendo acompanhar a execução do começo ao fim.

#### k) O que é Spring IoC Container?

O Spring IoC Container é o responsável pelos objetos, é o centro do framework e contém 2 tipos de container. E ele que cuida de todo o ciclo do elemento desda criação até destruição.

#### l) Como adicionamos segurança à nossa aplicação Spring?
O Spring Security é a lib responsável pela segurança, através desse pacote podemos obter acesso e armazenar na aplicação.

#### m) Qual é o pacote Spring responsável pelas conexões com os bancos de dados?
O Spring Data contém diversos drivers para conexão com o banco de dados, e o arquivo que configura as informações do bando é o application.properties.

#### n) Explique e exemplifique como criar um agendamento de execução de métodos Spring; Cite exemplos de usabilidade;
O Spring possui uma anotação para o agendamento de método, chamado de @Scheduled que fica em cima do método junto com alguns paramentos de configuração.
Sim, a forma simples e rápido, exemplo:
Digamos que gostaríamos de ter uma informação de venda toda semana.
Basta colocamos a anotação com suas configurações e será agendado aquele método que traz essas informações.


## DESAFIO 11
#### a) O que são libs quando se trata de código? 
As libs são um conjunto de funcionalidades de projetos, ou seja, são partes de sistemas que podem e/ou devem ser utilizados em uma aplicação.

#### b) Cite 2 libs populares no Java e seu objetivo;
1 - lomblok é uma lib para gerar em tempo de compilação os métodos getters, setters e construtores.
2 - Log4j é uma lib para fornecer logs para sua aplicação.

#### c) Qual é o propósito do Maven, e qual é o seu relacionamento com o arquivo pom.xml?
O Maven é o gerenciador de todo projeto, ou seja, o arquivo pom.xml contém todas as informações da aplicação.
Esses dados são: nome, pacotes, dependências, configurações da aplicação e muito mais.
O arquivo pom.xml gerenciado pelo Maven, podemos dizer que é o arquivo principal para compartilhar e subir a aplicação.

#### d) Qual é a diferença do Maven para o Grandle? 
A diferença entre Maven e Gradle, ambos são gerenciadores projetos e com linguagem diferentes.

#### e) Com os conhecimentos adquiridos até o agora, realize uma conexão com o desafio 3 onde falamos sobre JDBC, os drivers de comunicação com os bancos de dados. 
#### I. Qual a relação entre os termos lib, driver e JDBC?
O Framework Spring contém diversas libs como o Spring Data, e o mesmo contém o JDBC que por sua vez também tem os drivers. Essas libs se complementam formando um grande sistema.
O JDBC hoje é nativo do Java.

#### II. Como é adicionado uma lib no projeto?
A lib precisa está no projeto (Maven - pom.xml), e ser adicionada ao código.

#### III.  Escolha  um  banco  de  dados  (menos  o  H2)  e  explique  como  utilizar  o  driver  de  comunicação.
Basta adicionar a dependência do driver pom.xml e configurar o arquivo application.properties.


## DESAFIO 12
#### a) Explique o conceito de teste unitário?
O teste unitário é uma forma de acompanhar cada parte do funcionamento da aplicação, essa forma de desenvolver o software é mais conhecida como TDD.
Com o teste unitário tem sua vantagem e desvantagem:
Vantagem:
Segurança no código no que se espera.
Trabalho em equipe torna ser mais objetivo. 
Ajuda na gestão de grande projeto.
Evita bugs.
Desvantagem:
Gasta mais hora no código. 
Sem dúvida o teste unitário ajuda e muito no desenvolvimento de software.

#### b) Descreva como fazer um código de teste.
Para criar um teste precisa baixar a lib de preferência. 
Basta ir à pasta teste do projeto.
Adicionar uma classe de acordo com o ProjetoTeste e a anotação @RunWith(SpringRunner.class).
Adicionar a função com nome amigável ao que será testado e sua anotação @Teste.
E adicionar a dependência para a função caso seja especial com a anotação @InjectMocks para injetar e @Mock para simular algo esperado.
Logo depois preparar os acertos com o Assert, rodar os testes e refatorar.

#### c) Qual o intuito do teste unitário?
O teste unitário traz segurança para toda aplicação, ou seja, evita uma série de problemas como bugs, baixa performance, falha na regra de negócio e muito mais.

#### d)  Quais  são  as  ferramentas  que  utilizamos  para  realizar  testes  unitários(2  pelo  menos).
JUnit e Mockito

#### Desenvolva  o  teste  unitário  para  o  método  acima,  digitando  abaixo  todos  stack  traces de erros e explique em uma só frase qual o erro
1 - trilha.back.financys.exceptions.NullPointerException: objeto nulo.
2 - trilha.back.financys.exceptions.NotFoundException: objeto não encontrado.
3 - org.opentest4j.AssertionFailedError, erro no teste esperado.
4 - testes.TrilhaBackTestes.getLancamentosDependentesTeste: o caminho o erro na aplicação.


## DESAFIO 13
#### b)  Tire  evidências  das  telas  e  testes  mostrando  a  integração  dos  dois  códigos  e  adicione no README.md
Tive que configurar o backEnd a acessar o frontEnd com algumas anotações e funções.
Notei que é fundamental a comunicação do back com o front.
~~~Java
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
~~~
FrontEnd-Lançamento
![image](https://user-images.githubusercontent.com/69551421/152529472-1ca82378-f0d7-4b1d-bf94-cb4aa4aa833e.png)

FrontEnd-Categoria
![image](https://user-images.githubusercontent.com/69551421/152534969-037aa4e8-ddbe-42ca-a9a9-f841cca25cf2.png)

BackEnd
![image](https://user-images.githubusercontent.com/69551421/152535175-88101e8a-5eb2-475b-88f1-64bdc9948fe6.png)


## DESAFIO 14
#### a) Desafio 1 - Git:
#### I. Dê 2 exemplos de situações onde é necessário utilizar merge:
1 - É preciso mesclar os arquivos local com o remote.
2 - É possível abortar o merge com --abort.

#### II. Com qual objetivo realizamos o commit?III. Qual a diferença entre:     git add -all     git add  -u      git add -A     git add .
git add -all, não reconhecido pelo git
git add  -u, serve para atualizar logo após o git add(costumava usar no antigo git).
git add -A, adiciona todos os arquivos em toda a árvore de trabalho serão atualizados.
git add ., funciona igual o -A.

#### I V.  Qual  é  a  ordem  dos  comandos  para  subir  novas  atualizações,  verificando  se existem alterações a serem recebidas?
git status (verifica se tem novas atualizações)
git add .
git commit -m ""
git push -u origin main

#### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 1? Se não, justifique;
Sim, mas é tudo novo.

#### b) Desafio 2 - POO e Entity:
#### I. Qual é a finalidade da camada Entity?
A camada entity mapea todo o banco de dados.

#### II. Para você, por que acha que seguimos a programação orientada a objetos?
Como tudo na vida é um objeto, ou seja, um molde para montar outras coisas.

#### III. Qual é o ideal por trás de utilizar os métodos getters e setters?
O setter e getter tem a ideia de proteger algo, ou seja, voçê tem o poder de disponibilizar o vai acessar o atributo.

#### I V. Qual o propósito de um construtor em uma classe? Podemos criar uma classe sem construtor?
Sim, podemos criar sem o construtor. O construtor inícia todo um ciclo, ou seja, uma instância do objeto a partir daquela classe e assim usa-lo.

#### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 2? Se não, justifique;
Sim.

#### c) Desafio 3 - HTTP, REST e Controller:
#### I. Qual é o objetivo da camada Controller?
O nome já diz, é um controlador para o sistema, ou seja, a camada que conversa com o cliente.

#### II. No que os padrões REST nos auxiliam?
O padrão REST padronizar nossas API's, ou seja, nos permite boas práticas para o nosso projeto e assim tornando acessível para todos clientes.

#### III. Quais métodos HTTP utilizamos para montar um CRUD?
GET, POST, PUT, DELETE

#### I V.    Qual    a    diferença    entre    as    annotations    @PathVariable, @RequestParam, @RequestBody?  E  com  quais  métodos  HTTP  elas  podem  ser  utilizadas respectivamente?
@PathVariable, captura um caminha(.../users/{name}) na URL.
@RequestParam, captura um parâmetro(.../usrs?id=1) na URL.
@RequestBody, captura o corpo (body) na URL

#### V. Para que serve ResponseEntity?
O ResponseEntity serve para mostrar um feedback para aquela requisição, sendo é possível manipular o resultado.

#### VI. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 3? Se não, justifique;
Sim.

#### d) Desafio 4 - JPA e Repository:
#### I. Qual é o propósito da camada Repository?
A camada Repository é importante para toda persistencia no banco de dados.

#### II. De maneira prática como funciona a injeção do Repository? E qual a sua relação com @Autowired?
Através da anotação @Repository o Spring passa a gerenciar o ciclo, mas o @Autowired injeta a instância daquele objeto na classe.
Ou seja, como se fosse criado uma instância no construtor da classe.

#### III. Quais são as facilidades em utilizar JPA?
O JPA conta com uma serie de benefícios, isto é, métodos prontos e personalizaveis.

#### I V. Quais são os passos para configurar um banco de dados em um projeto Spring?
Baixa a lib . do Sprind Data SPA e Driver.
Configurar o arquivo application.propertities
Criar o repository.

#### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 4? Se não, justifique;
Sim.

#### e) Desafio 5 - Service:
#### I. Qual é a finalidade da camada Service?
A camada Sevice recebe todas as regras lógicos, em termos praticos, é ele que fazer pequeno ou grande operações e até mesmo comunição APIs e repositórios.

#### II. Qual o sentido de um método ter apenas um propósito?
Responsábilidade única um dos princípios do SOLID, é possível criar um pequeno métodos apenas para uma finalidade.

#### III. Qual a diferença entre um método void e métodos tipados?
Método void não tem retorno.
Método tipado é obrigado retornar o escrita do código... Classe, String, boolean

#### I V. É normal um serviço chamar outro?
Sim, é possível um serviço chamar outro para ter reaproveitamento de código.

#### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 5? Se não, justifique;
Sim, muito claro.

#### f) Desafio 6 - DTO:
#### I. Quais problemas conseguimos resolver utilizando a camada DTO?
O DTO possibilitou uma maior segurança no sistema, sendo possível controlar a requisição e resposta.

#### II.  Qual  a  diferença  de  realizarmos  o  “de  para”  utilizando  constructor  ou  getters  e  setters?
O construtor acaba usandou uma única vez, já o getters e setters acaba sendo verboso pela quantidade de código.

#### III. No que a utilização do Mapper nos auxilia? Achou fácil a implementação?
O mapper ajudou a converte as entidades com seu método.

#### I V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 6? Se não, justifique;
Sim, os DTOs ficaram bem claro.

#### g) Desafio 7 - Manipulação de dados:
#### I. Qual é a forma de validar os dados de uma requisição sem utilizar @Valid?
Usando o IF/ELSE e as funções prontas do java

#### II. Para que serve um ENUM? Cite exemplos;
O ENUM serve para controlar as constantes do sistema, ou seja, obrigamos aqueles enums no código.
Const. StatusPedido: PENDENTE, PAGO, CANCELADO.
Enum.  StatusPedido: PENDENTE(1), PAGO(2), CANCELADO(3).

#### III. Como criamos um custom validator? E qual o objetivo de criar um?
Basta baixar a lib.
Adicionar as anotações nos atributos e métodos de acordo com a validação, e assim teremos um retorno de algo inesperado.

#### I V. Qual foi a diferença entre utilizar for e streams no desafio 6?
A diferença muito grande em questão de código e leitura.

#### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 7? Se não, justifique;
Não, fiquei confuso na questão do @Valid e Streams.

#### h) Desafio 8 - Tratamento de exceptions:
#### I. Qual a finalidade de trata-las?
É importante tratar todos os erros do sistema para não trazer vulnerabilidade, e mostrar para o cliente uma resposta amigavél.

#### II. Como as descobrimos?
Através da Stack Trace.

#### III. Como fazemos para estourar um exception em uma determinada linha?
throw

#### I V. Qual é a melhor forma de implementarmos nosso controle de exceções?
ExceptionHandler

#### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 8? Se não, justifique;
Sim.

#### i) Desafio 9 - Patterns, SOLID e Arquitetura:
#### I. O que é Singleton Pattern?
É um padrão de projeto, e significa que apenas uma única classe será instânciada para toda a aplicação.

#### II. O que significa a letra D de SOLID e como se aplica na camada de Repository?
O D é Princípio da Inversão de Dependências, e se aplica em todo Spring Data.
De modo, rápida e fácil, é possível mudar de banco de bando por não ter dependência aclopada.

#### III. Qual o objetivo das camadas?
Distribuir as responsabilidades.

#### I V. Qual arquitetura é melhor DDD, Hexagonal ou Clean?
Não existe a melhor arquitetura e sim para aquela aplicação.

#### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 9? Se não, justifique;
Não, a questão do SOLID e Arquitetura.

#### j) Desafio 10 - Spring:
#### I. Qual a diferença entre Java e Spring?
Java é uma liguaguem de programação OO.
Spring é o framework do Java com diversas funcionalidades para o desenvolvimento.

#### II. É possível utilizar Spring Data sozinho?
Não, precisa do Spring.

#### III. É possível utilizar Spring Boot, Spring Data e Spring Security em apenas um projeto? Se sim, como é feito a integração?
Basta baixar as libs. Spring Boot, Spring Data e Spring Security.
Criar e configurar o arquivo application.propertities
Criar e confifurar a classe SecurityConfig e adicionar suas anotações.
E criar apalicação.

#### I V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 10? Se não, justifique;
Não, os desafios não apresentou Spring Security, mas cheguei a estudar.

#### k) Desafio 11 - Libs:
#### I. Cite 5 libs que utilizou durante a trilha e suas respectivas funcionalidades;
1 - Jackson
2 - Lombok
3 - Mapper
4 - JUnit
5 - Mockito

#### II. Qual a diferença entre uma lib e um driver?
O Spring Data é uma lib que contém diversos drivers do java puros.

#### III. Existe limite de libs por projeto?
Não, mas é melhor mínimo possível para performace.

### I V. Por que utilizar um gerenciador de dependências?
Para gerenciar todas as libs do sistema, sendo que a dependencia pode ter a mesma.

#### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 11? Se não, justifique;
Sim.

#### l) Desafio 12 - Testes unitários:
#### I. Por que DEVOPS exige uma porcentagem de cobertura mínima nos projetos?
Para que essa cobertura seja acompanhavel.

#### II. Qual o objetivo de utilizar Mockito? Dê um exemplo;
O seu principal objetivo é instanciar classes e controlar o comportamento dos métodos.
Temos a classe Pedido com método finalizar compra e seu retorno é gerar um código
Pedido.finalizar() -> esperado -> Pedido.finalizar("123456789")

#### III. O que é o Sonar? E qual é o seu papel?
O sonar é um projeto open source, ele avalia a qualidade do seu código e realiza diversas análises durante o processo de compilação.

#### I V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 12? Se não, justifique;
Sim.

#### m) Desafio 13 - Integração:
#### I. Como foi o processo de integração?
Trabalhoso por não ter o conhecimento, mas procurei as informações para poder integrar.

#### II. Quais foram as principais dificuldades?
Achar os bugs e as informações.

#### III. Obteve algum erro de CORS?I V. O que é CORS?
Sim, o Front-End estava sem acesso ao Back-End.
O CORS é um mecanismo que usa cabeçalho adicional HTTP para informar ao navegador que fará acesso no local de origem para outros servidores aonde possui acesso, ou seja, o sistema vai se comunicar com outras APIs.

#### V. Você conseguiu adquirir os conhecimentos transmitidos durante o desafio 13? Se não, justifique;
Sim.

