-Grupo: G10

-Constitu�do por:
Andr� Humberto Trigo de Bordalo Morais
Bruno Coelho da Silva
Jo�o Alberto Trigo de Bordalo Morais
Pedro Dias Faria

-Tema: XML2SDL

Pasta 'src' cont�m o c�digo fonte do projeto
Pasta 'bin' cont�m o projeto compilado
Pasta 'parserlexersemantic' cont�m os ficheiros teste

-Para iniciar o programa:
 Garantir a vers�o antlr 4.5
2 Formas poss�veis para executar:
1�: Compilar pelo IDE (exemplo Eclipse) pelo ficheiro bgl2sdl.java (onde se encontra a fun��o main)
2�: Localizar a pasta bin do projeto na linha de comandos;
    dentro da pasta escrever na linha de comandos: java bgl2sdl.bgl2sdl

Em seguida, na consola aparecer� um texto a perguntar por duas op��es (�(1) Console�, �(2) File�). Devem ser ignoradas. O projeto est� preparado para receber j� o conte�do a ser analizado.
Para isso copia-se o conte�do a analizar para a consola e pressionar os bot�es ctrl+z para o conte�do ser analizado.

Os ficheiros fridayharbor.xml e whidbey.xml
O ficheiro errors.xml � o que tem alguns erros despropositados os quais o nosso projeto deteta e sinaliza, indicado o tip ode erro e a linha (na maioria dos casos)


-Verifica��es feitas:
Ao valor de cada atributo: quer seja int, float, string, bool e ainda valores espec�ficos
Aos atributos e elementos que t�m ordem espec�fica, obrigatoriedade e opcional.

Cria��o das tabelas de s�mbolos
