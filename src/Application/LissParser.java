// Generated from /Users/damienvaz/IdeaProjects/liss/src/Application/Liss.g4 by ANTLR 4.5
package Application;

    import java.util.HashMap;
    import java.util.LinkedList;

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
			setState(161); 
			match(T__3);
			setState(162); 
			statements(idTH);
			setState(163); 
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
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==ID) {
				{
				{
				setState(165); 
				declaration(idTH);
				}
				}
				setState(170);
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
			setState(175);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(171); 
				variable_declaration(idTH);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(172); 
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
			setState(177); 
			((Variable_declarationContext)_localctx).vars = vars(idTH);
			setState(178); 
			match(T__5);
			setState(179); 
			((Variable_declarationContext)_localctx).type = type();
			setState(180); 
			match(T__6);

			                            HashMap<String, HashMap<String,Object>> varsH = ((Variable_declarationContext)_localctx).vars.varsS;
			                            if(((Variable_declarationContext)_localctx).type.typeS == "array" ){
			                                for(String i : varsH.keySet()){
			                                    varsH.get(i).put("dimension",((Variable_declarationContext)_localctx).type.arrayDimension);
			                                }
			                            }


			                            //Print the HashMap<String, HashMap<String,Object>> varsH
			                            /*for(String i : varsH.keySet()){
			                                System.out.println("Variable: "+i+" "+varsH.get(i).toString());
			                            }*/


			                            _localctx.idTH.addElementsIdentifiersTables(varsH,((Variable_declarationContext)_localctx).type.typeS,level);

			                     
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
		public IdentifiersTable idTH;
		public HashMap<String, HashMap<String,Object>> varsS;
		public VarContext var;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final VarsContext vars(IdentifiersTable idTH) throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState(), idTH);
		enterRule(_localctx, 10, RULE_vars);

		        HashMap<String, HashMap<String,Object>> info = new HashMap<String, HashMap<String,Object>>();
		     
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); 
			((VarsContext)_localctx).var = var(idTH);

			                if(!info.containsKey((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null))){
			                    info.put(((VarsContext)_localctx).var.idS,((VarsContext)_localctx).var.infoVarS);
			                }else{
			                    ErrorMessage.errorSemantic((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null),(int)((VarsContext)_localctx).var.infoVarS.get("line"), (int)((VarsContext)_localctx).var.infoVarS.get("pos"),ErrorMessage.errorDeclarations);
			                }
			            
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(185); 
				match(T__7);
				setState(186); 
				((VarsContext)_localctx).var = var(idTH);

				                    if(!info.containsKey((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null))){
				                        info.put(((VarsContext)_localctx).var.idS,((VarsContext)_localctx).var.infoVarS);
				                    }else{
				                        ErrorMessage.errorSemantic((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null),(int)((VarsContext)_localctx).var.infoVarS.get("line"), (int)((VarsContext)_localctx).var.infoVarS.get("pos"),ErrorMessage.errorDeclarations);
				                    }
				                
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            ((VarsContext)_localctx).varsS =  info;
			       
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
		public IdentifiersTable idTH;
		public String idS;
		public HashMap<String,Object> infoVarS;
		public IdentifierContext identifier;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_varContext value_var() {
			return getRuleContext(Value_varContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final VarContext var(IdentifiersTable idTH) throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState(), idTH);
		enterRule(_localctx, 12, RULE_var);

		        HashMap<String, Object> info = new HashMap<String, Object>();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			((VarContext)_localctx).identifier = identifier();
			setState(197); 
			value_var(idTH);

			                            info.put("pos",((VarContext)_localctx).identifier.pos);
			                            info.put("line",((VarContext)_localctx).identifier.line);

			                            ((VarContext)_localctx).idS =  (((VarContext)_localctx).identifier!=null?_input.getText(((VarContext)_localctx).identifier.start,((VarContext)_localctx).identifier.stop):null);
			                            ((VarContext)_localctx).infoVarS =  info;
			                            
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
		public IdentifiersTable idTH;
		public Inic_varContext inic_var() {
			return getRuleContext(Inic_varContext.class,0);
		}
		public Value_varContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Value_varContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Value_varContext value_var(IdentifiersTable idTH) throws RecognitionException {
		Value_varContext _localctx = new Value_varContext(_ctx, getState(), idTH);
		enterRule(_localctx, 14, RULE_value_var);
		try {
			setState(203);
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
				setState(201); 
				match(T__8);
				setState(202); 
				inic_var(idTH);
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
			setState(218);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); 
				match(T__9);
				((TypeContext)_localctx).typeS =  "integer"; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); 
				match(T__10);
				((TypeContext)_localctx).typeS =  "boolean";
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(209); 
				match(T__11);
				((TypeContext)_localctx).typeS =  "set";
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(211); 
				match(T__12);
				((TypeContext)_localctx).typeS =  "sequence";
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(213); 
				match(T__13);
				setState(214); 
				match(T__14);
				setState(215); 
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
			setState(220); 
			((DimensionContext)_localctx).number = number();
			vars.add(((DimensionContext)_localctx).number.numberS);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(222); 
				match(T__7);
				setState(223); 
				((DimensionContext)_localctx).number = number();
				vars.add(((DimensionContext)_localctx).number.numberS);
				}
				}
				setState(230);
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
		public IdentifiersTable idTH;
		public String typeS;
		public int line;
		public int pos;
		public ConstantContext constant;
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
		public Inic_varContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Inic_varContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Inic_varContext inic_var(IdentifiersTable idTH) throws RecognitionException {
		Inic_varContext _localctx = new Inic_varContext(_ctx, getState(), idTH);
		enterRule(_localctx, 20, RULE_inic_var);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); 
				((Inic_varContext)_localctx).constant = constant();
				((Inic_varContext)_localctx).typeS =  ((Inic_varContext)_localctx).constant.typeS; ((Inic_varContext)_localctx).line =  ((Inic_varContext)_localctx).constant.line; ((Inic_varContext)_localctx).pos =  ((Inic_varContext)_localctx).constant.pos;
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(236); 
				array_definition();
				((Inic_varContext)_localctx).typeS =  "integer";
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(239); 
				set_definition(idTH);
				((Inic_varContext)_localctx).typeS =  "set";
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(242); 
				sequence_definition();
				((Inic_varContext)_localctx).typeS =  "sequence";
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
		public String typeS;
		public int line;
		public int pos;
		public NumberContext number;
		public Token t;
		public Token f;
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
			setState(255);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(247); 
				sign();
				setState(248); 
				((ConstantContext)_localctx).number = number();
				((ConstantContext)_localctx).typeS =  "integer"; ((ConstantContext)_localctx).line =  ((ConstantContext)_localctx).number.line; ((ConstantContext)_localctx).pos =  ((ConstantContext)_localctx).number.pos;
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); 
				((ConstantContext)_localctx).t = match(T__15);
				((ConstantContext)_localctx).typeS =  "boolean"; ((ConstantContext)_localctx).line =  (((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getLine():0); ((ConstantContext)_localctx).pos =  (((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getCharPositionInLine():0); 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(253); 
				((ConstantContext)_localctx).f = match(T__16);
				((ConstantContext)_localctx).typeS =  "boolean"; ((ConstantContext)_localctx).line =  (((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getLine():0); ((ConstantContext)_localctx).pos =  (((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getCharPositionInLine():0);
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
			setState(260);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(258); 
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(259); 
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
			setState(262); 
			match(T__19);
			setState(263); 
			array_initialization();
			setState(264); 
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
			setState(266); 
			elem();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(267); 
				match(T__7);
				setState(268); 
				elem();
				}
				}
				setState(273);
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
			setState(276);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(274); 
				number();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(275); 
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
			setState(278); 
			match(T__21);
			setState(279); 
			sequence_initialization();
			setState(280); 
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
			setState(284);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case NBR:
				enterOuterAlt(_localctx, 2);
				{
				setState(283); 
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
			setState(286); 
			number();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(287); 
				match(T__7);
				setState(288); 
				number();
				}
				}
				setState(293);
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
		public IdentifiersTable idTH;
		public Set_initializationContext set_initialization() {
			return getRuleContext(Set_initializationContext.class,0);
		}
		public Set_definitionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Set_definitionContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Set_definitionContext set_definition(IdentifiersTable idTH) throws RecognitionException {
		Set_definitionContext _localctx = new Set_definitionContext(_ctx, getState(), idTH);
		enterRule(_localctx, 38, RULE_set_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); 
			match(T__1);
			setState(295); 
			set_initialization(idTH);
			setState(296); 
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
		public IdentifiersTable idTH;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_initializationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Set_initializationContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Set_initializationContext set_initialization(IdentifiersTable idTH) throws RecognitionException {
		Set_initializationContext _localctx = new Set_initializationContext(_ctx, getState(), idTH);
		enterRule(_localctx, 40, RULE_set_initialization);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(299); 
				identifier();
				setState(300); 
				match(T__23);
				setState(301); 
				expression(idTH);
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
			setState(305); 
			match(T__24);
			setState(306); 
			identifier();
			setState(307); 
			match(T__25);
			setState(308); 
			formal_args();
			setState(309); 
			match(T__26);
			setState(310); 
			return_type();
			setState(311); 
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
			setState(313); 
			match(T__1);
			setState(314); 
			match(T__2);
			setState(315); 
			declarations(idTH);
			setState(316); 
			match(T__3);
			setState(317); 
			statements(idTH);
			setState(318); 
			returnSubPrg(idTH);
			setState(319); 
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
			setState(323);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(322); 
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
			setState(325); 
			formal_arg();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(326); 
				match(T__6);
				setState(327); 
				formal_arg();
				}
				}
				setState(332);
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
			setState(333); 
			identifier();
			setState(334); 
			match(T__5);
			setState(335); 
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
			setState(340);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(338); 
				match(T__5);
				setState(339); 
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
		public IdentifiersTable idTH;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnSubPrgContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReturnSubPrgContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final ReturnSubPrgContext returnSubPrg(IdentifiersTable idTH) throws RecognitionException {
		ReturnSubPrgContext _localctx = new ReturnSubPrgContext(_ctx, getState(), idTH);
		enterRule(_localctx, 54, RULE_returnSubPrg);
		try {
			setState(347);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(343); 
				match(T__27);
				setState(344); 
				expression(idTH);
				setState(345); 
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
		public IdentifiersTable idTH;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final StatementsContext statements(IdentifiersTable idTH) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), idTH);
		enterRule(_localctx, 56, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__48 - 43)) | (1L << (T__54 - 43)) | (1L << (T__55 - 43)) | (1L << (T__56 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (ID - 43)))) != 0)) {
				{
				{
				setState(349); 
				statement(idTH);
				}
				}
				setState(354);
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
		public IdentifiersTable idTH;
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
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final StatementContext statement(IdentifiersTable idTH) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), idTH);
		enterRule(_localctx, 58, RULE_statement);
		try {
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); 
				assignment(idTH);
				setState(356); 
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358); 
				write_statement(idTH);
				setState(359); 
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361); 
				read_statement();
				setState(362); 
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(364); 
				conditional_statement(idTH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(365); 
				iterative_statement(idTH);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(366); 
				function_call(idTH);
				setState(367); 
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(369); 
				succ_or_pred();
				setState(370); 
				match(T__6);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(372); 
				copy_statement();
				setState(373); 
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(375); 
				cat_statement();
				setState(376); 
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
		public IdentifiersTable idTH;
		public String typeS;
		public DesignatorContext designator;
		public ExpressionContext expression;
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AssignmentContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final AssignmentContext assignment(IdentifiersTable idTH) throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState(), idTH);
		enterRule(_localctx, 60, RULE_assignment);

		                ((AssignmentContext)_localctx).typeS =  null;
		           
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); 
			((AssignmentContext)_localctx).designator = designator(idTH);
			setState(381); 
			match(T__8);
			setState(382); 
			((AssignmentContext)_localctx).expression = expression(idTH);

			              if((((AssignmentContext)_localctx).designator.typeS != null && ((AssignmentContext)_localctx).expression.typeS != null) && ((AssignmentContext)_localctx).designator.typeS.equals(((AssignmentContext)_localctx).expression.typeS)){
			                ((AssignmentContext)_localctx).typeS =  ((AssignmentContext)_localctx).designator.typeS;
			                System.out.println(((AssignmentContext)_localctx).designator.line+"Funcionou ;D");
			              }else{
			                ErrorMessage.errorSemanticAssignment(((AssignmentContext)_localctx).designator.line);
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

	public static class DesignatorContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public String typeS;
		public int line;
		public int pos;
		public IdentifierContext identifier;
		public Array_accessContext array_access;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DesignatorContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final DesignatorContext designator(IdentifiersTable idTH) throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState(), idTH);
		enterRule(_localctx, 62, RULE_designator);

		                ((DesignatorContext)_localctx).typeS =  null;
		            
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); 
			((DesignatorContext)_localctx).identifier = identifier();
			setState(386); 
			((DesignatorContext)_localctx).array_access = array_access(idTH);

			                                ((DesignatorContext)_localctx).line =  ((DesignatorContext)_localctx).identifier.line;
			                                ((DesignatorContext)_localctx).pos =  ((DesignatorContext)_localctx).identifier.pos;
			                                //Pre-Condicao: é um identificador
			                                if(!((DesignatorContext)_localctx).array_access.response){
			                                    //Pre-Condicao: ver se existe na tabela de identificador
			                                    if(!_localctx.idTH.getIdentifiersTable().containsKey((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null))){

			                                        ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.errorStatements);

			                                    }else{
			                                        if(!_localctx.idTH.getIdentifiersTable().get((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null)).getCategory().equals(new String("TYPE"))){
			                                            Var v = (Var) _localctx.idTH.getIdentifiersTable().get((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));
			                                            ((DesignatorContext)_localctx).typeS =  v.getInfoType();
			                                        }
			                                    }
			                                }
			                                //Pre-Condicao: é um array
			                                else{
			                                    //Pre-Condicao: se existe na tabela de identificador
			                                    if(!_localctx.idTH.getIdentifiersTable().containsKey((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null))){
			                                        ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.errorStatements);

			                                    }else{
			                                        Var v = (Var) _localctx.idTH.getIdentifiersTable().get((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));

			                                        if(v.getCategory().equals(new String("TYPE"))){
			                                            ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.errorStatements);

			                                        }else{
			                                            if(!v.getInfoType().equals(new String("array"))){
			                                                ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.errorArrayType);
			                                            }else{
			                                                Array a = (Array) v;
			                                                //System.out.println("Dimension: "+a.getDimension());

			                                                //Pre-Condição : Testar as dimensoes do array (feito atraves da seguinta forma : Valor do identifier da TI == valor do identifier)
			                                                if(a.getDimension().compareTo(((DesignatorContext)_localctx).array_access.dimensionS) == 0){
			                                                    //((DesignatorContext)_localctx).typeS =  v.getInfoType() ;
			                                                    ((DesignatorContext)_localctx).typeS =  "integer"; //v[1,1] => inteiro como tipo nao array
			                                                }else{
			                                                    ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.createMessageDimensionArray(((DesignatorContext)_localctx).array_access.dimensionS,a.getDimension()));
			                                                    //System.out.println("Dimension demasiadas grandes do array "+(((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));
			                                                }
			                                            }
			                                        }
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

	public static class Array_accessContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public boolean response;
		public int dimensionS;
		public Elem_arrayContext elem_array;
		public Elem_arrayContext elem_array() {
			return getRuleContext(Elem_arrayContext.class,0);
		}
		public Array_accessContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Array_accessContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Array_accessContext array_access(IdentifiersTable idTH) throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState(), idTH);
		enterRule(_localctx, 64, RULE_array_access);
		try {
			setState(395);
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
				((Array_accessContext)_localctx).response =  false;
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(390); 
				match(T__19);
				setState(391); 
				((Array_accessContext)_localctx).elem_array = elem_array(idTH);
				setState(392); 
				match(T__20);
				((Array_accessContext)_localctx).response =  true; ((Array_accessContext)_localctx).dimensionS =  ((Array_accessContext)_localctx).elem_array.dimensionS;
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
		public IdentifiersTable idTH;
		public int dimensionS;
		public Single_expressionContext single_expression;
		public List<Single_expressionContext> single_expression() {
			return getRuleContexts(Single_expressionContext.class);
		}
		public Single_expressionContext single_expression(int i) {
			return getRuleContext(Single_expressionContext.class,i);
		}
		public Elem_arrayContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Elem_arrayContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Elem_arrayContext elem_array(IdentifiersTable idTH) throws RecognitionException {
		Elem_arrayContext _localctx = new Elem_arrayContext(_ctx, getState(), idTH);
		enterRule(_localctx, 66, RULE_elem_array);

		                int dimension = 0;
		           
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); 
			((Elem_arrayContext)_localctx).single_expression = single_expression(idTH);

			                                      dimension++;
			                                      if(!(((Elem_arrayContext)_localctx).single_expression.typeS == "integer"))
			                                           {
			                                            ErrorMessage.errorSemantic((((Elem_arrayContext)_localctx).single_expression!=null?_input.getText(((Elem_arrayContext)_localctx).single_expression.start,((Elem_arrayContext)_localctx).single_expression.stop):null),((Elem_arrayContext)_localctx).single_expression.line,((Elem_arrayContext)_localctx).single_expression.pos,ErrorMessage.createMessageType(((Elem_arrayContext)_localctx).single_expression.typeS,"integer"));
			                                           }
			                                    
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(399); 
				match(T__7);
				setState(400); 
				((Elem_arrayContext)_localctx).single_expression = single_expression(idTH);

				                                        dimension++;
				                                        if(!(((Elem_arrayContext)_localctx).single_expression.typeS == "integer")){
				                                            ErrorMessage.errorSemantic((((Elem_arrayContext)_localctx).single_expression!=null?_input.getText(((Elem_arrayContext)_localctx).single_expression.start,((Elem_arrayContext)_localctx).single_expression.stop):null),((Elem_arrayContext)_localctx).single_expression.line,((Elem_arrayContext)_localctx).single_expression.pos,ErrorMessage.createMessageType(((Elem_arrayContext)_localctx).single_expression.typeS,"integer"));
				                                        }

				                                    
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((Elem_arrayContext)_localctx).dimensionS =  dimension;
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
		public IdentifiersTable idTH;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Sub_prg_argsContext sub_prg_args() {
			return getRuleContext(Sub_prg_argsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Function_callContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Function_callContext function_call(IdentifiersTable idTH) throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState(), idTH);
		enterRule(_localctx, 68, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); 
			identifier();
			setState(411); 
			match(T__25);
			setState(412); 
			sub_prg_args(idTH);
			setState(413); 
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
		public IdentifiersTable idTH;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Sub_prg_argsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Sub_prg_argsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Sub_prg_argsContext sub_prg_args(IdentifiersTable idTH) throws RecognitionException {
		Sub_prg_argsContext _localctx = new Sub_prg_argsContext(_ctx, getState(), idTH);
		enterRule(_localctx, 70, RULE_sub_prg_args);
		try {
			setState(417);
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
				setState(416); 
				args(idTH);
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
		public IdentifiersTable idTH;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final ArgsContext args(IdentifiersTable idTH) throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState(), idTH);
		enterRule(_localctx, 72, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); 
			expression(idTH);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(420); 
				match(T__7);
				setState(421); 
				expression(idTH);
				}
				}
				setState(426);
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
		public IdentifiersTable idTH;
		public String typeS;
		public int line;
		public int pos;
		public Single_expressionContext s1;
		public Rel_opContext rel_op;
		public Single_expressionContext s2;
		public List<Single_expressionContext> single_expression() {
			return getRuleContexts(Single_expressionContext.class);
		}
		public Single_expressionContext single_expression(int i) {
			return getRuleContext(Single_expressionContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final ExpressionContext expression(IdentifiersTable idTH) throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState(), idTH);
		enterRule(_localctx, 74, RULE_expression);

		                ((ExpressionContext)_localctx).typeS =  null;
		                boolean correctType = true;
		                boolean relationExp = false;
		            
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); 
			((ExpressionContext)_localctx).s1 = single_expression(idTH);
			((ExpressionContext)_localctx).line =  ((ExpressionContext)_localctx).s1.line; ((ExpressionContext)_localctx).pos =  ((ExpressionContext)_localctx).s1.pos;
			setState(433);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(429); 
				((ExpressionContext)_localctx).rel_op = rel_op();
				setState(430); 
				((ExpressionContext)_localctx).s2 = single_expression(idTH);
				   relationExp = true;
				                    if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).matches("([=!<>]=|[<>])")){ // ! in
				                        if((((ExpressionContext)_localctx).s1.typeS != null) && ((ExpressionContext)_localctx).s1.typeS.equals(((ExpressionContext)_localctx).rel_op.typeS)){
				                            if((((ExpressionContext)_localctx).s2.typeS !=null) && ((ExpressionContext)_localctx).rel_op.typeS.equals(((ExpressionContext)_localctx).s2.typeS)){
				                                ((ExpressionContext)_localctx).typeS =  "boolean";
				                            }else{
				                                System.out.print("expression > ");
				                                ErrorMessage.errorSemantic((((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null), ((ExpressionContext)_localctx).s2.line, ((ExpressionContext)_localctx).s2.pos, ErrorMessage.createMessageType(((ExpressionContext)_localctx).s2.typeS,((ExpressionContext)_localctx).rel_op.typeS));
				                                correctType = false;
				                            }
				                        }else{
				                            System.out.print("expression > ");
				                            ErrorMessage.errorSemantic((((ExpressionContext)_localctx).s1!=null?_input.getText(((ExpressionContext)_localctx).s1.start,((ExpressionContext)_localctx).s1.stop):null), ((ExpressionContext)_localctx).s1.line, ((ExpressionContext)_localctx).s1.pos, ErrorMessage.createMessageType(((ExpressionContext)_localctx).s1.typeS,((ExpressionContext)_localctx).rel_op.typeS));
				                            correctType = false;
				                        }
				                    }else if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("in")){

				                        if((((ExpressionContext)_localctx).s1.typeS != null) && (((ExpressionContext)_localctx).s1.typeS.equals("integer"))){
				                            if((((ExpressionContext)_localctx).s2.typeS != null) && (((ExpressionContext)_localctx).s2.typeS.equals("set"))){
				                                ((ExpressionContext)_localctx).typeS =  "boolean" ;
				                            }else{
				                                System.out.print("expression > ");
				                                ErrorMessage.errorSemantic((((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null), ((ExpressionContext)_localctx).s2.line, ((ExpressionContext)_localctx).s2.pos, ErrorMessage.createMessageType(((ExpressionContext)_localctx).s2.typeS,"set"));
				                                correctType = false;
				                            }
				                        }else{
				                            System.out.print("expression > ");
				                            ErrorMessage.errorSemantic((((ExpressionContext)_localctx).s1!=null?_input.getText(((ExpressionContext)_localctx).s1.start,((ExpressionContext)_localctx).s1.stop):null), ((ExpressionContext)_localctx).s1.line, ((ExpressionContext)_localctx).s1.pos, ErrorMessage.createMessageType(((ExpressionContext)_localctx).s1.typeS,((ExpressionContext)_localctx).rel_op.typeS));
				                            correctType = false;
				                        }
				                    }

				                
				}
			}


			                if(correctType){
			                    if(!relationExp){
			                        ((ExpressionContext)_localctx).typeS =  ((ExpressionContext)_localctx).s1.typeS;
			                    }else{
			                        ((ExpressionContext)_localctx).typeS =  "boolean";
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
		public IdentifiersTable idTH;
		public String typeS;
		public int line;
		public int pos;
		public TermContext t1;
		public TermContext term;
		public Add_opContext add_op;
		public TermContext t2;
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
		public Single_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Single_expressionContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Single_expressionContext single_expression(IdentifiersTable idTH) throws RecognitionException {
		Single_expressionContext _localctx = new Single_expressionContext(_ctx, getState(), idTH);
		enterRule(_localctx, 76, RULE_single_expression);

		                    ((Single_expressionContext)_localctx).typeS =  null;
		                    boolean correctType = true;
		                    boolean firstTime = true;
		                    String leftType = null;

		                    //Tratar os erros com mais especificaçoes
		                    LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();
		                  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); 
			((Single_expressionContext)_localctx).t1 = ((Single_expressionContext)_localctx).term = term(idTH);
			((Single_expressionContext)_localctx).line =  ((Single_expressionContext)_localctx).term.line; ((Single_expressionContext)_localctx).pos =  ((Single_expressionContext)_localctx).term.pos; errorManagement.add(new ErrorInfo((((Single_expressionContext)_localctx).t1!=null?_input.getText(((Single_expressionContext)_localctx).t1.start,((Single_expressionContext)_localctx).t1.stop):null),((Single_expressionContext)_localctx).t1.line,((Single_expressionContext)_localctx).t1.pos));
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				{
				setState(439); 
				((Single_expressionContext)_localctx).add_op = add_op();
				setState(440); 
				((Single_expressionContext)_localctx).t2 = ((Single_expressionContext)_localctx).term = term(idTH);

				                                        errorManagement.add(new ErrorInfo((((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null),((Single_expressionContext)_localctx).add_op.line,((Single_expressionContext)_localctx).add_op.pos));
				                                        errorManagement.add(new ErrorInfo((((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null),((Single_expressionContext)_localctx).t2.line,((Single_expressionContext)_localctx).t2.pos));


				                                        if(firstTime){
				                                            firstTime = false;
				                                            if((((Single_expressionContext)_localctx).t1.typeS != null) && ((Single_expressionContext)_localctx).t1.typeS.equals(((Single_expressionContext)_localctx).add_op.typeS)){
				                                                if((((Single_expressionContext)_localctx).t2.typeS != null) && ((Single_expressionContext)_localctx).add_op.typeS.equals(((Single_expressionContext)_localctx).t2.typeS)){
				                                                    leftType = ((Single_expressionContext)_localctx).add_op.typeS;

				                                                }else{
				                                                    System.out.print("single_expression1 > ");
				                                                    ErrorMessage.errorSemantic((((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null), ((Single_expressionContext)_localctx).t2.line, ((Single_expressionContext)_localctx).t2.pos, ErrorMessage.createMessageType(((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).add_op.typeS));
				                                                    correctType = false;

				                                                }
				                                            }else{
				                                                System.out.print("single_expression2 > ");
				                                                ErrorMessage.errorSemantic((((Single_expressionContext)_localctx).t1!=null?_input.getText(((Single_expressionContext)_localctx).t1.start,((Single_expressionContext)_localctx).t1.stop):null), ((Single_expressionContext)_localctx).t1.line, ((Single_expressionContext)_localctx).t1.pos, ErrorMessage.createMessageType(((Single_expressionContext)_localctx).t1.typeS,((Single_expressionContext)_localctx).add_op.typeS));
				                                                correctType = false;

				                                            }
				                                        }else{
				                                            errorManagement.pop();
				                                            errorManagement.pop();

				                                            if( (leftType != null) && leftType.equals(((Single_expressionContext)_localctx).add_op.typeS)){
				                                                if((((Single_expressionContext)_localctx).t2.typeS != null) && ((Single_expressionContext)_localctx).add_op.typeS.equals(((Single_expressionContext)_localctx).t2.typeS)){
				                                                    leftType = ((Single_expressionContext)_localctx).add_op.typeS;
				                                                }else{
				                                                    System.out.print("single_expression3 > ");
				                                                    ErrorMessage.errorSemantic((((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null), ((Single_expressionContext)_localctx).t2.line, ((Single_expressionContext)_localctx).t2.pos, ErrorMessage.createMessageType(((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).add_op.typeS));
				                                                    correctType = false;
				                                                }
				                                            }else{
				                                                System.out.print("single_expression4 > ");
				                                                ErrorMessage.errorSemantic(errorManagement.get(0).getIdentifier().concat((((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null)).concat((((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null)), errorManagement.get(0).getLine(), errorManagement.get(0).getPos(), ErrorMessage.createMessageType(leftType,((Single_expressionContext)_localctx).add_op.typeS));

				                                                correctType = false;
				                                            }

				                                        }

				                                     
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                        if(correctType == true){
			                            ((Single_expressionContext)_localctx).typeS =  ((Single_expressionContext)_localctx).t1.typeS;
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
		public IdentifiersTable idTH;
		public String typeS;
		public int line;
		public int pos;
		public FactorContext f1;
		public Mul_opContext mul_op;
		public FactorContext f2;
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
		public TermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TermContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final TermContext term(IdentifiersTable idTH) throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState(), idTH);
		enterRule(_localctx, 78, RULE_term);

		        ((TermContext)_localctx).typeS =  null;
		        boolean correctType = true;
		        boolean firstTime = true;
		        String leftType = null;

		        //Tratar os erros com mais especificaçoes
		        LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();


		     
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); 
			((TermContext)_localctx).f1 = factor(idTH);
			 ((TermContext)_localctx).line =  ((TermContext)_localctx).f1.line; ((TermContext)_localctx).pos =  ((TermContext)_localctx).f1.pos;  errorManagement.add(new ErrorInfo((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null),((TermContext)_localctx).f1.line,((TermContext)_localctx).f1.pos));
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				{
				setState(452); 
				((TermContext)_localctx).mul_op = mul_op();
				setState(453); 
				((TermContext)_localctx).f2 = factor(idTH);


				                                errorManagement.add(new ErrorInfo((((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null),((TermContext)_localctx).mul_op.line,((TermContext)_localctx).mul_op.pos));
				                                errorManagement.add(new ErrorInfo((((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null),((TermContext)_localctx).f2.line,((TermContext)_localctx).f2.pos));

				                                if(firstTime){
				                                    firstTime = false;
				                                    if((((TermContext)_localctx).f1.typeS != null) && ((TermContext)_localctx).f1.typeS.equals(((TermContext)_localctx).mul_op.typeS)){
				                                        if((((TermContext)_localctx).f2.typeS != null) && ((TermContext)_localctx).mul_op.typeS.equals(((TermContext)_localctx).f2.typeS)){
				                                            leftType = ((TermContext)_localctx).mul_op.typeS;
				                                        }else{
				                                            System.out.print("term1 > ");
				                                            ErrorMessage.errorSemantic((((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null), ((TermContext)_localctx).f2.line, ((TermContext)_localctx).f2.pos, ErrorMessage.createMessageType(((TermContext)_localctx).f2.typeS,((TermContext)_localctx).mul_op.typeS));
				                                            correctType = false;
				                                        }
				                                    }else{
				                                        System.out.print("term2 > ");
				                                        ErrorMessage.errorSemantic((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null), ((TermContext)_localctx).f1.line, ((TermContext)_localctx).f1.pos, ErrorMessage.createMessageType(((TermContext)_localctx).f1.typeS,((TermContext)_localctx).mul_op.typeS));
				                                        correctType = false;
				                                    }
				                                }else{

				                                        errorManagement.pop();
				                                        errorManagement.pop();

				                                        if((leftType != null) && leftType.equals(((TermContext)_localctx).mul_op.typeS)){
				                                            if((((TermContext)_localctx).f2.typeS != null) && ((TermContext)_localctx).mul_op.typeS.equals(((TermContext)_localctx).f2.typeS)){
				                                                leftType = ((TermContext)_localctx).mul_op.typeS;
				                                            }else{
				                                                System.out.print("term3 > ");
				                                                ErrorMessage.errorSemantic((((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null), ((TermContext)_localctx).f2.line, ((TermContext)_localctx).f2.pos, ErrorMessage.createMessageType(((TermContext)_localctx).f2.typeS,((TermContext)_localctx).mul_op.typeS));
				                                                correctType = false;
				                                            }
				                                        }else{
				                                            System.out.print("term4 > ");
				                                            ErrorMessage.errorSemantic(errorManagement.get(0).getIdentifier().concat((((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null)).concat((((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null)), errorManagement.get(0).getLine(), errorManagement.get(0).getPos(), ErrorMessage.createMessageType(leftType,((TermContext)_localctx).mul_op.typeS));
				                                            correctType = false;
				                                        }

				                                }

				                          
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            if(correctType == true){
			                ((TermContext)_localctx).typeS =  ((TermContext)_localctx).f1.typeS;
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
		public IdentifiersTable idTH;
		public String typeS;
		public int line;
		public int pos;
		public Inic_varContext inic_var;
		public DesignatorContext designator;
		public ExpressionContext expression;
		public FactorContext f1;
		public SpecialFunctionsContext specialFunctions;
		public Inic_varContext inic_var() {
			return getRuleContext(Inic_varContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public SpecialFunctionsContext specialFunctions() {
			return getRuleContext(SpecialFunctionsContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FactorContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final FactorContext factor(IdentifiersTable idTH) throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState(), idTH);
		enterRule(_localctx, 80, RULE_factor);

		            ((FactorContext)_localctx).typeS =  null;
		       
		try {
			setState(482);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463); 
				((FactorContext)_localctx).inic_var = inic_var(idTH);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).inic_var.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).inic_var.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).inic_var.pos;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466); 
				((FactorContext)_localctx).designator = designator(idTH);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).designator.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).designator.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).designator.pos;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469); 
				match(T__25);
				setState(470); 
				((FactorContext)_localctx).expression = expression(idTH);
				setState(471); 
				match(T__26);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).expression.typeS; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(474); 
				match(T__28);
				setState(475); 
				((FactorContext)_localctx).f1 = factor(idTH);
				 if(((FactorContext)_localctx).f1.typeS.equals("boolean")){((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).f1.typeS;}else{((FactorContext)_localctx).typeS =  null; ErrorMessage.errorSemantic((((FactorContext)_localctx).f1!=null?_input.getText(((FactorContext)_localctx).f1.start,((FactorContext)_localctx).f1.stop):null),((FactorContext)_localctx).f1.line,((FactorContext)_localctx).f1.pos,ErrorMessage.createMessageType(((FactorContext)_localctx).f1.typeS,"boolean"));}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(478); 
				function_call(idTH);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(479); 
				((FactorContext)_localctx).specialFunctions = specialFunctions(idTH);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).specialFunctions.typeS;
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
		public IdentifiersTable idTH;
		public String typeS;
		public TailContext tail;
		public HeadContext head;
		public ConsContext cons;
		public MemberContext member;
		public Is_emptyContext is_empty;
		public LengthContext length;
		public DeleteContext delete;
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
		public SpecialFunctionsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SpecialFunctionsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final SpecialFunctionsContext specialFunctions(IdentifiersTable idTH) throws RecognitionException {
		SpecialFunctionsContext _localctx = new SpecialFunctionsContext(_ctx, getState(), idTH);
		enterRule(_localctx, 82, RULE_specialFunctions);
		try {
			setState(505);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(484); 
				((SpecialFunctionsContext)_localctx).tail = tail(idTH);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).tail.typeS;
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(487); 
				((SpecialFunctionsContext)_localctx).head = head(idTH);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).head.typeS;
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(490); 
				((SpecialFunctionsContext)_localctx).cons = cons(idTH);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).cons.typeS;
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 4);
				{
				setState(493); 
				((SpecialFunctionsContext)_localctx).member = member(idTH);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).member.typeS;
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 5);
				{
				setState(496); 
				((SpecialFunctionsContext)_localctx).is_empty = is_empty(idTH);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).is_empty.typeS;
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 6);
				{
				setState(499); 
				((SpecialFunctionsContext)_localctx).length = length(idTH);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).length.typeS;
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 7);
				{
				setState(502); 
				((SpecialFunctionsContext)_localctx).delete = delete(idTH);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).delete.typeS;
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
		public String typeS;
		public int line;
		public int pos;
		public Token a;
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
		try {
			setState(515);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(507); 
				((Add_opContext)_localctx).a = match(T__17);
				((Add_opContext)_localctx).typeS =  "integer"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(509); 
				((Add_opContext)_localctx).a = match(T__18);
				((Add_opContext)_localctx).typeS =  "integer"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(511); 
				((Add_opContext)_localctx).a = match(T__29);
				((Add_opContext)_localctx).typeS =  "boolean"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(513); 
				((Add_opContext)_localctx).a = match(T__30);
				((Add_opContext)_localctx).typeS =  "set"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
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

	public static class Mul_opContext extends ParserRuleContext {
		public String typeS;
		public int line;
		public int pos;
		public Token m;
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
		try {
			setState(525);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(517); 
				((Mul_opContext)_localctx).m = match(T__31);
				((Mul_opContext)_localctx).typeS =  "integer"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(519); 
				((Mul_opContext)_localctx).m = match(T__32);
				((Mul_opContext)_localctx).typeS =  "integer"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(521); 
				((Mul_opContext)_localctx).m = match(T__33);
				((Mul_opContext)_localctx).typeS =  "boolean"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(523); 
				((Mul_opContext)_localctx).m = match(T__34);
				((Mul_opContext)_localctx).typeS =  "set"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
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

	public static class Rel_opContext extends ParserRuleContext {
		public String typeS;
		public int line;
		public int pos;
		public Token r;
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
		try {
			setState(541);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(527); 
				((Rel_opContext)_localctx).r = match(T__35);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(529); 
				((Rel_opContext)_localctx).r = match(T__36);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(531); 
				((Rel_opContext)_localctx).r = match(T__37);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(533); 
				((Rel_opContext)_localctx).r = match(T__38);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 5);
				{
				setState(535); 
				((Rel_opContext)_localctx).r = match(T__39);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(537); 
				((Rel_opContext)_localctx).r = match(T__40);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 7);
				{
				setState(539); 
				((Rel_opContext)_localctx).r = match(T__41);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
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

	public static class Write_statementContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public Write_exprContext write_expr() {
			return getRuleContext(Write_exprContext.class,0);
		}
		public Print_whatContext print_what() {
			return getRuleContext(Print_whatContext.class,0);
		}
		public Write_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Write_statementContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Write_statementContext write_statement(IdentifiersTable idTH) throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState(), idTH);
		enterRule(_localctx, 90, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543); 
			write_expr();
			setState(544); 
			match(T__25);
			setState(545); 
			print_what(idTH);
			setState(546); 
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
			setState(548);
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
		public IdentifiersTable idTH;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_whatContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Print_whatContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Print_whatContext print_what(IdentifiersTable idTH) throws RecognitionException {
		Print_whatContext _localctx = new Print_whatContext(_ctx, getState(), idTH);
		enterRule(_localctx, 94, RULE_print_what);
		try {
			setState(552);
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
				setState(551); 
				expression(idTH);
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
			setState(554); 
			match(T__44);
			setState(555); 
			match(T__25);
			setState(556); 
			identifier();
			setState(557); 
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
		public IdentifiersTable idTH;
		public If_then_else_statContext if_then_else_stat() {
			return getRuleContext(If_then_else_statContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Conditional_statementContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Conditional_statementContext conditional_statement(IdentifiersTable idTH) throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState(), idTH);
		enterRule(_localctx, 98, RULE_conditional_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559); 
			if_then_else_stat(idTH);
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
		public IdentifiersTable idTH;
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Iterative_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Iterative_statementContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Iterative_statementContext iterative_statement(IdentifiersTable idTH) throws RecognitionException {
		Iterative_statementContext _localctx = new Iterative_statementContext(_ctx, getState(), idTH);
		enterRule(_localctx, 100, RULE_iterative_statement);
		try {
			setState(563);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(561); 
				for_stat(idTH);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(562); 
				while_stat(idTH);
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
		public IdentifiersTable idTH;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_expressionContext else_expression() {
			return getRuleContext(Else_expressionContext.class,0);
		}
		public If_then_else_statContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_then_else_statContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final If_then_else_statContext if_then_else_stat(IdentifiersTable idTH) throws RecognitionException {
		If_then_else_statContext _localctx = new If_then_else_statContext(_ctx, getState(), idTH);
		enterRule(_localctx, 102, RULE_if_then_else_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); 
			match(T__45);
			setState(566); 
			match(T__25);
			setState(567); 
			expression(idTH);
			setState(568); 
			match(T__26);
			setState(569); 
			match(T__46);
			setState(570); 
			match(T__1);
			setState(571); 
			statements(idTH);
			setState(572); 
			match(T__4);
			setState(573); 
			else_expression(idTH);
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
		public IdentifiersTable idTH;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Else_expressionContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Else_expressionContext else_expression(IdentifiersTable idTH) throws RecognitionException {
		Else_expressionContext _localctx = new Else_expressionContext(_ctx, getState(), idTH);
		enterRule(_localctx, 104, RULE_else_expression);
		try {
			setState(581);
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
				setState(576); 
				match(T__47);
				setState(577); 
				match(T__1);
				setState(578); 
				statements(idTH);
				setState(579); 
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
		public IdentifiersTable idTH;
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
		public For_statContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public For_statContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final For_statContext for_stat(IdentifiersTable idTH) throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState(), idTH);
		enterRule(_localctx, 106, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); 
			match(T__48);
			setState(584); 
			match(T__25);
			setState(585); 
			interval();
			setState(586); 
			match(T__26);
			setState(587); 
			step();
			setState(588); 
			satisfy(idTH);
			setState(589); 
			match(T__1);
			setState(590); 
			statements(idTH);
			setState(591); 
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
			setState(593); 
			identifier();
			setState(594); 
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
			setState(600);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(596); 
				match(T__41);
				setState(597); 
				range();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(598); 
				match(T__49);
				setState(599); 
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
			setState(602); 
			minimum();
			setState(603); 
			match(T__50);
			setState(604); 
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
			setState(608);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(606); 
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(607); 
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
			setState(612);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(610); 
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(611); 
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
			setState(618);
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
				setState(615); 
				up_down();
				setState(616); 
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
			setState(620);
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
		public IdentifiersTable idTH;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SatisfyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SatisfyContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final SatisfyContext satisfy(IdentifiersTable idTH) throws RecognitionException {
		SatisfyContext _localctx = new SatisfyContext(_ctx, getState(), idTH);
		enterRule(_localctx, 122, RULE_satisfy);
		try {
			setState(625);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(623); 
				match(T__53);
				setState(624); 
				expression(idTH);
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
		public IdentifiersTable idTH;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public While_statContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final While_statContext while_stat(IdentifiersTable idTH) throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState(), idTH);
		enterRule(_localctx, 124, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627); 
			match(T__54);
			setState(628); 
			match(T__25);
			setState(629); 
			expression(idTH);
			setState(630); 
			match(T__26);
			setState(631); 
			match(T__1);
			setState(632); 
			statements(idTH);
			setState(633); 
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
			setState(635); 
			succ_pred();
			setState(636); 
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
			setState(638);
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
		public IdentifiersTable idTH;
		public String typeS;
		public Token t;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TailContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TailContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final TailContext tail(IdentifiersTable idTH) throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState(), idTH);
		enterRule(_localctx, 130, RULE_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640); 
			((TailContext)_localctx).t = match(T__57);
			setState(641); 
			match(T__25);
			setState(642); 
			((TailContext)_localctx).expression = expression(idTH);
			setState(643); 
			match(T__26);
			if((((TailContext)_localctx).expression.typeS != null) && ((TailContext)_localctx).expression.typeS.equals("sequence")){ ((TailContext)_localctx).typeS =  ((TailContext)_localctx).expression.typeS; }else{ ErrorMessage.errorSemantic((((TailContext)_localctx).t!=null?((TailContext)_localctx).t.getText():null).concat("(").concat((((TailContext)_localctx).expression!=null?_input.getText(((TailContext)_localctx).expression.start,((TailContext)_localctx).expression.stop):null)).concat(")"),(((TailContext)_localctx).t!=null?((TailContext)_localctx).t.getLine():0),(((TailContext)_localctx).t!=null?((TailContext)_localctx).t.getCharPositionInLine():0),ErrorMessage.createMessageType(((TailContext)_localctx).expression.typeS,"sequence"));}
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
		public IdentifiersTable idTH;
		public String typeS;
		public Token h;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public HeadContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final HeadContext head(IdentifiersTable idTH) throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState(), idTH);
		enterRule(_localctx, 132, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646); 
			((HeadContext)_localctx).h = match(T__58);
			setState(647); 
			match(T__25);
			setState(648); 
			((HeadContext)_localctx).expression = expression(idTH);
			setState(649); 
			match(T__26);
			if((((HeadContext)_localctx).expression.typeS != null) && ((HeadContext)_localctx).expression.typeS.equals("sequence")){ ((HeadContext)_localctx).typeS =  "integer"; }else{ ErrorMessage.errorSemantic((((HeadContext)_localctx).h!=null?((HeadContext)_localctx).h.getText():null).concat("(").concat((((HeadContext)_localctx).expression!=null?_input.getText(((HeadContext)_localctx).expression.start,((HeadContext)_localctx).expression.stop):null)).concat(")"),(((HeadContext)_localctx).h!=null?((HeadContext)_localctx).h.getLine():0),(((HeadContext)_localctx).h!=null?((HeadContext)_localctx).h.getCharPositionInLine():0),ErrorMessage.createMessageType(((HeadContext)_localctx).expression.typeS,"sequence"));}
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
		public IdentifiersTable idTH;
		public String typeS;
		public Token c;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ConsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final ConsContext cons(IdentifiersTable idTH) throws RecognitionException {
		ConsContext _localctx = new ConsContext(_ctx, getState(), idTH);
		enterRule(_localctx, 134, RULE_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652); 
			((ConsContext)_localctx).c = match(T__59);
			setState(653); 
			match(T__25);
			setState(654); 
			((ConsContext)_localctx).e1 = expression(idTH);
			setState(655); 
			match(T__7);
			setState(656); 
			((ConsContext)_localctx).e2 = expression(idTH);
			setState(657); 
			match(T__26);

			            if((((ConsContext)_localctx).e1.typeS != null) && ((ConsContext)_localctx).e1.typeS.equals("integer") ){
			                if((((ConsContext)_localctx).e2.typeS != null) && ((ConsContext)_localctx).e2.typeS.equals("sequence")){
			                    ((ConsContext)_localctx).typeS =  "sequence";
			                }else{
			                        ErrorMessage.errorSemantic((((ConsContext)_localctx).e2!=null?_input.getText(((ConsContext)_localctx).e2.start,((ConsContext)_localctx).e2.stop):null),((ConsContext)_localctx).e2.line,((ConsContext)_localctx).e2.pos,ErrorMessage.createMessageType(((ConsContext)_localctx).e2.typeS,"sequence"));
			                }
			            }else{
			                    ErrorMessage.errorSemantic((((ConsContext)_localctx).e1!=null?_input.getText(((ConsContext)_localctx).e1.start,((ConsContext)_localctx).e1.stop):null),((ConsContext)_localctx).e1.line,((ConsContext)_localctx).e1.pos,ErrorMessage.createMessageType(((ConsContext)_localctx).e1.typeS,"integer"));
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

	public static class DeleteContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public String typeS;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeleteContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final DeleteContext delete(IdentifiersTable idTH) throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState(), idTH);
		enterRule(_localctx, 136, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660); 
			match(T__60);
			setState(661); 
			match(T__25);
			setState(662); 
			((DeleteContext)_localctx).e1 = expression(idTH);
			setState(663); 
			match(T__7);
			setState(664); 
			((DeleteContext)_localctx).e2 = expression(idTH);
			setState(665); 
			match(T__26);

			            if((((DeleteContext)_localctx).e1.typeS != null) && ((DeleteContext)_localctx).e1.typeS.equals("integer") ){
			                if((((DeleteContext)_localctx).e2.typeS != null) && ((DeleteContext)_localctx).e2.typeS.equals("sequence")){
			                    ((DeleteContext)_localctx).typeS =  "sequence";
			                }else{
			                    ErrorMessage.errorSemantic((((DeleteContext)_localctx).e2!=null?_input.getText(((DeleteContext)_localctx).e2.start,((DeleteContext)_localctx).e2.stop):null),((DeleteContext)_localctx).e2.line,((DeleteContext)_localctx).e2.pos,ErrorMessage.createMessageType(((DeleteContext)_localctx).e2.typeS,"sequence"));
			                }
			            }else{
			                ErrorMessage.errorSemantic((((DeleteContext)_localctx).e1!=null?_input.getText(((DeleteContext)_localctx).e1.start,((DeleteContext)_localctx).e1.stop):null),((DeleteContext)_localctx).e1.line,((DeleteContext)_localctx).e1.pos,ErrorMessage.createMessageType(((DeleteContext)_localctx).e1.typeS,"integer"));
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
			setState(668); 
			match(T__61);
			setState(669); 
			match(T__25);
			setState(670); 
			identifier();
			setState(671); 
			match(T__7);
			setState(672); 
			identifier();
			setState(673); 
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
			setState(675); 
			match(T__62);
			setState(676); 
			match(T__25);
			setState(677); 
			identifier();
			setState(678); 
			match(T__7);
			setState(679); 
			identifier();
			setState(680); 
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
		public IdentifiersTable idTH;
		public String typeS;
		public ExpressionContext e1;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_emptyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Is_emptyContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Is_emptyContext is_empty(IdentifiersTable idTH) throws RecognitionException {
		Is_emptyContext _localctx = new Is_emptyContext(_ctx, getState(), idTH);
		enterRule(_localctx, 142, RULE_is_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682); 
			match(T__63);
			setState(683); 
			match(T__25);
			setState(684); 
			((Is_emptyContext)_localctx).e1 = expression(idTH);
			setState(685); 
			match(T__26);

			            if((((Is_emptyContext)_localctx).e1.typeS != null) && ((Is_emptyContext)_localctx).e1.typeS.equals("sequence")){
			                ((Is_emptyContext)_localctx).typeS =  "boolean";
			            }else{
			                ErrorMessage.errorSemantic((((Is_emptyContext)_localctx).e1!=null?_input.getText(((Is_emptyContext)_localctx).e1.start,((Is_emptyContext)_localctx).e1.stop):null),((Is_emptyContext)_localctx).e1.line,((Is_emptyContext)_localctx).e1.pos,ErrorMessage.createMessageType(((Is_emptyContext)_localctx).e1.typeS,"sequence"));
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

	public static class LengthContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public String typeS;
		public ExpressionContext e1;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LengthContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final LengthContext length(IdentifiersTable idTH) throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState(), idTH);
		enterRule(_localctx, 144, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688); 
			match(T__64);
			setState(689); 
			match(T__25);
			setState(690); 
			((LengthContext)_localctx).e1 = expression(idTH);
			setState(691); 
			match(T__26);

			          if((((LengthContext)_localctx).e1.typeS != null) && ((LengthContext)_localctx).e1.typeS.equals("sequence")){
			              ((LengthContext)_localctx).typeS =  "integer";
			          }else{
			              ErrorMessage.errorSemantic((((LengthContext)_localctx).e1!=null?_input.getText(((LengthContext)_localctx).e1.start,((LengthContext)_localctx).e1.stop):null),((LengthContext)_localctx).e1.line,((LengthContext)_localctx).e1.pos,ErrorMessage.createMessageType(((LengthContext)_localctx).e1.typeS,"sequence"));
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

	public static class MemberContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public String typeS;
		public ExpressionContext e;
		public IdentifierContext i;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MemberContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final MemberContext member(IdentifiersTable idTH) throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState(), idTH);
		enterRule(_localctx, 146, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694); 
			match(T__65);
			setState(695); 
			match(T__25);
			setState(696); 
			((MemberContext)_localctx).e = expression(idTH);
			setState(697); 
			match(T__7);
			setState(698); 
			((MemberContext)_localctx).i = identifier();
			setState(699); 
			match(T__26);


			          String type = null;

			          //Pre-Condicao : verificar se existe o identificador na tabela de identificador, caso nao existir significa que é um inteiro ou que nao foi declarado !!!
			          if(_localctx.idTH.getIdentifiersTable().containsKey((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null))){
			            Var v = (Var) _localctx.idTH.getIdentifiersTable().get((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null));
			            if( v != null){
			                type = v.getInfoType();
			                if((type != null) && type.equals("sequence")){
			                    if((((MemberContext)_localctx).e.typeS != null) && ((MemberContext)_localctx).e.typeS.equals("integer")){
			                        ((MemberContext)_localctx).typeS =  "boolean";
			                    }else{
			                        ErrorMessage.errorSemantic((((MemberContext)_localctx).e!=null?_input.getText(((MemberContext)_localctx).e.start,((MemberContext)_localctx).e.stop):null),((MemberContext)_localctx).e.line,((MemberContext)_localctx).e.pos,ErrorMessage.createMessageType(((MemberContext)_localctx).e.typeS,"integer"));
			                    }
			                }else{
			                    ErrorMessage.errorSemantic((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null),((MemberContext)_localctx).i.line,((MemberContext)_localctx).i.pos,ErrorMessage.createMessageType(type,"sequence"));
			                }
			            }
			            //Normally doesn't need else statement.
			          }else{
			            ErrorMessage.errorSemantic((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null), ((MemberContext)_localctx).i.line, ((MemberContext)_localctx).i.pos,ErrorMessage.errorStatements);
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
			setState(702); 
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
		public int line;
		public int pos;
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
			setState(704); 
			((NumberContext)_localctx).NBR = match(NBR);
			((NumberContext)_localctx).numberS =  Integer.parseInt((((NumberContext)_localctx).NBR!=null?((NumberContext)_localctx).NBR.getText():null));((NumberContext)_localctx).line =  (((NumberContext)_localctx).NBR!=null?((NumberContext)_localctx).NBR.getLine():0);((NumberContext)_localctx).pos =  (((NumberContext)_localctx).NBR!=null?((NumberContext)_localctx).NBR.getCharPositionInLine():0);
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
		public int line;
		public int pos;
		public Token ID;
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
			setState(707); 
			((IdentifierContext)_localctx).ID = match(ID);
			((IdentifierContext)_localctx).line =  (((IdentifierContext)_localctx).ID!=null?((IdentifierContext)_localctx).ID.getLine():0);((IdentifierContext)_localctx).pos =  (((IdentifierContext)_localctx).ID!=null?((IdentifierContext)_localctx).ID.getCharPositionInLine():0);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u02c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\7\4\u00a9\n\4\f\4\16\4\u00ac\13\4\3\5\3\5\3\5\3\5\5\5\u00b2"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c0\n\7\f\7"+
		"\16\7\u00c3\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00ce\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00dd\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\7\13\u00e5\n\13\f\13\16\13\u00e8\13\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f8\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0102\n\r\3\16\3\16\3\16\5\16\u0107\n"+
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u0110\n\20\f\20\16\20\u0113"+
		"\13\20\3\21\3\21\5\21\u0117\n\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u011f"+
		"\n\23\3\24\3\24\3\24\7\24\u0124\n\24\f\24\16\24\u0127\13\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0132\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\5\31\u0146\n\31\3\32\3\32\3\32\7\32\u014b\n\32\f\32\16\32\u014e\13\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0157\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u015e\n\35\3\36\7\36\u0161\n\36\f\36\16\36\u0164\13\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u017d\n\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u018e\n\"\3#\3#\3#\3#\3#\3#"+
		"\7#\u0196\n#\f#\16#\u0199\13#\3#\3#\3$\3$\3$\3$\3$\3%\3%\5%\u01a4\n%\3"+
		"&\3&\3&\7&\u01a9\n&\f&\16&\u01ac\13&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01b4"+
		"\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\7(\u01be\n(\f(\16(\u01c1\13(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\7)\u01cb\n)\f)\16)\u01ce\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01e5\n*\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01fc\n+\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\5,\u0206\n,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0210\n-\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0220\n.\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\61\3\61\5\61\u022b\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\5\64\u0236\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u0248\n\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39\59\u025b\n9\3:\3:\3:\3:\3;\3"+
		";\5;\u0263\n;\3<\3<\5<\u0267\n<\3=\3=\3=\3=\5=\u026d\n=\3>\3>\3?\3?\3"+
		"?\5?\u0274\n?\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3B\3B\3C\3C\3C\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3"+
		"J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3M\3M\3M\3N\3N\3N\3N\2\2O\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\2\5\3\2-.\3\2\66\67\3\2:;\u02c3\2"+
		"\u009c\3\2\2\2\4\u00a0\3\2\2\2\6\u00aa\3\2\2\2\b\u00b1\3\2\2\2\n\u00b3"+
		"\3\2\2\2\f\u00b9\3\2\2\2\16\u00c6\3\2\2\2\20\u00cd\3\2\2\2\22\u00dc\3"+
		"\2\2\2\24\u00de\3\2\2\2\26\u00f7\3\2\2\2\30\u0101\3\2\2\2\32\u0106\3\2"+
		"\2\2\34\u0108\3\2\2\2\36\u010c\3\2\2\2 \u0116\3\2\2\2\"\u0118\3\2\2\2"+
		"$\u011e\3\2\2\2&\u0120\3\2\2\2(\u0128\3\2\2\2*\u0131\3\2\2\2,\u0133\3"+
		"\2\2\2.\u013b\3\2\2\2\60\u0145\3\2\2\2\62\u0147\3\2\2\2\64\u014f\3\2\2"+
		"\2\66\u0156\3\2\2\28\u015d\3\2\2\2:\u0162\3\2\2\2<\u017c\3\2\2\2>\u017e"+
		"\3\2\2\2@\u0183\3\2\2\2B\u018d\3\2\2\2D\u018f\3\2\2\2F\u019c\3\2\2\2H"+
		"\u01a3\3\2\2\2J\u01a5\3\2\2\2L\u01ad\3\2\2\2N\u01b7\3\2\2\2P\u01c4\3\2"+
		"\2\2R\u01e4\3\2\2\2T\u01fb\3\2\2\2V\u0205\3\2\2\2X\u020f\3\2\2\2Z\u021f"+
		"\3\2\2\2\\\u0221\3\2\2\2^\u0226\3\2\2\2`\u022a\3\2\2\2b\u022c\3\2\2\2"+
		"d\u0231\3\2\2\2f\u0235\3\2\2\2h\u0237\3\2\2\2j\u0247\3\2\2\2l\u0249\3"+
		"\2\2\2n\u0253\3\2\2\2p\u025a\3\2\2\2r\u025c\3\2\2\2t\u0262\3\2\2\2v\u0266"+
		"\3\2\2\2x\u026c\3\2\2\2z\u026e\3\2\2\2|\u0273\3\2\2\2~\u0275\3\2\2\2\u0080"+
		"\u027d\3\2\2\2\u0082\u0280\3\2\2\2\u0084\u0282\3\2\2\2\u0086\u0288\3\2"+
		"\2\2\u0088\u028e\3\2\2\2\u008a\u0296\3\2\2\2\u008c\u029e\3\2\2\2\u008e"+
		"\u02a5\3\2\2\2\u0090\u02ac\3\2\2\2\u0092\u02b2\3\2\2\2\u0094\u02b8\3\2"+
		"\2\2\u0096\u02c0\3\2\2\2\u0098\u02c2\3\2\2\2\u009a\u02c5\3\2\2\2\u009c"+
		"\u009d\7\3\2\2\u009d\u009e\5\u009aN\2\u009e\u009f\5\4\3\2\u009f\3\3\2"+
		"\2\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\5\6\4\2\u00a3"+
		"\u00a4\7\6\2\2\u00a4\u00a5\5:\36\2\u00a5\u00a6\7\7\2\2\u00a6\5\3\2\2\2"+
		"\u00a7\u00a9\5\b\5\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\7\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b2\5\n\6\2\u00ae\u00af\5,\27\2\u00af\u00b0\b\5\1\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\t\3\2\2\2\u00b3\u00b4"+
		"\5\f\7\2\u00b4\u00b5\7\b\2\2\u00b5\u00b6\5\22\n\2\u00b6\u00b7\7\t\2\2"+
		"\u00b7\u00b8\b\6\1\2\u00b8\13\3\2\2\2\u00b9\u00ba\5\16\b\2\u00ba\u00c1"+
		"\b\7\1\2\u00bb\u00bc\7\n\2\2\u00bc\u00bd\5\16\b\2\u00bd\u00be\b\7\1\2"+
		"\u00be\u00c0\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\b\7\1\2\u00c5\r\3\2\2\2\u00c6\u00c7\5\u009aN\2\u00c7\u00c8\5\20"+
		"\t\2\u00c8\u00c9\b\b\1\2\u00c9\17\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cc"+
		"\7\13\2\2\u00cc\u00ce\5\26\f\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2"+
		"\u00ce\21\3\2\2\2\u00cf\u00d0\7\f\2\2\u00d0\u00dd\b\n\1\2\u00d1\u00d2"+
		"\7\r\2\2\u00d2\u00dd\b\n\1\2\u00d3\u00d4\7\16\2\2\u00d4\u00dd\b\n\1\2"+
		"\u00d5\u00d6\7\17\2\2\u00d6\u00dd\b\n\1\2\u00d7\u00d8\7\20\2\2\u00d8\u00d9"+
		"\7\21\2\2\u00d9\u00da\5\24\13\2\u00da\u00db\b\n\1\2\u00db\u00dd\3\2\2"+
		"\2\u00dc\u00cf\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d5"+
		"\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd\23\3\2\2\2\u00de\u00df\5\u0098M\2\u00df"+
		"\u00e6\b\13\1\2\u00e0\u00e1\7\n\2\2\u00e1\u00e2\5\u0098M\2\u00e2\u00e3"+
		"\b\13\1\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5\u00e8\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ea\b\13\1\2\u00ea\25\3\2\2\2\u00eb\u00ec\5\30\r\2\u00ec"+
		"\u00ed\b\f\1\2\u00ed\u00f8\3\2\2\2\u00ee\u00ef\5\34\17\2\u00ef\u00f0\b"+
		"\f\1\2\u00f0\u00f8\3\2\2\2\u00f1\u00f2\5(\25\2\u00f2\u00f3\b\f\1\2\u00f3"+
		"\u00f8\3\2\2\2\u00f4\u00f5\5\"\22\2\u00f5\u00f6\b\f\1\2\u00f6\u00f8\3"+
		"\2\2\2\u00f7\u00eb\3\2\2\2\u00f7\u00ee\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7"+
		"\u00f4\3\2\2\2\u00f8\27\3\2\2\2\u00f9\u00fa\5\32\16\2\u00fa\u00fb\5\u0098"+
		"M\2\u00fb\u00fc\b\r\1\2\u00fc\u0102\3\2\2\2\u00fd\u00fe\7\22\2\2\u00fe"+
		"\u0102\b\r\1\2\u00ff\u0100\7\23\2\2\u0100\u0102\b\r\1\2\u0101\u00f9\3"+
		"\2\2\2\u0101\u00fd\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\31\3\2\2\2\u0103"+
		"\u0107\3\2\2\2\u0104\u0107\7\24\2\2\u0105\u0107\7\25\2\2\u0106\u0103\3"+
		"\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\33\3\2\2\2\u0108"+
		"\u0109\7\26\2\2\u0109\u010a\5\36\20\2\u010a\u010b\7\27\2\2\u010b\35\3"+
		"\2\2\2\u010c\u0111\5 \21\2\u010d\u010e\7\n\2\2\u010e\u0110\5 \21\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\37\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0117\5\u0098M\2\u0115"+
		"\u0117\5\34\17\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117!\3\2\2"+
		"\2\u0118\u0119\7\30\2\2\u0119\u011a\5$\23\2\u011a\u011b\7\31\2\2\u011b"+
		"#\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011f\5&\24\2\u011e\u011c\3\2\2\2"+
		"\u011e\u011d\3\2\2\2\u011f%\3\2\2\2\u0120\u0125\5\u0098M\2\u0121\u0122"+
		"\7\n\2\2\u0122\u0124\5\u0098M\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2"+
		"\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\'\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0128\u0129\7\4\2\2\u0129\u012a\5*\26\2\u012a\u012b\7\7\2\2\u012b"+
		")\3\2\2\2\u012c\u0132\3\2\2\2\u012d\u012e\5\u009aN\2\u012e\u012f\7\32"+
		"\2\2\u012f\u0130\5L\'\2\u0130\u0132\3\2\2\2\u0131\u012c\3\2\2\2\u0131"+
		"\u012d\3\2\2\2\u0132+\3\2\2\2\u0133\u0134\7\33\2\2\u0134\u0135\5\u009a"+
		"N\2\u0135\u0136\7\34\2\2\u0136\u0137\5\60\31\2\u0137\u0138\7\35\2\2\u0138"+
		"\u0139\5\66\34\2\u0139\u013a\5.\30\2\u013a-\3\2\2\2\u013b\u013c\7\4\2"+
		"\2\u013c\u013d\7\5\2\2\u013d\u013e\5\6\4\2\u013e\u013f\7\6\2\2\u013f\u0140"+
		"\5:\36\2\u0140\u0141\58\35\2\u0141\u0142\7\7\2\2\u0142/\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0146\5\62\32\2\u0145\u0143\3\2\2\2\u0145\u0144\3"+
		"\2\2\2\u0146\61\3\2\2\2\u0147\u014c\5\64\33\2\u0148\u0149\7\t\2\2\u0149"+
		"\u014b\5\64\33\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3"+
		"\2\2\2\u014c\u014d\3\2\2\2\u014d\63\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0150\5\u009aN\2\u0150\u0151\7\b\2\2\u0151\u0152\5\22\n\2\u0152\65\3"+
		"\2\2\2\u0153\u0157\3\2\2\2\u0154\u0155\7\b\2\2\u0155\u0157\5\22\n\2\u0156"+
		"\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0157\67\3\2\2\2\u0158\u015e\3\2\2"+
		"\2\u0159\u015a\7\36\2\2\u015a\u015b\5L\'\2\u015b\u015c\7\t\2\2\u015c\u015e"+
		"\3\2\2\2\u015d\u0158\3\2\2\2\u015d\u0159\3\2\2\2\u015e9\3\2\2\2\u015f"+
		"\u0161\5<\37\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163;\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166"+
		"\5> \2\u0166\u0167\7\t\2\2\u0167\u017d\3\2\2\2\u0168\u0169\5\\/\2\u0169"+
		"\u016a\7\t\2\2\u016a\u017d\3\2\2\2\u016b\u016c\5b\62\2\u016c\u016d\7\t"+
		"\2\2\u016d\u017d\3\2\2\2\u016e\u017d\5d\63\2\u016f\u017d\5f\64\2\u0170"+
		"\u0171\5F$\2\u0171\u0172\7\t\2\2\u0172\u017d\3\2\2\2\u0173\u0174\5\u0080"+
		"A\2\u0174\u0175\7\t\2\2\u0175\u017d\3\2\2\2\u0176\u0177\5\u008cG\2\u0177"+
		"\u0178\7\t\2\2\u0178\u017d\3\2\2\2\u0179\u017a\5\u008eH\2\u017a\u017b"+
		"\7\t\2\2\u017b\u017d\3\2\2\2\u017c\u0165\3\2\2\2\u017c\u0168\3\2\2\2\u017c"+
		"\u016b\3\2\2\2\u017c\u016e\3\2\2\2\u017c\u016f\3\2\2\2\u017c\u0170\3\2"+
		"\2\2\u017c\u0173\3\2\2\2\u017c\u0176\3\2\2\2\u017c\u0179\3\2\2\2\u017d"+
		"=\3\2\2\2\u017e\u017f\5@!\2\u017f\u0180\7\13\2\2\u0180\u0181\5L\'\2\u0181"+
		"\u0182\b \1\2\u0182?\3\2\2\2\u0183\u0184\5\u009aN\2\u0184\u0185\5B\"\2"+
		"\u0185\u0186\b!\1\2\u0186A\3\2\2\2\u0187\u018e\b\"\1\2\u0188\u0189\7\26"+
		"\2\2\u0189\u018a\5D#\2\u018a\u018b\7\27\2\2\u018b\u018c\b\"\1\2\u018c"+
		"\u018e\3\2\2\2\u018d\u0187\3\2\2\2\u018d\u0188\3\2\2\2\u018eC\3\2\2\2"+
		"\u018f\u0190\5N(\2\u0190\u0197\b#\1\2\u0191\u0192\7\n\2\2\u0192\u0193"+
		"\5N(\2\u0193\u0194\b#\1\2\u0194\u0196\3\2\2\2\u0195\u0191\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019b\b#\1\2\u019bE\3\2\2\2\u019c\u019d"+
		"\5\u009aN\2\u019d\u019e\7\34\2\2\u019e\u019f\5H%\2\u019f\u01a0\7\35\2"+
		"\2\u01a0G\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a4\5J&\2\u01a3\u01a1\3"+
		"\2\2\2\u01a3\u01a2\3\2\2\2\u01a4I\3\2\2\2\u01a5\u01aa\5L\'\2\u01a6\u01a7"+
		"\7\n\2\2\u01a7\u01a9\5L\'\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abK\3\2\2\2\u01ac\u01aa\3\2\2\2"+
		"\u01ad\u01ae\5N(\2\u01ae\u01b3\b\'\1\2\u01af\u01b0\5Z.\2\u01b0\u01b1\5"+
		"N(\2\u01b1\u01b2\b\'\1\2\u01b2\u01b4\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\b\'\1\2\u01b6M\3\2\2\2"+
		"\u01b7\u01b8\5P)\2\u01b8\u01bf\b(\1\2\u01b9\u01ba\5V,\2\u01ba\u01bb\5"+
		"P)\2\u01bb\u01bc\b(\1\2\u01bc\u01be\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be"+
		"\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\3\2"+
		"\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\b(\1\2\u01c3O\3\2\2\2\u01c4\u01c5"+
		"\5R*\2\u01c5\u01cc\b)\1\2\u01c6\u01c7\5X-\2\u01c7\u01c8\5R*\2\u01c8\u01c9"+
		"\b)\1\2\u01c9\u01cb\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01cf\u01d0\b)\1\2\u01d0Q\3\2\2\2\u01d1\u01d2\5\26\f\2\u01d2\u01d3"+
		"\b*\1\2\u01d3\u01e5\3\2\2\2\u01d4\u01d5\5@!\2\u01d5\u01d6\b*\1\2\u01d6"+
		"\u01e5\3\2\2\2\u01d7\u01d8\7\34\2\2\u01d8\u01d9\5L\'\2\u01d9\u01da\7\35"+
		"\2\2\u01da\u01db\b*\1\2\u01db\u01e5\3\2\2\2\u01dc\u01dd\7\37\2\2\u01dd"+
		"\u01de\5R*\2\u01de\u01df\b*\1\2\u01df\u01e5\3\2\2\2\u01e0\u01e5\5F$\2"+
		"\u01e1\u01e2\5T+\2\u01e2\u01e3\b*\1\2\u01e3\u01e5\3\2\2\2\u01e4\u01d1"+
		"\3\2\2\2\u01e4\u01d4\3\2\2\2\u01e4\u01d7\3\2\2\2\u01e4\u01dc\3\2\2\2\u01e4"+
		"\u01e0\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e5S\3\2\2\2\u01e6\u01e7\5\u0084"+
		"C\2\u01e7\u01e8\b+\1\2\u01e8\u01fc\3\2\2\2\u01e9\u01ea\5\u0086D\2\u01ea"+
		"\u01eb\b+\1\2\u01eb\u01fc\3\2\2\2\u01ec\u01ed\5\u0088E\2\u01ed\u01ee\b"+
		"+\1\2\u01ee\u01fc\3\2\2\2\u01ef\u01f0\5\u0094K\2\u01f0\u01f1\b+\1\2\u01f1"+
		"\u01fc\3\2\2\2\u01f2\u01f3\5\u0090I\2\u01f3\u01f4\b+\1\2\u01f4\u01fc\3"+
		"\2\2\2\u01f5\u01f6\5\u0092J\2\u01f6\u01f7\b+\1\2\u01f7\u01fc\3\2\2\2\u01f8"+
		"\u01f9\5\u008aF\2\u01f9\u01fa\b+\1\2\u01fa\u01fc\3\2\2\2\u01fb\u01e6\3"+
		"\2\2\2\u01fb\u01e9\3\2\2\2\u01fb\u01ec\3\2\2\2\u01fb\u01ef\3\2\2\2\u01fb"+
		"\u01f2\3\2\2\2\u01fb\u01f5\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fcU\3\2\2\2"+
		"\u01fd\u01fe\7\24\2\2\u01fe\u0206\b,\1\2\u01ff\u0200\7\25\2\2\u0200\u0206"+
		"\b,\1\2\u0201\u0202\7 \2\2\u0202\u0206\b,\1\2\u0203\u0204\7!\2\2\u0204"+
		"\u0206\b,\1\2\u0205\u01fd\3\2\2\2\u0205\u01ff\3\2\2\2\u0205\u0201\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0206W\3\2\2\2\u0207\u0208\7\"\2\2\u0208\u0210"+
		"\b-\1\2\u0209\u020a\7#\2\2\u020a\u0210\b-\1\2\u020b\u020c\7$\2\2\u020c"+
		"\u0210\b-\1\2\u020d\u020e\7%\2\2\u020e\u0210\b-\1\2\u020f\u0207\3\2\2"+
		"\2\u020f\u0209\3\2\2\2\u020f\u020b\3\2\2\2\u020f\u020d\3\2\2\2\u0210Y"+
		"\3\2\2\2\u0211\u0212\7&\2\2\u0212\u0220\b.\1\2\u0213\u0214\7\'\2\2\u0214"+
		"\u0220\b.\1\2\u0215\u0216\7(\2\2\u0216\u0220\b.\1\2\u0217\u0218\7)\2\2"+
		"\u0218\u0220\b.\1\2\u0219\u021a\7*\2\2\u021a\u0220\b.\1\2\u021b\u021c"+
		"\7+\2\2\u021c\u0220\b.\1\2\u021d\u021e\7,\2\2\u021e\u0220\b.\1\2\u021f"+
		"\u0211\3\2\2\2\u021f\u0213\3\2\2\2\u021f\u0215\3\2\2\2\u021f\u0217\3\2"+
		"\2\2\u021f\u0219\3\2\2\2\u021f\u021b\3\2\2\2\u021f\u021d\3\2\2\2\u0220"+
		"[\3\2\2\2\u0221\u0222\5^\60\2\u0222\u0223\7\34\2\2\u0223\u0224\5`\61\2"+
		"\u0224\u0225\7\35\2\2\u0225]\3\2\2\2\u0226\u0227\t\2\2\2\u0227_\3\2\2"+
		"\2\u0228\u022b\3\2\2\2\u0229\u022b\5L\'\2\u022a\u0228\3\2\2\2\u022a\u0229"+
		"\3\2\2\2\u022ba\3\2\2\2\u022c\u022d\7/\2\2\u022d\u022e\7\34\2\2\u022e"+
		"\u022f\5\u009aN\2\u022f\u0230\7\35\2\2\u0230c\3\2\2\2\u0231\u0232\5h\65"+
		"\2\u0232e\3\2\2\2\u0233\u0236\5l\67\2\u0234\u0236\5~@\2\u0235\u0233\3"+
		"\2\2\2\u0235\u0234\3\2\2\2\u0236g\3\2\2\2\u0237\u0238\7\60\2\2\u0238\u0239"+
		"\7\34\2\2\u0239\u023a\5L\'\2\u023a\u023b\7\35\2\2\u023b\u023c\7\61\2\2"+
		"\u023c\u023d\7\4\2\2\u023d\u023e\5:\36\2\u023e\u023f\7\7\2\2\u023f\u0240"+
		"\5j\66\2\u0240i\3\2\2\2\u0241\u0248\3\2\2\2\u0242\u0243\7\62\2\2\u0243"+
		"\u0244\7\4\2\2\u0244\u0245\5:\36\2\u0245\u0246\7\7\2\2\u0246\u0248\3\2"+
		"\2\2\u0247\u0241\3\2\2\2\u0247\u0242\3\2\2\2\u0248k\3\2\2\2\u0249\u024a"+
		"\7\63\2\2\u024a\u024b\7\34\2\2\u024b\u024c\5n8\2\u024c\u024d\7\35\2\2"+
		"\u024d\u024e\5x=\2\u024e\u024f\5|?\2\u024f\u0250\7\4\2\2\u0250\u0251\5"+
		":\36\2\u0251\u0252\7\7\2\2\u0252m\3\2\2\2\u0253\u0254\5\u009aN\2\u0254"+
		"\u0255\5p9\2\u0255o\3\2\2\2\u0256\u0257\7,\2\2\u0257\u025b\5r:\2\u0258"+
		"\u0259\7\64\2\2\u0259\u025b\5\u009aN\2\u025a\u0256\3\2\2\2\u025a\u0258"+
		"\3\2\2\2\u025bq\3\2\2\2\u025c\u025d\5t;\2\u025d\u025e\7\65\2\2\u025e\u025f"+
		"\5v<\2\u025fs\3\2\2\2\u0260\u0263\5\u0098M\2\u0261\u0263\5\u009aN\2\u0262"+
		"\u0260\3\2\2\2\u0262\u0261\3\2\2\2\u0263u\3\2\2\2\u0264\u0267\5\u0098"+
		"M\2\u0265\u0267\5\u009aN\2\u0266\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267"+
		"w\3\2\2\2\u0268\u026d\3\2\2\2\u0269\u026a\5z>\2\u026a\u026b\5\u0098M\2"+
		"\u026b\u026d\3\2\2\2\u026c\u0268\3\2\2\2\u026c\u0269\3\2\2\2\u026dy\3"+
		"\2\2\2\u026e\u026f\t\3\2\2\u026f{\3\2\2\2\u0270\u0274\3\2\2\2\u0271\u0272"+
		"\78\2\2\u0272\u0274\5L\'\2\u0273\u0270\3\2\2\2\u0273\u0271\3\2\2\2\u0274"+
		"}\3\2\2\2\u0275\u0276\79\2\2\u0276\u0277\7\34\2\2\u0277\u0278\5L\'\2\u0278"+
		"\u0279\7\35\2\2\u0279\u027a\7\4\2\2\u027a\u027b\5:\36\2\u027b\u027c\7"+
		"\7\2\2\u027c\177\3\2\2\2\u027d\u027e\5\u0082B\2\u027e\u027f\5\u009aN\2"+
		"\u027f\u0081\3\2\2\2\u0280\u0281\t\4\2\2\u0281\u0083\3\2\2\2\u0282\u0283"+
		"\7<\2\2\u0283\u0284\7\34\2\2\u0284\u0285\5L\'\2\u0285\u0286\7\35\2\2\u0286"+
		"\u0287\bC\1\2\u0287\u0085\3\2\2\2\u0288\u0289\7=\2\2\u0289\u028a\7\34"+
		"\2\2\u028a\u028b\5L\'\2\u028b\u028c\7\35\2\2\u028c\u028d\bD\1\2\u028d"+
		"\u0087\3\2\2\2\u028e\u028f\7>\2\2\u028f\u0290\7\34\2\2\u0290\u0291\5L"+
		"\'\2\u0291\u0292\7\n\2\2\u0292\u0293\5L\'\2\u0293\u0294\7\35\2\2\u0294"+
		"\u0295\bE\1\2\u0295\u0089\3\2\2\2\u0296\u0297\7?\2\2\u0297\u0298\7\34"+
		"\2\2\u0298\u0299\5L\'\2\u0299\u029a\7\n\2\2\u029a\u029b\5L\'\2\u029b\u029c"+
		"\7\35\2\2\u029c\u029d\bF\1\2\u029d\u008b\3\2\2\2\u029e\u029f\7@\2\2\u029f"+
		"\u02a0\7\34\2\2\u02a0\u02a1\5\u009aN\2\u02a1\u02a2\7\n\2\2\u02a2\u02a3"+
		"\5\u009aN\2\u02a3\u02a4\7\35\2\2\u02a4\u008d\3\2\2\2\u02a5\u02a6\7A\2"+
		"\2\u02a6\u02a7\7\34\2\2\u02a7\u02a8\5\u009aN\2\u02a8\u02a9\7\n\2\2\u02a9"+
		"\u02aa\5\u009aN\2\u02aa\u02ab\7\35\2\2\u02ab\u008f\3\2\2\2\u02ac\u02ad"+
		"\7B\2\2\u02ad\u02ae\7\34\2\2\u02ae\u02af\5L\'\2\u02af\u02b0\7\35\2\2\u02b0"+
		"\u02b1\bI\1\2\u02b1\u0091\3\2\2\2\u02b2\u02b3\7C\2\2\u02b3\u02b4\7\34"+
		"\2\2\u02b4\u02b5\5L\'\2\u02b5\u02b6\7\35\2\2\u02b6\u02b7\bJ\1\2\u02b7"+
		"\u0093\3\2\2\2\u02b8\u02b9\7D\2\2\u02b9\u02ba\7\34\2\2\u02ba\u02bb\5L"+
		"\'\2\u02bb\u02bc\7\n\2\2\u02bc\u02bd\5\u009aN\2\u02bd\u02be\7\35\2\2\u02be"+
		"\u02bf\bK\1\2\u02bf\u0095\3\2\2\2\u02c0\u02c1\7H\2\2\u02c1\u0097\3\2\2"+
		"\2\u02c2\u02c3\7E\2\2\u02c3\u02c4\bM\1\2\u02c4\u0099\3\2\2\2\u02c5\u02c6"+
		"\7F\2\2\u02c6\u02c7\bN\1\2\u02c7\u009b\3\2\2\2*\u00aa\u00b1\u00c1\u00cd"+
		"\u00dc\u00e6\u00f7\u0101\u0106\u0111\u0116\u011e\u0125\u0131\u0145\u014c"+
		"\u0156\u015d\u0162\u017c\u018d\u0197\u01a3\u01aa\u01b3\u01bf\u01cc\u01e4"+
		"\u01fb\u0205\u020f\u021f\u022a\u0235\u0247\u025a\u0262\u0266\u026c\u0273";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}