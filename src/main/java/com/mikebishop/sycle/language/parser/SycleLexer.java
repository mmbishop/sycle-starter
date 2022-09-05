// Generated from /Users/Michael/IdeaProjects/sycle-starter/src/main/java/com/mikebishop/sycle/language/parser/Sycle.g4 by ANTLR 4.10.1
package com.mikebishop.sycle.language.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SycleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NUMBER=8, IDENTIFIER=9, 
		WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NUMBER", "IDENTIFIER", 
			"DIGIT", "LETTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NUMBER", "IDENTIFIER", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SycleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sycle.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\nT\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007)\b\u0007"+
		"\u000b\u0007\f\u0007*\u0001\u0007\u0004\u0007.\b\u0007\u000b\u0007\f\u0007"+
		"/\u0001\u0007\u0001\u0007\u0005\u00074\b\u0007\n\u0007\f\u00077\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007;\b\u0007\u000b\u0007\f\u0007<\u0003"+
		"\u0007?\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bE\b\b\n\b\f\bH"+
		"\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0004\u000bO\b\u000b"+
		"\u000b\u000b\f\u000bP\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\u0000\u0015\u0000\u0017\n\u0001\u0000\u0003\u0001\u0000"+
		"09\u0002\u0000AZaz\u0003\u0000\t\n\r\r  [\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003"+
		"\u001b\u0001\u0000\u0000\u0000\u0005\u001d\u0001\u0000\u0000\u0000\u0007"+
		"\u001f\u0001\u0000\u0000\u0000\t!\u0001\u0000\u0000\u0000\u000b#\u0001"+
		"\u0000\u0000\u0000\r%\u0001\u0000\u0000\u0000\u000f>\u0001\u0000\u0000"+
		"\u0000\u0011@\u0001\u0000\u0000\u0000\u0013I\u0001\u0000\u0000\u0000\u0015"+
		"K\u0001\u0000\u0000\u0000\u0017N\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"+\u0000\u0000\u001a\u0002\u0001\u0000\u0000\u0000\u001b\u001c\u0005-\u0000"+
		"\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d\u001e\u0005*\u0000\u0000"+
		"\u001e\u0006\u0001\u0000\u0000\u0000\u001f \u0005/\u0000\u0000 \b\u0001"+
		"\u0000\u0000\u0000!\"\u0005(\u0000\u0000\"\n\u0001\u0000\u0000\u0000#"+
		"$\u0005)\u0000\u0000$\f\u0001\u0000\u0000\u0000%&\u0005=\u0000\u0000&"+
		"\u000e\u0001\u0000\u0000\u0000\')\u0003\u0013\t\u0000(\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+?\u0001\u0000\u0000\u0000,.\u0003\u0013\t\u0000-,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000015\u0005.\u0000\u000024\u0003"+
		"\u0013\t\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u00006?\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u00008:\u0005.\u0000\u00009;\u0003\u0013\t\u0000"+
		":9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000>(\u0001\u0000"+
		"\u0000\u0000>-\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000?\u0010"+
		"\u0001\u0000\u0000\u0000@F\u0003\u0015\n\u0000AE\u0003\u0015\n\u0000B"+
		"E\u0003\u0013\t\u0000CE\u0005_\u0000\u0000DA\u0001\u0000\u0000\u0000D"+
		"B\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0012\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0007\u0000\u0000\u0000"+
		"J\u0014\u0001\u0000\u0000\u0000KL\u0007\u0001\u0000\u0000L\u0016\u0001"+
		"\u0000\u0000\u0000MO\u0007\u0002\u0000\u0000NM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RS\u0006\u000b\u0000\u0000S\u0018\u0001"+
		"\u0000\u0000\u0000\t\u0000*/5<>DFP\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}