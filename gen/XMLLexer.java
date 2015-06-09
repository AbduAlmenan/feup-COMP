// Generated from C:/Users/Lycantropus/Desktop/COMP/proj/src\XMLLexer.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, TAG_START_OPEN=3, TAG_END_OPEN=4, TAG_CLOSE=5, TAG_EMPTY_CLOSE=6, 
		AIRPORT=7, TAXIWAYPOINT=8, TAXIWAYPARKING=9, TAXINAME=10, TAXIWAYPATH=11, 
		TOWER=12, SERVICES=13, COM=14, RUNWAY=15, RUNWAYALIAS=16, APPROACH=17, 
		APPROACHLEGS=18, LEG=19, MISSEDAPPROACHLEGS=20, TRANSITION=21, TRANSITIONLEGS=22, 
		WAYPOINT=23, HELIPAD=24, START=25, JETWAY=26, FUEL=27, MARKINGS=28, LIGHTS=29, 
		OFFSETTHRESHOLD=30, APPROACHLIGHTS=31, VASI=32, ILS=33, GLIDESLOPE=34, 
		DME=35, ROUTE=36, NEXT=37, PREVIOUS=38, SCENERYOBJECT=39, LIBRARYOBJECT=40, 
		APRONS=41, APRONEDGELIGHTS=42, TAXIWAYSIGN=43, BOUNDARYFENCE=44, STRING=45, 
		SPECIAL_CHAR=46, EQUALS=47, QUOTES=48, OP=49, DISTANCE=50, INT=51, FLOAT=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "TAG_START_OPEN", "TAG_END_OPEN", "TAG_CLOSE", "TAG_EMPTY_CLOSE", 
		"AIRPORT", "TAXIWAYPOINT", "TAXIWAYPARKING", "TAXINAME", "TAXIWAYPATH", 
		"TOWER", "SERVICES", "COM", "RUNWAY", "RUNWAYALIAS", "APPROACH", "APPROACHLEGS", 
		"LEG", "MISSEDAPPROACHLEGS", "TRANSITION", "TRANSITIONLEGS", "WAYPOINT", 
		"HELIPAD", "START", "JETWAY", "FUEL", "MARKINGS", "LIGHTS", "OFFSETTHRESHOLD", 
		"APPROACHLIGHTS", "VASI", "ILS", "GLIDESLOPE", "DME", "ROUTE", "NEXT", 
		"PREVIOUS", "SCENERYOBJECT", "LIBRARYOBJECT", "APRONS", "APRONEDGELIGHTS", 
		"TAXIWAYSIGN", "BOUNDARYFENCE", "DIGIT", "CHAR", "STRING", "SPECIAL_CHAR", 
		"EQUALS", "QUOTES", "OP", "DISTANCE", "INT", "FLOAT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'<'", "'</'", "'>'", "'/>'", "'Airport'", "'TaxiwayPoint'", 
		"'TaxiwayParking'", "'TaxiName'", "'TaxiwayPath'", "'Tower'", "'Services'", 
		"'Com'", "'Runway'", "'RunwayAlias'", "'Approach'", "'ApproachLegs'", 
		"'Leg'", "'MissedApproachLegs'", "'Transition'", "'TransitionLegs'", "'Waypoint'", 
		"'Helipad'", "'Start'", "'Jetway'", "'Fuel'", "'Markings'", "'Lights'", 
		"'OffsetThreshold'", "'ApproachLights'", "'Vasi'", "'Ils'", "'GlideSlope'", 
		"'Dme'", "'Route'", "'Next'", "'Previous'", "'SceneryObject'", "'LibraryObject'", 
		null, null, null, null, null, null, "'='", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "TAG_START_OPEN", "TAG_END_OPEN", "TAG_CLOSE", 
		"TAG_EMPTY_CLOSE", "AIRPORT", "TAXIWAYPOINT", "TAXIWAYPARKING", "TAXINAME", 
		"TAXIWAYPATH", "TOWER", "SERVICES", "COM", "RUNWAY", "RUNWAYALIAS", "APPROACH", 
		"APPROACHLEGS", "LEG", "MISSEDAPPROACHLEGS", "TRANSITION", "TRANSITIONLEGS", 
		"WAYPOINT", "HELIPAD", "START", "JETWAY", "FUEL", "MARKINGS", "LIGHTS", 
		"OFFSETTHRESHOLD", "APPROACHLIGHTS", "VASI", "ILS", "GLIDESLOPE", "DME", 
		"ROUTE", "NEXT", "PREVIOUS", "SCENERYOBJECT", "LIBRARYOBJECT", "APRONS", 
		"APRONEDGELIGHTS", "TAXIWAYSIGN", "BOUNDARYFENCE", "STRING", "SPECIAL_CHAR", 
		"EQUALS", "QUOTES", "OP", "DISTANCE", "INT", "FLOAT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public XMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u0285\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3z\n\3\f\3\16\3}\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u01d7\n*\f*\16*\u01da\13*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\7+\u01fb\n+\f+\16+\u01fe\13+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\7,\u0223\n,\f,\16,\u0226\13,\3,\3,\3,\3,\3,\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u023d\n-\f-\16-\u0240\13-\3-\3"+
		"-\7-\u0244\n-\f-\16-\u0247\13-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\6\60\u0263\n\60\r\60\16"+
		"\60\u0264\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\5\65\u0271"+
		"\n\65\3\65\3\65\3\66\6\66\u0276\n\66\r\66\16\66\u0277\3\67\7\67\u027b"+
		"\n\67\f\67\16\67\u027e\13\67\3\67\3\67\6\67\u0282\n\67\r\67\16\67\u0283"+
		"\b{\u01d8\u01fc\u0224\u023e\u0245\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"\2]\2_/a\60c\61e\62g\63i\64k\65m\66\3\2\b\5\2\13\f\16\17\"\"\3\2\62;\4"+
		"\2C\\c|\t\2((--/\61==]_ab}\177\4\2--//\4\2OOoo\u028f\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5s\3\2\2\2\7\u0082\3\2\2\2"+
		"\t\u0084\3\2\2\2\13\u0087\3\2\2\2\r\u0089\3\2\2\2\17\u008c\3\2\2\2\21"+
		"\u0094\3\2\2\2\23\u00a1\3\2\2\2\25\u00b0\3\2\2\2\27\u00b9\3\2\2\2\31\u00c5"+
		"\3\2\2\2\33\u00cb\3\2\2\2\35\u00d4\3\2\2\2\37\u00d8\3\2\2\2!\u00df\3\2"+
		"\2\2#\u00eb\3\2\2\2%\u00f4\3\2\2\2\'\u0101\3\2\2\2)\u0105\3\2\2\2+\u0118"+
		"\3\2\2\2-\u0123\3\2\2\2/\u0132\3\2\2\2\61\u013b\3\2\2\2\63\u0143\3\2\2"+
		"\2\65\u0149\3\2\2\2\67\u0150\3\2\2\29\u0155\3\2\2\2;\u015e\3\2\2\2=\u0165"+
		"\3\2\2\2?\u0175\3\2\2\2A\u0184\3\2\2\2C\u0189\3\2\2\2E\u018d\3\2\2\2G"+
		"\u0198\3\2\2\2I\u019c\3\2\2\2K\u01a2\3\2\2\2M\u01a7\3\2\2\2O\u01b0\3\2"+
		"\2\2Q\u01be\3\2\2\2S\u01cc\3\2\2\2U\u01e7\3\2\2\2W\u0214\3\2\2\2Y\u022c"+
		"\3\2\2\2[\u025b\3\2\2\2]\u025d\3\2\2\2_\u0262\3\2\2\2a\u0266\3\2\2\2c"+
		"\u0268\3\2\2\2e\u026a\3\2\2\2g\u026c\3\2\2\2i\u0270\3\2\2\2k\u0275\3\2"+
		"\2\2m\u027c\3\2\2\2op\t\2\2\2pq\3\2\2\2qr\b\2\2\2r\4\3\2\2\2st\7>\2\2"+
		"tu\7#\2\2uv\7/\2\2vw\7/\2\2w{\3\2\2\2xz\13\2\2\2yx\3\2\2\2z}\3\2\2\2{"+
		"|\3\2\2\2{y\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7/\2\2\177\u0080\7/\2\2\u0080"+
		"\u0081\7@\2\2\u0081\6\3\2\2\2\u0082\u0083\7>\2\2\u0083\b\3\2\2\2\u0084"+
		"\u0085\7>\2\2\u0085\u0086\7\61\2\2\u0086\n\3\2\2\2\u0087\u0088\7@\2\2"+
		"\u0088\f\3\2\2\2\u0089\u008a\7\61\2\2\u008a\u008b\7@\2\2\u008b\16\3\2"+
		"\2\2\u008c\u008d\7C\2\2\u008d\u008e\7k\2\2\u008e\u008f\7t\2\2\u008f\u0090"+
		"\7r\2\2\u0090\u0091\7q\2\2\u0091\u0092\7t\2\2\u0092\u0093\7v\2\2\u0093"+
		"\20\3\2\2\2\u0094\u0095\7V\2\2\u0095\u0096\7c\2\2\u0096\u0097\7z\2\2\u0097"+
		"\u0098\7k\2\2\u0098\u0099\7y\2\2\u0099\u009a\7c\2\2\u009a\u009b\7{\2\2"+
		"\u009b\u009c\7R\2\2\u009c\u009d\7q\2\2\u009d\u009e\7k\2\2\u009e\u009f"+
		"\7p\2\2\u009f\u00a0\7v\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7V\2\2\u00a2\u00a3"+
		"\7c\2\2\u00a3\u00a4\7z\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7y\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7\u00a8\7{\2\2\u00a8\u00a9\7R\2\2\u00a9\u00aa\7c\2\2"+
		"\u00aa\u00ab\7t\2\2\u00ab\u00ac\7m\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae"+
		"\7p\2\2\u00ae\u00af\7i\2\2\u00af\24\3\2\2\2\u00b0\u00b1\7V\2\2\u00b1\u00b2"+
		"\7c\2\2\u00b2\u00b3\7z\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7P\2\2\u00b5"+
		"\u00b6\7c\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7g\2\2\u00b8\26\3\2\2\2\u00b9"+
		"\u00ba\7V\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7z\2\2\u00bc\u00bd\7k\2\2"+
		"\u00bd\u00be\7y\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7{\2\2\u00c0\u00c1"+
		"\7R\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7j\2\2\u00c4"+
		"\30\3\2\2\2\u00c5\u00c6\7V\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7y\2\2\u00c8"+
		"\u00c9\7g\2\2\u00c9\u00ca\7t\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\7U\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7k\2\2"+
		"\u00d0\u00d1\7e\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7u\2\2\u00d3\34\3\2"+
		"\2\2\u00d4\u00d5\7E\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7o\2\2\u00d7\36"+
		"\3\2\2\2\u00d8\u00d9\7T\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7p\2\2\u00db"+
		"\u00dc\7y\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7{\2\2\u00de \3\2\2\2\u00df"+
		"\u00e0\7T\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7y\2\2"+
		"\u00e3\u00e4\7c\2\2\u00e4\u00e5\7{\2\2\u00e5\u00e6\7C\2\2\u00e6\u00e7"+
		"\7n\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7u\2\2\u00ea"+
		"\"\3\2\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7r\2\2\u00ee"+
		"\u00ef\7t\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7e\2\2"+
		"\u00f2\u00f3\7j\2\2\u00f3$\3\2\2\2\u00f4\u00f5\7C\2\2\u00f5\u00f6\7r\2"+
		"\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa"+
		"\7c\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7N\2\2\u00fd"+
		"\u00fe\7g\2\2\u00fe\u00ff\7i\2\2\u00ff\u0100\7u\2\2\u0100&\3\2\2\2\u0101"+
		"\u0102\7N\2\2\u0102\u0103\7g\2\2\u0103\u0104\7i\2\2\u0104(\3\2\2\2\u0105"+
		"\u0106\7O\2\2\u0106\u0107\7k\2\2\u0107\u0108\7u\2\2\u0108\u0109\7u\2\2"+
		"\u0109\u010a\7g\2\2\u010a\u010b\7f\2\2\u010b\u010c\7C\2\2\u010c\u010d"+
		"\7r\2\2\u010d\u010e\7r\2\2\u010e\u010f\7t\2\2\u010f\u0110\7q\2\2\u0110"+
		"\u0111\7c\2\2\u0111\u0112\7e\2\2\u0112\u0113\7j\2\2\u0113\u0114\7N\2\2"+
		"\u0114\u0115\7g\2\2\u0115\u0116\7i\2\2\u0116\u0117\7u\2\2\u0117*\3\2\2"+
		"\2\u0118\u0119\7V\2\2\u0119\u011a\7t\2\2\u011a\u011b\7c\2\2\u011b\u011c"+
		"\7p\2\2\u011c\u011d\7u\2\2\u011d\u011e\7k\2\2\u011e\u011f\7v\2\2\u011f"+
		"\u0120\7k\2\2\u0120\u0121\7q\2\2\u0121\u0122\7p\2\2\u0122,\3\2\2\2\u0123"+
		"\u0124\7V\2\2\u0124\u0125\7t\2\2\u0125\u0126\7c\2\2\u0126\u0127\7p\2\2"+
		"\u0127\u0128\7u\2\2\u0128\u0129\7k\2\2\u0129\u012a\7v\2\2\u012a\u012b"+
		"\7k\2\2\u012b\u012c\7q\2\2\u012c\u012d\7p\2\2\u012d\u012e\7N\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7i\2\2\u0130\u0131\7u\2\2\u0131.\3\2\2\2\u0132"+
		"\u0133\7Y\2\2\u0133\u0134\7c\2\2\u0134\u0135\7{\2\2\u0135\u0136\7r\2\2"+
		"\u0136\u0137\7q\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2\2\u0139\u013a"+
		"\7v\2\2\u013a\60\3\2\2\2\u013b\u013c\7J\2\2\u013c\u013d\7g\2\2\u013d\u013e"+
		"\7n\2\2\u013e\u013f\7k\2\2\u013f\u0140\7r\2\2\u0140\u0141\7c\2\2\u0141"+
		"\u0142\7f\2\2\u0142\62\3\2\2\2\u0143\u0144\7U\2\2\u0144\u0145\7v\2\2\u0145"+
		"\u0146\7c\2\2\u0146\u0147\7t\2\2\u0147\u0148\7v\2\2\u0148\64\3\2\2\2\u0149"+
		"\u014a\7L\2\2\u014a\u014b\7g\2\2\u014b\u014c\7v\2\2\u014c\u014d\7y\2\2"+
		"\u014d\u014e\7c\2\2\u014e\u014f\7{\2\2\u014f\66\3\2\2\2\u0150\u0151\7"+
		"H\2\2\u0151\u0152\7w\2\2\u0152\u0153\7g\2\2\u0153\u0154\7n\2\2\u01548"+
		"\3\2\2\2\u0155\u0156\7O\2\2\u0156\u0157\7c\2\2\u0157\u0158\7t\2\2\u0158"+
		"\u0159\7m\2\2\u0159\u015a\7k\2\2\u015a\u015b\7p\2\2\u015b\u015c\7i\2\2"+
		"\u015c\u015d\7u\2\2\u015d:\3\2\2\2\u015e\u015f\7N\2\2\u015f\u0160\7k\2"+
		"\2\u0160\u0161\7i\2\2\u0161\u0162\7j\2\2\u0162\u0163\7v\2\2\u0163\u0164"+
		"\7u\2\2\u0164<\3\2\2\2\u0165\u0166\7Q\2\2\u0166\u0167\7h\2\2\u0167\u0168"+
		"\7h\2\2\u0168\u0169\7u\2\2\u0169\u016a\7g\2\2\u016a\u016b\7v\2\2\u016b"+
		"\u016c\7V\2\2\u016c\u016d\7j\2\2\u016d\u016e\7t\2\2\u016e\u016f\7g\2\2"+
		"\u016f\u0170\7u\2\2\u0170\u0171\7j\2\2\u0171\u0172\7q\2\2\u0172\u0173"+
		"\7n\2\2\u0173\u0174\7f\2\2\u0174>\3\2\2\2\u0175\u0176\7C\2\2\u0176\u0177"+
		"\7r\2\2\u0177\u0178\7r\2\2\u0178\u0179\7t\2\2\u0179\u017a\7q\2\2\u017a"+
		"\u017b\7c\2\2\u017b\u017c\7e\2\2\u017c\u017d\7j\2\2\u017d\u017e\7N\2\2"+
		"\u017e\u017f\7k\2\2\u017f\u0180\7i\2\2\u0180\u0181\7j\2\2\u0181\u0182"+
		"\7v\2\2\u0182\u0183\7u\2\2\u0183@\3\2\2\2\u0184\u0185\7X\2\2\u0185\u0186"+
		"\7c\2\2\u0186\u0187\7u\2\2\u0187\u0188\7k\2\2\u0188B\3\2\2\2\u0189\u018a"+
		"\7K\2\2\u018a\u018b\7n\2\2\u018b\u018c\7u\2\2\u018cD\3\2\2\2\u018d\u018e"+
		"\7I\2\2\u018e\u018f\7n\2\2\u018f\u0190\7k\2\2\u0190\u0191\7f\2\2\u0191"+
		"\u0192\7g\2\2\u0192\u0193\7U\2\2\u0193\u0194\7n\2\2\u0194\u0195\7q\2\2"+
		"\u0195\u0196\7r\2\2\u0196\u0197\7g\2\2\u0197F\3\2\2\2\u0198\u0199\7F\2"+
		"\2\u0199\u019a\7o\2\2\u019a\u019b\7g\2\2\u019bH\3\2\2\2\u019c\u019d\7"+
		"T\2\2\u019d\u019e\7q\2\2\u019e\u019f\7w\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1"+
		"\7g\2\2\u01a1J\3\2\2\2\u01a2\u01a3\7P\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5"+
		"\7z\2\2\u01a5\u01a6\7v\2\2\u01a6L\3\2\2\2\u01a7\u01a8\7R\2\2\u01a8\u01a9"+
		"\7t\2\2\u01a9\u01aa\7g\2\2\u01aa\u01ab\7x\2\2\u01ab\u01ac\7k\2\2\u01ac"+
		"\u01ad\7q\2\2\u01ad\u01ae\7w\2\2\u01ae\u01af\7u\2\2\u01afN\3\2\2\2\u01b0"+
		"\u01b1\7U\2\2\u01b1\u01b2\7e\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7p\2\2"+
		"\u01b4\u01b5\7g\2\2\u01b5\u01b6\7t\2\2\u01b6\u01b7\7{\2\2\u01b7\u01b8"+
		"\7Q\2\2\u01b8\u01b9\7d\2\2\u01b9\u01ba\7l\2\2\u01ba\u01bb\7g\2\2\u01bb"+
		"\u01bc\7e\2\2\u01bc\u01bd\7v\2\2\u01bdP\3\2\2\2\u01be\u01bf\7N\2\2\u01bf"+
		"\u01c0\7k\2\2\u01c0\u01c1\7d\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3\7c\2\2"+
		"\u01c3\u01c4\7t\2\2\u01c4\u01c5\7{\2\2\u01c5\u01c6\7Q\2\2\u01c6\u01c7"+
		"\7d\2\2\u01c7\u01c8\7l\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca\7e\2\2\u01ca"+
		"\u01cb\7v\2\2\u01cbR\3\2\2\2\u01cc\u01cd\7>\2\2\u01cd\u01ce\7C\2\2\u01ce"+
		"\u01cf\7r\2\2\u01cf\u01d0\7t\2\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7p\2\2"+
		"\u01d2\u01d3\7u\2\2\u01d3\u01d4\7@\2\2\u01d4\u01d8\3\2\2\2\u01d5\u01d7"+
		"\13\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d9\3\2\2\2"+
		"\u01d8\u01d6\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dc"+
		"\7>\2\2\u01dc\u01dd\7\61\2\2\u01dd\u01de\7C\2\2\u01de\u01df\7r\2\2\u01df"+
		"\u01e0\7t\2\2\u01e0\u01e1\7q\2\2\u01e1\u01e2\7p\2\2\u01e2\u01e3\7u\2\2"+
		"\u01e3\u01e4\7@\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\b*\2\2\u01e6T\3\2"+
		"\2\2\u01e7\u01e8\7>\2\2\u01e8\u01e9\7C\2\2\u01e9\u01ea\7r\2\2\u01ea\u01eb"+
		"\7t\2\2\u01eb\u01ec\7q\2\2\u01ec\u01ed\7p\2\2\u01ed\u01ee\7G\2\2\u01ee"+
		"\u01ef\7f\2\2\u01ef\u01f0\7i\2\2\u01f0\u01f1\7g\2\2\u01f1\u01f2\7N\2\2"+
		"\u01f2\u01f3\7k\2\2\u01f3\u01f4\7i\2\2\u01f4\u01f5\7j\2\2\u01f5\u01f6"+
		"\7v\2\2\u01f6\u01f7\7u\2\2\u01f7\u01f8\7@\2\2\u01f8\u01fc\3\2\2\2\u01f9"+
		"\u01fb\13\2\2\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fd\3"+
		"\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff"+
		"\u0200\7>\2\2\u0200\u0201\7\61\2\2\u0201\u0202\7C\2\2\u0202\u0203\7r\2"+
		"\2\u0203\u0204\7t\2\2\u0204\u0205\7q\2\2\u0205\u0206\7p\2\2\u0206\u0207"+
		"\7G\2\2\u0207\u0208\7f\2\2\u0208\u0209\7i\2\2\u0209\u020a\7g\2\2\u020a"+
		"\u020b\7N\2\2\u020b\u020c\7k\2\2\u020c\u020d\7i\2\2\u020d\u020e\7j\2\2"+
		"\u020e\u020f\7v\2\2\u020f\u0210\7u\2\2\u0210\u0211\7@\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0213\b+\2\2\u0213V\3\2\2\2\u0214\u0215\7>\2\2\u0215\u0216"+
		"\7V\2\2\u0216\u0217\7c\2\2\u0217\u0218\7z\2\2\u0218\u0219\7k\2\2\u0219"+
		"\u021a\7y\2\2\u021a\u021b\7c\2\2\u021b\u021c\7{\2\2\u021c\u021d\7U\2\2"+
		"\u021d\u021e\7k\2\2\u021e\u021f\7i\2\2\u021f\u0220\7p\2\2\u0220\u0224"+
		"\3\2\2\2\u0221\u0223\13\2\2\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2"+
		"\u0224\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224"+
		"\3\2\2\2\u0227\u0228\7\61\2\2\u0228\u0229\7@\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022b\b,\2\2\u022bX\3\2\2\2\u022c\u022d\7>\2\2\u022d\u022e\7D\2\2\u022e"+
		"\u022f\7q\2\2\u022f\u0230\7w\2\2\u0230\u0231\7p\2\2\u0231\u0232\7f\2\2"+
		"\u0232\u0233\7c\2\2\u0233\u0234\7t\2\2\u0234\u0235\7{\2\2\u0235\u0236"+
		"\7H\2\2\u0236\u0237\7g\2\2\u0237\u0238\7p\2\2\u0238\u0239\7e\2\2\u0239"+
		"\u023a\7g\2\2\u023a\u023e\3\2\2\2\u023b\u023d\13\2\2\2\u023c\u023b\3\2"+
		"\2\2\u023d\u0240\3\2\2\2\u023e\u023f\3\2\2\2\u023e\u023c\3\2\2\2\u023f"+
		"\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0245\7@\2\2\u0242\u0244\13\2"+
		"\2\2\u0243\u0242\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0246\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7>"+
		"\2\2\u0249\u024a\7\61\2\2\u024a\u024b\7D\2\2\u024b\u024c\7q\2\2\u024c"+
		"\u024d\7w\2\2\u024d\u024e\7p\2\2\u024e\u024f\7f\2\2\u024f\u0250\7c\2\2"+
		"\u0250\u0251\7t\2\2\u0251\u0252\7{\2\2\u0252\u0253\7H\2\2\u0253\u0254"+
		"\7g\2\2\u0254\u0255\7p\2\2\u0255\u0256\7e\2\2\u0256\u0257\7g\2\2\u0257"+
		"\u0258\7@\2\2\u0258\u0259\3\2\2\2\u0259\u025a\b-\2\2\u025aZ\3\2\2\2\u025b"+
		"\u025c\t\3\2\2\u025c\\\3\2\2\2\u025d\u025e\t\4\2\2\u025e^\3\2\2\2\u025f"+
		"\u0263\5[.\2\u0260\u0263\5]/\2\u0261\u0263\5a\61\2\u0262\u025f\3\2\2\2"+
		"\u0262\u0260\3\2\2\2\u0262\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0262"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265`\3\2\2\2\u0266\u0267\t\5\2\2\u0267"+
		"b\3\2\2\2\u0268\u0269\7?\2\2\u0269d\3\2\2\2\u026a\u026b\7$\2\2\u026bf"+
		"\3\2\2\2\u026c\u026d\t\6\2\2\u026dh\3\2\2\2\u026e\u0271\5m\67\2\u026f"+
		"\u0271\5k\66\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272\u0273\t\7\2\2\u0273j\3\2\2\2\u0274\u0276\t\3\2\2\u0275\u0274"+
		"\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"l\3\2\2\2\u0279\u027b\t\3\2\2\u027a\u0279\3\2\2\2\u027b\u027e\3\2\2\2"+
		"\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u027c"+
		"\3\2\2\2\u027f\u0281\7\60\2\2\u0280\u0282\t\3\2\2\u0281\u0280\3\2\2\2"+
		"\u0282\u0283\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284n\3"+
		"\2\2\2\17\2{\u01d8\u01fc\u0224\u023e\u0245\u0262\u0264\u0270\u0277\u027c"+
		"\u0283\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}