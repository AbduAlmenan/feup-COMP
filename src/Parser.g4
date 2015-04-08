grammar Parser;

options{
language=Java;
}

//basic types
WS: [\\t \n \\r]+ -> skip; //whitespaces
INT: [0-9]+;
FLOAT: [0-9]* '.' [0-9]+;
EQUALS: '=';
STRING: [a-zA-Z]+;
QUOTES: '"';
OP: ('+' | '-');


//tag symbols
TAG_OPEN: '<';
TAG_OPEN_SLASH: '</';
TAG_CLOSE: '>';
TAG_CLOSE_SLASH: '/>';


//xml elements
tagName: STRING;
attribute: STRING EQUALS QUOTES attributeValue QUOTES;
attributeValue: OP? INT | OP? FLOAT | STRING;
comment: '<!--' .*? '-->';

//Grammar
document: xmlItems* ;
xmlItems: xmlElement | comment;

xmlElement:
    elementStart attribute* TAG_CLOSE xmlItems* elementEnd TAG_CLOSE
   | elementStart attribute* TAG_CLOSE_SLASH;

elementEnd: TAG_OPEN_SLASH tagName;


elementStart: TAG_OPEN tagName;


//Parser init
start: document EOF;

