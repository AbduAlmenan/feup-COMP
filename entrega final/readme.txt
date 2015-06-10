 - Identifica��o dos Autores:
.Grupo: G10
.Tema: XML2SDL
.Constitu�do por:
Andr� Humberto Trigo de Bordalo Morais
Bruno Coelho da Silva
Jo�o Alberto Trigo de Bordalo Morais
Pedro Dias Faria

 - Instru��es de Compila��o:
2 Formas poss�veis para executar:
1�: Compilar pelo IDE (exemplo Eclipse) pelo ficheiro bgl2sdl.java (onde se encontra a fun��o main)
2�: Localizar a pasta bin do projeto na linha de comandos;
    dentro da pasta escrever na linha de comandos: java bgl2sdl.bgl2sdl

 - Descri��o dos Exemplos:
.Ficheiro correto: deltaheritage.xml
.Ficheiro com erros: errors.xml tem alguns erros despropositados os quais o nosso projeto deteta e sinaliza, indicado o tip ode erro e a linha (na maioria dos casos)

 - Descri��o de Utiliza��o:
localizar pasta bin eescrever a seguintelinha: java bgl2sdl.bgl2sdl
Em seguida, na consola aparecer� um texto a perguntar por duas op��es (�(1) Console�, �(2) File�). O projeto est� preparado quer para receber j� o conte�do a ser analizado ou o nome do ficheiro a ser analizado ( se s� for indicado o nome do ficheiro, este deve estar na raiz do projeto).
Para isso copia-se o conte�do a analizar para a consola e pressionar os bot�es ctrl+z para o conte�do ser analizado, para a op��o 1, para a op��o 2 basta escrever o nome do ficheiro.

 - An�lise Lexical:
Ficheiro do lexer: XMLLexer.g4
No caso do ficheiro de entrada estiver com erros a n�veis lexicais, ser�o indicadas as linhas do ficheiro onde nenhum token foi unificado.

 - An�lise Sint�tica:
Ficheiro do parser: XMLParser.g4
No caso do ficheiro de entrada estiver com erros a n�veis sint�tios, ser�o indicadas as linhas do ficheiro onde n�o respeitam as regras da gram�tica.

 - An�lise Sem�ntica:
Ficheiro do listener:Listener.java
No caso do ficheiro de entrada estiver com erros a n�veis semanticos,ser�o indicadas as linhas do ficheiro e ainda a regra que violam quando n�o respeitam as regras sem�nticas.

 - Representa��o(�es) Interm�dia(s):
Ficheiro do listener:Listener.java
Ao decorrer das verifica��es sem�nticas bem suceddias, iam sendo criados mapas com o objetivo de ir criando a tabela de simbolos.

 - Gera��o de C�digo:
Ficheiro gerar .sdl: GenerateSDL.java
No caso de n�o haver erros a n�veis lexicais, sint�ticos nem sem�nticos, � gerado o ficheiro com extens�o .sdl. Este ficheiro tem em conta as especifica��es que um ficheiro .sdl deve ter.
Recorremos � biblioteca JDOM paragerar o ficheiro .sdl tendo uma identa��o semelhante aos ficheiros com extens�o .xml.
Um dos principais problemas com a gera��o de c�digo foi haver atributos e elementos n�o especificados no .xml e serem necess�rios no .sdl.

 - Testes:
N�o foram realizadas nenhuma infraestrutura nem bateria de testes. A nossoa forma de debugging foi atrav�z de compara��o de ficheiros.

 - Arquitetura:
S�o gerandos os tokens que ser�o utilizados na identifica��o da gram�tica. Posteriormente, ser� feita a valida��o da �rvore gerada pela an�lise sint�tica para, na fase seguinte, j� com a representa��o interm�dia conclu�da, gerar o ficheiro de sa�da.
XMLLexer.g4 comunica com XMLParser.g4, enviando os tokens.
XMLParser.g4 comunica com Listener.java, enviando a �rvore de an�lise.
Listener.java comunica com GenerateSDL.java enviando a tablea de s�mbolos.
O ficheiro Edge � �til pois � utilizado num algoritmos por n�s criado para verificar se nos taxiways points e taxiways paths h� conectividade, isto � � poss�vel aceder a todos os pontos.

 - Pontos Positivos: 
Elabora��o de algor�tmo para verificar conectividade;
Ficheiro de sa�da bem identado e correto

 - Pontos Negativos:
Alguns aspetos n�o foram gerados no ficheiro de output. Est� preparado para imprimir, s� que est� com pequenos erros.





