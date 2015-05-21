// Generated from /Users/damienvaz/Desktop/Backup/IdeaProjects/liss/src/Application/Liss.g4 by ANTLR 4.5
package Application;

    import java.util.HashMap;
    import java.util.LinkedList;
    import SymbolTable.*;

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


	    int level = 0;
	    TableError e = new TableError();
	    boolean isSet = false;
	    int i= 0;


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
			System.out.println(e.toString());
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
			setState(159); 
			match(T__1);
			setState(160); 
			match(T__2);
			setState(161); 
			declarations(idTH);
			setState(162); 
			match(T__3);
			setState(163); 
			statements(idTH);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); 
			declaration(idTH);
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
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public List<Subprogram_definitionContext> subprogram_definition() {
			return getRuleContexts(Subprogram_definitionContext.class);
		}
		public Subprogram_definitionContext subprogram_definition(int i) {
			return getRuleContext(Subprogram_definitionContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(168); 
				variable_declaration(idTH);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(174); 
				subprogram_definition(idTH);
				}
				}
				setState(179);
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
			setState(180); 
			((Variable_declarationContext)_localctx).vars = vars(idTH);
			setState(181); 
			match(T__5);
			setState(182); 
			((Variable_declarationContext)_localctx).type = type();
			setState(183); 
			match(T__6);

			                            HashMap<String, HashMap<String,Object>> varsH = ((Variable_declarationContext)_localctx).vars.varsS;
			                            if(((Variable_declarationContext)_localctx).type.typeS == "array" ){
			                                for(String i : varsH.keySet()){
			                                    varsH.get(i).put("dimension",((Variable_declarationContext)_localctx).type.arrayDimension);
			                                    varsH.get(i).put("type","array");
			                                }
			                            }else if(((Variable_declarationContext)_localctx).type.typeS == "set"){
			                                for(String i : varsH.keySet()){
			                                    HashMap<String,Object> v = (HashMap<String,Object>)varsH.get(i);
			                                    if(v.get("set") == null){
			                                        v.put("set", new Set());
			                                    }
			                                }
			                                for(String i : varsH.keySet()){
			                                    System.out.println("Variable: "+i+" "+varsH.get(i).toString());
			                                }
			                            }

			                            for(String i : varsH.keySet()){
			                                HashMap<String, Object> varInfo = (HashMap<String, Object>)varsH.get(i);
			                                boolean s=false;
			                                for(String j : varInfo.keySet()){
			                                    String type = (String) varInfo.get("type");
			                                    if(type!=null && !type.equals(((Variable_declarationContext)_localctx).type.typeS) && s==false){
			                                        e.addMessage((int)varInfo.get("line"),(int)varInfo.get("pos"),ErrorMessage.semantic(i,ErrorMessage.type((String)varInfo.get("type"),((Variable_declarationContext)_localctx).type.typeS)));
			                                        s=true;
			                                    }
			                                }
			                            }


			                            //Print the HashMap<String, HashMap<String,Object>> varsH
			                            /*for(String i : varsH.keySet()){
			                                System.out.println("Variable: "+i+" "+varsH.get(i).toString());
			                            }*/


			                            _localctx.idTH.add(e,varsH,((Variable_declarationContext)_localctx).type.typeS,level);
			                            if(isSet){isSet = false;}
			                     
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
		public VarContext v1;
		public VarContext var;
		public VarContext v2;
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
			setState(186); 
			((VarsContext)_localctx).v1 = ((VarsContext)_localctx).var = var(idTH);

			                if(!info.containsKey((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null))){
			                    info.put(((VarsContext)_localctx).var.idS,((VarsContext)_localctx).var.infoVarS);
			                }else{
			                    e.addMessage((int)((VarsContext)_localctx).var.infoVarS.get("line"),(int)((VarsContext)_localctx).var.infoVarS.get("pos"),ErrorMessage.semantic((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null),ErrorMessage.Declarations));
			                }

			            
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(188); 
				match(T__7);
				setState(189); 
				((VarsContext)_localctx).v2 = ((VarsContext)_localctx).var = var(idTH);

				                    if(!info.containsKey((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null))){
				                        info.put(((VarsContext)_localctx).var.idS,((VarsContext)_localctx).var.infoVarS);
				                    }else{
				                        e.addMessage((int)((VarsContext)_localctx).var.infoVarS.get("line"),(int)((VarsContext)_localctx).var.infoVarS.get("pos"),ErrorMessage.semantic((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null),ErrorMessage.Declarations));
				                    }
				                
				}
				}
				setState(196);
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
		public IdentifierContext i;
		public IdentifierContext identifier;
		public Value_varContext v;
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
			setState(199); 
			((VarContext)_localctx).i = ((VarContext)_localctx).identifier = identifier();
			setState(200); 
			((VarContext)_localctx).v = value_var(idTH);

			        info.put("pos",((VarContext)_localctx).i.pos);
			        info.put("line",((VarContext)_localctx).i.line);

			        if(((VarContext)_localctx).v.typeS!=null){
			            info.put("type",((VarContext)_localctx).v.typeS);
			        }

			        if(((VarContext)_localctx).v.setS!=null){
			            info.put("set",((VarContext)_localctx).v.setS);
			        }


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
		public Set setS;
		public String typeS;
		public Inic_varContext i;
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

		            Set set = null;
		          
		try {
			setState(208);
			switch (_input.LA(1)) {
			case T__5:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				 ((Value_varContext)_localctx).setS =  set; ((Value_varContext)_localctx).typeS =  null;
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); 
				match(T__8);
				setState(205); 
				((Value_varContext)_localctx).i = inic_var(idTH, set);
				if(isSet){ set = ((Value_varContext)_localctx).i.setS; ((Value_varContext)_localctx).setS =  set;} ((Value_varContext)_localctx).typeS =  ((Value_varContext)_localctx).i.typeS;
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
			setState(223);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); 
				match(T__9);
				((TypeContext)_localctx).typeS =  "integer"; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); 
				match(T__10);
				((TypeContext)_localctx).typeS =  "boolean";
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(214); 
				match(T__11);
				((TypeContext)_localctx).typeS =  "set";
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(216); 
				match(T__12);
				((TypeContext)_localctx).typeS =  "sequence";
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(218); 
				match(T__13);
				setState(219); 
				match(T__14);
				setState(220); 
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
			setState(225); 
			((DimensionContext)_localctx).number = number();
			vars.add(((DimensionContext)_localctx).number.numberS);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(227); 
				match(T__7);
				setState(228); 
				((DimensionContext)_localctx).number = number();
				vars.add(((DimensionContext)_localctx).number.numberS);
				}
				}
				setState(235);
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
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Set setS;
		public Node treeS;
		public ConstantContext c;
		public ConstantContext constant;
		public Array_definitionContext a;
		public Set_definitionContext s1;
		public Sequence_definitionContext s2;
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
		public Inic_varContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final Inic_varContext inic_var(IdentifiersTable idTH,Set set) throws RecognitionException {
		Inic_varContext _localctx = new Inic_varContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 20, RULE_inic_var);

		            ((Inic_varContext)_localctx).treeS =  null;
		         
		try {
			setState(250);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(238); 
				((Inic_varContext)_localctx).c = ((Inic_varContext)_localctx).constant = constant();
				((Inic_varContext)_localctx).typeS =  ((Inic_varContext)_localctx).constant.typeS; ((Inic_varContext)_localctx).line =  ((Inic_varContext)_localctx).constant.line; ((Inic_varContext)_localctx).pos =  ((Inic_varContext)_localctx).constant.pos; if(isSet && _localctx.set!=null){ Node n = new Node(new Data((((Inic_varContext)_localctx).c!=null?_input.getText(((Inic_varContext)_localctx).c.start,((Inic_varContext)_localctx).c.stop):null))); ((Inic_varContext)_localctx).treeS =  n;}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(241); 
				((Inic_varContext)_localctx).a = array_definition();
				((Inic_varContext)_localctx).typeS =  "integer";
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(244); 
				((Inic_varContext)_localctx).s1 = set_definition(idTH);
				((Inic_varContext)_localctx).typeS =  "set"; ((Inic_varContext)_localctx).line =  ((Inic_varContext)_localctx).s1.line; ((Inic_varContext)_localctx).pos =  ((Inic_varContext)_localctx).s1.pos;if(isSet && ((Inic_varContext)_localctx).s1.treeS!=null){((Inic_varContext)_localctx).treeS =  ((Inic_varContext)_localctx).s1.treeS;} if(isSet && ((Inic_varContext)_localctx).s1.setS!=null){((Inic_varContext)_localctx).setS =  ((Inic_varContext)_localctx).s1.setS;}
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(247); 
				((Inic_varContext)_localctx).s2 = sequence_definition();
				((Inic_varContext)_localctx).typeS =  "sequence"; if(isSet && _localctx.set!=null){((Inic_varContext)_localctx).treeS =  ((Inic_varContext)_localctx).s2.treeS;}
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
			setState(260);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(252); 
				sign();
				setState(253); 
				((ConstantContext)_localctx).number = number();
				((ConstantContext)_localctx).typeS =  "integer"; ((ConstantContext)_localctx).line =  ((ConstantContext)_localctx).number.line; ((ConstantContext)_localctx).pos =  ((ConstantContext)_localctx).number.pos;
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(256); 
				((ConstantContext)_localctx).t = match(T__15);
				((ConstantContext)_localctx).typeS =  "boolean"; ((ConstantContext)_localctx).line =  (((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getLine():0); ((ConstantContext)_localctx).pos =  (((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getCharPositionInLine():0); 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(258); 
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
			setState(265);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); 
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(264); 
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
			setState(267); 
			match(T__19);
			setState(268); 
			array_initialization();
			setState(269); 
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
			setState(271); 
			elem();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(272); 
				match(T__7);
				setState(273); 
				elem();
				}
				}
				setState(278);
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
			setState(281);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); 
				number();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); 
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
		public Node treeS;
		public Sequence_initializationContext s;
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
			setState(283); 
			match(T__21);
			setState(284); 
			((Sequence_definitionContext)_localctx).s = sequence_initialization();
			if(isSet){Node n = new Node(new Data("sequence"),null,((Sequence_definitionContext)_localctx).s.treeS); ((Sequence_definitionContext)_localctx).treeS =  n;}
			setState(286); 
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
		public Node treeS;
		public ValuesContext v;
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
			setState(292);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				if(isSet){((Sequence_initializationContext)_localctx).treeS =  null;}
				}
				break;
			case NBR:
				enterOuterAlt(_localctx, 2);
				{
				setState(289); 
				((Sequence_initializationContext)_localctx).v = values();
				if(isSet){((Sequence_initializationContext)_localctx).treeS =  ((Sequence_initializationContext)_localctx).v.treeS;}
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
		public Node treeS;
		public NumberContext n1;
		public NumberContext n2;
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

		            Node head = null;
		            Node m = null;
		       
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); 
			((ValuesContext)_localctx).n1 = number();
			if(isSet){head = new Node(new Data("args"),new Node(new Data((((ValuesContext)_localctx).n1!=null?_input.getText(((ValuesContext)_localctx).n1.start,((ValuesContext)_localctx).n1.stop):null)),null,null),null); m = head;}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(296); 
				match(T__7);
				setState(297); 
				((ValuesContext)_localctx).n2 = number();
				if(isSet){m.setRight(new Node(new Data("args"),new Node(new Data((((ValuesContext)_localctx).n2!=null?_input.getText(((ValuesContext)_localctx).n2.start,((ValuesContext)_localctx).n2.stop):null)),null,null),null)); m = m.getRight();}
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        if(isSet && head!=null){
			            ((ValuesContext)_localctx).treeS =  head;
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
		public Set setS;
		public Node treeS;
		public int line;
		public int pos;
		public Token m;
		public Set_initializationContext s;
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
			setState(307); 
			((Set_definitionContext)_localctx).m = match(T__1);
			setState(308); 
			((Set_definitionContext)_localctx).s = set_initialization(idTH);
			((Set_definitionContext)_localctx).line =  (((Set_definitionContext)_localctx).m!=null?((Set_definitionContext)_localctx).m.getLine():0); ((Set_definitionContext)_localctx).pos =  (((Set_definitionContext)_localctx).m!=null?((Set_definitionContext)_localctx).m.getCharPositionInLine():0);((Set_definitionContext)_localctx).setS =  ((Set_definitionContext)_localctx).s.setS; ((Set_definitionContext)_localctx).treeS =  ((Set_definitionContext)_localctx).s.treeS; if(((Set_definitionContext)_localctx).s.setS!=null){System.out.println("SET_DEFINITION: {"+(((Set_definitionContext)_localctx).s!=null?_input.getText(((Set_definitionContext)_localctx).s.start,((Set_definitionContext)_localctx).s.stop):null)+"} -> "+((Set_definitionContext)_localctx).s.setS.toString());}
			setState(310); 
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
		public Set setS;
		public Node treeS;
		public IdentifierContext i;
		public ExpressionContext e;
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

		                      isSet = true;
		                      Set s = null;
		                      Node tree = null;
		                   
		try {
			setState(319);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				 s = new Set("x"); ((Set_initializationContext)_localctx).setS =  s; ((Set_initializationContext)_localctx).treeS = null;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(313); 
				((Set_initializationContext)_localctx).i = identifier();

				                     s = new Set((((Set_initializationContext)_localctx).i!=null?_input.getText(((Set_initializationContext)_localctx).i.start,((Set_initializationContext)_localctx).i.stop):null),tree);
				                   
				setState(315); 
				match(T__23);
				setState(316); 
				((Set_initializationContext)_localctx).e = expression(idTH,s);

				                    if( !(((Set_initializationContext)_localctx).e.typeS != null && ((Set_initializationContext)_localctx).e.typeS.equals("boolean")) ){
				                        e.addMessage(((Set_initializationContext)_localctx).e.line,((Set_initializationContext)_localctx).e.pos,ErrorMessage.semantic((((Set_initializationContext)_localctx).e!=null?_input.getText(((Set_initializationContext)_localctx).e.start,((Set_initializationContext)_localctx).e.stop):null),ErrorMessage.type(((Set_initializationContext)_localctx).e.typeS,"boolean")));
				                    }

				                    if(((Set_initializationContext)_localctx).e.treeS!=null && isSet && ((Set_initializationContext)_localctx).e.typeS != null && ((Set_initializationContext)_localctx).e.typeS.equals("boolean")){                                              //só se pode adicionar caso a expressao for booleano !
				                        s.setHead(((Set_initializationContext)_localctx).e.treeS);
				                        ((Set_initializationContext)_localctx).treeS =  ((Set_initializationContext)_localctx).e.treeS;
				                    }else{
				                        //s.isntASet(); //se nao é booleano deve-se enviar o conjunto vazio ( que é constituido por identifier nao nulo e
				                    }
				                    ((Set_initializationContext)_localctx).setS =  s;

				                   
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
		public IdentifierContext i;
		public Formal_argsContext f;
		public Return_typeContext r;
		public F_bodyContext f_body() {
			return getRuleContext(F_bodyContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Formal_argsContext formal_args() {
			return getRuleContext(Formal_argsContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
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
		                        HashMap<String,Object> varInfo = new HashMap<String, Object>();
		                        HashMap<String, HashMap<String, Object>> hashmapVar = new HashMap<String, HashMap<String,Object>>();
		                      
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); 
			match(T__24);
			setState(322); 
			((Subprogram_definitionContext)_localctx).i = identifier();
			setState(323); 
			match(T__25);
			setState(324); 
			((Subprogram_definitionContext)_localctx).f = formal_args(idTH);
			setState(325); 
			match(T__26);
			setState(326); 
			((Subprogram_definitionContext)_localctx).r = return_type();
			setState(327); 
			f_body(idTH);

			                            //Pre-Condition : Remover todas as variaveis do nivel actual

			                            //_localctx.idTH.removeLevel(level);

			                            level--;

			                            varInfo.put("line",((Subprogram_definitionContext)_localctx).i.line);
			                            varInfo.put("pos",((Subprogram_definitionContext)_localctx).i.pos);
			                            varInfo.put("return",((Subprogram_definitionContext)_localctx).r.typeS);
			                            varInfo.put("numberArguments", ((Subprogram_definitionContext)_localctx).f.numberArgumentS);
			                            varInfo.put("typeList",((Subprogram_definitionContext)_localctx).f.typeListS);

			                            hashmapVar.put((((Subprogram_definitionContext)_localctx).i!=null?_input.getText(((Subprogram_definitionContext)_localctx).i.start,((Subprogram_definitionContext)_localctx).i.stop):null),varInfo);
			                            _localctx.idTH.add(e,hashmapVar,"function",level);
			                        
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
			setState(330); 
			match(T__1);
			setState(331); 
			match(T__2);
			setState(332); 
			declarations(idTH);
			setState(333); 
			match(T__3);
			setState(334); 
			statements(idTH);
			setState(335); 
			returnSubPrg(idTH);
			setState(336); 
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
		public IdentifiersTable idTH;
		public int numberArgumentS;
		public LinkedList<String> typeListS;
		public F_argsContext f;
		public F_argsContext f_args() {
			return getRuleContext(F_argsContext.class,0);
		}
		public Formal_argsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Formal_argsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Formal_argsContext formal_args(IdentifiersTable idTH) throws RecognitionException {
		Formal_argsContext _localctx = new Formal_argsContext(_ctx, getState(), idTH);
		enterRule(_localctx, 46, RULE_formal_args);
		try {
			setState(342);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				 ((Formal_argsContext)_localctx).numberArgumentS =  0; ((Formal_argsContext)_localctx).typeListS =  null;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(339); 
				((Formal_argsContext)_localctx).f = f_args(idTH);
				 ((Formal_argsContext)_localctx).numberArgumentS =  ((Formal_argsContext)_localctx).f.numberArgumentS; ((Formal_argsContext)_localctx).typeListS =  ((Formal_argsContext)_localctx).f.typeListS;
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
		public IdentifiersTable idTH;
		public int numberArgumentS;
		public LinkedList<String> typeListS;
		public Formal_argContext f1;
		public Formal_argContext f2;
		public List<Formal_argContext> formal_arg() {
			return getRuleContexts(Formal_argContext.class);
		}
		public Formal_argContext formal_arg(int i) {
			return getRuleContext(Formal_argContext.class,i);
		}
		public F_argsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public F_argsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final F_argsContext f_args(IdentifiersTable idTH) throws RecognitionException {
		F_argsContext _localctx = new F_argsContext(_ctx, getState(), idTH);
		enterRule(_localctx, 48, RULE_f_args);

		            int numberArgument = 0;
		            LinkedList<String> typeList = new LinkedList<String>();
		        
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); 
			((F_argsContext)_localctx).f1 = formal_arg();

			            numberArgument++;
			            _localctx.idTH.add(e,((F_argsContext)_localctx).f1.hashmapVarS,((F_argsContext)_localctx).f1.typeS,level);
			            typeList.add(((F_argsContext)_localctx).f1.typeS);
			          
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(346); 
				match(T__6);
				setState(347); 
				((F_argsContext)_localctx).f2 = formal_arg();

				            numberArgument++;
				            _localctx.idTH.add(e,((F_argsContext)_localctx).f2.hashmapVarS,((F_argsContext)_localctx).f2.typeS,level);
				            typeList.add(((F_argsContext)_localctx).f2.typeS);
				          
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            ((F_argsContext)_localctx).numberArgumentS =  numberArgument;
			            ((F_argsContext)_localctx).typeListS =  typeList;
			          
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
		public HashMap<String,HashMap<String,Object>> hashmapVarS;
		public String typeS;
		public IdentifierContext i;
		public TypeContext t;
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

		            HashMap<String,Object> varInfo = new HashMap<String, Object>();
		            HashMap<String, HashMap<String, Object>> hashmapVar = new HashMap<String, HashMap<String,Object>>();
		           
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); 
			((Formal_argContext)_localctx).i = identifier();
			setState(358); 
			match(T__5);
			setState(359); 
			((Formal_argContext)_localctx).t = type();

			            varInfo.put("line",((Formal_argContext)_localctx).i.line);
			            varInfo.put("pos",((Formal_argContext)_localctx).i.pos);

			            hashmapVar.put((((Formal_argContext)_localctx).i!=null?_input.getText(((Formal_argContext)_localctx).i.start,((Formal_argContext)_localctx).i.stop):null),varInfo);
			            ((Formal_argContext)_localctx).hashmapVarS =  hashmapVar;
			            ((Formal_argContext)_localctx).typeS =  ((Formal_argContext)_localctx).t.typeS;
			           
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
		public String typeS;
		public TypeContext t;
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
			setState(367);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				((Return_typeContext)_localctx).typeS =  "null";
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(363); 
				match(T__5);
				setState(364); 
				((Return_typeContext)_localctx).t = type();
				((Return_typeContext)_localctx).typeS =  ((Return_typeContext)_localctx).t.typeS;
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
		public String typeS;
		public ExpressionContext e;
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

		                Set tree = null;
		                ((ReturnSubPrgContext)_localctx).typeS =  null;
		             
		try {
			setState(375);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(370); 
				match(T__27);
				setState(371); 
				((ReturnSubPrgContext)_localctx).e = expression(idTH,tree);
				((ReturnSubPrgContext)_localctx).typeS =  ((ReturnSubPrgContext)_localctx).e.typeS;
				setState(373); 
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
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__48 - 43)) | (1L << (T__54 - 43)) | (1L << (T__55 - 43)) | (1L << (T__56 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (ID - 43)))) != 0)) {
				{
				{
				setState(377); 
				statement(idTH);
				}
				}
				setState(382);
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

		            Set set = null;
		          
		try {
			setState(406);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383); 
				assignment(idTH);
				setState(384); 
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386); 
				write_statement(idTH);
				setState(387); 
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389); 
				read_statement(idTH);
				setState(390); 
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392); 
				conditional_statement(idTH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(393); 
				iterative_statement(idTH);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(394); 
				function_call(idTH, set);
				setState(395); 
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(397); 
				succ_or_pred(idTH);
				setState(398); 
				match(T__6);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(400); 
				copy_statement(idTH);
				setState(401); 
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(403); 
				cat_statement(idTH);
				setState(404); 
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
		                Set set = null;
		           
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); 
			((AssignmentContext)_localctx).designator = designator(idTH, set);
			setState(409); 
			match(T__8);
			setState(410); 
			((AssignmentContext)_localctx).expression = expression(idTH,set);

			              if((((AssignmentContext)_localctx).designator.typeS != null && ((AssignmentContext)_localctx).expression.typeS != null) && ((AssignmentContext)_localctx).designator.typeS.equals(((AssignmentContext)_localctx).expression.typeS)){
			                ((AssignmentContext)_localctx).typeS =  ((AssignmentContext)_localctx).designator.typeS;
			                System.out.println(((AssignmentContext)_localctx).designator.line+"Funcionou ;D");
			              }else{
			                //ErrorMessage.errorSemanticAssignment(((AssignmentContext)_localctx).designator.line);
			                e.addMessage(((AssignmentContext)_localctx).designator.line,-1,ErrorMessage.semanticAssignment(((AssignmentContext)_localctx).designator.line)); //-1 => assignemen error => there is no pos.
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
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
		public IdentifierContext i;
		public IdentifierContext identifier;
		public Array_accessContext a;
		public Array_accessContext array_access;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Array_accessContext array_access() {
			return getRuleContext(Array_accessContext.class,0);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DesignatorContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final DesignatorContext designator(IdentifiersTable idTH,Set set) throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 62, RULE_designator);

		                ((DesignatorContext)_localctx).typeS =  null;
		                ((DesignatorContext)_localctx).treeS =  null;
		            
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); 
			((DesignatorContext)_localctx).i = ((DesignatorContext)_localctx).identifier = identifier();
			setState(414); 
			((DesignatorContext)_localctx).a = ((DesignatorContext)_localctx).array_access = array_access(idTH, set);

			                                ((DesignatorContext)_localctx).line =  ((DesignatorContext)_localctx).identifier.line;
			                                ((DesignatorContext)_localctx).pos =  ((DesignatorContext)_localctx).identifier.pos;
			                                //Pre-Condicao: é um identificador
			                                if(!((DesignatorContext)_localctx).array_access.response){
			                                    //Pre-Condicao: ver se existe na tabela de identificador
			                                    if(!isSet && !_localctx.idTH.getIdentifiersTable().containsKey((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null))){

			                                        //ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.errorStatements);
			                                        e.addMessage(((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.semantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),ErrorMessage.Statements));

			                                    }else{
			                                        if(!isSet && !_localctx.idTH.getInfoIdentifiersTable((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null)).getCategory().equals(new String("TYPE"))){
			                                            if(_localctx.idTH.getInfoIdentifiersTable((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null)) instanceof Var){
			                                                Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));
			                                                ((DesignatorContext)_localctx).typeS =  v.getInfoType();
			                                            }
			                                        }
			                                    }
			                                    if(isSet && _localctx.set!=null){
			                                        Data d = _localctx.set.getIdentifier();
			                                        ((DesignatorContext)_localctx).typeS =  "integer";
			                                        Node n = null;
			                                        if(d.getData().equals((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null))){
			                                            n = new Node(d);
			                                            //System.out.println("NT : designator, é um identificador igual ao identificador do set, i.e., setId:"+d.getData()+" designatorId: "+(((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));
			                                        }else{
			                                            n = new Node(new Data((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null)));
			                                            //System.out.println("NT : designator, é um identificador que nao é igual ao identificador do set, i.e., setId:"+d.getData()+" designatorId: "+(((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));
			                                        }
			                                        ((DesignatorContext)_localctx).treeS =  n;
			                                    }
			                                }
			                                //Pre-Condicao: é um array
			                                else{
			                                    //Pre-Condicao: se existe na tabela de identificador
			                                    if(!_localctx.idTH.getIdentifiersTable().containsKey((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null))){
			                                        //ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.errorStatements);
			                                        e.addMessage(((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.semantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),ErrorMessage.Statements));

			                                    }else{
			                                        Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));

			                                        if(v!=null && v.getCategory().equals(new String("TYPE"))){
			                                            //ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.errorStatements);
			                                            e.addMessage(((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.semantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),ErrorMessage.Statements));

			                                        }else{
			                                            if(v!=null && !v.getInfoType().equals(new String("array"))){
			                                                //ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.errorArrayType);
			                                                e.addMessage(((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.semantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),ErrorMessage.ArrayType));
			                                            }else{
			                                                Array a = (Array) v;
			                                                //System.out.println("Dimension: "+a.getDimension());

			                                                //Pre-Condição : Testar as dimensoes do array (feito atraves da seguinta forma : Valor do identifier da TI == valor do identifier)
			                                                if(a.getDimension().compareTo(((DesignatorContext)_localctx).array_access.dimensionS) == 0){
			                                                    //((DesignatorContext)_localctx).typeS =  v.getInfoType() ;
			                                                    ((DesignatorContext)_localctx).typeS =  "integer"; //v[1,1] => inteiro como tipo nao array
			                                                }else{
			                                                    //ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.createMessageDimensionArray(((DesignatorContext)_localctx).array_access.dimensionS,a.getDimension()));
			                                                    e.addMessage(((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.semantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),ErrorMessage.dimensionArray(((DesignatorContext)_localctx).array_access.dimensionS,a.getDimension())));
			                                                    //System.out.println("Dimension demasiadas grandes do array "+(((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));
			                                                }
			                                            }
			                                        }
			                                        if(isSet && _localctx.set!=null){
			                                            Node m = new Node(new Data((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null)),null,null);
			                                            Node head = new Node(new Data("array"),m,((DesignatorContext)_localctx).a.treeS);
			                                            ((DesignatorContext)_localctx).treeS =  head;
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
		public Set set;
		public boolean response;
		public int dimensionS;
		public Node treeS;
		public Elem_arrayContext e;
		public Elem_arrayContext elem_array;
		public Elem_arrayContext elem_array() {
			return getRuleContext(Elem_arrayContext.class,0);
		}
		public Array_accessContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Array_accessContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final Array_accessContext array_access(IdentifiersTable idTH,Set set) throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 64, RULE_array_access);
		try {
			setState(423);
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
				setState(418); 
				match(T__19);
				setState(419); 
				((Array_accessContext)_localctx).e = ((Array_accessContext)_localctx).elem_array = elem_array(idTH, set);
				setState(420); 
				match(T__20);
				((Array_accessContext)_localctx).response =  true; ((Array_accessContext)_localctx).dimensionS =  ((Array_accessContext)_localctx).elem_array.dimensionS; if(isSet && _localctx.set!=null && ((Array_accessContext)_localctx).e.treeS!=null){ ((Array_accessContext)_localctx).treeS =  ((Array_accessContext)_localctx).e.treeS;}
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
		public Set set;
		public int dimensionS;
		public Node treeS;
		public Single_expressionContext s1;
		public Single_expressionContext single_expression;
		public Single_expressionContext s2;
		public List<Single_expressionContext> single_expression() {
			return getRuleContexts(Single_expressionContext.class);
		}
		public Single_expressionContext single_expression(int i) {
			return getRuleContext(Single_expressionContext.class,i);
		}
		public Elem_arrayContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Elem_arrayContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final Elem_arrayContext elem_array(IdentifiersTable idTH,Set set) throws RecognitionException {
		Elem_arrayContext _localctx = new Elem_arrayContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 66, RULE_elem_array);

		                int dimension = 0;
		                ((Elem_arrayContext)_localctx).treeS =  null;
		                Node head = null;
		                Node right = null;
		           
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); 
			((Elem_arrayContext)_localctx).s1 = ((Elem_arrayContext)_localctx).single_expression = single_expression(idTH, set);

			                                      dimension++;
			                                      if(!(((Elem_arrayContext)_localctx).single_expression.typeS == "integer"))
			                                           {
			                                            //ErrorMessage.errorSemantic((((Elem_arrayContext)_localctx).single_expression!=null?_input.getText(((Elem_arrayContext)_localctx).single_expression.start,((Elem_arrayContext)_localctx).single_expression.stop):null),((Elem_arrayContext)_localctx).single_expression.line,((Elem_arrayContext)_localctx).single_expression.pos,ErrorMessage.type(((Elem_arrayContext)_localctx).single_expression.typeS,"integer"));
			                                            e.addMessage(((Elem_arrayContext)_localctx).single_expression.line,((Elem_arrayContext)_localctx).single_expression.pos,ErrorMessage.semantic((((Elem_arrayContext)_localctx).single_expression!=null?_input.getText(((Elem_arrayContext)_localctx).single_expression.start,((Elem_arrayContext)_localctx).single_expression.stop):null),ErrorMessage.type(((Elem_arrayContext)_localctx).single_expression.typeS,"integer")));
			                                           }
			                                      if(isSet && _localctx.set!=null && head == null){
			                                        head = new Node(new Data("args"),((Elem_arrayContext)_localctx).s1.treeS,null);
			                                        right = head;
			                                      }
			                                    
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(427); 
				match(T__7);
				setState(428); 
				((Elem_arrayContext)_localctx).s2 = ((Elem_arrayContext)_localctx).single_expression = single_expression(idTH, set);

				                                        dimension++;
				                                        if(!(((Elem_arrayContext)_localctx).single_expression.typeS == "integer")){
				                                            //ErrorMessage.errorSemantic((((Elem_arrayContext)_localctx).single_expression!=null?_input.getText(((Elem_arrayContext)_localctx).single_expression.start,((Elem_arrayContext)_localctx).single_expression.stop):null),((Elem_arrayContext)_localctx).single_expression.line,((Elem_arrayContext)_localctx).single_expression.pos,ErrorMessage.type(((Elem_arrayContext)_localctx).single_expression.typeS,"integer"));
				                                            e.addMessage(((Elem_arrayContext)_localctx).single_expression.line,((Elem_arrayContext)_localctx).single_expression.pos,ErrorMessage.semantic((((Elem_arrayContext)_localctx).single_expression!=null?_input.getText(((Elem_arrayContext)_localctx).single_expression.start,((Elem_arrayContext)_localctx).single_expression.stop):null),ErrorMessage.type(((Elem_arrayContext)_localctx).single_expression.typeS,"integer")));
				                                        }
				                                        if(isSet && _localctx.set!=null){
				                                            Node m = new Node(new Data("args"),((Elem_arrayContext)_localctx).s2.treeS,null);
				                                            right.setRight(m);
				                                            right = m;
				                                        }
				                                    
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			              ((Elem_arrayContext)_localctx).dimensionS =  dimension;
			              if(isSet && _localctx.set!=null && head!=null){
			                ((Elem_arrayContext)_localctx).treeS =  head;
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
		public IdentifiersTable idTH;
		public Set set;
		public Node treeS;
		public IdentifierContext i;
		public Sub_prg_argsContext s;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Sub_prg_argsContext sub_prg_args() {
			return getRuleContext(Sub_prg_argsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Function_callContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final Function_callContext function_call(IdentifiersTable idTH,Set set) throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 68, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438); 
			((Function_callContext)_localctx).i = identifier();
			setState(439); 
			match(T__25);
			setState(440); 
			((Function_callContext)_localctx).s = sub_prg_args(idTH, set);
			setState(441); 
			match(T__26);
			if(isSet && _localctx.set!=null){Node m = new Node(new Data("call"),new Node(new Data((((Function_callContext)_localctx).i!=null?_input.getText(((Function_callContext)_localctx).i.start,((Function_callContext)_localctx).i.stop):null)),null,null),((Function_callContext)_localctx).s.treeS);}
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
		public Set set;
		public Node treeS;
		public ArgsContext a;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Sub_prg_argsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Sub_prg_argsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final Sub_prg_argsContext sub_prg_args(IdentifiersTable idTH,Set set) throws RecognitionException {
		Sub_prg_argsContext _localctx = new Sub_prg_argsContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 70, RULE_sub_prg_args);
		try {
			setState(448);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				if(isSet && _localctx.set!=null){((Sub_prg_argsContext)_localctx).treeS =  null;}
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
				setState(445); 
				((Sub_prg_argsContext)_localctx).a = args(idTH, set);
				if(isSet && _localctx.set!=null){((Sub_prg_argsContext)_localctx).treeS =  ((Sub_prg_argsContext)_localctx).a.treeS;}
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
		public Set set;
		public Node treeS;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final ArgsContext args(IdentifiersTable idTH,Set set) throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 72, RULE_args);

		        Node head = null;
		        Node m = null;
		     
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); 
			((ArgsContext)_localctx).e1 = expression(idTH, set);
			if(isSet && _localctx.set!=null){ head = new Node(new Data("args"),((ArgsContext)_localctx).e1.treeS,null); m = head;}
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(452); 
				match(T__7);
				setState(453); 
				((ArgsContext)_localctx).e2 = expression(idTH, set);
				if(isSet && _localctx.set!=null){ m.setRight(new Node(new Data("args"),((ArgsContext)_localctx).e2.treeS,null)); m = m.getRight();}
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        if(isSet && _localctx.set!=null){
			            ((ArgsContext)_localctx).treeS =  head;
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
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
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
		public ExpressionContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final ExpressionContext expression(IdentifiersTable idTH,Set set) throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 74, RULE_expression);

		                ((ExpressionContext)_localctx).typeS =  null;
		                boolean correctType = true;
		                boolean relationExp = false;
		                Node n = null;

		            
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); 
			((ExpressionContext)_localctx).s1 = single_expression(idTH, set);
			((ExpressionContext)_localctx).line =  ((ExpressionContext)_localctx).s1.line; ((ExpressionContext)_localctx).pos =  ((ExpressionContext)_localctx).s1.pos; if(isSet && _localctx.set!=null && ((ExpressionContext)_localctx).s1.treeS!=null){ n = ((ExpressionContext)_localctx).s1.treeS;}
			setState(469);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(465); 
				((ExpressionContext)_localctx).rel_op = rel_op();
				setState(466); 
				((ExpressionContext)_localctx).s2 = single_expression(idTH,set);
				   relationExp = true;
				                    if(!(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("in")){
				                        if((((ExpressionContext)_localctx).s1.typeS != null) && ((ExpressionContext)_localctx).s1.typeS.equals(((ExpressionContext)_localctx).rel_op.typeS)){
				                            if((((ExpressionContext)_localctx).s2.typeS !=null) && ((ExpressionContext)_localctx).rel_op.typeS.equals(((ExpressionContext)_localctx).s2.typeS)){
				                                ((ExpressionContext)_localctx).typeS =  "boolean";
				                            }else{
				                                correctType = false;
				                            }
				                        }else{
				                            correctType = false;
				                        }
				                        if(!correctType){
				                            e.addMessage(((ExpressionContext)_localctx).s1.line,((ExpressionContext)_localctx).s1.pos,ErrorMessage.semantic((((ExpressionContext)_localctx).s1!=null?_input.getText(((ExpressionContext)_localctx).s1.start,((ExpressionContext)_localctx).s1.stop):null)+" "+(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null)+" "+(((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null),ErrorMessage.typeExpression(((ExpressionContext)_localctx).s1.typeS,(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null),((ExpressionContext)_localctx).s2.typeS,((ExpressionContext)_localctx).rel_op.typeS,((ExpressionContext)_localctx).rel_op.typeS)+" < expression 1"));
				                        }
				                    }else{
				                        if((((ExpressionContext)_localctx).s1.typeS != null) && (((ExpressionContext)_localctx).s1.typeS.equals("integer"))){
				                            if((((ExpressionContext)_localctx).s2.typeS != null) && (((ExpressionContext)_localctx).s2.typeS.equals("set"))){
				                                ((ExpressionContext)_localctx).typeS =  "boolean" ;
				                            }else{
				                                correctType = false;
				                            }
				                        }else{
				                            correctType = false;
				                        }
				                        if(!correctType){
				                            // 'integer' in 'set'
				                            e.addMessage(((ExpressionContext)_localctx).s1.line,((ExpressionContext)_localctx).s1.pos,ErrorMessage.semantic((((ExpressionContext)_localctx).s1!=null?_input.getText(((ExpressionContext)_localctx).s1.start,((ExpressionContext)_localctx).s1.stop):null)+" "+(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null)+" "+(((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null),ErrorMessage.typeExpression(((ExpressionContext)_localctx).s1.typeS,(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null),((ExpressionContext)_localctx).s2.typeS,"integer","set")+" < expression 2"));
				                        }
				                    }
				                    if(isSet && _localctx.set!=null){
				                        Node m = new Node(new Data((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null)),((ExpressionContext)_localctx).s1.treeS,((ExpressionContext)_localctx).s2.treeS);
				                        n = m;
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
			                if(isSet && n!=null && _localctx.set!=null){
			                    ((ExpressionContext)_localctx).treeS =  n;
			                    //System.out.println((((ExpressionContext)_localctx).s1!=null?_input.getText(((ExpressionContext)_localctx).s1.start,((ExpressionContext)_localctx).s1.stop):null)+(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null)+(((ExpressionContext)_localctx).s2!=null?_input.getText(((ExpressionContext)_localctx).s2.start,((ExpressionContext)_localctx).s2.stop):null)+" : "+n.toStringSort("infix"));
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
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
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
		public Single_expressionContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final Single_expressionContext single_expression(IdentifiersTable idTH,Set set) throws RecognitionException {
		Single_expressionContext _localctx = new Single_expressionContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 76, RULE_single_expression);

		                    ((Single_expressionContext)_localctx).typeS =  null;
		                    boolean correctType = true;
		                    boolean firstTime = true;
		                    String leftType = null;
		                    Node n = null;

		                    //Tratar os erros com mais especificaçoes
		                    LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();
		                  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473); 
			((Single_expressionContext)_localctx).t1 = ((Single_expressionContext)_localctx).term = term(idTH, set);
			((Single_expressionContext)_localctx).line =  ((Single_expressionContext)_localctx).term.line; ((Single_expressionContext)_localctx).pos =  ((Single_expressionContext)_localctx).term.pos; errorManagement.add(new ErrorInfo((((Single_expressionContext)_localctx).t1!=null?_input.getText(((Single_expressionContext)_localctx).t1.start,((Single_expressionContext)_localctx).t1.stop):null),((Single_expressionContext)_localctx).t1.typeS,((Single_expressionContext)_localctx).t1.line,((Single_expressionContext)_localctx).t1.pos)); if(_localctx.set!=null && isSet && ((Single_expressionContext)_localctx).t1.treeS!=null){ n = ((Single_expressionContext)_localctx).t1.treeS; }
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				{
				setState(475); 
				((Single_expressionContext)_localctx).add_op = add_op();
				setState(476); 
				((Single_expressionContext)_localctx).t2 = ((Single_expressionContext)_localctx).term = term(idTH, set);

				                                        errorManagement.add(new ErrorInfo((((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null),((Single_expressionContext)_localctx).add_op.typeS,((Single_expressionContext)_localctx).add_op.line,((Single_expressionContext)_localctx).add_op.pos));
				                                        errorManagement.add(new ErrorInfo((((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null),((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).t2.line,((Single_expressionContext)_localctx).t2.pos));


				                                        if(firstTime){
				                                            firstTime = false;
				                                            if((((Single_expressionContext)_localctx).t1.typeS != null) && ((Single_expressionContext)_localctx).t1.typeS.equals(((Single_expressionContext)_localctx).add_op.typeS)){
				                                                if((((Single_expressionContext)_localctx).t2.typeS != null) && ((Single_expressionContext)_localctx).add_op.typeS.equals(((Single_expressionContext)_localctx).t2.typeS)){
				                                                    leftType = ((Single_expressionContext)_localctx).add_op.typeS;

				                                                }else{
				                                                    e.addMessage(((Single_expressionContext)_localctx).t1.line,((Single_expressionContext)_localctx).t1.pos,ErrorMessage.semantic((((Single_expressionContext)_localctx).t1!=null?_input.getText(((Single_expressionContext)_localctx).t1.start,((Single_expressionContext)_localctx).t1.stop):null)+" "+(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null)+" "+(((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null),ErrorMessage.typeExpression(((Single_expressionContext)_localctx).t1.typeS,(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null),((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).add_op.typeS,((Single_expressionContext)_localctx).add_op.typeS)+" < single_Expression 1"));
				                                                    correctType = false;

				                                                }
				                                            }else{
				                                                e.addMessage(((Single_expressionContext)_localctx).t1.line,((Single_expressionContext)_localctx).t1.pos,ErrorMessage.semantic((((Single_expressionContext)_localctx).t1!=null?_input.getText(((Single_expressionContext)_localctx).t1.start,((Single_expressionContext)_localctx).t1.stop):null)+" "+(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null)+" "+(((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null),ErrorMessage.typeExpression(((Single_expressionContext)_localctx).t1.typeS,(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null),((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).add_op.typeS,((Single_expressionContext)_localctx).add_op.typeS)+" < single_Expression 2"));
				                                                correctType = false;
				                                            }
				                                        }else{
				                                            errorManagement.pop();
				                                            errorManagement.pop();

				                                            ErrorInfo leftVar = errorManagement.get(0);

				                                            if( (leftType != null) && leftType.equals(((Single_expressionContext)_localctx).add_op.typeS)){
				                                                if((((Single_expressionContext)_localctx).t2.typeS != null) && ((Single_expressionContext)_localctx).add_op.typeS.equals(((Single_expressionContext)_localctx).t2.typeS)){
				                                                    leftType = ((Single_expressionContext)_localctx).add_op.typeS;
				                                                }else{
				                                                    e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null)+" "+(((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null),ErrorMessage.typeExpression(leftVar.getType(),(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null),((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).add_op.typeS,((Single_expressionContext)_localctx).add_op.typeS)+" < single_Expression 3"));
				                                                    correctType = false;
				                                                }
				                                            }else{
				                                                e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null)+" "+(((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null),ErrorMessage.typeExpression(leftVar.getType(),(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null),((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).add_op.typeS,((Single_expressionContext)_localctx).add_op.typeS)+" < single_Expression 4"));
				                                                correctType = false;
				                                            }

				                                        }

				                                        if(isSet && _localctx.set != null){
				                                            Node m = new Node(new Data((((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null)),n,((Single_expressionContext)_localctx).t2.treeS);
				                                            n = m;
				                                        }

				                                     
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                        if(correctType == true){
			                            ((Single_expressionContext)_localctx).typeS =  ((Single_expressionContext)_localctx).t1.typeS;
			                        }
			                        if(isSet && n!=null && _localctx.set!=null){
			                            ((Single_expressionContext)_localctx).treeS =  n;
			                            //System.out.println("woot "+n.toStringSort("infix"));
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
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
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
		public TermContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final TermContext term(IdentifiersTable idTH,Set set) throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 78, RULE_term);

		        ((TermContext)_localctx).typeS =  null;
		        boolean correctType = true;
		        boolean firstTime = true;
		        String leftType = null;
		        ((TermContext)_localctx).treeS =  null;
		        Node n = null;

		        //Tratar os erros com mais especificaçoes (queue de erros de infromaçoes)
		        LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();
		     
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); 
			((TermContext)_localctx).f1 = factor(idTH, set);
			 ((TermContext)_localctx).line =  ((TermContext)_localctx).f1.line; ((TermContext)_localctx).pos =  ((TermContext)_localctx).f1.pos;  errorManagement.add(new ErrorInfo((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null), ((TermContext)_localctx).f1.typeS, ((TermContext)_localctx).f1.line,((TermContext)_localctx).f1.pos)); if(_localctx.set!=null && isSet && ((TermContext)_localctx).f1.treeS!=null){ n = ((TermContext)_localctx).f1.treeS; } 
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				{
				setState(488); 
				((TermContext)_localctx).mul_op = mul_op();
				setState(489); 
				((TermContext)_localctx).f2 = factor(idTH, set);


				                                errorManagement.add(new ErrorInfo((((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null),((TermContext)_localctx).mul_op.typeS,((TermContext)_localctx).mul_op.line,((TermContext)_localctx).mul_op.pos));
				                                errorManagement.add(new ErrorInfo((((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null),((TermContext)_localctx).f2.typeS,((TermContext)_localctx).f2.line,((TermContext)_localctx).f2.pos));

				                                if(firstTime){
				                                    firstTime = false;
				                                    if((((TermContext)_localctx).f1.typeS != null) && ((TermContext)_localctx).f1.typeS.equals(((TermContext)_localctx).mul_op.typeS)){
				                                        if((((TermContext)_localctx).f2.typeS != null) && ((TermContext)_localctx).mul_op.typeS.equals(((TermContext)_localctx).f2.typeS)){
				                                            leftType = ((TermContext)_localctx).mul_op.typeS;
				                                        }else{
				                                            e.addMessage(((TermContext)_localctx).f1.line,((TermContext)_localctx).f1.pos,ErrorMessage.semantic((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null)+" "+(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null)+" "+(((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null),ErrorMessage.typeExpression(((TermContext)_localctx).f1.typeS,(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null),((TermContext)_localctx).f2.typeS,((TermContext)_localctx).mul_op.typeS,((TermContext)_localctx).mul_op.typeS)+" < term1"));
				                                            correctType = false;
				                                        }
				                                    }else{
				                                        e.addMessage(((TermContext)_localctx).f1.line,((TermContext)_localctx).f1.pos,ErrorMessage.semantic((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null)+" "+(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null)+" "+(((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null),ErrorMessage.typeExpression(((TermContext)_localctx).f1.typeS,(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null),((TermContext)_localctx).f2.typeS,((TermContext)_localctx).mul_op.typeS,((TermContext)_localctx).mul_op.typeS)+" < term2"));
				                                        correctType = false;
				                                    }
				                                }else{

				                                        errorManagement.pop();
				                                        errorManagement.pop();

				                                        ErrorInfo leftVar = errorManagement.get(0);

				                                        if((leftType != null) && leftType.equals(((TermContext)_localctx).mul_op.typeS)){
				                                            if((((TermContext)_localctx).f2.typeS != null) && ((TermContext)_localctx).mul_op.typeS.equals(((TermContext)_localctx).f2.typeS)){
				                                                leftType = ((TermContext)_localctx).mul_op.typeS;
				                                            }else{
				                                                e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null)+" "+(((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null),ErrorMessage.typeExpression(leftVar.getType(),(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null),((TermContext)_localctx).f2.typeS,((TermContext)_localctx).mul_op.typeS,((TermContext)_localctx).mul_op.typeS)+" < term3"));
				                                                correctType = false;
				                                            }
				                                        }else{
				                                            String identifier = errorManagement.get(0).getIdentifier();
				                                            e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null)+" "+(((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null),ErrorMessage.typeExpression(leftVar.getType(),(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null),((TermContext)_localctx).f2.typeS,((TermContext)_localctx).mul_op.typeS,((TermContext)_localctx).mul_op.typeS)+" < term4"));
				                                            correctType = false;
				                                        }

				                                }

				                                //Algorithm for inserting elements in the set
				                                if(isSet && _localctx.set != null){
				                                    Node m = new Node(new Data((((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null)),n,((TermContext)_localctx).f2.treeS);
				                                    n = m;
				                                }


				                          
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            if(correctType == true){
			                ((TermContext)_localctx).typeS =  ((TermContext)_localctx).f1.typeS;
			            }
			            if(isSet && n!=null && _localctx.set!=null){
			                ((TermContext)_localctx).treeS =  n;
			                //System.out.println("woot "+n.toStringSort("infix"));
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
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
		public Inic_varContext i;
		public DesignatorContext d;
		public ExpressionContext e;
		public FactorContext f1;
		public Function_callContext f2;
		public SpecialFunctionsContext s;
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
		public FactorContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final FactorContext factor(IdentifiersTable idTH,Set set) throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 80, RULE_factor);

		        //if(isSet && _localctx.set!=null){System.out.println(_localctx.set.toString());}  //Set funciona muito bem até aqui
		        ((FactorContext)_localctx).treeS =  null;
		       
		try {
			setState(520);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499); 
				((FactorContext)_localctx).i = inic_var(idTH, set);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).i.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).i.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).i.pos; if(isSet && ((FactorContext)_localctx).i.treeS!=null && _localctx.set!=null){ ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).i.treeS;}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502); 
				((FactorContext)_localctx).d = designator(idTH, set);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).d.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).d.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).d.pos; if(isSet && ((FactorContext)_localctx).d.treeS!=null && _localctx.set!=null){ ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).d.treeS;}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(505); 
				match(T__25);
				setState(506); 
				((FactorContext)_localctx).e = expression(idTH, set);
				setState(507); 
				match(T__26);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).e.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).e.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).e.pos; if(isSet && ((FactorContext)_localctx).e.treeS!=null && _localctx.set!=null){ ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).e.treeS;}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(510); 
				match(T__28);
				setState(511); 
				((FactorContext)_localctx).f1 = factor(idTH, set);

				            ((FactorContext)_localctx).line =  ((FactorContext)_localctx).f1.line;
				            ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).f1.pos;
				            if(((FactorContext)_localctx).f1.typeS!=null && ((FactorContext)_localctx).f1.typeS.equals("boolean")){
				                ((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).f1.typeS;
				            }else{
				                ((FactorContext)_localctx).typeS =  null;
				                e.addMessage(((FactorContext)_localctx).f1.line,((FactorContext)_localctx).f1.pos,ErrorMessage.semantic((((FactorContext)_localctx).f1!=null?_input.getText(((FactorContext)_localctx).f1.start,((FactorContext)_localctx).f1.stop):null),ErrorMessage.type(((FactorContext)_localctx).f1.typeS,"boolean")));
				            }
				            if(isSet && _localctx.set!=null){
				                Node n = new Node(new Data("not"),((FactorContext)_localctx).f1.treeS,null);
				                ((FactorContext)_localctx).treeS =  n;
				            }
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(514); 
				((FactorContext)_localctx).f2 = function_call(idTH, set);
				((FactorContext)_localctx).typeS =  null; if(isSet && _localctx.set!=null){((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).f2.treeS;}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(517); 
				((FactorContext)_localctx).s = specialFunctions(idTH, set);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).s.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).s.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).s.pos; if(isSet && ((FactorContext)_localctx).s.treeS!=null && _localctx.set!=null){ ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).s.treeS;}
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
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
		public TailContext t;
		public TailContext tail;
		public HeadContext h;
		public HeadContext head;
		public ConsContext c;
		public ConsContext cons;
		public MemberContext m;
		public MemberContext member;
		public Is_emptyContext i;
		public Is_emptyContext is_empty;
		public LengthContext l;
		public LengthContext length;
		public DeleteContext d;
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
		public SpecialFunctionsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final SpecialFunctionsContext specialFunctions(IdentifiersTable idTH,Set set) throws RecognitionException {
		SpecialFunctionsContext _localctx = new SpecialFunctionsContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 82, RULE_specialFunctions);
		try {
			setState(543);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(522); 
				((SpecialFunctionsContext)_localctx).t = ((SpecialFunctionsContext)_localctx).tail = tail(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).tail.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).tail.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).tail.pos; if(isSet && ((SpecialFunctionsContext)_localctx).t.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).t.treeS;}
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(525); 
				((SpecialFunctionsContext)_localctx).h = ((SpecialFunctionsContext)_localctx).head = head(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).head.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).head.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).head.pos; if(isSet && ((SpecialFunctionsContext)_localctx).h.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).h.treeS;}
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(528); 
				((SpecialFunctionsContext)_localctx).c = ((SpecialFunctionsContext)_localctx).cons = cons(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).cons.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).cons.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).cons.pos; if(isSet && ((SpecialFunctionsContext)_localctx).c.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).c.treeS;}
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 4);
				{
				setState(531); 
				((SpecialFunctionsContext)_localctx).m = ((SpecialFunctionsContext)_localctx).member = member(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).member.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).member.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).member.pos; if(isSet && ((SpecialFunctionsContext)_localctx).m.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).m.treeS;}
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 5);
				{
				setState(534); 
				((SpecialFunctionsContext)_localctx).i = ((SpecialFunctionsContext)_localctx).is_empty = is_empty(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).is_empty.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).is_empty.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).is_empty.pos; if(isSet && ((SpecialFunctionsContext)_localctx).i.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).i.treeS;}
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 6);
				{
				setState(537); 
				((SpecialFunctionsContext)_localctx).l = ((SpecialFunctionsContext)_localctx).length = length(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).length.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).length.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).length.pos; if(isSet && ((SpecialFunctionsContext)_localctx).l.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).l.treeS;}
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 7);
				{
				setState(540); 
				((SpecialFunctionsContext)_localctx).d = ((SpecialFunctionsContext)_localctx).delete = delete(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).delete.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).delete.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).delete.pos; if(isSet && ((SpecialFunctionsContext)_localctx).d.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).d.treeS;}
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
			setState(553);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(545); 
				((Add_opContext)_localctx).a = match(T__17);
				((Add_opContext)_localctx).typeS =  "integer"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(547); 
				((Add_opContext)_localctx).a = match(T__18);
				((Add_opContext)_localctx).typeS =  "integer"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(549); 
				((Add_opContext)_localctx).a = match(T__29);
				((Add_opContext)_localctx).typeS =  "boolean"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(551); 
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
			setState(563);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(555); 
				((Mul_opContext)_localctx).m = match(T__31);
				((Mul_opContext)_localctx).typeS =  "integer"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(557); 
				((Mul_opContext)_localctx).m = match(T__32);
				((Mul_opContext)_localctx).typeS =  "integer"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(559); 
				((Mul_opContext)_localctx).m = match(T__33);
				((Mul_opContext)_localctx).typeS =  "boolean"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(561); 
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
			setState(579);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(565); 
				((Rel_opContext)_localctx).r = match(T__35);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(567); 
				((Rel_opContext)_localctx).r = match(T__36);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(569); 
				((Rel_opContext)_localctx).r = match(T__37);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(571); 
				((Rel_opContext)_localctx).r = match(T__38);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 5);
				{
				setState(573); 
				((Rel_opContext)_localctx).r = match(T__39);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(575); 
				((Rel_opContext)_localctx).r = match(T__40);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 7);
				{
				setState(577); 
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
			setState(581); 
			write_expr();
			setState(582); 
			match(T__25);
			setState(583); 
			print_what(idTH);
			setState(584); 
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
			setState(586);
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
		public ExpressionContext e;
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

		              Set tree = null;
		           
		try {
			setState(592);
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
				setState(589); 
				((Print_whatContext)_localctx).e = expression(idTH, tree);
				if(!(((Print_whatContext)_localctx).e.typeS != null && ((Print_whatContext)_localctx).e.typeS.equals("set"))){e.addMessage(((Print_whatContext)_localctx).e.line,((Print_whatContext)_localctx).e.pos,ErrorMessage.semantic((((Print_whatContext)_localctx).e!=null?_input.getText(((Print_whatContext)_localctx).e.start,((Print_whatContext)_localctx).e.stop):null),ErrorMessage.type(((Print_whatContext)_localctx).e.typeS,"integer | boolean | sequence | array")));}
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
		public IdentifiersTable idTH;
		public IdentifierContext i;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Read_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Read_statementContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Read_statementContext read_statement(IdentifiersTable idTH) throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState(), idTH);
		enterRule(_localctx, 96, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594); 
			match(T__44);
			setState(595); 
			match(T__25);
			setState(596); 
			((Read_statementContext)_localctx).i = identifier();
			setState(597); 
			match(T__26);

			                  Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((Read_statementContext)_localctx).i!=null?_input.getText(((Read_statementContext)_localctx).i.start,((Read_statementContext)_localctx).i.stop):null));
			                  if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //verificar se existe e é tipo inteiro e class VAR
			                    e.addMessage(((Read_statementContext)_localctx).i.line,((Read_statementContext)_localctx).i.pos,ErrorMessage.semantic((((Read_statementContext)_localctx).i!=null?_input.getText(((Read_statementContext)_localctx).i.start,((Read_statementContext)_localctx).i.stop):null),ErrorMessage.type(v.getInfoType(),"integer")));
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
			setState(600); 
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
			setState(604);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(602); 
				for_stat(idTH);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(603); 
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
		public ExpressionContext e1;
		public StatementsContext s;
		public Else_expressionContext e2;
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

		                    Set tree = null;
		                  
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606); 
			match(T__45);
			setState(607); 
			match(T__25);
			setState(608); 
			((If_then_else_statContext)_localctx).e1 = expression(idTH, tree);
			setState(609); 
			match(T__26);
			 if(!(((If_then_else_statContext)_localctx).e1.typeS!=null && ((If_then_else_statContext)_localctx).e1.typeS.equals("boolean"))){e.addMessage(((If_then_else_statContext)_localctx).e1.line,((If_then_else_statContext)_localctx).e1.pos,ErrorMessage.semantic((((If_then_else_statContext)_localctx).e1!=null?_input.getText(((If_then_else_statContext)_localctx).e1.start,((If_then_else_statContext)_localctx).e1.stop):null),ErrorMessage.type(((If_then_else_statContext)_localctx).e1.typeS,"boolean")));}
			setState(611); 
			match(T__46);
			setState(612); 
			match(T__1);
			setState(613); 
			((If_then_else_statContext)_localctx).s = statements(idTH);
			setState(614); 
			match(T__4);
			setState(615); 
			((If_then_else_statContext)_localctx).e2 = else_expression(idTH);
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
			setState(623);
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
				setState(618); 
				match(T__47);
				setState(619); 
				match(T__1);
				setState(620); 
				statements(idTH);
				setState(621); 
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
			setState(625); 
			match(T__48);
			setState(626); 
			match(T__25);
			setState(627); 
			interval(idTH);
			setState(628); 
			match(T__26);
			setState(629); 
			step();
			setState(630); 
			satisfy(idTH);
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

	public static class IntervalContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public IdentifierContext i;
		public Type_intervalContext type_interval() {
			return getRuleContext(Type_intervalContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IntervalContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final IntervalContext interval(IdentifiersTable idTH) throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState(), idTH);
		enterRule(_localctx, 108, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); 
			((IntervalContext)_localctx).i = identifier();
			setState(636); 
			type_interval(idTH);

			            Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((IntervalContext)_localctx).i!=null?_input.getText(((IntervalContext)_localctx).i.start,((IntervalContext)_localctx).i.stop):null));
			            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){   //identifier tem que pertencer a tabela, cat VAR e tipo inteiro
			                e.addMessage(((IntervalContext)_localctx).i.line,((IntervalContext)_localctx).i.pos,ErrorMessage.semantic((((IntervalContext)_localctx).i!=null?_input.getText(((IntervalContext)_localctx).i.start,((IntervalContext)_localctx).i.stop):null),ErrorMessage.type(v.getInfoType(),"integer")));
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

	public static class Type_intervalContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public IdentifierContext i;
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_intervalContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Type_intervalContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Type_intervalContext type_interval(IdentifiersTable idTH) throws RecognitionException {
		Type_intervalContext _localctx = new Type_intervalContext(_ctx, getState(), idTH);
		enterRule(_localctx, 110, RULE_type_interval);
		try {
			setState(645);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(639); 
				match(T__41);
				setState(640); 
				range(idTH);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(641); 
				match(T__49);
				setState(642); 
				((Type_intervalContext)_localctx).i = identifier();

				                Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((Type_intervalContext)_localctx).i!=null?_input.getText(((Type_intervalContext)_localctx).i.start,((Type_intervalContext)_localctx).i.stop):null));
				                if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("array"))){   //identifier => Array e cat VAR
				                    e.addMessage(((Type_intervalContext)_localctx).i.line,((Type_intervalContext)_localctx).i.pos,ErrorMessage.semantic((((Type_intervalContext)_localctx).i!=null?_input.getText(((Type_intervalContext)_localctx).i.start,((Type_intervalContext)_localctx).i.stop):null),ErrorMessage.type(v.getInfoType(),"integer")));
				                }
				              
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
		public IdentifiersTable idTH;
		public MinimumContext minimum() {
			return getRuleContext(MinimumContext.class,0);
		}
		public MaximumContext maximum() {
			return getRuleContext(MaximumContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RangeContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final RangeContext range(IdentifiersTable idTH) throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState(), idTH);
		enterRule(_localctx, 112, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647); 
			minimum(idTH);
			setState(648); 
			match(T__50);
			setState(649); 
			maximum(idTH);
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
		public IdentifiersTable idTH;
		public IdentifierContext i;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MinimumContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MinimumContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final MinimumContext minimum(IdentifiersTable idTH) throws RecognitionException {
		MinimumContext _localctx = new MinimumContext(_ctx, getState(), idTH);
		enterRule(_localctx, 114, RULE_minimum);
		try {
			setState(655);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(651); 
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(652); 
				((MinimumContext)_localctx).i = identifier();

				            Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((MinimumContext)_localctx).i!=null?_input.getText(((MinimumContext)_localctx).i.start,((MinimumContext)_localctx).i.stop):null));
				            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //tem que existir e tem que ser variavel tipo inteiro , cat VAR
				                e.addMessage(((MinimumContext)_localctx).i.line,((MinimumContext)_localctx).i.pos,ErrorMessage.semantic((((MinimumContext)_localctx).i!=null?_input.getText(((MinimumContext)_localctx).i.start,((MinimumContext)_localctx).i.stop):null),ErrorMessage.type(v.getInfoType(),"integer")));
				            }
				         
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
		public IdentifiersTable idTH;
		public IdentifierContext i;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MaximumContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MaximumContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final MaximumContext maximum(IdentifiersTable idTH) throws RecognitionException {
		MaximumContext _localctx = new MaximumContext(_ctx, getState(), idTH);
		enterRule(_localctx, 116, RULE_maximum);
		try {
			setState(661);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(657); 
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(658); 
				((MaximumContext)_localctx).i = identifier();

				            Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((MaximumContext)_localctx).i!=null?_input.getText(((MaximumContext)_localctx).i.start,((MaximumContext)_localctx).i.stop):null));
				            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //tem que existir e tem que ser variavel tipo inteiro , cat VAR
				                e.addMessage(((MaximumContext)_localctx).i.line,((MaximumContext)_localctx).i.pos,ErrorMessage.semantic((((MaximumContext)_localctx).i!=null?_input.getText(((MaximumContext)_localctx).i.start,((MaximumContext)_localctx).i.stop):null),ErrorMessage.type(v.getInfoType(),"integer")));
				            }
				        
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
			setState(667);
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
				setState(664); 
				up_down();
				setState(665); 
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
			setState(669);
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
		public ExpressionContext e;
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

		            Set tree = null;
		        
		try {
			setState(676);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(672); 
				match(T__53);
				setState(673); 
				((SatisfyContext)_localctx).e = expression(idTH, tree);

				            if(!(((SatisfyContext)_localctx).e.typeS !=null && ((SatisfyContext)_localctx).e.typeS.equals("boolean"))){
				                e.addMessage(((SatisfyContext)_localctx).e.line,((SatisfyContext)_localctx).e.pos,ErrorMessage.semantic((((SatisfyContext)_localctx).e!=null?_input.getText(((SatisfyContext)_localctx).e.start,((SatisfyContext)_localctx).e.stop):null),ErrorMessage.type(((SatisfyContext)_localctx).e.typeS,"boolean")));
				            }
				        
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
		public ExpressionContext e;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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

		              Set tree = null;
		           
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678); 
			match(T__54);
			setState(679); 
			match(T__25);
			setState(680); 
			((While_statContext)_localctx).e = expression(idTH, tree);
			setState(681); 
			match(T__26);
			 if(!(((While_statContext)_localctx).e.typeS!=null && ((While_statContext)_localctx).e.typeS.equals("boolean"))){e.addMessage(((While_statContext)_localctx).e.line,((While_statContext)_localctx).e.pos,ErrorMessage.semantic((((While_statContext)_localctx).e!=null?_input.getText(((While_statContext)_localctx).e.start,((While_statContext)_localctx).e.stop):null),ErrorMessage.type(((While_statContext)_localctx).e.typeS,"boolean")));}
			setState(683); 
			match(T__1);
			setState(684); 
			statements(idTH);
			setState(685); 
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
		public IdentifiersTable idTH;
		public IdentifierContext i;
		public Succ_predContext succ_pred() {
			return getRuleContext(Succ_predContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Succ_or_predContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Succ_or_predContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Succ_or_predContext succ_or_pred(IdentifiersTable idTH) throws RecognitionException {
		Succ_or_predContext _localctx = new Succ_or_predContext(_ctx, getState(), idTH);
		enterRule(_localctx, 126, RULE_succ_or_pred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687); 
			succ_pred();
			setState(688); 
			((Succ_or_predContext)_localctx).i = identifier();

			                Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null));
			                if( !( (((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null).matches("^[0-9]+$") || (v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer")) ) ){
			                    e.addMessage(((Succ_or_predContext)_localctx).i.line,((Succ_or_predContext)_localctx).i.pos,ErrorMessage.semantic((((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null),ErrorMessage.type("null","integer")));
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
			setState(691);
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
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
		public Token t;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TailContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TailContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final TailContext tail(IdentifiersTable idTH,Set set) throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 130, RULE_tail);


		     
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693); 
			((TailContext)_localctx).t = match(T__57);
			setState(694); 
			match(T__25);
			setState(695); 
			((TailContext)_localctx).e = expression(idTH, set);
			setState(696); 
			match(T__26);

			        ((TailContext)_localctx).line =  (((TailContext)_localctx).t!=null?((TailContext)_localctx).t.getLine():0);
			        ((TailContext)_localctx).pos =  (((TailContext)_localctx).t!=null?((TailContext)_localctx).t.getCharPositionInLine():0);
			        if((((TailContext)_localctx).e.typeS != null) && ((TailContext)_localctx).e.typeS.equals("sequence")){
			            ((TailContext)_localctx).typeS =  ((TailContext)_localctx).e.typeS;
			        }else{
			            e.addMessage(((TailContext)_localctx).e.line,((TailContext)_localctx).e.pos,ErrorMessage.semantic((((TailContext)_localctx).e!=null?_input.getText(((TailContext)_localctx).e.start,((TailContext)_localctx).e.stop):null),ErrorMessage.type(((TailContext)_localctx).e.typeS,"sequence")));
			        }

			        if(_localctx.set!=null && isSet){
			            Node left = new Node(new Data("tail"),null,null);
			            Node n = new Node(new Data("call"),left,new Node(new Data("args"),((TailContext)_localctx).e.treeS,null));
			            ((TailContext)_localctx).treeS =  n;
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

	public static class HeadContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
		public Token h;
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public HeadContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final HeadContext head(IdentifiersTable idTH,Set set) throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 132, RULE_head);


		     
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699); 
			((HeadContext)_localctx).h = match(T__58);
			setState(700); 
			match(T__25);
			setState(701); 
			((HeadContext)_localctx).e = expression(idTH, set);
			setState(702); 
			match(T__26);

			        ((HeadContext)_localctx).line =  (((HeadContext)_localctx).h!=null?((HeadContext)_localctx).h.getLine():0);
			        ((HeadContext)_localctx).pos =  (((HeadContext)_localctx).h!=null?((HeadContext)_localctx).h.getCharPositionInLine():0);
			        if((((HeadContext)_localctx).e.typeS != null) && ((HeadContext)_localctx).e.typeS.equals("sequence")){
			            ((HeadContext)_localctx).typeS =  "integer"; 
			        }else{ 
			            e.addMessage(((HeadContext)_localctx).e.line,((HeadContext)_localctx).e.pos,ErrorMessage.semantic((((HeadContext)_localctx).e!=null?_input.getText(((HeadContext)_localctx).e.start,((HeadContext)_localctx).e.stop):null),ErrorMessage.type(((HeadContext)_localctx).e.typeS,"sequence")));
			        }

			        if(_localctx.set!=null && isSet){
			            Node left = new Node(new Data("head"),null,null);
			            Node n = new Node(new Data("call"),left,new Node(new Data("args"),((HeadContext)_localctx).e.treeS,null));
			            ((HeadContext)_localctx).treeS =  n;
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

	public static class ConsContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
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
		public ConsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final ConsContext cons(IdentifiersTable idTH,Set set) throws RecognitionException {
		ConsContext _localctx = new ConsContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 134, RULE_cons);


		     
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705); 
			((ConsContext)_localctx).c = match(T__59);
			setState(706); 
			match(T__25);
			setState(707); 
			((ConsContext)_localctx).e1 = expression(idTH, set);
			setState(708); 
			match(T__7);
			setState(709); 
			((ConsContext)_localctx).e2 = expression(idTH, set);
			setState(710); 
			match(T__26);

			            ((ConsContext)_localctx).line =  (((ConsContext)_localctx).c!=null?((ConsContext)_localctx).c.getLine():0);
			            ((ConsContext)_localctx).pos =  (((ConsContext)_localctx).c!=null?((ConsContext)_localctx).c.getCharPositionInLine():0);
			            if((((ConsContext)_localctx).e1.typeS != null) && ((ConsContext)_localctx).e1.typeS.equals("integer") ){
			                if((((ConsContext)_localctx).e2.typeS != null) && ((ConsContext)_localctx).e2.typeS.equals("sequence")){
			                    ((ConsContext)_localctx).typeS =  "sequence";
			                }else{
			                        e.addMessage(((ConsContext)_localctx).e2.line,((ConsContext)_localctx).e2.pos,ErrorMessage.semantic((((ConsContext)_localctx).e2!=null?_input.getText(((ConsContext)_localctx).e2.start,((ConsContext)_localctx).e2.stop):null),ErrorMessage.type(((ConsContext)_localctx).e2.typeS,"sequence")));
			                }
			            }else{
			                    e.addMessage(((ConsContext)_localctx).e1.line,((ConsContext)_localctx).e1.pos,ErrorMessage.semantic((((ConsContext)_localctx).e1!=null?_input.getText(((ConsContext)_localctx).e1.start,((ConsContext)_localctx).e1.stop):null),ErrorMessage.type(((ConsContext)_localctx).e1.typeS,"integer")));
			            }
			            if(_localctx.set!=null && isSet){
			                Node left = new Node(new Data("cons"),null,null);
			                Node n = new Node(new Data("call"),left,new Node(new Data("args"),((ConsContext)_localctx).e1.treeS,new Node(new Data("args"),((ConsContext)_localctx).e2.treeS,null)));
			                ((ConsContext)_localctx).treeS =  n;
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
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
		public Token d;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeleteContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final DeleteContext delete(IdentifiersTable idTH,Set set) throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 136, RULE_delete);


		       
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713); 
			((DeleteContext)_localctx).d = match(T__60);
			setState(714); 
			match(T__25);
			setState(715); 
			((DeleteContext)_localctx).e1 = expression(idTH, set);
			setState(716); 
			match(T__7);
			setState(717); 
			((DeleteContext)_localctx).e2 = expression(idTH, set);
			setState(718); 
			match(T__26);

			            ((DeleteContext)_localctx).line =  (((DeleteContext)_localctx).d!=null?((DeleteContext)_localctx).d.getLine():0);
			            ((DeleteContext)_localctx).pos =  (((DeleteContext)_localctx).d!=null?((DeleteContext)_localctx).d.getCharPositionInLine():0);
			            if((((DeleteContext)_localctx).e1.typeS != null) && ((DeleteContext)_localctx).e1.typeS.equals("integer") ){
			                if((((DeleteContext)_localctx).e2.typeS != null) && ((DeleteContext)_localctx).e2.typeS.equals("sequence")){
			                    ((DeleteContext)_localctx).typeS =  "sequence";
			                }else{
			                    e.addMessage(((DeleteContext)_localctx).e2.line,((DeleteContext)_localctx).e2.pos,ErrorMessage.semantic((((DeleteContext)_localctx).e2!=null?_input.getText(((DeleteContext)_localctx).e2.start,((DeleteContext)_localctx).e2.stop):null),ErrorMessage.type(((DeleteContext)_localctx).e2.typeS,"sequence")));
			                }
			            }else{
			                e.addMessage(((DeleteContext)_localctx).e1.line,((DeleteContext)_localctx).e1.pos,ErrorMessage.semantic((((DeleteContext)_localctx).e1!=null?_input.getText(((DeleteContext)_localctx).e1.start,((DeleteContext)_localctx).e1.stop):null),ErrorMessage.type(((DeleteContext)_localctx).e1.typeS,"integer")));
			            }
			            if(_localctx.set!=null && isSet){
			                Node left = new Node(new Data("delete"),null,null);
			                Node n = new Node(new Data("call"),left,new Node(new Data("args"),((DeleteContext)_localctx).e1.treeS,new Node(new Data("args"),((DeleteContext)_localctx).e2.treeS,null)));
			                ((DeleteContext)_localctx).treeS =  n;
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
		public IdentifiersTable idTH;
		public String typeS;
		public int line;
		public int pos;
		public IdentifierContext i1;
		public IdentifierContext i2;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Copy_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Copy_statementContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Copy_statementContext copy_statement(IdentifiersTable idTH) throws RecognitionException {
		Copy_statementContext _localctx = new Copy_statementContext(_ctx, getState(), idTH);
		enterRule(_localctx, 138, RULE_copy_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721); 
			match(T__61);
			setState(722); 
			match(T__25);
			setState(723); 
			((Copy_statementContext)_localctx).i1 = identifier();
			setState(724); 
			match(T__7);
			setState(725); 
			((Copy_statementContext)_localctx).i2 = identifier();
			setState(726); 
			match(T__26);

			                  Var v1 = (Var) _localctx.idTH.getInfoIdentifiersTable((((Copy_statementContext)_localctx).i1!=null?_input.getText(((Copy_statementContext)_localctx).i1.start,((Copy_statementContext)_localctx).i1.stop):null));
			                  Var v2 = (Var) _localctx.idTH.getInfoIdentifiersTable((((Copy_statementContext)_localctx).i2!=null?_input.getText(((Copy_statementContext)_localctx).i2.start,((Copy_statementContext)_localctx).i2.stop):null));

			                  if( !( v1 != null && v1.getInfoType().equals("sequence") && v1.getCategory().equals("VAR") ) ){
			                    e.addMessage(((Copy_statementContext)_localctx).i1.line,((Copy_statementContext)_localctx).i2.pos,ErrorMessage.semantic((((Copy_statementContext)_localctx).i1!=null?_input.getText(((Copy_statementContext)_localctx).i1.start,((Copy_statementContext)_localctx).i1.stop):null),ErrorMessage.type("boolean | sequence | integer","sequence")));
			                  }
			                  if( !( v2 != null && v2.getInfoType().equals("sequence") && v2.getCategory().equals("VAR") ) ){
			                    e.addMessage(((Copy_statementContext)_localctx).i2.line,((Copy_statementContext)_localctx).i2.pos,ErrorMessage.semantic((((Copy_statementContext)_localctx).i2!=null?_input.getText(((Copy_statementContext)_localctx).i2.start,((Copy_statementContext)_localctx).i2.stop):null),ErrorMessage.type("boolean | sequence | integer","sequence")));
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

	public static class Cat_statementContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public String typeS;
		public int line;
		public int pos;
		public IdentifierContext i1;
		public IdentifierContext i2;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Cat_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Cat_statementContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH) {
			super(parent, invokingState);
			this.idTH = idTH;
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

	public final Cat_statementContext cat_statement(IdentifiersTable idTH) throws RecognitionException {
		Cat_statementContext _localctx = new Cat_statementContext(_ctx, getState(), idTH);
		enterRule(_localctx, 140, RULE_cat_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729); 
			match(T__62);
			setState(730); 
			match(T__25);
			setState(731); 
			((Cat_statementContext)_localctx).i1 = identifier();
			setState(732); 
			match(T__7);
			setState(733); 
			((Cat_statementContext)_localctx).i2 = identifier();
			setState(734); 
			match(T__26);

			                Var v1 = (Var) _localctx.idTH.getInfoIdentifiersTable((((Cat_statementContext)_localctx).i1!=null?_input.getText(((Cat_statementContext)_localctx).i1.start,((Cat_statementContext)_localctx).i1.stop):null));
			                Var v2 = (Var) _localctx.idTH.getInfoIdentifiersTable((((Cat_statementContext)_localctx).i2!=null?_input.getText(((Cat_statementContext)_localctx).i2.start,((Cat_statementContext)_localctx).i2.stop):null));

			                if( !( v1 != null && v1.getInfoType().equals("sequence") && v1.getCategory().equals("VAR") ) ){
			                    e.addMessage(((Cat_statementContext)_localctx).i1.line,((Cat_statementContext)_localctx).i2.pos,ErrorMessage.semantic((((Cat_statementContext)_localctx).i1!=null?_input.getText(((Cat_statementContext)_localctx).i1.start,((Cat_statementContext)_localctx).i1.stop):null),ErrorMessage.type("boolean | sequence | integer","sequence")));
			                }
			                if( !( v2 != null && v2.getInfoType().equals("sequence") && v2.getCategory().equals("VAR") ) ){
			                    e.addMessage(((Cat_statementContext)_localctx).i2.line,((Cat_statementContext)_localctx).i2.pos,ErrorMessage.semantic((((Cat_statementContext)_localctx).i2!=null?_input.getText(((Cat_statementContext)_localctx).i2.start,((Cat_statementContext)_localctx).i2.stop):null),ErrorMessage.type("boolean | sequence | integer","sequence")));
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

	public static class Is_emptyContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
		public Token i;
		public ExpressionContext e1;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Is_emptyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Is_emptyContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final Is_emptyContext is_empty(IdentifiersTable idTH,Set set) throws RecognitionException {
		Is_emptyContext _localctx = new Is_emptyContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 142, RULE_is_empty);


		         
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737); 
			((Is_emptyContext)_localctx).i = match(T__63);
			setState(738); 
			match(T__25);
			setState(739); 
			((Is_emptyContext)_localctx).e1 = expression(idTH, set);
			setState(740); 
			match(T__26);

			            ((Is_emptyContext)_localctx).line =  (((Is_emptyContext)_localctx).i!=null?((Is_emptyContext)_localctx).i.getLine():0);
			            ((Is_emptyContext)_localctx).pos =  (((Is_emptyContext)_localctx).i!=null?((Is_emptyContext)_localctx).i.getCharPositionInLine():0);
			            if((((Is_emptyContext)_localctx).e1.typeS != null) && ((Is_emptyContext)_localctx).e1.typeS.equals("sequence")){
			                ((Is_emptyContext)_localctx).typeS =  "boolean";
			            }else{
			                e.addMessage(((Is_emptyContext)_localctx).e1.line,((Is_emptyContext)_localctx).e1.pos,ErrorMessage.semantic((((Is_emptyContext)_localctx).e1!=null?_input.getText(((Is_emptyContext)_localctx).e1.start,((Is_emptyContext)_localctx).e1.stop):null),ErrorMessage.type(((Is_emptyContext)_localctx).e1.typeS,"sequence")));
			            }
			            if(_localctx.set!=null && isSet){
			                Node left = new Node(new Data("is_empty"),null,null);
			                Node n = new Node(new Data("call"),left,new Node(new Data("args"),((Is_emptyContext)_localctx).e1.treeS,null));
			                ((Is_emptyContext)_localctx).treeS =  n;
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
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
		public Token l;
		public ExpressionContext e1;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LengthContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final LengthContext length(IdentifiersTable idTH,Set set) throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 144, RULE_length);


		       
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743); 
			((LengthContext)_localctx).l = match(T__64);
			setState(744); 
			match(T__25);
			setState(745); 
			((LengthContext)_localctx).e1 = expression(idTH, set);
			setState(746); 
			match(T__26);

			          ((LengthContext)_localctx).line =  (((LengthContext)_localctx).l!=null?((LengthContext)_localctx).l.getLine():0);
			          ((LengthContext)_localctx).pos =  (((LengthContext)_localctx).l!=null?((LengthContext)_localctx).l.getCharPositionInLine():0);
			          if((((LengthContext)_localctx).e1.typeS != null) && ((LengthContext)_localctx).e1.typeS.equals("sequence")){
			              ((LengthContext)_localctx).typeS =  "integer";
			          }else{
			              e.addMessage(((LengthContext)_localctx).e1.line,((LengthContext)_localctx).e1.pos,ErrorMessage.semantic((((LengthContext)_localctx).e1!=null?_input.getText(((LengthContext)_localctx).e1.start,((LengthContext)_localctx).e1.stop):null),ErrorMessage.type(((LengthContext)_localctx).e1.typeS,"sequence")));
			          }
			          if(_localctx.set!=null && isSet){
			             Node left = new Node(new Data("length"),null,null);
			             Node n = new Node(new Data("call"),left,new Node(new Data("args"),((LengthContext)_localctx).e1.treeS,null));
			             ((LengthContext)_localctx).treeS =  n;
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
		public Set set;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
		public Token im;
		public ExpressionContext e;
		public IdentifierContext i;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MemberContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
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

	public final MemberContext member(IdentifiersTable idTH,Set set) throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState(), idTH, set);
		enterRule(_localctx, 146, RULE_member);


		       
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749); 
			((MemberContext)_localctx).im = match(T__65);
			setState(750); 
			match(T__25);
			setState(751); 
			((MemberContext)_localctx).e = expression(idTH, set);
			setState(752); 
			match(T__7);
			setState(753); 
			((MemberContext)_localctx).i = identifier();
			setState(754); 
			match(T__26);

			          ((MemberContext)_localctx).line =  (((MemberContext)_localctx).im!=null?((MemberContext)_localctx).im.getLine():0);
			          ((MemberContext)_localctx).pos =  (((MemberContext)_localctx).im!=null?((MemberContext)_localctx).im.getCharPositionInLine():0);

			          String type = null;

			          //Pre-Condicao : verificar se existe o identificador na tabela de identificador, caso nao existir significa que é um inteiro ou que nao foi declarado !!!
			          if(_localctx.idTH.getIdentifiersTable().containsKey((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null))){
			            Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null));
			            if( v != null){
			                type = v.getInfoType();
			                if((type != null) && type.equals("sequence")){
			                    if((((MemberContext)_localctx).e.typeS != null) && ((MemberContext)_localctx).e.typeS.equals("integer")){
			                        ((MemberContext)_localctx).typeS =  "boolean";
			                    }else{
			                        e.addMessage(((MemberContext)_localctx).e.line,((MemberContext)_localctx).e.pos,ErrorMessage.semantic((((MemberContext)_localctx).e!=null?_input.getText(((MemberContext)_localctx).e.start,((MemberContext)_localctx).e.stop):null),ErrorMessage.type(((MemberContext)_localctx).e.typeS,"integer")));
			                    }
			                }else{
			                    e.addMessage(((MemberContext)_localctx).i.line,((MemberContext)_localctx).i.pos,ErrorMessage.semantic((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null),ErrorMessage.type(type,"sequence")));
			                }
			            }
			            //Normally doesn't need else statement.
			          }else{
			            e.addMessage(((MemberContext)_localctx).i.line,((MemberContext)_localctx).i.pos,ErrorMessage.semantic((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null),ErrorMessage.Statements));
			          }
			          if(_localctx.set!=null && isSet){
			            Data d = _localctx.set.getIdentifier();
			            Node left = new Node(new Data("member"),null,null);
			            Node n = null;
			            if(d.getData().equals((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null))){
			                n = new Node(new Data("call"),left,new Node(new Data("args"),((MemberContext)_localctx).e.treeS,new Node(new Data("args"),new Node(d,null,null),null)));
			            }else{
			                n = new Node(new Data("call"),left,new Node(new Data("args"),((MemberContext)_localctx).e.treeS,new Node(new Data("args"),new Node(new Data((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null)),null,null),null)));
			            }
			            ((MemberContext)_localctx).treeS =  n;
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
			setState(757); 
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
			setState(759); 
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
			setState(762); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u0300\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\7\5\u00ac\n\5\f\5\16\5\u00af\13\5\3\5\7\5\u00b2"+
		"\n\5\f\5\16\5\u00b5\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u00c3\n\7\f\7\16\7\u00c6\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00d3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00e2\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ea\n\13\f\13"+
		"\16\13\u00ed\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00fd\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0107\n\r\3\16"+
		"\3\16\3\16\5\16\u010c\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u0115"+
		"\n\20\f\20\16\20\u0118\13\20\3\21\3\21\5\21\u011c\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0127\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u012f\n\24\f\24\16\24\u0132\13\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0142\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\5\31\u0159\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u0161\n\32\f\32\16\32\u0164\13\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u0172\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u017a\n\35\3\36\7\36\u017d\n\36\f\36\16\36\u0180\13\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0199\n\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01aa\n\"\3#\3#\3#\3#\3#\3#"+
		"\7#\u01b2\n#\f#\16#\u01b5\13#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\5%\u01c3"+
		"\n%\3&\3&\3&\3&\3&\3&\7&\u01cb\n&\f&\16&\u01ce\13&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u01d8\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\7(\u01e2\n(\f(\16("+
		"\u01e5\13(\3(\3(\3)\3)\3)\3)\3)\3)\7)\u01ef\n)\f)\16)\u01f2\13)\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u020b"+
		"\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+"+
		"\u0222\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u022c\n,\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u0236\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0246\n.\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u0253\n\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\5\64\u025f\n\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u0272\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38"+
		"\38\38\38\39\39\39\39\39\39\59\u0288\n9\3:\3:\3:\3:\3;\3;\3;\3;\5;\u0292"+
		"\n;\3<\3<\3<\3<\5<\u0298\n<\3=\3=\3=\3=\5=\u029e\n=\3>\3>\3?\3?\3?\3?"+
		"\3?\5?\u02a7\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3C\3C\3C"+
		"\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I"+
		"\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3M\3M\3M\3N\3N\3N"+
		"\3N\2\2O\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\2\5\3\2-.\3\2\66\67\3"+
		"\2:;\u02fa\2\u009c\3\2\2\2\4\u00a1\3\2\2\2\6\u00a8\3\2\2\2\b\u00ad\3\2"+
		"\2\2\n\u00b6\3\2\2\2\f\u00bc\3\2\2\2\16\u00c9\3\2\2\2\20\u00d2\3\2\2\2"+
		"\22\u00e1\3\2\2\2\24\u00e3\3\2\2\2\26\u00fc\3\2\2\2\30\u0106\3\2\2\2\32"+
		"\u010b\3\2\2\2\34\u010d\3\2\2\2\36\u0111\3\2\2\2 \u011b\3\2\2\2\"\u011d"+
		"\3\2\2\2$\u0126\3\2\2\2&\u0128\3\2\2\2(\u0135\3\2\2\2*\u0141\3\2\2\2,"+
		"\u0143\3\2\2\2.\u014c\3\2\2\2\60\u0158\3\2\2\2\62\u015a\3\2\2\2\64\u0167"+
		"\3\2\2\2\66\u0171\3\2\2\28\u0179\3\2\2\2:\u017e\3\2\2\2<\u0198\3\2\2\2"+
		">\u019a\3\2\2\2@\u019f\3\2\2\2B\u01a9\3\2\2\2D\u01ab\3\2\2\2F\u01b8\3"+
		"\2\2\2H\u01c2\3\2\2\2J\u01c4\3\2\2\2L\u01d1\3\2\2\2N\u01db\3\2\2\2P\u01e8"+
		"\3\2\2\2R\u020a\3\2\2\2T\u0221\3\2\2\2V\u022b\3\2\2\2X\u0235\3\2\2\2Z"+
		"\u0245\3\2\2\2\\\u0247\3\2\2\2^\u024c\3\2\2\2`\u0252\3\2\2\2b\u0254\3"+
		"\2\2\2d\u025a\3\2\2\2f\u025e\3\2\2\2h\u0260\3\2\2\2j\u0271\3\2\2\2l\u0273"+
		"\3\2\2\2n\u027d\3\2\2\2p\u0287\3\2\2\2r\u0289\3\2\2\2t\u0291\3\2\2\2v"+
		"\u0297\3\2\2\2x\u029d\3\2\2\2z\u029f\3\2\2\2|\u02a6\3\2\2\2~\u02a8\3\2"+
		"\2\2\u0080\u02b1\3\2\2\2\u0082\u02b5\3\2\2\2\u0084\u02b7\3\2\2\2\u0086"+
		"\u02bd\3\2\2\2\u0088\u02c3\3\2\2\2\u008a\u02cb\3\2\2\2\u008c\u02d3\3\2"+
		"\2\2\u008e\u02db\3\2\2\2\u0090\u02e3\3\2\2\2\u0092\u02e9\3\2\2\2\u0094"+
		"\u02ef\3\2\2\2\u0096\u02f7\3\2\2\2\u0098\u02f9\3\2\2\2\u009a\u02fc\3\2"+
		"\2\2\u009c\u009d\7\3\2\2\u009d\u009e\5\u009aN\2\u009e\u009f\5\4\3\2\u009f"+
		"\u00a0\b\2\1\2\u00a0\3\3\2\2\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\7\5\2\2"+
		"\u00a3\u00a4\5\6\4\2\u00a4\u00a5\7\6\2\2\u00a5\u00a6\5:\36\2\u00a6\u00a7"+
		"\7\7\2\2\u00a7\5\3\2\2\2\u00a8\u00a9\5\b\5\2\u00a9\7\3\2\2\2\u00aa\u00ac"+
		"\5\n\6\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b3\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\5,"+
		"\27\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\t\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\5\f\7\2"+
		"\u00b7\u00b8\7\b\2\2\u00b8\u00b9\5\22\n\2\u00b9\u00ba\7\t\2\2\u00ba\u00bb"+
		"\b\6\1\2\u00bb\13\3\2\2\2\u00bc\u00bd\5\16\b\2\u00bd\u00c4\b\7\1\2\u00be"+
		"\u00bf\7\n\2\2\u00bf\u00c0\5\16\b\2\u00c0\u00c1\b\7\1\2\u00c1\u00c3\3"+
		"\2\2\2\u00c2\u00be\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\b\7"+
		"\1\2\u00c8\r\3\2\2\2\u00c9\u00ca\5\u009aN\2\u00ca\u00cb\5\20\t\2\u00cb"+
		"\u00cc\b\b\1\2\u00cc\17\3\2\2\2\u00cd\u00d3\b\t\1\2\u00ce\u00cf\7\13\2"+
		"\2\u00cf\u00d0\5\26\f\2\u00d0\u00d1\b\t\1\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00cd\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\21\3\2\2\2\u00d4\u00d5\7\f\2"+
		"\2\u00d5\u00e2\b\n\1\2\u00d6\u00d7\7\r\2\2\u00d7\u00e2\b\n\1\2\u00d8\u00d9"+
		"\7\16\2\2\u00d9\u00e2\b\n\1\2\u00da\u00db\7\17\2\2\u00db\u00e2\b\n\1\2"+
		"\u00dc\u00dd\7\20\2\2\u00dd\u00de\7\21\2\2\u00de\u00df\5\24\13\2\u00df"+
		"\u00e0\b\n\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00d4\3\2\2\2\u00e1\u00d6\3\2"+
		"\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e2"+
		"\23\3\2\2\2\u00e3\u00e4\5\u0098M\2\u00e4\u00eb\b\13\1\2\u00e5\u00e6\7"+
		"\n\2\2\u00e6\u00e7\5\u0098M\2\u00e7\u00e8\b\13\1\2\u00e8\u00ea\3\2\2\2"+
		"\u00e9\u00e5\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\b\13\1\2"+
		"\u00ef\25\3\2\2\2\u00f0\u00f1\5\30\r\2\u00f1\u00f2\b\f\1\2\u00f2\u00fd"+
		"\3\2\2\2\u00f3\u00f4\5\34\17\2\u00f4\u00f5\b\f\1\2\u00f5\u00fd\3\2\2\2"+
		"\u00f6\u00f7\5(\25\2\u00f7\u00f8\b\f\1\2\u00f8\u00fd\3\2\2\2\u00f9\u00fa"+
		"\5\"\22\2\u00fa\u00fb\b\f\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00f0\3\2\2\2"+
		"\u00fc\u00f3\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\27"+
		"\3\2\2\2\u00fe\u00ff\5\32\16\2\u00ff\u0100\5\u0098M\2\u0100\u0101\b\r"+
		"\1\2\u0101\u0107\3\2\2\2\u0102\u0103\7\22\2\2\u0103\u0107\b\r\1\2\u0104"+
		"\u0105\7\23\2\2\u0105\u0107\b\r\1\2\u0106\u00fe\3\2\2\2\u0106\u0102\3"+
		"\2\2\2\u0106\u0104\3\2\2\2\u0107\31\3\2\2\2\u0108\u010c\3\2\2\2\u0109"+
		"\u010c\7\24\2\2\u010a\u010c\7\25\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3"+
		"\2\2\2\u010b\u010a\3\2\2\2\u010c\33\3\2\2\2\u010d\u010e\7\26\2\2\u010e"+
		"\u010f\5\36\20\2\u010f\u0110\7\27\2\2\u0110\35\3\2\2\2\u0111\u0116\5 "+
		"\21\2\u0112\u0113\7\n\2\2\u0113\u0115\5 \21\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\37\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0119\u011c\5\u0098M\2\u011a\u011c\5\34\17\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c!\3\2\2\2\u011d\u011e\7\30\2\2"+
		"\u011e\u011f\5$\23\2\u011f\u0120\b\22\1\2\u0120\u0121\7\31\2\2\u0121#"+
		"\3\2\2\2\u0122\u0127\b\23\1\2\u0123\u0124\5&\24\2\u0124\u0125\b\23\1\2"+
		"\u0125\u0127\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0127%\3"+
		"\2\2\2\u0128\u0129\5\u0098M\2\u0129\u0130\b\24\1\2\u012a\u012b\7\n\2\2"+
		"\u012b\u012c\5\u0098M\2\u012c\u012d\b\24\1\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012a\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\b\24\1\2\u0134"+
		"\'\3\2\2\2\u0135\u0136\7\4\2\2\u0136\u0137\5*\26\2\u0137\u0138\b\25\1"+
		"\2\u0138\u0139\7\7\2\2\u0139)\3\2\2\2\u013a\u0142\b\26\1\2\u013b\u013c"+
		"\5\u009aN\2\u013c\u013d\b\26\1\2\u013d\u013e\7\32\2\2\u013e\u013f\5L\'"+
		"\2\u013f\u0140\b\26\1\2\u0140\u0142\3\2\2\2\u0141\u013a\3\2\2\2\u0141"+
		"\u013b\3\2\2\2\u0142+\3\2\2\2\u0143\u0144\7\33\2\2\u0144\u0145\5\u009a"+
		"N\2\u0145\u0146\7\34\2\2\u0146\u0147\5\60\31\2\u0147\u0148\7\35\2\2\u0148"+
		"\u0149\5\66\34\2\u0149\u014a\5.\30\2\u014a\u014b\b\27\1\2\u014b-\3\2\2"+
		"\2\u014c\u014d\7\4\2\2\u014d\u014e\7\5\2\2\u014e\u014f\5\6\4\2\u014f\u0150"+
		"\7\6\2\2\u0150\u0151\5:\36\2\u0151\u0152\58\35\2\u0152\u0153\7\7\2\2\u0153"+
		"/\3\2\2\2\u0154\u0159\b\31\1\2\u0155\u0156\5\62\32\2\u0156\u0157\b\31"+
		"\1\2\u0157\u0159\3\2\2\2\u0158\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0159"+
		"\61\3\2\2\2\u015a\u015b\5\64\33\2\u015b\u0162\b\32\1\2\u015c\u015d\7\t"+
		"\2\2\u015d\u015e\5\64\33\2\u015e\u015f\b\32\1\2\u015f\u0161\3\2\2\2\u0160"+
		"\u015c\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\b\32\1\2\u0166"+
		"\63\3\2\2\2\u0167\u0168\5\u009aN\2\u0168\u0169\7\b\2\2\u0169\u016a\5\22"+
		"\n\2\u016a\u016b\b\33\1\2\u016b\65\3\2\2\2\u016c\u0172\b\34\1\2\u016d"+
		"\u016e\7\b\2\2\u016e\u016f\5\22\n\2\u016f\u0170\b\34\1\2\u0170\u0172\3"+
		"\2\2\2\u0171\u016c\3\2\2\2\u0171\u016d\3\2\2\2\u0172\67\3\2\2\2\u0173"+
		"\u017a\3\2\2\2\u0174\u0175\7\36\2\2\u0175\u0176\5L\'\2\u0176\u0177\b\35"+
		"\1\2\u0177\u0178\7\t\2\2\u0178\u017a\3\2\2\2\u0179\u0173\3\2\2\2\u0179"+
		"\u0174\3\2\2\2\u017a9\3\2\2\2\u017b\u017d\5<\37\2\u017c\u017b\3\2\2\2"+
		"\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f;\3"+
		"\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\5> \2\u0182\u0183\7\t\2\2\u0183"+
		"\u0199\3\2\2\2\u0184\u0185\5\\/\2\u0185\u0186\7\t\2\2\u0186\u0199\3\2"+
		"\2\2\u0187\u0188\5b\62\2\u0188\u0189\7\t\2\2\u0189\u0199\3\2\2\2\u018a"+
		"\u0199\5d\63\2\u018b\u0199\5f\64\2\u018c\u018d\5F$\2\u018d\u018e\7\t\2"+
		"\2\u018e\u0199\3\2\2\2\u018f\u0190\5\u0080A\2\u0190\u0191\7\t\2\2\u0191"+
		"\u0199\3\2\2\2\u0192\u0193\5\u008cG\2\u0193\u0194\7\t\2\2\u0194\u0199"+
		"\3\2\2\2\u0195\u0196\5\u008eH\2\u0196\u0197\7\t\2\2\u0197\u0199\3\2\2"+
		"\2\u0198\u0181\3\2\2\2\u0198\u0184\3\2\2\2\u0198\u0187\3\2\2\2\u0198\u018a"+
		"\3\2\2\2\u0198\u018b\3\2\2\2\u0198\u018c\3\2\2\2\u0198\u018f\3\2\2\2\u0198"+
		"\u0192\3\2\2\2\u0198\u0195\3\2\2\2\u0199=\3\2\2\2\u019a\u019b\5@!\2\u019b"+
		"\u019c\7\13\2\2\u019c\u019d\5L\'\2\u019d\u019e\b \1\2\u019e?\3\2\2\2\u019f"+
		"\u01a0\5\u009aN\2\u01a0\u01a1\5B\"\2\u01a1\u01a2\b!\1\2\u01a2A\3\2\2\2"+
		"\u01a3\u01aa\b\"\1\2\u01a4\u01a5\7\26\2\2\u01a5\u01a6\5D#\2\u01a6\u01a7"+
		"\7\27\2\2\u01a7\u01a8\b\"\1\2\u01a8\u01aa\3\2\2\2\u01a9\u01a3\3\2\2\2"+
		"\u01a9\u01a4\3\2\2\2\u01aaC\3\2\2\2\u01ab\u01ac\5N(\2\u01ac\u01b3\b#\1"+
		"\2\u01ad\u01ae\7\n\2\2\u01ae\u01af\5N(\2\u01af\u01b0\b#\1\2\u01b0\u01b2"+
		"\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\b#"+
		"\1\2\u01b7E\3\2\2\2\u01b8\u01b9\5\u009aN\2\u01b9\u01ba\7\34\2\2\u01ba"+
		"\u01bb\5H%\2\u01bb\u01bc\7\35\2\2\u01bc\u01bd\b$\1\2\u01bdG\3\2\2\2\u01be"+
		"\u01c3\b%\1\2\u01bf\u01c0\5J&\2\u01c0\u01c1\b%\1\2\u01c1\u01c3\3\2\2\2"+
		"\u01c2\u01be\3\2\2\2\u01c2\u01bf\3\2\2\2\u01c3I\3\2\2\2\u01c4\u01c5\5"+
		"L\'\2\u01c5\u01cc\b&\1\2\u01c6\u01c7\7\n\2\2\u01c7\u01c8\5L\'\2\u01c8"+
		"\u01c9\b&\1\2\u01c9\u01cb\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cb\u01ce\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01cf\u01d0\b&\1\2\u01d0K\3\2\2\2\u01d1\u01d2\5N(\2\u01d2"+
		"\u01d7\b\'\1\2\u01d3\u01d4\5Z.\2\u01d4\u01d5\5N(\2\u01d5\u01d6\b\'\1\2"+
		"\u01d6\u01d8\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\b\'\1\2\u01daM\3\2\2\2\u01db\u01dc\5P)\2\u01dc\u01e3"+
		"\b(\1\2\u01dd\u01de\5V,\2\u01de\u01df\5P)\2\u01df\u01e0\b(\1\2\u01e0\u01e2"+
		"\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e7\b("+
		"\1\2\u01e7O\3\2\2\2\u01e8\u01e9\5R*\2\u01e9\u01f0\b)\1\2\u01ea\u01eb\5"+
		"X-\2\u01eb\u01ec\5R*\2\u01ec\u01ed\b)\1\2\u01ed\u01ef\3\2\2\2\u01ee\u01ea"+
		"\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\b)\1\2\u01f4Q\3\2\2\2\u01f5"+
		"\u01f6\5\26\f\2\u01f6\u01f7\b*\1\2\u01f7\u020b\3\2\2\2\u01f8\u01f9\5@"+
		"!\2\u01f9\u01fa\b*\1\2\u01fa\u020b\3\2\2\2\u01fb\u01fc\7\34\2\2\u01fc"+
		"\u01fd\5L\'\2\u01fd\u01fe\7\35\2\2\u01fe\u01ff\b*\1\2\u01ff\u020b\3\2"+
		"\2\2\u0200\u0201\7\37\2\2\u0201\u0202\5R*\2\u0202\u0203\b*\1\2\u0203\u020b"+
		"\3\2\2\2\u0204\u0205\5F$\2\u0205\u0206\b*\1\2\u0206\u020b\3\2\2\2\u0207"+
		"\u0208\5T+\2\u0208\u0209\b*\1\2\u0209\u020b\3\2\2\2\u020a\u01f5\3\2\2"+
		"\2\u020a\u01f8\3\2\2\2\u020a\u01fb\3\2\2\2\u020a\u0200\3\2\2\2\u020a\u0204"+
		"\3\2\2\2\u020a\u0207\3\2\2\2\u020bS\3\2\2\2\u020c\u020d\5\u0084C\2\u020d"+
		"\u020e\b+\1\2\u020e\u0222\3\2\2\2\u020f\u0210\5\u0086D\2\u0210\u0211\b"+
		"+\1\2\u0211\u0222\3\2\2\2\u0212\u0213\5\u0088E\2\u0213\u0214\b+\1\2\u0214"+
		"\u0222\3\2\2\2\u0215\u0216\5\u0094K\2\u0216\u0217\b+\1\2\u0217\u0222\3"+
		"\2\2\2\u0218\u0219\5\u0090I\2\u0219\u021a\b+\1\2\u021a\u0222\3\2\2\2\u021b"+
		"\u021c\5\u0092J\2\u021c\u021d\b+\1\2\u021d\u0222\3\2\2\2\u021e\u021f\5"+
		"\u008aF\2\u021f\u0220\b+\1\2\u0220\u0222\3\2\2\2\u0221\u020c\3\2\2\2\u0221"+
		"\u020f\3\2\2\2\u0221\u0212\3\2\2\2\u0221\u0215\3\2\2\2\u0221\u0218\3\2"+
		"\2\2\u0221\u021b\3\2\2\2\u0221\u021e\3\2\2\2\u0222U\3\2\2\2\u0223\u0224"+
		"\7\24\2\2\u0224\u022c\b,\1\2\u0225\u0226\7\25\2\2\u0226\u022c\b,\1\2\u0227"+
		"\u0228\7 \2\2\u0228\u022c\b,\1\2\u0229\u022a\7!\2\2\u022a\u022c\b,\1\2"+
		"\u022b\u0223\3\2\2\2\u022b\u0225\3\2\2\2\u022b\u0227\3\2\2\2\u022b\u0229"+
		"\3\2\2\2\u022cW\3\2\2\2\u022d\u022e\7\"\2\2\u022e\u0236\b-\1\2\u022f\u0230"+
		"\7#\2\2\u0230\u0236\b-\1\2\u0231\u0232\7$\2\2\u0232\u0236\b-\1\2\u0233"+
		"\u0234\7%\2\2\u0234\u0236\b-\1\2\u0235\u022d\3\2\2\2\u0235\u022f\3\2\2"+
		"\2\u0235\u0231\3\2\2\2\u0235\u0233\3\2\2\2\u0236Y\3\2\2\2\u0237\u0238"+
		"\7&\2\2\u0238\u0246\b.\1\2\u0239\u023a\7\'\2\2\u023a\u0246\b.\1\2\u023b"+
		"\u023c\7(\2\2\u023c\u0246\b.\1\2\u023d\u023e\7)\2\2\u023e\u0246\b.\1\2"+
		"\u023f\u0240\7*\2\2\u0240\u0246\b.\1\2\u0241\u0242\7+\2\2\u0242\u0246"+
		"\b.\1\2\u0243\u0244\7,\2\2\u0244\u0246\b.\1\2\u0245\u0237\3\2\2\2\u0245"+
		"\u0239\3\2\2\2\u0245\u023b\3\2\2\2\u0245\u023d\3\2\2\2\u0245\u023f\3\2"+
		"\2\2\u0245\u0241\3\2\2\2\u0245\u0243\3\2\2\2\u0246[\3\2\2\2\u0247\u0248"+
		"\5^\60\2\u0248\u0249\7\34\2\2\u0249\u024a\5`\61\2\u024a\u024b\7\35\2\2"+
		"\u024b]\3\2\2\2\u024c\u024d\t\2\2\2\u024d_\3\2\2\2\u024e\u0253\3\2\2\2"+
		"\u024f\u0250\5L\'\2\u0250\u0251\b\61\1\2\u0251\u0253\3\2\2\2\u0252\u024e"+
		"\3\2\2\2\u0252\u024f\3\2\2\2\u0253a\3\2\2\2\u0254\u0255\7/\2\2\u0255\u0256"+
		"\7\34\2\2\u0256\u0257\5\u009aN\2\u0257\u0258\7\35\2\2\u0258\u0259\b\62"+
		"\1\2\u0259c\3\2\2\2\u025a\u025b\5h\65\2\u025be\3\2\2\2\u025c\u025f\5l"+
		"\67\2\u025d\u025f\5~@\2\u025e\u025c\3\2\2\2\u025e\u025d\3\2\2\2\u025f"+
		"g\3\2\2\2\u0260\u0261\7\60\2\2\u0261\u0262\7\34\2\2\u0262\u0263\5L\'\2"+
		"\u0263\u0264\7\35\2\2\u0264\u0265\b\65\1\2\u0265\u0266\7\61\2\2\u0266"+
		"\u0267\7\4\2\2\u0267\u0268\5:\36\2\u0268\u0269\7\7\2\2\u0269\u026a\5j"+
		"\66\2\u026ai\3\2\2\2\u026b\u0272\3\2\2\2\u026c\u026d\7\62\2\2\u026d\u026e"+
		"\7\4\2\2\u026e\u026f\5:\36\2\u026f\u0270\7\7\2\2\u0270\u0272\3\2\2\2\u0271"+
		"\u026b\3\2\2\2\u0271\u026c\3\2\2\2\u0272k\3\2\2\2\u0273\u0274\7\63\2\2"+
		"\u0274\u0275\7\34\2\2\u0275\u0276\5n8\2\u0276\u0277\7\35\2\2\u0277\u0278"+
		"\5x=\2\u0278\u0279\5|?\2\u0279\u027a\7\4\2\2\u027a\u027b\5:\36\2\u027b"+
		"\u027c\7\7\2\2\u027cm\3\2\2\2\u027d\u027e\5\u009aN\2\u027e\u027f\5p9\2"+
		"\u027f\u0280\b8\1\2\u0280o\3\2\2\2\u0281\u0282\7,\2\2\u0282\u0288\5r:"+
		"\2\u0283\u0284\7\64\2\2\u0284\u0285\5\u009aN\2\u0285\u0286\b9\1\2\u0286"+
		"\u0288\3\2\2\2\u0287\u0281\3\2\2\2\u0287\u0283\3\2\2\2\u0288q\3\2\2\2"+
		"\u0289\u028a\5t;\2\u028a\u028b\7\65\2\2\u028b\u028c\5v<\2\u028cs\3\2\2"+
		"\2\u028d\u0292\5\u0098M\2\u028e\u028f\5\u009aN\2\u028f\u0290\b;\1\2\u0290"+
		"\u0292\3\2\2\2\u0291\u028d\3\2\2\2\u0291\u028e\3\2\2\2\u0292u\3\2\2\2"+
		"\u0293\u0298\5\u0098M\2\u0294\u0295\5\u009aN\2\u0295\u0296\b<\1\2\u0296"+
		"\u0298\3\2\2\2\u0297\u0293\3\2\2\2\u0297\u0294\3\2\2\2\u0298w\3\2\2\2"+
		"\u0299\u029e\3\2\2\2\u029a\u029b\5z>\2\u029b\u029c\5\u0098M\2\u029c\u029e"+
		"\3\2\2\2\u029d\u0299\3\2\2\2\u029d\u029a\3\2\2\2\u029ey\3\2\2\2\u029f"+
		"\u02a0\t\3\2\2\u02a0{\3\2\2\2\u02a1\u02a7\3\2\2\2\u02a2\u02a3\78\2\2\u02a3"+
		"\u02a4\5L\'\2\u02a4\u02a5\b?\1\2\u02a5\u02a7\3\2\2\2\u02a6\u02a1\3\2\2"+
		"\2\u02a6\u02a2\3\2\2\2\u02a7}\3\2\2\2\u02a8\u02a9\79\2\2\u02a9\u02aa\7"+
		"\34\2\2\u02aa\u02ab\5L\'\2\u02ab\u02ac\7\35\2\2\u02ac\u02ad\b@\1\2\u02ad"+
		"\u02ae\7\4\2\2\u02ae\u02af\5:\36\2\u02af\u02b0\7\7\2\2\u02b0\177\3\2\2"+
		"\2\u02b1\u02b2\5\u0082B\2\u02b2\u02b3\5\u009aN\2\u02b3\u02b4\bA\1\2\u02b4"+
		"\u0081\3\2\2\2\u02b5\u02b6\t\4\2\2\u02b6\u0083\3\2\2\2\u02b7\u02b8\7<"+
		"\2\2\u02b8\u02b9\7\34\2\2\u02b9\u02ba\5L\'\2\u02ba\u02bb\7\35\2\2\u02bb"+
		"\u02bc\bC\1\2\u02bc\u0085\3\2\2\2\u02bd\u02be\7=\2\2\u02be\u02bf\7\34"+
		"\2\2\u02bf\u02c0\5L\'\2\u02c0\u02c1\7\35\2\2\u02c1\u02c2\bD\1\2\u02c2"+
		"\u0087\3\2\2\2\u02c3\u02c4\7>\2\2\u02c4\u02c5\7\34\2\2\u02c5\u02c6\5L"+
		"\'\2\u02c6\u02c7\7\n\2\2\u02c7\u02c8\5L\'\2\u02c8\u02c9\7\35\2\2\u02c9"+
		"\u02ca\bE\1\2\u02ca\u0089\3\2\2\2\u02cb\u02cc\7?\2\2\u02cc\u02cd\7\34"+
		"\2\2\u02cd\u02ce\5L\'\2\u02ce\u02cf\7\n\2\2\u02cf\u02d0\5L\'\2\u02d0\u02d1"+
		"\7\35\2\2\u02d1\u02d2\bF\1\2\u02d2\u008b\3\2\2\2\u02d3\u02d4\7@\2\2\u02d4"+
		"\u02d5\7\34\2\2\u02d5\u02d6\5\u009aN\2\u02d6\u02d7\7\n\2\2\u02d7\u02d8"+
		"\5\u009aN\2\u02d8\u02d9\7\35\2\2\u02d9\u02da\bG\1\2\u02da\u008d\3\2\2"+
		"\2\u02db\u02dc\7A\2\2\u02dc\u02dd\7\34\2\2\u02dd\u02de\5\u009aN\2\u02de"+
		"\u02df\7\n\2\2\u02df\u02e0\5\u009aN\2\u02e0\u02e1\7\35\2\2\u02e1\u02e2"+
		"\bH\1\2\u02e2\u008f\3\2\2\2\u02e3\u02e4\7B\2\2\u02e4\u02e5\7\34\2\2\u02e5"+
		"\u02e6\5L\'\2\u02e6\u02e7\7\35\2\2\u02e7\u02e8\bI\1\2\u02e8\u0091\3\2"+
		"\2\2\u02e9\u02ea\7C\2\2\u02ea\u02eb\7\34\2\2\u02eb\u02ec\5L\'\2\u02ec"+
		"\u02ed\7\35\2\2\u02ed\u02ee\bJ\1\2\u02ee\u0093\3\2\2\2\u02ef\u02f0\7D"+
		"\2\2\u02f0\u02f1\7\34\2\2\u02f1\u02f2\5L\'\2\u02f2\u02f3\7\n\2\2\u02f3"+
		"\u02f4\5\u009aN\2\u02f4\u02f5\7\35\2\2\u02f5\u02f6\bK\1\2\u02f6\u0095"+
		"\3\2\2\2\u02f7\u02f8\7H\2\2\u02f8\u0097\3\2\2\2\u02f9\u02fa\7E\2\2\u02fa"+
		"\u02fb\bM\1\2\u02fb\u0099\3\2\2\2\u02fc\u02fd\7F\2\2\u02fd\u02fe\bN\1"+
		"\2\u02fe\u009b\3\2\2\2*\u00ad\u00b3\u00c4\u00d2\u00e1\u00eb\u00fc\u0106"+
		"\u010b\u0116\u011b\u0126\u0130\u0141\u0158\u0162\u0171\u0179\u017e\u0198"+
		"\u01a9\u01b3\u01c2\u01cc\u01d7\u01e3\u01f0\u020a\u0221\u022b\u0235\u0245"+
		"\u0252\u025e\u0271\u0287\u0291\u0297\u029d\u02a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}