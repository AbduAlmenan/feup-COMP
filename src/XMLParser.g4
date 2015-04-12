parser grammar XMLParser;

options {      tokenVocab=XMLLexer; }


//cenas: O_AIRPORT C_AIRPORT;
document: xmlItems+ ;
xmlItems: airportElement | COMMENT;

attributeName: STRING;
//tagName: STRING;
attribute: attributeName EQUALS QUOTES attributeValue QUOTES;
attributeValue: OP? INT | OP? FLOAT | DISTANCE | STRING+;





airportElement: TAG_START_OPEN  AIRPORT attribute+ TAG_CLOSE (airportElements)* TAG_END_OPEN AIRPORT TAG_CLOSE;
airportElements: (servicesElement | towerElement | runwayElement | startElement |
                 runwayAliasElement | waypointElement | helipadElement | jetwayElement
                 taxiwayPointElement | taxiwayParkingElement | taxiNameElement | taxiwayPathElement);

servicesElement :TAG_START_OPEN SERVICES TAG_CLOSE (servicesElements)* TAG_END_OPEN SERVICES TAG_CLOSE;
servicesElements: fuelElement;
fuelElement: TAG_START_OPEN FUEL attribute+ TAG_EMPTY_CLOSE;

towerElement: TAG_START_OPEN TOWER  attribute+ TAG_CLOSE TAG_END_OPEN TOWER TAG_CLOSE;

runwayElement: TAG_START_OPEN RUNWAY  attribute+ TAG_CLOSE runwayElements* TAG_END_OPEN RUNWAY TAG_CLOSE;
runwayElements: markingsElement | lightsElement | offsetThresholdElement | approachLightsElement | vasiElement | ilsElement;

markingsElement: TAG_START_OPEN MARKINGS attribute+ TAG_EMPTY_CLOSE;
lightsElement: TAG_START_OPEN LIGHTS attribute+ TAG_EMPTY_CLOSE;
offsetThresholdElement: TAG_START_OPEN OFFSETTHRESHOLD attribute+ TAG_EMPTY_CLOSE;
approachLightsElement: TAG_START_OPEN APPROACHLIGHTS attribute+ TAG_EMPTY_CLOSE;
vasiElement: TAG_START_OPEN VASI attribute+ TAG_EMPTY_CLOSE ;
ilsElement: TAG_START_OPEN ILS attribute+ TAG_CLOSE ilsElements*  TAG_END_OPEN ILS TAG_CLOSE;
ilsElements: glideSlopeElement | dmeElement;

glideSlopeElement: TAG_START_OPEN GLIDESLOPE attribute+ TAG_EMPTY_CLOSE;
dmeElement: TAG_START_OPEN DME attribute+ TAG_EMPTY_CLOSE;

startElement: TAG_START_OPEN START attribute+ TAG_EMPTY_CLOSE;

runwayAliasElement: TAG_START_OPEN RUNWAYALIAS attribute+ TAG_EMPTY_CLOSE;

waypointElement: TAG_START_OPEN WAYPOINT attribute+ TAG_CLOSE routeElement+  TAG_END_OPEN WAYPOINT TAG_CLOSE;
routeElement: TAG_START_OPEN ROUTE attribute+ TAG_CLOSE routeElements*  TAG_END_OPEN ROUTE TAG_CLOSE;
routeElements: nextElement | previousElement;
nextElement: TAG_START_OPEN NEXT attribute+ TAG_EMPTY_CLOSE;
previousElement:TAG_START_OPEN PREVIOUS attribute+ TAG_EMPTY_CLOSE;

helipadElement: TAG_START_OPEN HELIPAD attribute+ TAG_EMPTY_CLOSE;

jetwayElement: TAG_START_OPEN JETWAY attribute+ TAG_CLOSE sceneryObjectElement  TAG_END_OPEN JETWAY TAG_CLOSE;
sceneryObjectElement: TAG_START_OPEN SCENERYOBJECT attribute+ TAG_CLOSE sceneryObjectElements*  TAG_END_OPEN SCENERYOBJECT TAG_CLOSE;
sceneryObjectElements: libraryObject;
libraryObject: TAG_START_OPEN LIBRARYOBJECT attribute+ TAG_EMPTY_CLOSE;

taxiwayPointElement: TAG_START_OPEN TAXIWAYPOINT attribute+ TAG_EMPTY_CLOSE;

taxiwayParkingElement: TAG_START_OPEN TAXIWAYPARKING attribute+ TAG_EMPTY_CLOSE;

taxiNameElement: TAG_START_OPEN TAXINAME attribute+ TAG_EMPTY_CLOSE;

taxiwayPathElement: TAG_START_OPEN TAXIWAYPATH attribute+ TAG_EMPTY_CLOSE;

taxiwaySignElement: TAG_START_OPEN TAXIWAYSIGN attribute+ TAG_EMPTY_CLOSE;

















//Parser init
startpoint: document EOF;