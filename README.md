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


