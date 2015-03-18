// Generated from /Users/damienvaz/IdeaProjects/liss/src/Application/Liss.g4 by ANTLR 4.5
package Application;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LissParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		NBR=67, ID=68, WS=69, STR=70;
	public static final int
		RULE_liss = 0, RULE_body = 1, RULE_declarations = 2, RULE_declaration = 3, 
		RULE_variable_declaration = 4, RULE_vars = 5, RULE_var = 6, RULE_value_var = 7, 
		RULE_type = 8, RULE_dimension = 9, RULE_inic_var = 10, RULE_constant = 11, 
		RULE_sign = 12, RULE_array_definition = 13, RULE_array_initialization = 14, 
		RULE_elem = 15, RULE_sequence_definition = 16, RULE_sequence_initialization = 17, 
		RULE_values = 18, RULE_set_definition = 19, RULE_set_initialization = 20, 
		RULE_subprogram_definition = 21, RULE_f_body = 22, RULE_formal_args = 23, 
		RULE_f_args = 24, RULE_formal_arg = 25, RULE_return_type = 26, RULE_returnSubPrg = 27, 
		RULE_statements = 28, RULE_statement = 29, RULE_assignment = 30, RULE_designator = 31, 
		RULE_array_access = 32, RULE_elem_array = 33, RULE_function_call = 34, 
		RULE_sub_prg_args = 35, RULE_args = 36, RULE_expression = 37, RULE_single_expression = 38, 
		RULE_term = 39, RULE_factor = 40, RULE_specialFunctions = 41, RULE_add_op = 42, 
		RULE_mul_op = 43, RULE_rel_op = 44, RULE_write_statement = 45, RULE_write_expr = 46, 
		RULE_print_what = 47, RULE_read_statement = 48, RULE_conditional_statement = 49, 
		RULE_iterative_statement = 50, RULE_if_then_else_stat = 51, RULE_else_expression = 52, 
		RULE_for_stat = 53, RULE_interval = 54, RULE_type_interval = 55, RULE_range = 56, 
		RULE_minimum = 57, RULE_maximum = 58, RULE_step = 59, RULE_up_down = 60, 
		RULE_satisfy = 61, RULE_while_stat = 62, RULE_succ_or_pred = 63, RULE_succ_pred = 64, 
		RULE_tail = 65, RULE_head = 66, RULE_cons = 67, RULE_delete = 68, RULE_copy_statement = 69, 
		RULE_cat_statement = 70, RULE_is_empty = 71, RULE_length = 72, RULE_member = 73, 
		RULE_string = 74, RULE_number = 75, RULE_identifier = 76;
	public static final String[] ruleNames = {
		"liss", "body", "declarations", "declaration", "variable_declaration", 
		"vars", "var", "value_var", "type", "dimension", "inic_var", "constant", 
		"sign", "array_definition", "array_initialization", "elem", "sequence_definition", 
		"sequence_initialization", "values", "set_definition", "set_initialization", 
		"subprogram_definition", "f_body", "formal_args", "f_args", "formal_arg", 
		"return_type", "returnSubPrg", "statements", "statement", "assignment", 
		"designator", "array_access", "elem_array", "function_call", "sub_prg_args", 
		"args", "expression", "single_expression", "term", "factor", "specialFunctions", 
		"add_op", "mul_op", "rel_op", "write_statement", "write_expr", "print_what", 
		"read_statement", "conditional_statement", "iterative_statement", "if_then_else_stat", 
		"else_expression", "for_stat", "interval", "type_interval", "range", "minimum", 
		"maximum", "step", "up_down", "satisfy", "while_stat", "succ_or_pred", 
		"succ_pred", "tail", "head", "cons", "delete", "copy_statement", "cat_statement", 
		"is_empty", "length", "member", "string", "number", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'{'", "'declarations'", "'statements'", "'}'", "'->'", 
		"';'", "','", "'='", "'integer'", "'boolean'", "'set'", "'sequence'", 
		"'array'", "'size'", "'true'", "'false'", "'+'", "'-'", "'['", "']'", 
		"'<<'", "'>>'", "'|'", "'subprogram'", "'('", "')'", "'return'", "'!'", 
		"'||'", "'++'", "'*'", "'/'", "'&&'", "'**'", "'=='", "'!='", "'<'", "'>'", 
		"'<='", "'>='", "'in'", "'write'", "'writeln'", "'input'", "'if'", "'then'", 
		"'else'", "'for'", "'inArray'", "'..'", "'stepUp'", "'stepDown'", "'satisfying'", 
		"'while'", "'succ'", "'pred'", "'tail'", "'head'", "'cons'", "'del'", 
		"'copy'", "'cat'", "'isEmpty'", "'length'", "'isMember'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "NBR", "ID", "WS", "STR"
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

	@Override
	public String getGrammarFileName() { return "Liss.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int level=0;
	    int address = 0;

	public LissParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LissContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LissContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LissContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
		}
		@Override public int getRuleIndex() { return RULE_liss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterLiss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitLiss(this);
		}
	}

	public final LissContext liss(IdentifiersTable idTH) throws RecognitionException {
		LissContext _localctx = new LissContext(_ctx, getState(), idTH);
		enterRule(_localctx, 0, RULE_liss);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			match(T__0);
			setState(155); 
			identifier();
			setState(156); 
			body(idTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BodyContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitBody(this);
		}
	}

	public final BodyContext body(IdentifiersTable idTH) throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState(), idTH);
		enterRule(_localctx, 2, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); 
			match(T__1);
			setState(159); 
			match(T__2);
			setState(160); 
			declarations(idTH);
			System.out.println("VM exclusive: "+address+"\n");
			setState(162); 
			match(T__3);
			setState(163); 
			statements();
			setState(164); 
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeclarationsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations(IdentifiersTable idTH) throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState(), idTH);
		enterRule(_localctx, 4, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==ID) {
				{
				{
				setState(166); 
				declaration(idTH);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Subprogram_definitionContext subprogram_definition() {
			return getRuleContext(Subprogram_definitionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeclarationContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration(IdentifiersTable idTH) throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState(), idTH);
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); 
				variable_declaration(idTH);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); 
				subprogram_definition(idTH);
				level--;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public VarsContext vars;
		public TypeContext type;
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Variable_declarationContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration(IdentifiersTable idTH) throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState(), idTH);
		enterRule(_localctx, 8, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); 
			((Variable_declarationContext)_localctx).vars = vars();
			setState(179); 
			match(T__5);
			setState(180); 
			((Variable_declarationContext)_localctx).type = type();
			setState(181); 
			match(T__6);

			                            ArrayList<String> array = ((Variable_declarationContext)_localctx).vars.arrayS;
			                            Type typeSpace;
			                            if(((Variable_declarationContext)_localctx).type.typeS == "integer"){
			                                Int i = new Int(new String("VAR"),new Integer(level),address);
			                                typeSpace = (Type) _localctx.idTH.getIdentifiersTable().get("integer");

			                                for(String id : array){
			                                    _localctx.idTH.addIdentifiersTable(id,i.clone());

			                                    address = address + typeSpace.getSpace();
			                                    i.setAddress(address);
			                                }
			                            }else if(((Variable_declarationContext)_localctx).type.typeS == "boolean"){
			                                Bool b = new Bool(new String("VAR"),new Integer(level),address);
			                                typeSpace = (Type) _localctx.idTH.getIdentifiersTable().get("boolean");

			                                for(String id : array){
			                                    _localctx.idTH.addIdentifiersTable(id,b.clone());

			                                    address = address + typeSpace.getSpace();
			                                    b.setAddress(address);
			                                }
			                            }else if(((Variable_declarationContext)_localctx).type.typeS == "array"){
			                                Array a = new Array(new String("VAR"),new Integer(level),new Integer(((Variable_declarationContext)_localctx).type.arrayDimension.size()),((Variable_declarationContext)_localctx).type.arrayDimension,address);
			                                typeSpace = (Type) _localctx.idTH.getIdentifiersTable().get("integer"); //inteiro porque guarda, supostamente, o endereço do array (nao o conteudo)

			                                for(String id : array){
			                                    _localctx.idTH.addIdentifiersTable(id,a.clone());

			                                    address = address + (a.getMemorySize()*typeSpace.getSpace());
			                                    a.setAddress(address);
			                                }

			                            }
			                            else if(((Variable_declarationContext)_localctx).type.typeS == "sequence"){
			                                Sequence s = new Sequence(new String("VAR"),new Integer(level),address,"integer");
			                                typeSpace = (Type) _localctx.idTH.getIdentifiersTable().get("sequence");

			                                for(String id : array){
			                                    _localctx.idTH.addIdentifiersTable(id,s.clone());

			                                    address = address + typeSpace.getSpace();
			                                    s.setAddress(address);
			                                }

			                            }





			                     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsContext extends ParserRuleContext {
		public ArrayList<String> arrayS;
		public VarContext var;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vars);

		        ArrayList<String> vars = new ArrayList<String>();
		     
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); 
			((VarsContext)_localctx).var = var();
			 vars.add(((VarsContext)_localctx).var.idS);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(186); 
				match(T__7);
				setState(187); 
				((VarsContext)_localctx).var = var();
				vars.add(((VarsContext)_localctx).var.idS);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((VarsContext)_localctx).arrayS =  vars;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public String idS;
		public IdentifierContext identifier;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_varContext value_var() {
			return getRuleContext(Value_varContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			((VarContext)_localctx).identifier = identifier();
			setState(198); 
			value_var();
			((VarContext)_localctx).idS =  (((VarContext)_localctx).identifier!=null?_input.getText(((VarContext)_localctx).identifier.start,((VarContext)_localctx).identifier.stop):null);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_varContext extends ParserRuleContext {
		public Inic_varContext inic_var() {
			return getRuleContext(Inic_varContext.class,0);
		}
		public Value_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterValue_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitValue_var(this);
		}
	}

	public final Value_varContext value_var() throws RecognitionException {
		Value_varContext _localctx = new Value_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value_var);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case T__5:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(202); 
				match(T__8);
				setState(203); 
				inic_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public String typeS;
		public ArrayList<Integer> arrayDimension;
		public DimensionContext dimension;
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(206); 
				match(T__9);
				((TypeContext)_localctx).typeS =  "integer";
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); 
				match(T__10);
				((TypeContext)_localctx).typeS =  "boolean";
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(210); 
				match(T__11);
				((TypeContext)_localctx).typeS =  "set";
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(212); 
				match(T__12);
				((TypeContext)_localctx).typeS =  "sequence";
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(214); 
				match(T__13);
				setState(215); 
				match(T__14);
				setState(216); 
				((TypeContext)_localctx).dimension = dimension();
				((TypeContext)_localctx).typeS =  "array"; ((TypeContext)_localctx).arrayDimension =  ((TypeContext)_localctx).dimension.arrayDimension;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionContext extends ParserRuleContext {
		public ArrayList<Integer> arrayDimension;
		public NumberContext number;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitDimension(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimension);

		            ArrayList<Integer> vars = new ArrayList<Integer>();
		          
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); 
			((DimensionContext)_localctx).number = number();
			vars.add(((DimensionContext)_localctx).number.numberS);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(223); 
				match(T__7);
				setState(224); 
				((DimensionContext)_localctx).number = number();
				vars.add(((DimensionContext)_localctx).number.numberS);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((DimensionContext)_localctx).arrayDimension =  vars;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inic_varContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public Set_definitionContext set_definition() {
			return getRuleContext(Set_definitionContext.class,0);
		}
		public Sequence_definitionContext sequence_definition() {
			return getRuleContext(Sequence_definitionContext.class,0);
		}
		public Inic_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inic_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterInic_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitInic_var(this);
		}
	}

	public final Inic_varContext inic_var() throws RecognitionException {
		Inic_varContext _localctx = new Inic_varContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inic_var);
		try {
			setState(238);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(234); 
				constant();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(235); 
				array_definition();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(236); 
				set_definition();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(237); 
				sequence_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(240); 
				sign();
				setState(241); 
				number();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); 
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(244); 
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sign);
		try {
			setState(250);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); 
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(249); 
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_definitionContext extends ParserRuleContext {
		public Array_initializationContext array_initialization() {
			return getRuleContext(Array_initializationContext.class,0);
		}
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterArray_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitArray_definition(this);
		}
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); 
			match(T__19);
			setState(253); 
			array_initialization();
			setState(254); 
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_initializationContext extends ParserRuleContext {
		public List<ElemContext> elem() {
			return getRuleContexts(ElemContext.class);
		}
		public ElemContext elem(int i) {
			return getRuleContext(ElemContext.class,i);
		}
		public Array_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterArray_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitArray_initialization(this);
		}
	}

	public final Array_initializationContext array_initialization() throws RecognitionException {
		Array_initializationContext _localctx = new Array_initializationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array_initialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); 
			elem();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(257); 
				match(T__7);
				setState(258); 
				elem();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElemContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitElem(this);
		}
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elem);
		try {
			setState(266);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(264); 
				number();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(265); 
				array_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequence_definitionContext extends ParserRuleContext {
		public Sequence_initializationContext sequence_initialization() {
			return getRuleContext(Sequence_initializationContext.class,0);
		}
		public Sequence_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSequence_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSequence_definition(this);
		}
	}

	public final Sequence_definitionContext sequence_definition() throws RecognitionException {
		Sequence_definitionContext _localctx = new Sequence_definitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sequence_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); 
			match(T__21);
			setState(269); 
			sequence_initialization();
			setState(270); 
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequence_initializationContext extends ParserRuleContext {
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public Sequence_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSequence_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSequence_initialization(this);
		}
	}

	public final Sequence_initializationContext sequence_initialization() throws RecognitionException {
		Sequence_initializationContext _localctx = new Sequence_initializationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sequence_initialization);
		try {
			setState(274);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case NBR:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); 
				values();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitValues(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); 
			number();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(277); 
				match(T__7);
				setState(278); 
				number();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_definitionContext extends ParserRuleContext {
		public Set_initializationContext set_initialization() {
			return getRuleContext(Set_initializationContext.class,0);
		}
		public Set_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSet_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSet_definition(this);
		}
	}

	public final Set_definitionContext set_definition() throws RecognitionException {
		Set_definitionContext _localctx = new Set_definitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_set_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); 
			match(T__1);
			setState(285); 
			set_initialization();
			setState(286); 
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_initializationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_initializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSet_initialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSet_initialization(this);
		}
	}

	public final Set_initializationContext set_initialization() throws RecognitionException {
		Set_initializationContext _localctx = new Set_initializationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_set_initialization);
		try {
			setState(293);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(289); 
				identifier();
				setState(290); 
				match(T__23);
				setState(291); 
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subprogram_definitionContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Formal_argsContext formal_args() {
			return getRuleContext(Formal_argsContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public F_bodyContext f_body() {
			return getRuleContext(F_bodyContext.class,0);
		}
		public Subprogram_definitionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Subprogram_definitionContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
		}
		@Override public int getRuleIndex() { return RULE_subprogram_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSubprogram_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSubprogram_definition(this);
		}
	}

	public final Subprogram_definitionContext subprogram_definition(IdentifiersTable idTH) throws RecognitionException {
		Subprogram_definitionContext _localctx = new Subprogram_definitionContext(_ctx, getState(), idTH);
		enterRule(_localctx, 42, RULE_subprogram_definition);

		                        level++;
		                      
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); 
			match(T__24);
			setState(296); 
			identifier();
			setState(297); 
			match(T__25);
			setState(298); 
			formal_args();
			setState(299); 
			match(T__26);
			setState(300); 
			return_type();
			setState(301); 
			f_body(idTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F_bodyContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ReturnSubPrgContext returnSubPrg() {
			return getRuleContext(ReturnSubPrgContext.class,0);
		}
		public F_bodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public F_bodyContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
		}
		@Override public int getRuleIndex() { return RULE_f_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterF_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitF_body(this);
		}
	}

	public final F_bodyContext f_body(IdentifiersTable idTH) throws RecognitionException {
		F_bodyContext _localctx = new F_bodyContext(_ctx, getState(), idTH);
		enterRule(_localctx, 44, RULE_f_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); 
			match(T__1);
			setState(304); 
			match(T__2);
			setState(305); 
			declarations(idTH);
			setState(306); 
			match(T__3);
			setState(307); 
			statements();
			setState(308); 
			returnSubPrg();
			setState(309); 
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_argsContext extends ParserRuleContext {
		public F_argsContext f_args() {
			return getRuleContext(F_argsContext.class,0);
		}
		public Formal_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterFormal_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitFormal_args(this);
		}
	}

	public final Formal_argsContext formal_args() throws RecognitionException {
		Formal_argsContext _localctx = new Formal_argsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_formal_args);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(312); 
				f_args();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class F_argsContext extends ParserRuleContext {
		public List<Formal_argContext> formal_arg() {
			return getRuleContexts(Formal_argContext.class);
		}
		public Formal_argContext formal_arg(int i) {
			return getRuleContext(Formal_argContext.class,i);
		}
		public F_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterF_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitF_args(this);
		}
	}

	public final F_argsContext f_args() throws RecognitionException {
		F_argsContext _localctx = new F_argsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_f_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); 
			formal_arg();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(316); 
				match(T__6);
				setState(317); 
				formal_arg();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_argContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Formal_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterFormal_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitFormal_arg(this);
		}
	}

	public final Formal_argContext formal_arg() throws RecognitionException {
		Formal_argContext _localctx = new Formal_argContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_formal_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323); 
			identifier();
			setState(324); 
			match(T__5);
			setState(325); 
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_type);
		try {
			setState(330);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(328); 
				match(T__5);
				setState(329); 
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnSubPrgContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnSubPrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSubPrg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterReturnSubPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitReturnSubPrg(this);
		}
	}

	public final ReturnSubPrgContext returnSubPrg() throws RecognitionException {
		ReturnSubPrgContext _localctx = new ReturnSubPrgContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnSubPrg);
		try {
			setState(337);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(333); 
				match(T__27);
				setState(334); 
				expression();
				setState(335); 
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__48 - 43)) | (1L << (T__54 - 43)) | (1L << (T__55 - 43)) | (1L << (T__56 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (ID - 43)))) != 0)) {
				{
				{
				setState(339); 
				statement();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Iterative_statementContext iterative_statement() {
			return getRuleContext(Iterative_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Succ_or_predContext succ_or_pred() {
			return getRuleContext(Succ_or_predContext.class,0);
		}
		public Copy_statementContext copy_statement() {
			return getRuleContext(Copy_statementContext.class,0);
		}
		public Cat_statementContext cat_statement() {
			return getRuleContext(Cat_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		try {
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345); 
				assignment();
				setState(346); 
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348); 
				write_statement();
				setState(349); 
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351); 
				read_statement();
				setState(352); 
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354); 
				conditional_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(355); 
				iterative_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(356); 
				function_call();
				setState(357); 
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(359); 
				succ_or_pred();
				setState(360); 
				match(T__6);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(362); 
				copy_statement();
				setState(363); 
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(365); 
				cat_statement();
				setState(366); 
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); 
			designator();
			setState(371); 
			match(T__8);
			setState(372); 
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_designator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); 
			identifier();
			setState(375); 
			array_access();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_accessContext extends ParserRuleContext {
		public Elem_arrayContext elem_array() {
			return getRuleContext(Elem_arrayContext.class,0);
		}
		public Array_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterArray_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitArray_access(this);
		}
	}

	public final Array_accessContext array_access() throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_array_access);
		try {
			setState(382);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__17:
			case T__18:
			case T__20:
			case T__26:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(378); 
				match(T__19);
				setState(379); 
				elem_array();
				setState(380); 
				match(T__20);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elem_arrayContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Elem_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterElem_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitElem_array(this);
		}
	}

	public final Elem_arrayContext elem_array() throws RecognitionException {
		Elem_arrayContext _localctx = new Elem_arrayContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_elem_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); 
			expression();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(385); 
				match(T__7);
				setState(386); 
				expression();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Sub_prg_argsContext sub_prg_args() {
			return getRuleContext(Sub_prg_argsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); 
			identifier();
			setState(393); 
			match(T__25);
			setState(394); 
			sub_prg_args();
			setState(395); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sub_prg_argsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Sub_prg_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_prg_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSub_prg_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSub_prg_args(this);
		}
	}

	public final Sub_prg_argsContext sub_prg_args() throws RecognitionException {
		Sub_prg_argsContext _localctx = new Sub_prg_argsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sub_prg_args);
		try {
			setState(399);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__25:
			case T__28:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__63:
			case T__64:
			case T__65:
			case NBR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(398); 
				args();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); 
			expression();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(402); 
				match(T__7);
				setState(403); 
				expression();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Single_expressionContext> single_expression() {
			return getRuleContexts(Single_expressionContext.class);
		}
		public Single_expressionContext single_expression(int i) {
			return getRuleContext(Single_expressionContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); 
			single_expression();
			setState(413);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(410); 
				rel_op();
				setState(411); 
				single_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Add_opContext> add_op() {
			return getRuleContexts(Add_opContext.class);
		}
		public Add_opContext add_op(int i) {
			return getRuleContext(Add_opContext.class,i);
		}
		public Single_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSingle_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSingle_expression(this);
		}
	}

	public final Single_expressionContext single_expression() throws RecognitionException {
		Single_expressionContext _localctx = new Single_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_single_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); 
			term();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				{
				setState(416); 
				add_op();
				setState(417); 
				term();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Mul_opContext> mul_op() {
			return getRuleContexts(Mul_opContext.class);
		}
		public Mul_opContext mul_op(int i) {
			return getRuleContext(Mul_opContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); 
			factor();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				{
				setState(425); 
				mul_op();
				setState(426); 
				factor();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Inic_varContext inic_var() {
			return getRuleContext(Inic_varContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public SpecialFunctionsContext specialFunctions() {
			return getRuleContext(SpecialFunctionsContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_factor);
		try {
			setState(443);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433); 
				inic_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434); 
				designator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435); 
				function_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(436); 
				match(T__25);
				setState(437); 
				expression();
				setState(438); 
				match(T__26);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(440); 
				match(T__28);
				setState(441); 
				factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(442); 
				specialFunctions();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialFunctionsContext extends ParserRuleContext {
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public ConsContext cons() {
			return getRuleContext(ConsContext.class,0);
		}
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public Is_emptyContext is_empty() {
			return getRuleContext(Is_emptyContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public SpecialFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSpecialFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSpecialFunctions(this);
		}
	}

	public final SpecialFunctionsContext specialFunctions() throws RecognitionException {
		SpecialFunctionsContext _localctx = new SpecialFunctionsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_specialFunctions);
		try {
			setState(452);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(445); 
				tail();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(446); 
				head();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(447); 
				cons();
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 4);
				{
				setState(448); 
				member();
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 5);
				{
				setState(449); 
				is_empty();
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 6);
				{
				setState(450); 
				length();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 7);
				{
				setState(451); 
				delete();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_opContext extends ParserRuleContext {
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitAdd_op(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__30))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mul_opContext extends ParserRuleContext {
		public Mul_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterMul_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitMul_op(this);
		}
	}

	public final Mul_opContext mul_op() throws RecognitionException {
		Mul_opContext _localctx = new Mul_opContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mul_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_statementContext extends ParserRuleContext {
		public Write_exprContext write_expr() {
			return getRuleContext(Write_exprContext.class,0);
		}
		public Print_whatContext print_what() {
			return getRuleContext(Print_whatContext.class,0);
		}
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); 
			write_expr();
			setState(461); 
			match(T__25);
			setState(462); 
			print_what();
			setState(463); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_exprContext extends ParserRuleContext {
		public Write_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterWrite_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitWrite_expr(this);
		}
	}

	public final Write_exprContext write_expr() throws RecognitionException {
		Write_exprContext _localctx = new Write_exprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_write_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_whatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_whatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_what; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterPrint_what(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitPrint_what(this);
		}
	}

	public final Print_whatContext print_what() throws RecognitionException {
		Print_whatContext _localctx = new Print_whatContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_print_what);
		try {
			setState(469);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__25:
			case T__28:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__63:
			case T__64:
			case T__65:
			case NBR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(468); 
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_statementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitRead_statement(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471); 
			match(T__44);
			setState(472); 
			match(T__25);
			setState(473); 
			identifier();
			setState(474); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_statementContext extends ParserRuleContext {
		public If_then_else_statContext if_then_else_stat() {
			return getRuleContext(If_then_else_statContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterConditional_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitConditional_statement(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); 
			if_then_else_stat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iterative_statementContext extends ParserRuleContext {
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Iterative_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterIterative_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitIterative_statement(this);
		}
	}

	public final Iterative_statementContext iterative_statement() throws RecognitionException {
		Iterative_statementContext _localctx = new Iterative_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_iterative_statement);
		try {
			setState(480);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(478); 
				for_stat();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(479); 
				while_stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_then_else_statContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_expressionContext else_expression() {
			return getRuleContext(Else_expressionContext.class,0);
		}
		public If_then_else_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_else_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterIf_then_else_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitIf_then_else_stat(this);
		}
	}

	public final If_then_else_statContext if_then_else_stat() throws RecognitionException {
		If_then_else_statContext _localctx = new If_then_else_statContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_if_then_else_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482); 
			match(T__45);
			setState(483); 
			match(T__25);
			setState(484); 
			expression();
			setState(485); 
			match(T__26);
			setState(486); 
			match(T__46);
			setState(487); 
			match(T__1);
			setState(488); 
			statements();
			setState(489); 
			match(T__4);
			setState(490); 
			else_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_expressionContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterElse_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitElse_expression(this);
		}
	}

	public final Else_expressionContext else_expression() throws RecognitionException {
		Else_expressionContext _localctx = new Else_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_else_expression);
		try {
			setState(498);
			switch (_input.LA(1)) {
			case T__4:
			case T__27:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__48:
			case T__54:
			case T__55:
			case T__56:
			case T__61:
			case T__62:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(493); 
				match(T__47);
				setState(494); 
				match(T__1);
				setState(495); 
				statements();
				setState(496); 
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statContext extends ParserRuleContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public SatisfyContext satisfy() {
			return getRuleContext(SatisfyContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitFor_stat(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500); 
			match(T__48);
			setState(501); 
			match(T__25);
			setState(502); 
			interval();
			setState(503); 
			match(T__26);
			setState(504); 
			step();
			setState(505); 
			satisfy();
			setState(506); 
			match(T__1);
			setState(507); 
			statements();
			setState(508); 
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_intervalContext type_interval() {
			return getRuleContext(Type_intervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510); 
			identifier();
			setState(511); 
			type_interval();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_intervalContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterType_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitType_interval(this);
		}
	}

	public final Type_intervalContext type_interval() throws RecognitionException {
		Type_intervalContext _localctx = new Type_intervalContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_type_interval);
		try {
			setState(517);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(513); 
				match(T__41);
				setState(514); 
				range();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(515); 
				match(T__49);
				setState(516); 
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public MinimumContext minimum() {
			return getRuleContext(MinimumContext.class,0);
		}
		public MaximumContext maximum() {
			return getRuleContext(MaximumContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519); 
			minimum();
			setState(520); 
			match(T__50);
			setState(521); 
			maximum();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinimumContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MinimumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterMinimum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitMinimum(this);
		}
	}

	public final MinimumContext minimum() throws RecognitionException {
		MinimumContext _localctx = new MinimumContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_minimum);
		try {
			setState(525);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(523); 
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(524); 
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaximumContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MaximumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maximum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterMaximum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitMaximum(this);
		}
	}

	public final MaximumContext maximum() throws RecognitionException {
		MaximumContext _localctx = new MaximumContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_maximum);
		try {
			setState(529);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(527); 
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(528); 
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepContext extends ParserRuleContext {
		public Up_downContext up_down() {
			return getRuleContext(Up_downContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_step);
		try {
			setState(535);
			switch (_input.LA(1)) {
			case T__1:
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(532); 
				up_down();
				setState(533); 
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Up_downContext extends ParserRuleContext {
		public Up_downContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up_down; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterUp_down(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitUp_down(this);
		}
	}

	public final Up_downContext up_down() throws RecognitionException {
		Up_downContext _localctx = new Up_downContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_up_down);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__52) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SatisfyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SatisfyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_satisfy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSatisfy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSatisfy(this);
		}
	}

	public final SatisfyContext satisfy() throws RecognitionException {
		SatisfyContext _localctx = new SatisfyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_satisfy);
		try {
			setState(542);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(540); 
				match(T__53);
				setState(541); 
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitWhile_stat(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); 
			match(T__54);
			setState(545); 
			match(T__25);
			setState(546); 
			expression();
			setState(547); 
			match(T__26);
			setState(548); 
			match(T__1);
			setState(549); 
			statements();
			setState(550); 
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Succ_or_predContext extends ParserRuleContext {
		public Succ_predContext succ_pred() {
			return getRuleContext(Succ_predContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Succ_or_predContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_succ_or_pred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSucc_or_pred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSucc_or_pred(this);
		}
	}

	public final Succ_or_predContext succ_or_pred() throws RecognitionException {
		Succ_or_predContext _localctx = new Succ_or_predContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_succ_or_pred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552); 
			succ_pred();
			setState(553); 
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Succ_predContext extends ParserRuleContext {
		public Succ_predContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_succ_pred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterSucc_pred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitSucc_pred(this);
		}
	}

	public final Succ_predContext succ_pred() throws RecognitionException {
		Succ_predContext _localctx = new Succ_predContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_succ_pred);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if ( !(_la==T__55 || _la==T__56) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TailContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitTail(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557); 
			match(T__57);
			setState(558); 
			match(T__25);
			setState(559); 
			expression();
			setState(560); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562); 
			match(T__58);
			setState(563); 
			match(T__25);
			setState(564); 
			expression();
			setState(565); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterCons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitCons(this);
		}
	}

	public final ConsContext cons() throws RecognitionException {
		ConsContext _localctx = new ConsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); 
			match(T__59);
			setState(568); 
			match(T__25);
			setState(569); 
			expression();
			setState(570); 
			match(T__7);
			setState(571); 
			expression();
			setState(572); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitDelete(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); 
			match(T__60);
			setState(575); 
			match(T__25);
			setState(576); 
			expression();
			setState(577); 
			match(T__7);
			setState(578); 
			expression();
			setState(579); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_statementContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Copy_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterCopy_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitCopy_statement(this);
		}
	}

	public final Copy_statementContext copy_statement() throws RecognitionException {
		Copy_statementContext _localctx = new Copy_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_copy_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581); 
			match(T__61);
			setState(582); 
			match(T__25);
			setState(583); 
			identifier();
			setState(584); 
			match(T__7);
			setState(585); 
			identifier();
			setState(586); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cat_statementContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Cat_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cat_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterCat_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitCat_statement(this);
		}
	}

	public final Cat_statementContext cat_statement() throws RecognitionException {
		Cat_statementContext _localctx = new Cat_statementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cat_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); 
			match(T__62);
			setState(589); 
			match(T__25);
			setState(590); 
			identifier();
			setState(591); 
			match(T__7);
			setState(592); 
			identifier();
			setState(593); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Is_emptyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_emptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterIs_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitIs_empty(this);
		}
	}

	public final Is_emptyContext is_empty() throws RecognitionException {
		Is_emptyContext _localctx = new Is_emptyContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_is_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); 
			match(T__63);
			setState(596); 
			match(T__25);
			setState(597); 
			expression();
			setState(598); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitLength(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600); 
			match(T__64);
			setState(601); 
			match(T__25);
			setState(602); 
			expression();
			setState(603); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); 
			match(T__65);
			setState(606); 
			match(T__25);
			setState(607); 
			expression();
			setState(608); 
			match(T__7);
			setState(609); 
			identifier();
			setState(610); 
			match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(LissParser.STR, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612); 
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public Integer numberS;
		public Token NBR;
		public TerminalNode NBR() { return getToken(LissParser.NBR, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614); 
			((NumberContext)_localctx).NBR = match(NBR);
			((NumberContext)_localctx).numberS =  Integer.parseInt((((NumberContext)_localctx).NBR!=null?((NumberContext)_localctx).NBR.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LissParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LissListener ) ((LissListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617); 
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u026e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\7\4\u00aa\n\4\f\4\16\4\u00ad\13\4\3\5\3\5\3\5\3\5\5\5"+
		"\u00b3\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c1\n"+
		"\7\f\7\16\7\u00c4\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00cf\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00de\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e6\n\13\f\13\16\13\u00e9\13\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\5\f\u00f1\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00f8\n"+
		"\r\3\16\3\16\3\16\5\16\u00fd\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7"+
		"\20\u0106\n\20\f\20\16\20\u0109\13\20\3\21\3\21\5\21\u010d\n\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\5\23\u0115\n\23\3\24\3\24\3\24\7\24\u011a\n\24"+
		"\f\24\16\24\u011d\13\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u0128\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u013c\n\31\3\32\3\32\3\32\7\32"+
		"\u0141\n\32\f\32\16\32\u0144\13\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\5\34\u014d\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0154\n\35\3\36\7\36\u0157"+
		"\n\36\f\36\16\36\u015a\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u0173\n\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0181"+
		"\n\"\3#\3#\3#\7#\u0186\n#\f#\16#\u0189\13#\3$\3$\3$\3$\3$\3%\3%\5%\u0192"+
		"\n%\3&\3&\3&\7&\u0197\n&\f&\16&\u019a\13&\3\'\3\'\3\'\3\'\5\'\u01a0\n"+
		"\'\3(\3(\3(\3(\7(\u01a6\n(\f(\16(\u01a9\13(\3)\3)\3)\3)\7)\u01af\n)\f"+
		")\16)\u01b2\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01be\n*\3+\3+\3+\3+"+
		"\3+\3+\3+\5+\u01c7\n+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\61"+
		"\3\61\5\61\u01d8\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\5\64"+
		"\u01e3\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u01f5\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\38\38\38\39\39\39\39\59\u0208\n9\3:\3:\3:\3:\3;\3;\5;"+
		"\u0210\n;\3<\3<\5<\u0214\n<\3=\3=\3=\3=\5=\u021a\n=\3>\3>\3?\3?\3?\5?"+
		"\u0221\n?\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3B\3B\3C\3C\3C\3C\3C\3D\3D"+
		"\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G"+
		"\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K"+
		"\3K\3K\3L\3L\3M\3M\3M\3N\3N\3N\2\2O\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\2\b\4\2\24\25 !\3\2\"%\3\2&,\3\2-.\3\2\66\67\3\2:;\u025c\2\u009c\3\2"+
		"\2\2\4\u00a0\3\2\2\2\6\u00ab\3\2\2\2\b\u00b2\3\2\2\2\n\u00b4\3\2\2\2\f"+
		"\u00ba\3\2\2\2\16\u00c7\3\2\2\2\20\u00ce\3\2\2\2\22\u00dd\3\2\2\2\24\u00df"+
		"\3\2\2\2\26\u00f0\3\2\2\2\30\u00f7\3\2\2\2\32\u00fc\3\2\2\2\34\u00fe\3"+
		"\2\2\2\36\u0102\3\2\2\2 \u010c\3\2\2\2\"\u010e\3\2\2\2$\u0114\3\2\2\2"+
		"&\u0116\3\2\2\2(\u011e\3\2\2\2*\u0127\3\2\2\2,\u0129\3\2\2\2.\u0131\3"+
		"\2\2\2\60\u013b\3\2\2\2\62\u013d\3\2\2\2\64\u0145\3\2\2\2\66\u014c\3\2"+
		"\2\28\u0153\3\2\2\2:\u0158\3\2\2\2<\u0172\3\2\2\2>\u0174\3\2\2\2@\u0178"+
		"\3\2\2\2B\u0180\3\2\2\2D\u0182\3\2\2\2F\u018a\3\2\2\2H\u0191\3\2\2\2J"+
		"\u0193\3\2\2\2L\u019b\3\2\2\2N\u01a1\3\2\2\2P\u01aa\3\2\2\2R\u01bd\3\2"+
		"\2\2T\u01c6\3\2\2\2V\u01c8\3\2\2\2X\u01ca\3\2\2\2Z\u01cc\3\2\2\2\\\u01ce"+
		"\3\2\2\2^\u01d3\3\2\2\2`\u01d7\3\2\2\2b\u01d9\3\2\2\2d\u01de\3\2\2\2f"+
		"\u01e2\3\2\2\2h\u01e4\3\2\2\2j\u01f4\3\2\2\2l\u01f6\3\2\2\2n\u0200\3\2"+
		"\2\2p\u0207\3\2\2\2r\u0209\3\2\2\2t\u020f\3\2\2\2v\u0213\3\2\2\2x\u0219"+
		"\3\2\2\2z\u021b\3\2\2\2|\u0220\3\2\2\2~\u0222\3\2\2\2\u0080\u022a\3\2"+
		"\2\2\u0082\u022d\3\2\2\2\u0084\u022f\3\2\2\2\u0086\u0234\3\2\2\2\u0088"+
		"\u0239\3\2\2\2\u008a\u0240\3\2\2\2\u008c\u0247\3\2\2\2\u008e\u024e\3\2"+
		"\2\2\u0090\u0255\3\2\2\2\u0092\u025a\3\2\2\2\u0094\u025f\3\2\2\2\u0096"+
		"\u0266\3\2\2\2\u0098\u0268\3\2\2\2\u009a\u026b\3\2\2\2\u009c\u009d\7\3"+
		"\2\2\u009d\u009e\5\u009aN\2\u009e\u009f\5\4\3\2\u009f\3\3\2\2\2\u00a0"+
		"\u00a1\7\4\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00a4\b\3"+
		"\1\2\u00a4\u00a5\7\6\2\2\u00a5\u00a6\5:\36\2\u00a6\u00a7\7\7\2\2\u00a7"+
		"\5\3\2\2\2\u00a8\u00aa\5\b\5\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\7\3\2\2\2\u00ad\u00ab\3"+
		"\2\2\2\u00ae\u00b3\5\n\6\2\u00af\u00b0\5,\27\2\u00b0\u00b1\b\5\1\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\t\3\2\2\2"+
		"\u00b4\u00b5\5\f\7\2\u00b5\u00b6\7\b\2\2\u00b6\u00b7\5\22\n\2\u00b7\u00b8"+
		"\7\t\2\2\u00b8\u00b9\b\6\1\2\u00b9\13\3\2\2\2\u00ba\u00bb\5\16\b\2\u00bb"+
		"\u00c2\b\7\1\2\u00bc\u00bd\7\n\2\2\u00bd\u00be\5\16\b\2\u00be\u00bf\b"+
		"\7\1\2\u00bf\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c6\b\7\1\2\u00c6\r\3\2\2\2\u00c7\u00c8\5\u009aN\2\u00c8"+
		"\u00c9\5\20\t\2\u00c9\u00ca\b\b\1\2\u00ca\17\3\2\2\2\u00cb\u00cf\3\2\2"+
		"\2\u00cc\u00cd\7\13\2\2\u00cd\u00cf\5\26\f\2\u00ce\u00cb\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\21\3\2\2\2\u00d0\u00d1\7\f\2\2\u00d1\u00de\b\n\1"+
		"\2\u00d2\u00d3\7\r\2\2\u00d3\u00de\b\n\1\2\u00d4\u00d5\7\16\2\2\u00d5"+
		"\u00de\b\n\1\2\u00d6\u00d7\7\17\2\2\u00d7\u00de\b\n\1\2\u00d8\u00d9\7"+
		"\20\2\2\u00d9\u00da\7\21\2\2\u00da\u00db\5\24\13\2\u00db\u00dc\b\n\1\2"+
		"\u00dc\u00de\3\2\2\2\u00dd\u00d0\3\2\2\2\u00dd\u00d2\3\2\2\2\u00dd\u00d4"+
		"\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00d8\3\2\2\2\u00de\23\3\2\2\2\u00df"+
		"\u00e0\5\u0098M\2\u00e0\u00e7\b\13\1\2\u00e1\u00e2\7\n\2\2\u00e2\u00e3"+
		"\5\u0098M\2\u00e3\u00e4\b\13\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2"+
		"\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\b\13\1\2\u00eb\25\3\2\2\2\u00ec"+
		"\u00f1\5\30\r\2\u00ed\u00f1\5\34\17\2\u00ee\u00f1\5(\25\2\u00ef\u00f1"+
		"\5\"\22\2\u00f0\u00ec\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\27\3\2\2\2\u00f2\u00f3\5\32\16\2\u00f3\u00f4"+
		"\5\u0098M\2\u00f4\u00f8\3\2\2\2\u00f5\u00f8\7\22\2\2\u00f6\u00f8\7\23"+
		"\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\31\3\2\2\2\u00f9\u00fd\3\2\2\2\u00fa\u00fd\7\24\2\2\u00fb\u00fd\7\25"+
		"\2\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\33\3\2\2\2\u00fe\u00ff\7\26\2\2\u00ff\u0100\5\36\20\2\u0100\u0101\7\27"+
		"\2\2\u0101\35\3\2\2\2\u0102\u0107\5 \21\2\u0103\u0104\7\n\2\2\u0104\u0106"+
		"\5 \21\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\37\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010d\5\u0098"+
		"M\2\u010b\u010d\5\34\17\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"!\3\2\2\2\u010e\u010f\7\30\2\2\u010f\u0110\5$\23\2\u0110\u0111\7\31\2"+
		"\2\u0111#\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0115\5&\24\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0113\3\2\2\2\u0115%\3\2\2\2\u0116\u011b\5\u0098M\2\u0117"+
		"\u0118\7\n\2\2\u0118\u011a\5\u0098M\2\u0119\u0117\3\2\2\2\u011a\u011d"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\'\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\7\4\2\2\u011f\u0120\5*\26\2\u0120\u0121\7\7"+
		"\2\2\u0121)\3\2\2\2\u0122\u0128\3\2\2\2\u0123\u0124\5\u009aN\2\u0124\u0125"+
		"\7\32\2\2\u0125\u0126\5L\'\2\u0126\u0128\3\2\2\2\u0127\u0122\3\2\2\2\u0127"+
		"\u0123\3\2\2\2\u0128+\3\2\2\2\u0129\u012a\7\33\2\2\u012a\u012b\5\u009a"+
		"N\2\u012b\u012c\7\34\2\2\u012c\u012d\5\60\31\2\u012d\u012e\7\35\2\2\u012e"+
		"\u012f\5\66\34\2\u012f\u0130\5.\30\2\u0130-\3\2\2\2\u0131\u0132\7\4\2"+
		"\2\u0132\u0133\7\5\2\2\u0133\u0134\5\6\4\2\u0134\u0135\7\6\2\2\u0135\u0136"+
		"\5:\36\2\u0136\u0137\58\35\2\u0137\u0138\7\7\2\2\u0138/\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u013c\5\62\32\2\u013b\u0139\3\2\2\2\u013b\u013a\3"+
		"\2\2\2\u013c\61\3\2\2\2\u013d\u0142\5\64\33\2\u013e\u013f\7\t\2\2\u013f"+
		"\u0141\5\64\33\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3"+
		"\2\2\2\u0142\u0143\3\2\2\2\u0143\63\3\2\2\2\u0144\u0142\3\2\2\2\u0145"+
		"\u0146\5\u009aN\2\u0146\u0147\7\b\2\2\u0147\u0148\5\22\n\2\u0148\65\3"+
		"\2\2\2\u0149\u014d\3\2\2\2\u014a\u014b\7\b\2\2\u014b\u014d\5\22\n\2\u014c"+
		"\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014d\67\3\2\2\2\u014e\u0154\3\2\2"+
		"\2\u014f\u0150\7\36\2\2\u0150\u0151\5L\'\2\u0151\u0152\7\t\2\2\u0152\u0154"+
		"\3\2\2\2\u0153\u014e\3\2\2\2\u0153\u014f\3\2\2\2\u01549\3\2\2\2\u0155"+
		"\u0157\5<\37\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159;\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015c"+
		"\5> \2\u015c\u015d\7\t\2\2\u015d\u0173\3\2\2\2\u015e\u015f\5\\/\2\u015f"+
		"\u0160\7\t\2\2\u0160\u0173\3\2\2\2\u0161\u0162\5b\62\2\u0162\u0163\7\t"+
		"\2\2\u0163\u0173\3\2\2\2\u0164\u0173\5d\63\2\u0165\u0173\5f\64\2\u0166"+
		"\u0167\5F$\2\u0167\u0168\7\t\2\2\u0168\u0173\3\2\2\2\u0169\u016a\5\u0080"+
		"A\2\u016a\u016b\7\t\2\2\u016b\u0173\3\2\2\2\u016c\u016d\5\u008cG\2\u016d"+
		"\u016e\7\t\2\2\u016e\u0173\3\2\2\2\u016f\u0170\5\u008eH\2\u0170\u0171"+
		"\7\t\2\2\u0171\u0173\3\2\2\2\u0172\u015b\3\2\2\2\u0172\u015e\3\2\2\2\u0172"+
		"\u0161\3\2\2\2\u0172\u0164\3\2\2\2\u0172\u0165\3\2\2\2\u0172\u0166\3\2"+
		"\2\2\u0172\u0169\3\2\2\2\u0172\u016c\3\2\2\2\u0172\u016f\3\2\2\2\u0173"+
		"=\3\2\2\2\u0174\u0175\5@!\2\u0175\u0176\7\13\2\2\u0176\u0177\5L\'\2\u0177"+
		"?\3\2\2\2\u0178\u0179\5\u009aN\2\u0179\u017a\5B\"\2\u017aA\3\2\2\2\u017b"+
		"\u0181\3\2\2\2\u017c\u017d\7\26\2\2\u017d\u017e\5D#\2\u017e\u017f\7\27"+
		"\2\2\u017f\u0181\3\2\2\2\u0180\u017b\3\2\2\2\u0180\u017c\3\2\2\2\u0181"+
		"C\3\2\2\2\u0182\u0187\5L\'\2\u0183\u0184\7\n\2\2\u0184\u0186\5L\'\2\u0185"+
		"\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188E\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\5\u009aN\2\u018b\u018c"+
		"\7\34\2\2\u018c\u018d\5H%\2\u018d\u018e\7\35\2\2\u018eG\3\2\2\2\u018f"+
		"\u0192\3\2\2\2\u0190\u0192\5J&\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2"+
		"\2\u0192I\3\2\2\2\u0193\u0198\5L\'\2\u0194\u0195\7\n\2\2\u0195\u0197\5"+
		"L\'\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199K\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019f\5N(\2\u019c"+
		"\u019d\5Z.\2\u019d\u019e\5N(\2\u019e\u01a0\3\2\2\2\u019f\u019c\3\2\2\2"+
		"\u019f\u01a0\3\2\2\2\u01a0M\3\2\2\2\u01a1\u01a7\5P)\2\u01a2\u01a3\5V,"+
		"\2\u01a3\u01a4\5P)\2\u01a4\u01a6\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a6\u01a9"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8O\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01b0\5R*\2\u01ab\u01ac\5X-\2\u01ac\u01ad\5R*\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1Q\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01be"+
		"\5\26\f\2\u01b4\u01be\5@!\2\u01b5\u01be\5F$\2\u01b6\u01b7\7\34\2\2\u01b7"+
		"\u01b8\5L\'\2\u01b8\u01b9\7\35\2\2\u01b9\u01be\3\2\2\2\u01ba\u01bb\7\37"+
		"\2\2\u01bb\u01be\5R*\2\u01bc\u01be\5T+\2\u01bd\u01b3\3\2\2\2\u01bd\u01b4"+
		"\3\2\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01b6\3\2\2\2\u01bd\u01ba\3\2\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01beS\3\2\2\2\u01bf\u01c7\5\u0084C\2\u01c0\u01c7\5\u0086"+
		"D\2\u01c1\u01c7\5\u0088E\2\u01c2\u01c7\5\u0094K\2\u01c3\u01c7\5\u0090"+
		"I\2\u01c4\u01c7\5\u0092J\2\u01c5\u01c7\5\u008aF\2\u01c6\u01bf\3\2\2\2"+
		"\u01c6\u01c0\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c3"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7U\3\2\2\2\u01c8"+
		"\u01c9\t\2\2\2\u01c9W\3\2\2\2\u01ca\u01cb\t\3\2\2\u01cbY\3\2\2\2\u01cc"+
		"\u01cd\t\4\2\2\u01cd[\3\2\2\2\u01ce\u01cf\5^\60\2\u01cf\u01d0\7\34\2\2"+
		"\u01d0\u01d1\5`\61\2\u01d1\u01d2\7\35\2\2\u01d2]\3\2\2\2\u01d3\u01d4\t"+
		"\5\2\2\u01d4_\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d8\5L\'\2\u01d7\u01d5"+
		"\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8a\3\2\2\2\u01d9\u01da\7/\2\2\u01da\u01db"+
		"\7\34\2\2\u01db\u01dc\5\u009aN\2\u01dc\u01dd\7\35\2\2\u01ddc\3\2\2\2\u01de"+
		"\u01df\5h\65\2\u01dfe\3\2\2\2\u01e0\u01e3\5l\67\2\u01e1\u01e3\5~@\2\u01e2"+
		"\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3g\3\2\2\2\u01e4\u01e5\7\60\2\2"+
		"\u01e5\u01e6\7\34\2\2\u01e6\u01e7\5L\'\2\u01e7\u01e8\7\35\2\2\u01e8\u01e9"+
		"\7\61\2\2\u01e9\u01ea\7\4\2\2\u01ea\u01eb\5:\36\2\u01eb\u01ec\7\7\2\2"+
		"\u01ec\u01ed\5j\66\2\u01edi\3\2\2\2\u01ee\u01f5\3\2\2\2\u01ef\u01f0\7"+
		"\62\2\2\u01f0\u01f1\7\4\2\2\u01f1\u01f2\5:\36\2\u01f2\u01f3\7\7\2\2\u01f3"+
		"\u01f5\3\2\2\2\u01f4\u01ee\3\2\2\2\u01f4\u01ef\3\2\2\2\u01f5k\3\2\2\2"+
		"\u01f6\u01f7\7\63\2\2\u01f7\u01f8\7\34\2\2\u01f8\u01f9\5n8\2\u01f9\u01fa"+
		"\7\35\2\2\u01fa\u01fb\5x=\2\u01fb\u01fc\5|?\2\u01fc\u01fd\7\4\2\2\u01fd"+
		"\u01fe\5:\36\2\u01fe\u01ff\7\7\2\2\u01ffm\3\2\2\2\u0200\u0201\5\u009a"+
		"N\2\u0201\u0202\5p9\2\u0202o\3\2\2\2\u0203\u0204\7,\2\2\u0204\u0208\5"+
		"r:\2\u0205\u0206\7\64\2\2\u0206\u0208\5\u009aN\2\u0207\u0203\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0208q\3\2\2\2\u0209\u020a\5t;\2\u020a\u020b\7\65\2\2\u020b"+
		"\u020c\5v<\2\u020cs\3\2\2\2\u020d\u0210\5\u0098M\2\u020e\u0210\5\u009a"+
		"N\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210u\3\2\2\2\u0211\u0214"+
		"\5\u0098M\2\u0212\u0214\5\u009aN\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2"+
		"\2\2\u0214w\3\2\2\2\u0215\u021a\3\2\2\2\u0216\u0217\5z>\2\u0217\u0218"+
		"\5\u0098M\2\u0218\u021a\3\2\2\2\u0219\u0215\3\2\2\2\u0219\u0216\3\2\2"+
		"\2\u021ay\3\2\2\2\u021b\u021c\t\6\2\2\u021c{\3\2\2\2\u021d\u0221\3\2\2"+
		"\2\u021e\u021f\78\2\2\u021f\u0221\5L\'\2\u0220\u021d\3\2\2\2\u0220\u021e"+
		"\3\2\2\2\u0221}\3\2\2\2\u0222\u0223\79\2\2\u0223\u0224\7\34\2\2\u0224"+
		"\u0225\5L\'\2\u0225\u0226\7\35\2\2\u0226\u0227\7\4\2\2\u0227\u0228\5:"+
		"\36\2\u0228\u0229\7\7\2\2\u0229\177\3\2\2\2\u022a\u022b\5\u0082B\2\u022b"+
		"\u022c\5\u009aN\2\u022c\u0081\3\2\2\2\u022d\u022e\t\7\2\2\u022e\u0083"+
		"\3\2\2\2\u022f\u0230\7<\2\2\u0230\u0231\7\34\2\2\u0231\u0232\5L\'\2\u0232"+
		"\u0233\7\35\2\2\u0233\u0085\3\2\2\2\u0234\u0235\7=\2\2\u0235\u0236\7\34"+
		"\2\2\u0236\u0237\5L\'\2\u0237\u0238\7\35\2\2\u0238\u0087\3\2\2\2\u0239"+
		"\u023a\7>\2\2\u023a\u023b\7\34\2\2\u023b\u023c\5L\'\2\u023c\u023d\7\n"+
		"\2\2\u023d\u023e\5L\'\2\u023e\u023f\7\35\2\2\u023f\u0089\3\2\2\2\u0240"+
		"\u0241\7?\2\2\u0241\u0242\7\34\2\2\u0242\u0243\5L\'\2\u0243\u0244\7\n"+
		"\2\2\u0244\u0245\5L\'\2\u0245\u0246\7\35\2\2\u0246\u008b\3\2\2\2\u0247"+
		"\u0248\7@\2\2\u0248\u0249\7\34\2\2\u0249\u024a\5\u009aN\2\u024a\u024b"+
		"\7\n\2\2\u024b\u024c\5\u009aN\2\u024c\u024d\7\35\2\2\u024d\u008d\3\2\2"+
		"\2\u024e\u024f\7A\2\2\u024f\u0250\7\34\2\2\u0250\u0251\5\u009aN\2\u0251"+
		"\u0252\7\n\2\2\u0252\u0253\5\u009aN\2\u0253\u0254\7\35\2\2\u0254\u008f"+
		"\3\2\2\2\u0255\u0256\7B\2\2\u0256\u0257\7\34\2\2\u0257\u0258\5L\'\2\u0258"+
		"\u0259\7\35\2\2\u0259\u0091\3\2\2\2\u025a\u025b\7C\2\2\u025b\u025c\7\34"+
		"\2\2\u025c\u025d\5L\'\2\u025d\u025e\7\35\2\2\u025e\u0093\3\2\2\2\u025f"+
		"\u0260\7D\2\2\u0260\u0261\7\34\2\2\u0261\u0262\5L\'\2\u0262\u0263\7\n"+
		"\2\2\u0263\u0264\5\u009aN\2\u0264\u0265\7\35\2\2\u0265\u0095\3\2\2\2\u0266"+
		"\u0267\7H\2\2\u0267\u0097\3\2\2\2\u0268\u0269\7E\2\2\u0269\u026a\bM\1"+
		"\2\u026a\u0099\3\2\2\2\u026b\u026c\7F\2\2\u026c\u009b\3\2\2\2\'\u00ab"+
		"\u00b2\u00c2\u00ce\u00dd\u00e7\u00f0\u00f7\u00fc\u0107\u010c\u0114\u011b"+
		"\u0127\u013b\u0142\u014c\u0153\u0158\u0172\u0180\u0187\u0191\u0198\u019f"+
		"\u01a7\u01b0\u01bd\u01c6\u01d7\u01e2\u01f4\u0207\u020f\u0213\u0219\u0220";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}