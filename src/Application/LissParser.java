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

	    boolean isDeclarations;

	     Mips m = new Mips();

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
			 System.out.println(e.toString()); if(e.isNull()){ m.write();}
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
		public StatementsContext s;
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
			isDeclarations = true;
			setState(162); 
			declarations(idTH);
			setState(163); 
			match(T__3);
			isDeclarations = false;
			setState(165); 
			((BodyContext)_localctx).s = statements(idTH);
			/*m.addLineInstruction("line"+($s.line+1),m.exitProgram($s.line));*/ m.addTextInstructions(m.exitProgram(((BodyContext)_localctx).s.line)); m.addLineInstruction("indexoutofboundError",m.indexOutOfBoundError(((BodyContext)_localctx).s.line));
			setState(167); 
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
			setState(169); 
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
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(171); 
				variable_declaration(idTH);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(177); 
				subprogram_definition(idTH);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 m.addDataInstruction(m.dataTextOriginal());
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
			setState(185); 
			((Variable_declarationContext)_localctx).vars = vars(idTH);
			setState(186); 
			match(T__5);
			setState(187); 
			((Variable_declarationContext)_localctx).type = type();
			setState(188); 
			match(T__6);

			                            HashMap<String, HashMap<String,Object>> varsH = ((Variable_declarationContext)_localctx).vars.varsS;
			                            if(((Variable_declarationContext)_localctx).type.typeS == "array" ){
			                                for(String i : varsH.keySet()){
			                                    varsH.get(i).put("dimension",((Variable_declarationContext)_localctx).type.arrayDimension);
			                                    varsH.get(i).put("type",((Variable_declarationContext)_localctx).type.typeS);
			                                    if(varsH.get(i).get("accessArray") != null){
			                                        ArrayList<ArrayList<Integer>> accessArray = (ArrayList<ArrayList<Integer>>) varsH.get(i).get("accessArray");

			                                        String mipsCodeS = null;

			                                        m.addTextInstruction("\t##### Initialize Array :"+i+"#####\n");
			                                        for(ArrayList<Integer> array :accessArray){
			                                            int value = array.get(array.size()-1);
			                                            array.remove(array.size()-1);

			                                            //System.out.println(mipsCodeS);

			                                            int res = 0;
			                                            System.out.println("WOOOOOOOOOOOOOT BEGIN \n");
			                                            for(int j=0; j< array.size(); j++){
			                                                System.out.print(array.get(j).toString()+" <- QUE È ISSO ? ");
			                                                int calc = array.get(j);
			                                                //Verify if the position of the value for setting the array is in the limits of the array !!!
			                                                if(calc < ((Variable_declarationContext)_localctx).type.arrayDimension.get(j)){
			                                                    for(int h=j+1; h< array.size(); h++){
			                                                        calc = calc*((Variable_declarationContext)_localctx).type.arrayDimension.get(h);
			                                                    }
			                                                    res = res + calc;
			                                                }else{
			                                                    e.addMessage((int)varsH.get(i).get("line"),(int)varsH.get(i).get("pos"),ErrorMessage.semantic((((Variable_declarationContext)_localctx).vars!=null?_input.getText(((Variable_declarationContext)_localctx).vars.start,((Variable_declarationContext)_localctx).vars.stop):null),ErrorMessage.LimitsArray));
			                                                }
			                                            }
			                                            System.out.println("WOOOOOOOOOOOOOT END \n");

			                                            //we need to see if the res is in the max limit of the array
			                                            /*int limitMaxArray = 1;
			                                            for(Integer i : ((Variable_declarationContext)_localctx).type.arrayDimension){
			                                                limitMaxArray = limitMaxArray * i;
			                                            }
			                                            */

			                                            //if( res >= 0 && res < limitMaxArray){
			                                                res = res*4;
			                                                //Add the value of the array firstly
			                                                mipsCodeS = m.loadImmediateWord(String.valueOf(value), (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos")); //generate mips code for value of the array
			                                                //Add the address of the value of the array
			                                                mipsCodeS = mipsCodeS + m.loadImmediateWord(String.valueOf(res), (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));//generate mips code for position of the array
			                                                //Function for adding the value and the addres of the value to the given array
			                                                mipsCodeS = mipsCodeS + m.storeWordArray(i,(int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));
			                                                //Add the instruction to the assembly
			                                                m.addTextInstruction(mipsCodeS);
			                                            //}
			                                        }
			                                        m.addTextInstruction("\t#######################################\n");
			                                        varsH.get(i).put("mips",mipsCodeS);
			                                    }
			                                }
			                            }else if(((Variable_declarationContext)_localctx).type.typeS == "set"){
			                                for(String i : varsH.keySet()){
			                                    HashMap<String,Object> v = (HashMap<String,Object>)varsH.get(i);
			                                    if(v.get("set") == null){
			                                        v.put("set", new Set());
			                                    }
			                                }
			                                //for(String i : varsH.keySet()){
			                                for(String i : varsH.keySet()){
			                                    System.out.println("Variable: "+i+" || "+varsH.get(i).toString());


			                                    Node n1 = new Node(new String("2"),null,null);
			                                    Node n2 = new Node(new String("3"),null,null);
			                                    Node n3 = new Node(new String("+"),n1,n2);

			                                    Application.Set ss= (Application.Set) varsH.get(i).get("set");
			                                    //ss.getSet().setIdentifier(n3);
			                                    //ss.setIdentifier(n3);
			                                    //System.out.println("Variable: "+i+" || "+varsH.get(i).toString());
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
			                            //if(isSet){isSet = false;}

			                            //MIPS
			                            m.addDataInstructions(varsH,((Variable_declarationContext)_localctx).type.typeS);

			                     
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
			setState(191); 
			((VarsContext)_localctx).v1 = ((VarsContext)_localctx).var = var(idTH);

			                if(!info.containsKey((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null))){
			                    info.put(((VarsContext)_localctx).var.idS,((VarsContext)_localctx).var.infoVarS);
			                }else{
			                    e.addMessage((int)((VarsContext)_localctx).var.infoVarS.get("line"),(int)((VarsContext)_localctx).var.infoVarS.get("pos"),ErrorMessage.semantic((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null),ErrorMessage.Declarations));
			                }

			            
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(193); 
				match(T__7);
				setState(194); 
				((VarsContext)_localctx).v2 = ((VarsContext)_localctx).var = var(idTH);

				                    if(!info.containsKey((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null))){
				                        info.put(((VarsContext)_localctx).var.idS,((VarsContext)_localctx).var.infoVarS);
				                    }else{
				                        e.addMessage((int)((VarsContext)_localctx).var.infoVarS.get("line"),(int)((VarsContext)_localctx).var.infoVarS.get("pos"),ErrorMessage.semantic((((VarsContext)_localctx).var!=null?_input.getText(((VarsContext)_localctx).var.start,((VarsContext)_localctx).var.stop):null),ErrorMessage.Declarations));
				                    }
				                
				}
				}
				setState(201);
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
			setState(204); 
			((VarContext)_localctx).i = ((VarContext)_localctx).identifier = identifier();
			setState(205); 
			((VarContext)_localctx).v = value_var(idTH);

			        info.put("pos",((VarContext)_localctx).i.pos);
			        info.put("line",((VarContext)_localctx).i.line);

			        if(((VarContext)_localctx).v.typeS!=null){
			            info.put("type",((VarContext)_localctx).v.typeS);
			        }

			        if(((VarContext)_localctx).v.setS!=null){
			            info.put("set",((VarContext)_localctx).v.setS);
			        }
			        if(((VarContext)_localctx).v.mipsCodeS != null){
			            info.put("mips",((VarContext)_localctx).v.mipsCodeS);

			        }
			        if(((VarContext)_localctx).v.type_ != null && ((VarContext)_localctx).v.type_.equals("array")){
			            //System.out.println("I HAVE BEEN HERE "+(((VarContext)_localctx).v!=null?_input.getText(((VarContext)_localctx).v.start,((VarContext)_localctx).v.stop):null));
			            //info.put("type_", ((VarContext)_localctx).v.type_);
			            info.put("accessArray", ((VarContext)_localctx).v.accessArrayS);
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
		public String type_;
		public String mipsCodeS;
		public ArrayList<ArrayList<Integer>> accessArrayS;
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
		            ((Value_varContext)_localctx).mipsCodeS =  null;
		            ((Value_varContext)_localctx).type_ =  null;
		          
		try {
			setState(213);
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
				setState(209); 
				match(T__8);
				setState(210); 
				((Value_varContext)_localctx).i = inic_var(idTH, set);

				                //if(isSet){ set = ((Value_varContext)_localctx).i.setS; ((Value_varContext)_localctx).setS =  set;}
				                set = ((Value_varContext)_localctx).i.setS; ((Value_varContext)_localctx).setS =  set;
				                ((Value_varContext)_localctx).typeS =  ((Value_varContext)_localctx).i.typeS;
				                ((Value_varContext)_localctx).mipsCodeS =  ((Value_varContext)_localctx).i.mipsCodeS;
				                if(((Value_varContext)_localctx).i.type_ != null && ((Value_varContext)_localctx).i.type_.equals("array")){
				                    ((Value_varContext)_localctx).type_ =  ((Value_varContext)_localctx).i.type_;
				                    ((Value_varContext)_localctx).accessArrayS =  ((Value_varContext)_localctx).i.accessArrayS;
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
			setState(228);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); 
				match(T__9);
				((TypeContext)_localctx).typeS =  "integer"; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); 
				match(T__10);
				((TypeContext)_localctx).typeS =  "boolean";
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(219); 
				match(T__11);
				((TypeContext)_localctx).typeS =  "set";
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(221); 
				match(T__12);
				((TypeContext)_localctx).typeS =  "sequence";
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(223); 
				match(T__13);
				setState(224); 
				match(T__14);
				setState(225); 
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
			setState(230); 
			((DimensionContext)_localctx).number = number();
			vars.add(((DimensionContext)_localctx).number.numberS);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(232); 
				match(T__7);
				setState(233); 
				((DimensionContext)_localctx).number = number();
				vars.add(((DimensionContext)_localctx).number.numberS);
				}
				}
				setState(240);
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
		public String type_;
		public int line;
		public int pos;
		public Set setS;
		public Node treeS;
		public String mipsCodeS;
		public ArrayList<ArrayList<Integer>> accessArrayS;
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
		            ((Inic_varContext)_localctx).type_ =  null;
		            ((Inic_varContext)_localctx).mipsCodeS =  null;
		            ArrayList<Integer> a= new ArrayList<Integer>();
		            ArrayList<ArrayList<Integer>> accessArray = new ArrayList<ArrayList<Integer>>();
		         
		try {
			setState(255);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(243); 
				((Inic_varContext)_localctx).c = ((Inic_varContext)_localctx).constant = constant();
				((Inic_varContext)_localctx).typeS =  ((Inic_varContext)_localctx).constant.typeS; ((Inic_varContext)_localctx).line =  ((Inic_varContext)_localctx).constant.line; ((Inic_varContext)_localctx).pos =  ((Inic_varContext)_localctx).constant.pos; ((Inic_varContext)_localctx).mipsCodeS =  ((Inic_varContext)_localctx).c.mipsCodeS; Node n = new Node(new String((((Inic_varContext)_localctx).c!=null?_input.getText(((Inic_varContext)_localctx).c.start,((Inic_varContext)_localctx).c.stop):null))); ((Inic_varContext)_localctx).treeS =  n; /*if(isSet && _localctx.set!=null){ Node n = new Node(new String((((Inic_varContext)_localctx).c!=null?_input.getText(((Inic_varContext)_localctx).c.start,((Inic_varContext)_localctx).c.stop):null))); ((Inic_varContext)_localctx).treeS =  n; }*/ 
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(246); 
				((Inic_varContext)_localctx).a = array_definition(a, accessArray);

				                                                    ((Inic_varContext)_localctx).typeS =  "integer";
				                                                    ((Inic_varContext)_localctx).type_ =  "array";
				                                                    /*for(ArrayList<Integer> array :accessArray){
				                                                        for(int i=0; i< array.size(); i++){
				                                                            System.out.print(array.get(i).toString()+" ");
				                                                        }
				                                                        System.out.println("woot");
				                                                    }*/
				                                                    ((Inic_varContext)_localctx).accessArrayS =  accessArray;
				                                              
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(249); 
				((Inic_varContext)_localctx).s1 = set_definition(idTH);
				((Inic_varContext)_localctx).typeS =  "set"; ((Inic_varContext)_localctx).line =  ((Inic_varContext)_localctx).s1.line; ((Inic_varContext)_localctx).pos =  ((Inic_varContext)_localctx).s1.pos; ((Inic_varContext)_localctx).treeS =  ((Inic_varContext)_localctx).s1.treeS; ((Inic_varContext)_localctx).setS =  ((Inic_varContext)_localctx).s1.setS;/*if(isSet && $s1.treeS!=null){$treeS = $s1.treeS;} if(isSet && $s1.setS!=null){$setS = $s1.setS;}*/
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(252); 
				((Inic_varContext)_localctx).s2 = sequence_definition();
				((Inic_varContext)_localctx).typeS =  "sequence"; ((Inic_varContext)_localctx).treeS =  ((Inic_varContext)_localctx).s2.treeS; /*if(isSet && _localctx.set!=null){((Inic_varContext)_localctx).treeS =  ((Inic_varContext)_localctx).s2.treeS;}*/
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
		public String mipsCodeS;
		public SignContext sign;
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
			setState(265);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(257); 
				((ConstantContext)_localctx).sign = sign();
				setState(258); 
				((ConstantContext)_localctx).number = number();
				((ConstantContext)_localctx).typeS =  "integer"; ((ConstantContext)_localctx).line =  ((ConstantContext)_localctx).number.line; ((ConstantContext)_localctx).pos =  ((ConstantContext)_localctx).number.pos; if(isDeclarations){ ((ConstantContext)_localctx).mipsCodeS =  m.dataWord((((ConstantContext)_localctx).sign!=null?_input.getText(((ConstantContext)_localctx).sign.start,((ConstantContext)_localctx).sign.stop):null)+(((ConstantContext)_localctx).number!=null?_input.getText(((ConstantContext)_localctx).number.start,((ConstantContext)_localctx).number.stop):null),((ConstantContext)_localctx).number.line,((ConstantContext)_localctx).number.pos);}else{ ((ConstantContext)_localctx).mipsCodeS =  m.loadImmediateWord((((ConstantContext)_localctx).sign!=null?_input.getText(((ConstantContext)_localctx).sign.start,((ConstantContext)_localctx).sign.stop):null)+(((ConstantContext)_localctx).number!=null?_input.getText(((ConstantContext)_localctx).number.start,((ConstantContext)_localctx).number.stop):null),((ConstantContext)_localctx).number.line,((ConstantContext)_localctx).number.pos);} 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(261); 
				((ConstantContext)_localctx).t = match(T__15);
				((ConstantContext)_localctx).typeS =  "boolean"; ((ConstantContext)_localctx).line =  (((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getLine():0); ((ConstantContext)_localctx).pos =  (((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getCharPositionInLine():0); if(isDeclarations){ ((ConstantContext)_localctx).mipsCodeS =  m.dataBoolean(true,(((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getLine():0),(((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getCharPositionInLine():0));}else{} 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(263); 
				((ConstantContext)_localctx).f = match(T__16);
				((ConstantContext)_localctx).typeS =  "boolean"; ((ConstantContext)_localctx).line =  (((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getLine():0); ((ConstantContext)_localctx).pos =  (((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getCharPositionInLine():0); if(isDeclarations){ ((ConstantContext)_localctx).mipsCodeS =  m.dataBoolean(false,(((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getLine():0),(((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getCharPositionInLine():0));}else{} 
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
			setState(270);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(268); 
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(269); 
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
		public ArrayList<Integer> a;
		public ArrayList<ArrayList<Integer>> accessArray;
		public Array_initializationContext array_initialization() {
			return getRuleContext(Array_initializationContext.class,0);
		}
		public Array_definitionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState, ArrayList<Integer> a, ArrayList<ArrayList<Integer>> accessArray) {
			super(parent, invokingState);
			this.a = a;
			this.accessArray = accessArray;
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

	public final Array_definitionContext array_definition(ArrayList<Integer> a,ArrayList<ArrayList<Integer>> accessArray) throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState(), a, accessArray);
		enterRule(_localctx, 26, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); 
			match(T__19);
			setState(273); 
			array_initialization(a,accessArray);
			setState(274); 
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
		public ArrayList<Integer> a;
		public ArrayList<ArrayList<Integer>> accessArray;
		public List<ElemContext> elem() {
			return getRuleContexts(ElemContext.class);
		}
		public ElemContext elem(int i) {
			return getRuleContext(ElemContext.class,i);
		}
		public Array_initializationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Array_initializationContext(ParserRuleContext parent, int invokingState, ArrayList<Integer> a, ArrayList<ArrayList<Integer>> accessArray) {
			super(parent, invokingState);
			this.a = a;
			this.accessArray = accessArray;
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

	public final Array_initializationContext array_initialization(ArrayList<Integer> a,ArrayList<ArrayList<Integer>> accessArray) throws RecognitionException {
		Array_initializationContext _localctx = new Array_initializationContext(_ctx, getState(), a, accessArray);
		enterRule(_localctx, 28, RULE_array_initialization);

		                        int position = 0;
		                     
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			a.add(position);
			setState(277); 
			elem(a,accessArray);
			position++;
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(279); 
				match(T__7);
				a.remove(a.size()-1);a.add(position);
				setState(281); 
				elem(a,accessArray);
				position++;
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			a.remove(a.size()-1);
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
		public ArrayList<Integer> a;
		public ArrayList<ArrayList<Integer>> accessArray;
		public NumberContext number;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public ElemContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElemContext(ParserRuleContext parent, int invokingState, ArrayList<Integer> a, ArrayList<ArrayList<Integer>> accessArray) {
			super(parent, invokingState);
			this.a = a;
			this.accessArray = accessArray;
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

	public final ElemContext elem(ArrayList<Integer> a,ArrayList<ArrayList<Integer>> accessArray) throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState(), a, accessArray);
		enterRule(_localctx, 30, RULE_elem);
		try {
			setState(295);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); 
				((ElemContext)_localctx).number = number();

				                            ArrayList<Integer> m = new ArrayList<Integer>();
				                            for(Integer i: a){
				                                //System.out.print(i.toString()+" ");
				                                m.add(i);
				                            }
				                            //System.out.println(" = "+(((ElemContext)_localctx).number!=null?_input.getText(((ElemContext)_localctx).number.start,((ElemContext)_localctx).number.stop):null));
				                            m.add(Integer.valueOf((((ElemContext)_localctx).number!=null?_input.getText(((ElemContext)_localctx).number.start,((ElemContext)_localctx).number.stop):null)));
				                            accessArray.add(m);
				                        
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(294); 
				array_definition(a, accessArray);
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
			setState(297); 
			match(T__21);
			setState(298); 
			((Sequence_definitionContext)_localctx).s = sequence_initialization();
			 Node n = new Node(new String("sequence"),null,((Sequence_definitionContext)_localctx).s.treeS); ((Sequence_definitionContext)_localctx).treeS =  n; /*if(isSet){Node n = new Node(new String("sequence"),null,((Sequence_definitionContext)_localctx).s.treeS); ((Sequence_definitionContext)_localctx).treeS =  n;}*/
			setState(300); 
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
			setState(306);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				 ((Sequence_initializationContext)_localctx).treeS =  null; /*if(isSet){((Sequence_initializationContext)_localctx).treeS =  null;}*/
				}
				break;
			case NBR:
				enterOuterAlt(_localctx, 2);
				{
				setState(303); 
				((Sequence_initializationContext)_localctx).v = values();
				 ((Sequence_initializationContext)_localctx).treeS =  ((Sequence_initializationContext)_localctx).v.treeS; /*if(isSet){((Sequence_initializationContext)_localctx).treeS =  ((Sequence_initializationContext)_localctx).v.treeS;}*/
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
			setState(308); 
			((ValuesContext)_localctx).n1 = number();
			 head = new Node(new String("args"),new Node(new String((((ValuesContext)_localctx).n1!=null?_input.getText(((ValuesContext)_localctx).n1.start,((ValuesContext)_localctx).n1.stop):null)),null,null),null); m = head; /*if(isSet){head = new Node(new String("args"),new Node(new String((((ValuesContext)_localctx).n1!=null?_input.getText(((ValuesContext)_localctx).n1.start,((ValuesContext)_localctx).n1.stop):null)),null,null),null); m = head;}*/
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(310); 
				match(T__7);
				setState(311); 
				((ValuesContext)_localctx).n2 = number();
				 m.setRight(new Node(new String("args"),new Node(new String((((ValuesContext)_localctx).n2!=null?_input.getText(((ValuesContext)_localctx).n2.start,((ValuesContext)_localctx).n2.stop):null)),null,null),null)); m = m.getRight(); /*if(isSet){m.setRight(new Node(new String("args"),new Node(new String((((ValuesContext)_localctx).n2!=null?_input.getText(((ValuesContext)_localctx).n2.start,((ValuesContext)_localctx).n2.stop):null)),null,null),null)); m = m.getRight();}*/
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        /*if(isSet && head!=null){
			            ((ValuesContext)_localctx).treeS =  head;
			        }*/
			        if( head!=null){ //For sets
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
			setState(321); 
			((Set_definitionContext)_localctx).m = match(T__1);
			setState(322); 
			((Set_definitionContext)_localctx).s = set_initialization(idTH);
			((Set_definitionContext)_localctx).line =  (((Set_definitionContext)_localctx).m!=null?((Set_definitionContext)_localctx).m.getLine():0); ((Set_definitionContext)_localctx).pos =  (((Set_definitionContext)_localctx).m!=null?((Set_definitionContext)_localctx).m.getCharPositionInLine():0);((Set_definitionContext)_localctx).setS =  ((Set_definitionContext)_localctx).s.setS; ((Set_definitionContext)_localctx).treeS =  ((Set_definitionContext)_localctx).s.treeS; if(((Set_definitionContext)_localctx).s.setS!=null){/*System.out.println("SET_DEFINITION: {"+(((Set_definitionContext)_localctx).s!=null?_input.getText(((Set_definitionContext)_localctx).s.start,((Set_definitionContext)_localctx).s.stop):null)+"} -> "+((Set_definitionContext)_localctx).s.setS.toString());*/}
			setState(324); 
			match(T__4);
			isSet = false;
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
			setState(334);
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
				setState(328); 
				((Set_initializationContext)_localctx).i = identifier();

				                     //s = new Set((((Set_initializationContext)_localctx).i!=null?_input.getText(((Set_initializationContext)_localctx).i.start,((Set_initializationContext)_localctx).i.stop):null),tree);
				                     s = new Set((((Set_initializationContext)_localctx).i!=null?_input.getText(((Set_initializationContext)_localctx).i.start,((Set_initializationContext)_localctx).i.stop):null));
				                   
				setState(330); 
				match(T__23);
				setState(331); 
				((Set_initializationContext)_localctx).e = expression(idTH,s);

				                    if( !(((Set_initializationContext)_localctx).e.typeS != null && ((Set_initializationContext)_localctx).e.typeS.equals("boolean")) ){
				                        e.addMessage(((Set_initializationContext)_localctx).e.line,((Set_initializationContext)_localctx).e.pos,ErrorMessage.semantic((((Set_initializationContext)_localctx).e!=null?_input.getText(((Set_initializationContext)_localctx).e.start,((Set_initializationContext)_localctx).e.stop):null),ErrorMessage.type(((Set_initializationContext)_localctx).e.typeS,"boolean")));
				                    }

				                    //if(((Set_initializationContext)_localctx).e.treeS!=null && isSet && ((Set_initializationContext)_localctx).e.typeS != null && ((Set_initializationContext)_localctx).e.typeS.equals("boolean")){                                              //só se pode adicionar caso a expressao for booleano !
				                    if(((Set_initializationContext)_localctx).e.treeS!=null && ((Set_initializationContext)_localctx).e.typeS != null && ((Set_initializationContext)_localctx).e.typeS.equals("boolean")){
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

		                        _localctx.idTH.setAddress(0);
		                      
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); 
			match(T__24);
			setState(337); 
			((Subprogram_definitionContext)_localctx).i = identifier();
			setState(338); 
			match(T__25);
			setState(339); 
			((Subprogram_definitionContext)_localctx).f = formal_args(idTH);
			setState(340); 
			match(T__26);
			setState(341); 
			((Subprogram_definitionContext)_localctx).r = return_type();
			setState(342); 
			f_body(idTH);

			                            //Pre-Condition : Remover todas as variaveis do nivel actual

			                            _localctx.idTH.removeLevel(level);

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
			setState(345); 
			match(T__1);
			setState(346); 
			match(T__2);
			isDeclarations = true;
			setState(348); 
			declarations(idTH);
			setState(349); 
			match(T__3);
			isDeclarations = false;
			setState(351); 
			statements(idTH);
			setState(352); 
			returnSubPrg(idTH);
			setState(353); 
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
			setState(359);
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
				setState(356); 
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
			setState(361); 
			((F_argsContext)_localctx).f1 = formal_arg();

			            numberArgument++;
			            _localctx.idTH.add(e,((F_argsContext)_localctx).f1.hashmapVarS,((F_argsContext)_localctx).f1.typeS,level);
			            typeList.add(((F_argsContext)_localctx).f1.typeS);
			          
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(363); 
				match(T__6);
				setState(364); 
				((F_argsContext)_localctx).f2 = formal_arg();

				            numberArgument++;
				            _localctx.idTH.add(e,((F_argsContext)_localctx).f2.hashmapVarS,((F_argsContext)_localctx).f2.typeS,level);
				            typeList.add(((F_argsContext)_localctx).f2.typeS);
				          
				}
				}
				setState(371);
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
			setState(374); 
			((Formal_argContext)_localctx).i = identifier();
			setState(375); 
			match(T__5);
			setState(376); 
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
			setState(384);
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
				setState(380); 
				match(T__5);
				setState(381); 
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
			setState(392);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(387); 
				match(T__27);
				setState(388); 
				((ReturnSubPrgContext)_localctx).e = expression(idTH,tree);
				((ReturnSubPrgContext)_localctx).typeS =  ((ReturnSubPrgContext)_localctx).e.typeS;
				setState(390); 
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
		public int line;
		public int pos;
		public StatementContext s;
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
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__48 - 43)) | (1L << (T__54 - 43)) | (1L << (T__55 - 43)) | (1L << (T__56 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (ID - 43)))) != 0)) {
				{
				{
				setState(394); 
				((StatementsContext)_localctx).s = statement(idTH);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			m.resetRegister(); ((StatementsContext)_localctx).line =  ((StatementsContext)_localctx).s.line; ((StatementsContext)_localctx).pos =  ((StatementsContext)_localctx).s.pos;
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
		public int line;
		public int pos;
		public AssignmentContext a;
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
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402); 
				((StatementContext)_localctx).a = assignment(idTH);
				setState(403); 
				match(T__6);
				((StatementContext)_localctx).line = ((StatementContext)_localctx).a.line; ((StatementContext)_localctx).pos = ((StatementContext)_localctx).a.pos;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406); 
				write_statement(idTH);
				setState(407); 
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409); 
				read_statement(idTH);
				setState(410); 
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(412); 
				conditional_statement(idTH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(413); 
				iterative_statement(idTH);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(414); 
				function_call(idTH, set);
				setState(415); 
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(417); 
				succ_or_pred(idTH);
				setState(418); 
				match(T__6);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(420); 
				copy_statement(idTH);
				setState(421); 
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(423); 
				cat_statement(idTH);
				setState(424); 
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
		public int line;
		public int pos;
		public DesignatorContext designator;
		public Token r;
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
		                String side = "left";
		           
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); 
			((AssignmentContext)_localctx).designator = designator(idTH, set, side);
			setState(429); 
			((AssignmentContext)_localctx).r = match(T__8);
			setState(430); 
			((AssignmentContext)_localctx).expression = expression(idTH,set);

			              ((AssignmentContext)_localctx).line =  (((AssignmentContext)_localctx).r!=null?((AssignmentContext)_localctx).r.getLine():0);
			              ((AssignmentContext)_localctx).pos =  (((AssignmentContext)_localctx).r!=null?((AssignmentContext)_localctx).r.getCharPositionInLine():0);
			              if((((AssignmentContext)_localctx).designator.typeS != null && ((AssignmentContext)_localctx).expression.typeS != null) && ((AssignmentContext)_localctx).designator.typeS.equals(((AssignmentContext)_localctx).expression.typeS)){
			                ((AssignmentContext)_localctx).typeS =  ((AssignmentContext)_localctx).designator.typeS;
			                System.out.println(((AssignmentContext)_localctx).designator.line+"Funcionou ;D");

			                //MIPS
			                if(((AssignmentContext)_localctx).expression.mipsCodeS != null){
			                    System.out.println("INICIO <- assignment");
			                    System.out.println(((AssignmentContext)_localctx).expression.mipsCodeS);
			                    System.out.println("FIM <- assignment");
			                    String mipsCodeS = "";
			                    if(((AssignmentContext)_localctx).designator.arrayS == false){
			                        mipsCodeS = ((AssignmentContext)_localctx).expression.mipsCodeS;
			                        mipsCodeS += m.storeWord((((AssignmentContext)_localctx).designator!=null?_input.getText(((AssignmentContext)_localctx).designator.start,((AssignmentContext)_localctx).designator.stop):null), ((AssignmentContext)_localctx).designator.line, ((AssignmentContext)_localctx).designator.pos);
			                        //m.addTextInstructions((((AssignmentContext)_localctx).designator!=null?_input.getText(((AssignmentContext)_localctx).designator.start,((AssignmentContext)_localctx).designator.stop):null),((AssignmentContext)_localctx).expression.mipsCodeS,((AssignmentContext)_localctx).designator.typeS,((AssignmentContext)_localctx).designator.line,((AssignmentContext)_localctx).designator.pos);
			                    }else if(((AssignmentContext)_localctx).designator.arrayS == true){
			                        mipsCodeS = ((AssignmentContext)_localctx).designator.mipsCodeS;
			                        mipsCodeS += ((AssignmentContext)_localctx).expression.mipsCodeS;
			                        mipsCodeS += m.storeWordArrayText(((AssignmentContext)_localctx).designator.identifierS, ((AssignmentContext)_localctx).designator.line, ((AssignmentContext)_localctx).designator.pos);
			                    }

			                    m.addTextInstructions(mipsCodeS);
			                    //m.addLineInstruction("line"+(((AssignmentContext)_localctx).r!=null?((AssignmentContext)_localctx).r.getLine():0),mipsCodeS);
			                }

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
		public String side;
		public String identifierS;
		public String typeS;
		public int line;
		public int pos;
		public Node treeS;
		public String mipsCodeS;
		public boolean arrayS;
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
		public DesignatorContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set, String side) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
			this.side = side;
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

	public final DesignatorContext designator(IdentifiersTable idTH,Set set,String side) throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState(), idTH, set, side);
		enterRule(_localctx, 62, RULE_designator);

		                ((DesignatorContext)_localctx).typeS =  null;
		                ((DesignatorContext)_localctx).treeS =  null;
		                ((DesignatorContext)_localctx).mipsCodeS =  null;

		            
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); 
			((DesignatorContext)_localctx).i = ((DesignatorContext)_localctx).identifier = identifier();
			setState(434); 
			((DesignatorContext)_localctx).a = ((DesignatorContext)_localctx).array_access = array_access(idTH, set, (((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));

			                                ((DesignatorContext)_localctx).identifierS =  (((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null);
			                                ((DesignatorContext)_localctx).arrayS =  ((DesignatorContext)_localctx).array_access.response;
			                                ((DesignatorContext)_localctx).line =  ((DesignatorContext)_localctx).identifier.line;
			                                ((DesignatorContext)_localctx).pos =  ((DesignatorContext)_localctx).identifier.pos;
			                                //Pre-Condicao: é um identificador
			                                if(!((DesignatorContext)_localctx).array_access.response){
			                                    //Pre-Condicao: ver se existe na tabela de identificador
			                                    if(!isSet && !_localctx.idTH.getIdentifiersTable().containsKey((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null))){

			                                        //ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.errorStatements);
			                                        e.addMessage(((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.semantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),ErrorMessage.Statements));

			                                    }else{
			                                        //Só se pode buscar os elementos que estao na tabela de identificador ! Casos como variaveis livres de um conjunto, nao podem ser pesquisado ! Daí o '!isSet'
			                                        //if(!isSet && !_localctx.idTH.getInfoIdentifiersTable((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null)).getCategory().equals(new String("TYPE"))){
			                                        if(!isSet && !_localctx.idTH.getInfoIdentifiersTable((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null)).getCategory().equals(new String("TYPE"))){
			                                            if(_localctx.idTH.getInfoIdentifiersTable((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null)) instanceof Var){
			                                                Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));
			                                                ((DesignatorContext)_localctx).typeS =  v.getInfoType();

			                                                //MIPS
			                                                if(_localctx.typeS.equals("integer")){
			                                                    if(_localctx.side.equals("right")){
			                                                        ((DesignatorContext)_localctx).mipsCodeS =  m.loadWord((((DesignatorContext)_localctx).i!=null?_input.getText(((DesignatorContext)_localctx).i.start,((DesignatorContext)_localctx).i.stop):null), ((DesignatorContext)_localctx).i.line, ((DesignatorContext)_localctx).i.pos);
			                                                        //System.out.println(_localctx.mipsCodeS);
			                                                    }
			                                                }
			                                            }

			                                        }
			                                    }
			                                    //if(isSet && _localctx.set!=null){
			                                    if(_localctx.set!=null){
			                                        Node d = _localctx.set.getIdentifier().get(0);  //ver se funciona
			                                        ((DesignatorContext)_localctx).typeS =  "integer";
			                                        Node n = null;
			                                        if(d.getData().equals((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null))){
			                                            //n = new Node(d);
			                                            n = d;
			                                            //System.out.println("NT : designator, é um identificador igual ao identificador do set, i.e., setId:"+d.getData()+" designatorId: "+(((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));
			                                        }else{
			                                            n = new Node(new String((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null)));
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

			                                                    //o codigo do array todo ;D

			                                                    if(_localctx.side.equals("right") && ((DesignatorContext)_localctx).a.mipsCodeS != null){
			                                                        //_localctx.mipsCodeS += m.loadWordArray((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null), ((DesignatorContext)_localctx).identifier.line, ((DesignatorContext)_localctx).identifier.pos);
			                                                        ((DesignatorContext)_localctx).mipsCodeS =  ((DesignatorContext)_localctx).a.mipsCodeS;
			                                                        _localctx.mipsCodeS += m.loadWordArray((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null), ((DesignatorContext)_localctx).identifier.line, ((DesignatorContext)_localctx).identifier.pos);
			                                                    }else{
			                                                        ((DesignatorContext)_localctx).mipsCodeS =  ((DesignatorContext)_localctx).a.mipsCodeS;
			                                                    }
			                                                    //System.out.println(((DesignatorContext)_localctx).a.mipsCodeS);


			                                                }else{
			                                                    //ErrorMessage.errorSemantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.createMessageDimensionArray(((DesignatorContext)_localctx).array_access.dimensionS,a.getDimension()));
			                                                    e.addMessage(((DesignatorContext)_localctx).identifier.line,((DesignatorContext)_localctx).identifier.pos,ErrorMessage.semantic((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null),ErrorMessage.dimensionArray(((DesignatorContext)_localctx).array_access.dimensionS,a.getDimension())));
			                                                    //System.out.println("Dimension demasiadas grandes do array "+(((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null));
			                                                }
			                                            }
			                                        }
			                                        //if(isSet && _localctx.set!=null){
			                                        if( _localctx.set!=null){
			                                            Node m = new Node(new String((((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null)),null,null);
			                                            Node head = new Node(new String("array"),m,((DesignatorContext)_localctx).a.treeS);
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
		public String id;
		public boolean response;
		public int dimensionS;
		public Node treeS;
		public String mipsCodeS;
		public Elem_arrayContext e;
		public Elem_arrayContext elem_array;
		public Elem_arrayContext elem_array() {
			return getRuleContext(Elem_arrayContext.class,0);
		}
		public Array_accessContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Array_accessContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set, String id) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
			this.id = id;
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

	public final Array_accessContext array_access(IdentifiersTable idTH,Set set,String id) throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState(), idTH, set, id);
		enterRule(_localctx, 64, RULE_array_access);
		try {
			setState(443);
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
				setState(438); 
				match(T__19);
				setState(439); 
				((Array_accessContext)_localctx).e = ((Array_accessContext)_localctx).elem_array = elem_array(idTH, set, id);
				setState(440); 
				match(T__20);
				((Array_accessContext)_localctx).response =  true; ((Array_accessContext)_localctx).dimensionS =  ((Array_accessContext)_localctx).elem_array.dimensionS; ((Array_accessContext)_localctx).treeS =  ((Array_accessContext)_localctx).e.treeS; if(((Array_accessContext)_localctx).e.mipsCodeS != null){((Array_accessContext)_localctx).mipsCodeS =  ((Array_accessContext)_localctx).e.mipsCodeS;}
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
		public String id;
		public int dimensionS;
		public Node treeS;
		public String mipsCodeS;
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
		public Elem_arrayContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set, String id) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
			this.id = id;
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

	public final Elem_arrayContext elem_array(IdentifiersTable idTH,Set set,String id) throws RecognitionException {
		Elem_arrayContext _localctx = new Elem_arrayContext(_ctx, getState(), idTH, set, id);
		enterRule(_localctx, 66, RULE_elem_array);

		                int dimension = 0;
		                ((Elem_arrayContext)_localctx).treeS =  null;
		                Node head = null;
		                Node right = null;

		                //((Elem_arrayContext)_localctx).mipsCodeS =  null;
		                Array array = (Array) idTH.getInfoIdentifiersTable(id);
		                int n = 1;
		                //System.out.println("Dimension: "+array.getDimension());
		           
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); 
			((Elem_arrayContext)_localctx).s1 = ((Elem_arrayContext)_localctx).single_expression = single_expression(idTH, set);

			                                      dimension++;
			                                      if(!(((Elem_arrayContext)_localctx).single_expression.typeS == "integer"))
			                                           {
			                                            //ErrorMessage.errorSemantic((((Elem_arrayContext)_localctx).single_expression!=null?_input.getText(((Elem_arrayContext)_localctx).single_expression.start,((Elem_arrayContext)_localctx).single_expression.stop):null),((Elem_arrayContext)_localctx).single_expression.line,((Elem_arrayContext)_localctx).single_expression.pos,ErrorMessage.type(((Elem_arrayContext)_localctx).single_expression.typeS,"integer"));
			                                            e.addMessage(((Elem_arrayContext)_localctx).single_expression.line,((Elem_arrayContext)_localctx).single_expression.pos,ErrorMessage.semantic((((Elem_arrayContext)_localctx).single_expression!=null?_input.getText(((Elem_arrayContext)_localctx).single_expression.start,((Elem_arrayContext)_localctx).single_expression.stop):null),ErrorMessage.type(((Elem_arrayContext)_localctx).single_expression.typeS,"integer")));
			                                           }
			                                      else{
			                                        if(!isSet){
			                                            if(array.getDimension() == 1){
			                                                ((Elem_arrayContext)_localctx).mipsCodeS =  ((Elem_arrayContext)_localctx).s1.mipsCodeS;
			                                            }else{
			                                                int res = 1;
			                                                for(int i = n; i < array.getDimension(); i++){
			                                                    res = res* array.getLimits().get(i);
			                                                }
			                                                ((Elem_arrayContext)_localctx).mipsCodeS =  ((Elem_arrayContext)_localctx).s1.mipsCodeS + m.loadImmediateWord(String.valueOf(res),((Elem_arrayContext)_localctx).s1.line,((Elem_arrayContext)_localctx).s1.pos) + m.textMul(((Elem_arrayContext)_localctx).s1.line,((Elem_arrayContext)_localctx).s1.pos);
			                                                //System.out.println(_localctx.mipsCodeS);
			                                                n++;
			                                            }
			                                        }
			                                      }
			                                      //if(isSet && _localctx.set!=null && head == null){
			                                      if( _localctx.set!=null && head == null){
			                                        head = new Node(new String("args"),((Elem_arrayContext)_localctx).s1.treeS,null);
			                                        right = head;
			                                      }
			                                    
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(447); 
				match(T__7);
				setState(448); 
				((Elem_arrayContext)_localctx).s2 = ((Elem_arrayContext)_localctx).single_expression = single_expression(idTH, set);

				                                        dimension++;
				                                        if(!(((Elem_arrayContext)_localctx).single_expression.typeS == "integer")){
				                                            //ErrorMessage.errorSemantic((((Elem_arrayContext)_localctx).single_expression!=null?_input.getText(((Elem_arrayContext)_localctx).single_expression.start,((Elem_arrayContext)_localctx).single_expression.stop):null),((Elem_arrayContext)_localctx).single_expression.line,((Elem_arrayContext)_localctx).single_expression.pos,ErrorMessage.type(((Elem_arrayContext)_localctx).single_expression.typeS,"integer"));
				                                            e.addMessage(((Elem_arrayContext)_localctx).single_expression.line,((Elem_arrayContext)_localctx).single_expression.pos,ErrorMessage.semantic((((Elem_arrayContext)_localctx).single_expression!=null?_input.getText(((Elem_arrayContext)_localctx).single_expression.start,((Elem_arrayContext)_localctx).single_expression.stop):null),ErrorMessage.type(((Elem_arrayContext)_localctx).single_expression.typeS,"integer")));
				                                        }else{
				                                            if(!isSet){
				                                                if(array.getDimension() == n){
				                                                    _localctx.mipsCodeS += ((Elem_arrayContext)_localctx).s2.mipsCodeS + m.textAdd(((Elem_arrayContext)_localctx).s2.line,((Elem_arrayContext)_localctx).s2.pos);
				                                                }else{
				                                                    int res = 1;
				                                                    for(int i = n; i < array.getDimension(); i++){
				                                                        res = res* array.getLimits().get(i);
				                                                    }
				                                                    _localctx.mipsCodeS += ((Elem_arrayContext)_localctx).s2.mipsCodeS + m.loadImmediateWord(String.valueOf(res),((Elem_arrayContext)_localctx).s2.line,((Elem_arrayContext)_localctx).s2.pos) + m.textMul(((Elem_arrayContext)_localctx).s2.line,((Elem_arrayContext)_localctx).s2.pos) + m.textAdd(((Elem_arrayContext)_localctx).s2.line,((Elem_arrayContext)_localctx).s2.pos);
				                                                    n++;
				                                                }
				                                            }


				                                        }
				                                        //if(isSet && _localctx.set!=null){
				                                        if( _localctx.set!=null){
				                                            Node m = new Node(new String("args"),((Elem_arrayContext)_localctx).s2.treeS,null);
				                                            right.setRight(m);
				                                            right = m;
				                                        }
				                                    
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			              ((Elem_arrayContext)_localctx).dimensionS =  dimension;
			              //if(isSet && _localctx.set!=null && head!=null){
			              if( _localctx.set!=null && head!=null){
			                ((Elem_arrayContext)_localctx).treeS =  head;
			              }

			              //gerar o codigo asssembly mips
			              if(!isSet){
			                  //Verificar os limites dos arrays se estao na zona do array
			                  int res = 1;
			                  for(int i = 0; i < array.getDimension(); i++){
			                    res = res* array.getLimits().get(i);
			                  }
			                  _localctx.mipsCodeS += m.textLimitsArray(res,((Elem_arrayContext)_localctx).s1.line,((Elem_arrayContext)_localctx).s1.pos);
			                  //caso estiver tudo correcto multiplicar o array por 4
			                  _localctx.mipsCodeS += m.loadImmediateWord(String.valueOf("4"),((Elem_arrayContext)_localctx).s1.line,((Elem_arrayContext)_localctx).s1.pos) + m.textMul(((Elem_arrayContext)_localctx).s1.line,((Elem_arrayContext)_localctx).s1.pos);

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
			setState(458); 
			((Function_callContext)_localctx).i = identifier();
			setState(459); 
			match(T__25);
			setState(460); 
			((Function_callContext)_localctx).s = sub_prg_args(idTH, set);
			setState(461); 
			match(T__26);
			 if( _localctx.set!=null){Node m = new Node(new String("call"),new Node(new String((((Function_callContext)_localctx).i!=null?_input.getText(((Function_callContext)_localctx).i.start,((Function_callContext)_localctx).i.stop):null)),null,null),((Function_callContext)_localctx).s.treeS);}/*if(isSet && _localctx.set!=null){Node m = new Node(new String("call"),new Node(new String((((Function_callContext)_localctx).i!=null?_input.getText(((Function_callContext)_localctx).i.start,((Function_callContext)_localctx).i.stop):null)),null,null),((Function_callContext)_localctx).s.treeS);}*/
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
			setState(468);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				 ((Sub_prg_argsContext)_localctx).treeS =  null;/*if(isSet && $set!=null){$treeS = null;}*/
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
				setState(465); 
				((Sub_prg_argsContext)_localctx).a = args(idTH, set);
				 ((Sub_prg_argsContext)_localctx).treeS =  ((Sub_prg_argsContext)_localctx).a.treeS;/*if(isSet && $set!=null){$treeS = $a.treeS;}*/
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
			setState(470); 
			((ArgsContext)_localctx).e1 = expression(idTH, set);
			  head = new Node(new String("args"),((ArgsContext)_localctx).e1.treeS,null); m = head;/*if(isSet && _localctx.set!=null){ head = new Node(new String("args"),((ArgsContext)_localctx).e1.treeS,null); m = head;}*/
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(472); 
				match(T__7);
				setState(473); 
				((ArgsContext)_localctx).e2 = expression(idTH, set);
				  m.setRight(new Node(new String("args"),((ArgsContext)_localctx).e2.treeS,null)); m = m.getRight();/*if(isSet && _localctx.set!=null){ m.setRight(new Node(new String("args"),((ArgsContext)_localctx).e2.treeS,null)); m = m.getRight();}*/
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        //if(isSet && _localctx.set!=null){
			        if(_localctx.set!=null){
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
		public String mipsCodeS;
		public Set setS;
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
		                ((ExpressionContext)_localctx).mipsCodeS =  null;

		            
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483); 
			((ExpressionContext)_localctx).s1 = single_expression(idTH, set);
			 ((ExpressionContext)_localctx).line =  ((ExpressionContext)_localctx).s1.line; ((ExpressionContext)_localctx).pos =  ((ExpressionContext)_localctx).s1.pos; n = ((ExpressionContext)_localctx).s1.treeS; ((ExpressionContext)_localctx).setS =  ((ExpressionContext)_localctx).s1.setS; if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null) == null){((ExpressionContext)_localctx).mipsCodeS =  ((ExpressionContext)_localctx).s1.mipsCodeS;}
			setState(489);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(485); 
				((ExpressionContext)_localctx).rel_op = rel_op();
				setState(486); 
				((ExpressionContext)_localctx).s2 = single_expression(idTH,set);
				   relationExp = true;
				                    if(!(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("in")){
				                        if((((ExpressionContext)_localctx).s1.typeS != null) && ((ExpressionContext)_localctx).s1.typeS.equals(((ExpressionContext)_localctx).rel_op.typeS)){
				                            if((((ExpressionContext)_localctx).s2.typeS !=null) && ((ExpressionContext)_localctx).rel_op.typeS.equals(((ExpressionContext)_localctx).s2.typeS)){
				                                ((ExpressionContext)_localctx).typeS =  "boolean";
				                                //MIPS
				                                    if(((ExpressionContext)_localctx).rel_op.typeS.equals("integer") && !isDeclarations && !isSet){
				                                        ((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + ((ExpressionContext)_localctx).s2.mipsCodeS;
				                                        if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("==")){
				                                            ((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textEquals(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                            //((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textSetOnLessThan(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos) + m.textNot(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                            //((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textSetOnGreatThan(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos) + m.textNot(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                            //((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textAnd(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                        }else if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("!=")){
				                                            ((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textDifferent(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                            //((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textSetOnLessThan(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                            //((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textSetOnGreatThan(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                            //((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textOr(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                        }else if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals(">=")){
				                                            //((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + ((ExpressionContext)_localctx).s2.mipsCodeS;
				                                            ((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textSetOnLessThan(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos) + m.textNot(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                        }else if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("<=")){
				                                            //((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + ((ExpressionContext)_localctx).s2.mipsCodeS;
				                                            ((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textSetOnGreatThan(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos) + m.textNot(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                        }else if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("<")){
				                                            //((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + ((ExpressionContext)_localctx).s2.mipsCodeS;
				                                            ((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textSetOnLessThan(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                        }else if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals(">")){
				                                            //((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + ((ExpressionContext)_localctx).s2.mipsCodeS;
				                                            ((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textSetOnGreatThan(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                        }
				                                    }
				                                //END_MIPS
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
				                        // integer 'in' set
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

				                        Set s = ((ExpressionContext)_localctx).s2.setS;
				                        if(s!=null && !isDeclarations){
				                            System.out.println(s.toString()+" LINE : "+((ExpressionContext)_localctx).rel_op.line);
				                            s.setIdentifier(((ExpressionContext)_localctx).s1.treeS);
				                            System.out.println(s.toString());
				                            //escrever o mips code para gerar !
				                            ((ExpressionContext)_localctx).mipsCodeS =  s.mipsCode(_localctx.idTH,m, ((ExpressionContext)_localctx).rel_op.line);
				                        }

				                    }
				                    //if(isSet && _localctx.set!=null && !(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("in")){ //!(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("in") -> the 'in' relation serves for the use of set only
				                    if(!(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("in")){ //!(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("in") -> the 'in' relation serves for the use of set only
				                        Node m = new Node(new String((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null)),((ExpressionContext)_localctx).s1.treeS,((ExpressionContext)_localctx).s2.treeS);
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

			                ((ExpressionContext)_localctx).treeS =  n;
			            
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
		public Set setS;
		public int line;
		public int pos;
		public Node treeS;
		public String mipsCodeS;
		public TermContext t1;
		public TermContext term;
		public Add_opContext a;
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
		                    ((Single_expressionContext)_localctx).mipsCodeS =  null;

		                    //Tratar os erros com mais especificaçoes
		                    LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();
		                  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493); 
			((Single_expressionContext)_localctx).t1 = ((Single_expressionContext)_localctx).term = term(idTH, set);
			((Single_expressionContext)_localctx).line =  ((Single_expressionContext)_localctx).term.line; ((Single_expressionContext)_localctx).pos =  ((Single_expressionContext)_localctx).term.pos; errorManagement.add(new ErrorInfo((((Single_expressionContext)_localctx).t1!=null?_input.getText(((Single_expressionContext)_localctx).t1.start,((Single_expressionContext)_localctx).t1.stop):null),((Single_expressionContext)_localctx).t1.typeS,((Single_expressionContext)_localctx).t1.line,((Single_expressionContext)_localctx).t1.pos)); n = ((Single_expressionContext)_localctx).t1.treeS; ((Single_expressionContext)_localctx).setS =  ((Single_expressionContext)_localctx).t1.setS; ((Single_expressionContext)_localctx).mipsCodeS =  ((Single_expressionContext)_localctx).t1.mipsCodeS;
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				{
				setState(495); 
				((Single_expressionContext)_localctx).a = ((Single_expressionContext)_localctx).add_op = add_op();
				setState(496); 
				((Single_expressionContext)_localctx).t2 = ((Single_expressionContext)_localctx).term = term(idTH, set);

				                                        errorManagement.add(new ErrorInfo((((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null),((Single_expressionContext)_localctx).add_op.typeS,((Single_expressionContext)_localctx).add_op.line,((Single_expressionContext)_localctx).add_op.pos));
				                                        errorManagement.add(new ErrorInfo((((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null),((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).t2.line,((Single_expressionContext)_localctx).t2.pos));


				                                        if(firstTime){
				                                            firstTime = false;
				                                            if((((Single_expressionContext)_localctx).t1.typeS != null) && ((Single_expressionContext)_localctx).t1.typeS.equals(((Single_expressionContext)_localctx).add_op.typeS)){
				                                                if((((Single_expressionContext)_localctx).t2.typeS != null) && ((Single_expressionContext)_localctx).add_op.typeS.equals(((Single_expressionContext)_localctx).t2.typeS)){
				                                                    leftType = ((Single_expressionContext)_localctx).add_op.typeS;

				                                                    //MIPS
				                                                    if(((Single_expressionContext)_localctx).add_op.typeS.equals("integer") && !isDeclarations && !isSet){
				                                                        ((Single_expressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + ((Single_expressionContext)_localctx).t2.mipsCodeS;
				                                                        if((((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null).equals("+")){
				                                                            //System.out.println("Line: "+((Single_expressionContext)_localctx).t1.line+" ERROR");
				                                                            ((Single_expressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textAdd(((Single_expressionContext)_localctx).add_op.line,((Single_expressionContext)_localctx).add_op.pos);
				                                                        }
				                                                        if((((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null).equals("-") && _localctx.mipsCodeS != null){
				                                                            ((Single_expressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textSub(((Single_expressionContext)_localctx).add_op.line,((Single_expressionContext)_localctx).add_op.pos);
				                                                            //System.out.println(_localctx.mipsCodeS+" single_expression");
				                                                        }
				                                                        //}
				                                                    }
				                                                    //END_MIPS
				                                                }else{
				                                                    e.addMessage(((Single_expressionContext)_localctx).t1.line,((Single_expressionContext)_localctx).t1.pos,ErrorMessage.semantic((((Single_expressionContext)_localctx).t1!=null?_input.getText(((Single_expressionContext)_localctx).t1.start,((Single_expressionContext)_localctx).t1.stop):null)+" "+(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null)+" "+(((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null),ErrorMessage.typeExpression(((Single_expressionContext)_localctx).t1.typeS,(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null),((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).add_op.typeS,((Single_expressionContext)_localctx).add_op.typeS)+" < single_Expression 1"));
				                                                    correctType = false;

				                                                }
				                                            }else{
				                                                e.addMessage(((Single_expressionContext)_localctx).t1.line,((Single_expressionContext)_localctx).t1.pos,ErrorMessage.semantic((((Single_expressionContext)_localctx).t1!=null?_input.getText(((Single_expressionContext)_localctx).t1.start,((Single_expressionContext)_localctx).t1.stop):null)+" "+(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null)+" "+(((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null),ErrorMessage.typeExpression(((Single_expressionContext)_localctx).t1.typeS,(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null),((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).add_op.typeS,((Single_expressionContext)_localctx).add_op.typeS)+" < single_Expression 2"));
				                                                correctType = false;
				                                            }
				                                            //Construct Set
				                                            if(((Single_expressionContext)_localctx).add_op.typeS.equals("set") && !isDeclarations){
				                                                if((((Single_expressionContext)_localctx).a!=null?_input.getText(((Single_expressionContext)_localctx).a.start,((Single_expressionContext)_localctx).a.stop):null).equals("++")){
				                                                    Set s1 = ((Single_expressionContext)_localctx).t1.setS ;
				                                                    Set s2 = ((Single_expressionContext)_localctx).t2.setS;
				                                                    if(s1 == null ){
				                                                        SymbolTable.Set s = (SymbolTable.Set) _localctx.idTH.getInfoIdentifiersTable((((Single_expressionContext)_localctx).t1!=null?_input.getText(((Single_expressionContext)_localctx).t1.start,((Single_expressionContext)_localctx).t1.stop):null));
				                                                        s1 = s.getSet();
				                                                    }
				                                                    if(s2 == null ){
				                                                        SymbolTable.Set s = (SymbolTable.Set) _localctx.idTH.getInfoIdentifiersTable((((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null));
				                                                        s2 = s.getSet();
				                                                    }
				                                                    ((Single_expressionContext)_localctx).setS =  new Set(s1,s2,(((Single_expressionContext)_localctx).a!=null?_input.getText(((Single_expressionContext)_localctx).a.start,((Single_expressionContext)_localctx).a.stop):null));

				                                                }
				                                            }
				                                        }else{
				                                            errorManagement.pop();
				                                            errorManagement.pop();

				                                            ErrorInfo leftVar = errorManagement.get(0);

				                                            if( (leftType != null) && leftType.equals(((Single_expressionContext)_localctx).add_op.typeS)){
				                                                if((((Single_expressionContext)_localctx).t2.typeS != null) && ((Single_expressionContext)_localctx).add_op.typeS.equals(((Single_expressionContext)_localctx).t2.typeS)){
				                                                    leftType = ((Single_expressionContext)_localctx).add_op.typeS;

				                                                    //MIPS
				                                                    if(((Single_expressionContext)_localctx).add_op.typeS.equals("integer") && !isDeclarations && !isSet){
				                                                        ((Single_expressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + ((Single_expressionContext)_localctx).t2.mipsCodeS;
				                                                        if((((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null).equals("+")){
				                                                            ((Single_expressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textAdd(((Single_expressionContext)_localctx).add_op.line,((Single_expressionContext)_localctx).add_op.pos);
				                                                        }
				                                                        if((((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null).equals("-") && _localctx.mipsCodeS != null){
				                                                            ((Single_expressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textSub(((Single_expressionContext)_localctx).add_op.line,((Single_expressionContext)_localctx).add_op.pos);
				                                                            //System.out.println(_localctx.mipsCodeS+" single_expression");
				                                                        }
				                                                    }
				                                                    //END_MIPS
				                                                }else{
				                                                    e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null)+" "+(((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null),ErrorMessage.typeExpression(leftVar.getType(),(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null),((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).add_op.typeS,((Single_expressionContext)_localctx).add_op.typeS)+" < single_Expression 3"));
				                                                    correctType = false;
				                                                }
				                                            }else{
				                                                e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null)+" "+(((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null),ErrorMessage.typeExpression(leftVar.getType(),(((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null),((Single_expressionContext)_localctx).t2.typeS,((Single_expressionContext)_localctx).add_op.typeS,((Single_expressionContext)_localctx).add_op.typeS)+" < single_Expression 4"));
				                                                correctType = false;
				                                            }

				                                            //Construct Set
				                                            if((((Single_expressionContext)_localctx).a!=null?_input.getText(((Single_expressionContext)_localctx).a.start,((Single_expressionContext)_localctx).a.stop):null).equals("++")){
				                                                Set s1 = _localctx.setS ;
				                                                Set s2 = ((Single_expressionContext)_localctx).t2.setS;
				                                                if(s1 == null ){
				                                                    SymbolTable.Set s = (SymbolTable.Set) _localctx.idTH.getInfoIdentifiersTable((((Single_expressionContext)_localctx).t1!=null?_input.getText(((Single_expressionContext)_localctx).t1.start,((Single_expressionContext)_localctx).t1.stop):null));
				                                                    s1 = s.getSet();
				                                                }
				                                                if(s2 == null ){
				                                                    SymbolTable.Set s = (SymbolTable.Set) _localctx.idTH.getInfoIdentifiersTable((((Single_expressionContext)_localctx).t2!=null?_input.getText(((Single_expressionContext)_localctx).t2.start,((Single_expressionContext)_localctx).t2.stop):null));
				                                                    s2 = s.getSet();
				                                                }
				                                                ((Single_expressionContext)_localctx).setS =  new Set(s1,s2,(((Single_expressionContext)_localctx).a!=null?_input.getText(((Single_expressionContext)_localctx).a.start,((Single_expressionContext)_localctx).a.stop):null));
				                                            }
				                                        }

				                                        //Constructing the tree for others operators
				                                        if(!(((Single_expressionContext)_localctx).a!=null?_input.getText(((Single_expressionContext)_localctx).a.start,((Single_expressionContext)_localctx).a.stop):null).equals("++")){
				                                            Node m = new Node(new String((((Single_expressionContext)_localctx).add_op!=null?_input.getText(((Single_expressionContext)_localctx).add_op.start,((Single_expressionContext)_localctx).add_op.stop):null)),n,((Single_expressionContext)_localctx).t2.treeS);
				                                            n = m;
				                                        }
				                                     
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			                        if(correctType == true){
			                            ((Single_expressionContext)_localctx).typeS =  ((Single_expressionContext)_localctx).t1.typeS;
			                        }

			                        ((Single_expressionContext)_localctx).treeS =  n;

			                     
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
		public Set setS;
		public int line;
		public int pos;
		public Node treeS;
		public String mipsCodeS;
		public FactorContext f1;
		public Mul_opContext m;
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
		        ((TermContext)_localctx).mipsCodeS =  null;

		        //Tratar os erros com mais especificaçoes (queue de erros de informaçoes)
		        LinkedList<ErrorInfo> errorManagement = new LinkedList<ErrorInfo>();
		     
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506); 
			((TermContext)_localctx).f1 = factor(idTH, set);
			 ((TermContext)_localctx).line =  ((TermContext)_localctx).f1.line; ((TermContext)_localctx).pos =  ((TermContext)_localctx).f1.pos;  errorManagement.add(new ErrorInfo((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null), ((TermContext)_localctx).f1.typeS, ((TermContext)_localctx).f1.line,((TermContext)_localctx).f1.pos)); n = ((TermContext)_localctx).f1.treeS; if(((TermContext)_localctx).f1.setS == null && !isDeclarations){ if(_localctx.idTH.doesExist((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null))){if(_localctx.idTH.getInfoIdentifiersTable((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null)) instanceof SymbolTable.Set){SymbolTable.Set s = (SymbolTable.Set) _localctx.idTH.getInfoIdentifiersTable((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null)); ((TermContext)_localctx).setS =  s.getSet();}}}else{((TermContext)_localctx).setS =  ((TermContext)_localctx).f1.setS;} ((TermContext)_localctx).mipsCodeS =  ((TermContext)_localctx).f1.mipsCodeS; 
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				{
				setState(508); 
				((TermContext)_localctx).m = ((TermContext)_localctx).mul_op = mul_op();
				setState(509); 
				((TermContext)_localctx).f2 = factor(idTH, set);


				                                errorManagement.add(new ErrorInfo((((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null),((TermContext)_localctx).mul_op.typeS,((TermContext)_localctx).mul_op.line,((TermContext)_localctx).mul_op.pos));
				                                errorManagement.add(new ErrorInfo((((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null),((TermContext)_localctx).f2.typeS,((TermContext)_localctx).f2.line,((TermContext)_localctx).f2.pos));

				                                if(firstTime){
				                                    firstTime = false;
				                                    if((((TermContext)_localctx).f1.typeS != null) && ((TermContext)_localctx).f1.typeS.equals(((TermContext)_localctx).mul_op.typeS)){
				                                        if((((TermContext)_localctx).f2.typeS != null) && ((TermContext)_localctx).mul_op.typeS.equals(((TermContext)_localctx).f2.typeS)){
				                                            leftType = ((TermContext)_localctx).mul_op.typeS;

				                                            //MIPS
				                                            if(((TermContext)_localctx).mul_op.typeS.equals("integer") && !isDeclarations && !isSet){
				                                                ((TermContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + ((TermContext)_localctx).f2.mipsCodeS;
				                                                if((((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null).equals("*")){
				                                                    ((TermContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textMul(((TermContext)_localctx).mul_op.line,((TermContext)_localctx).mul_op.pos);
				                                                }
				                                                if((((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null).equals("/")){
				                                                    ((TermContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textDiv(((TermContext)_localctx).mul_op.line,((TermContext)_localctx).mul_op.pos);
				                                                }
				                                            }

				                                        }else{
				                                            e.addMessage(((TermContext)_localctx).f1.line,((TermContext)_localctx).f1.pos,ErrorMessage.semantic((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null)+" "+(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null)+" "+(((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null),ErrorMessage.typeExpression(((TermContext)_localctx).f1.typeS,(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null),((TermContext)_localctx).f2.typeS,((TermContext)_localctx).mul_op.typeS,((TermContext)_localctx).mul_op.typeS)+" < term1"));
				                                            correctType = false;
				                                        }
				                                    }else{
				                                        e.addMessage(((TermContext)_localctx).f1.line,((TermContext)_localctx).f1.pos,ErrorMessage.semantic((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null)+" "+(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null)+" "+(((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null),ErrorMessage.typeExpression(((TermContext)_localctx).f1.typeS,(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null),((TermContext)_localctx).f2.typeS,((TermContext)_localctx).mul_op.typeS,((TermContext)_localctx).mul_op.typeS)+" < term2"));
				                                        correctType = false;
				                                    }
				                                    //Construct Set
				                                    if(((TermContext)_localctx).mul_op.typeS.equals("set") && !isDeclarations){
				                                        if((((TermContext)_localctx).m!=null?_input.getText(((TermContext)_localctx).m.start,((TermContext)_localctx).m.stop):null).equals("**")){
				                                            Set s1 = ((TermContext)_localctx).f1.setS ;
				                                            Set s2 = ((TermContext)_localctx).f2.setS;
				                                            if(s1 == null ){
				                                                SymbolTable.Set s = (SymbolTable.Set) _localctx.idTH.getInfoIdentifiersTable((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null));
				                                                s1 = s.getSet();
				                                            }
				                                            if(s2 == null ){
				                                                SymbolTable.Set s = (SymbolTable.Set) _localctx.idTH.getInfoIdentifiersTable((((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null));
				                                                s2 = s.getSet();
				                                            }
				                                            ((TermContext)_localctx).setS =  new Set(s1,s2,(((TermContext)_localctx).m!=null?_input.getText(((TermContext)_localctx).m.start,((TermContext)_localctx).m.stop):null));
				                                            //System.out.println(_localctx.setS.toString());
				                                            //_localctx.setS.setIdentifier(new Node("3"));
				                                            //System.out.println(_localctx.setS.toString());

				                                        }
				                                    }
				                                }else{

				                                        errorManagement.pop();
				                                        errorManagement.pop();

				                                        ErrorInfo leftVar = errorManagement.get(0);

				                                        if((leftType != null) && leftType.equals(((TermContext)_localctx).mul_op.typeS)){
				                                            if((((TermContext)_localctx).f2.typeS != null) && ((TermContext)_localctx).mul_op.typeS.equals(((TermContext)_localctx).f2.typeS)){
				                                                leftType = ((TermContext)_localctx).mul_op.typeS;

				                                                //MIPS
				                                                if(((TermContext)_localctx).mul_op.typeS.equals("integer") && !isDeclarations && !isSet){
				                                                    ((TermContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + ((TermContext)_localctx).f2.mipsCodeS;
				                                                    if((((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null).equals("*")){
				                                                        ((TermContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textMul(((TermContext)_localctx).mul_op.line,((TermContext)_localctx).mul_op.pos);
				                                                    }
				                                                    if((((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null).equals("/")){
				                                                        ((TermContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textDiv(((TermContext)_localctx).mul_op.line,((TermContext)_localctx).mul_op.pos);
				                                                    }
				                                                }


				                                            }else{
				                                                e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null)+" "+(((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null),ErrorMessage.typeExpression(leftVar.getType(),(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null),((TermContext)_localctx).f2.typeS,((TermContext)_localctx).mul_op.typeS,((TermContext)_localctx).mul_op.typeS)+" < term3"));
				                                                correctType = false;
				                                            }
				                                        }else{
				                                            String identifier = errorManagement.get(0).getIdentifier();
				                                            e.addMessage(leftVar.getLine(),leftVar.getPos(),ErrorMessage.semantic(leftVar.getIdentifier()+" "+(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null)+" "+(((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null),ErrorMessage.typeExpression(leftVar.getType(),(((TermContext)_localctx).mul_op!=null?_input.getText(((TermContext)_localctx).mul_op.start,((TermContext)_localctx).mul_op.stop):null),((TermContext)_localctx).f2.typeS,((TermContext)_localctx).mul_op.typeS,((TermContext)_localctx).mul_op.typeS)+" < term4"));
				                                            correctType = false;
				                                        }
				                                        //Construct Set
				                                        if(((TermContext)_localctx).mul_op.typeS.equals("set") && !isDeclarations){
				                                            if((((TermContext)_localctx).m!=null?_input.getText(((TermContext)_localctx).m.start,((TermContext)_localctx).m.stop):null).equals("**")){
				                                                Set s1 = _localctx.setS ;
				                                                Set s2 = ((TermContext)_localctx).f2.setS;
				                                                if(s1 == null ){
				                                                    SymbolTable.Set s = (SymbolTable.Set) _localctx.idTH.getInfoIdentifiersTable((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null));
				                                                    s1 = s.getSet();
				                                                }
				                                                if(s2 == null ){
				                                                    SymbolTable.Set s = (SymbolTable.Set) _localctx.idTH.getInfoIdentifiersTable((((TermContext)_localctx).f2!=null?_input.getText(((TermContext)_localctx).f2.start,((TermContext)_localctx).f2.stop):null));
				                                                    s2 = s.getSet();
				                                                }
				                                                ((TermContext)_localctx).setS =  new Set(s1,s2,(((TermContext)_localctx).m!=null?_input.getText(((TermContext)_localctx).m.start,((TermContext)_localctx).m.stop):null));

				                                            }
				                                        }
				                                }

				                                //Constructing the tree for others operators
				                                if(!(((TermContext)_localctx).m!=null?_input.getText(((TermContext)_localctx).m.start,((TermContext)_localctx).m.stop):null).equals("**")){
				                                    Node m = new Node(new String((((TermContext)_localctx).m!=null?_input.getText(((TermContext)_localctx).m.start,((TermContext)_localctx).m.stop):null)),n,((TermContext)_localctx).f2.treeS);
				                                    n = m;
				                                }
				                          
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            if(correctType == true){
			                ((TermContext)_localctx).typeS =  ((TermContext)_localctx).f1.typeS;
			            }
			            ((TermContext)_localctx).treeS =  n;


			        
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
		public Set setS;
		public int line;
		public int pos;
		public Node treeS;
		public String mipsCodeS;
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

		        ((FactorContext)_localctx).treeS =  null;
		        ((FactorContext)_localctx).mipsCodeS =  null;
		        String side = "right";
		        ((FactorContext)_localctx).setS =  null;
		       
		try {
			setState(540);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519); 
				((FactorContext)_localctx).i = inic_var(idTH, set);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).i.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).i.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).i.pos; ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).i.treeS; ((FactorContext)_localctx).setS =  ((FactorContext)_localctx).i.setS; /*if(isSet && ((FactorContext)_localctx).i.treeS!=null && _localctx.set!=null){ ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).i.treeS;}*/ ((FactorContext)_localctx).mipsCodeS =  ((FactorContext)_localctx).i.mipsCodeS;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522); 
				((FactorContext)_localctx).d = designator(idTH, set, side);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).d.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).d.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).d.pos; ((FactorContext)_localctx).mipsCodeS =  ((FactorContext)_localctx).d.mipsCodeS; ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).d.treeS;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525); 
				match(T__25);
				setState(526); 
				((FactorContext)_localctx).e = expression(idTH, set);
				setState(527); 
				match(T__26);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).e.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).e.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).e.pos; ((FactorContext)_localctx).mipsCodeS =  ((FactorContext)_localctx).e.mipsCodeS; ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).e.treeS; ((FactorContext)_localctx).setS =  ((FactorContext)_localctx).e.setS;/*if(isSet && $e.treeS!=null && $set!=null){ $treeS = $e.treeS;}*/
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(530); 
				match(T__28);
				setState(531); 
				((FactorContext)_localctx).f1 = factor(idTH, set);

				            ((FactorContext)_localctx).line =  ((FactorContext)_localctx).f1.line;
				            ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).f1.pos;
				            if(((FactorContext)_localctx).f1.typeS!=null && ((FactorContext)_localctx).f1.typeS.equals("boolean")){
				                ((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).f1.typeS;
				            }else{
				                ((FactorContext)_localctx).typeS =  null;
				                e.addMessage(((FactorContext)_localctx).f1.line,((FactorContext)_localctx).f1.pos,ErrorMessage.semantic((((FactorContext)_localctx).f1!=null?_input.getText(((FactorContext)_localctx).f1.start,((FactorContext)_localctx).f1.stop):null),ErrorMessage.type(((FactorContext)_localctx).f1.typeS,"boolean")));
				            }
				            /*if(isSet && _localctx.set!=null){
				                Node n = new Node(new String("not"),((FactorContext)_localctx).f1.treeS,null);
				                ((FactorContext)_localctx).treeS =  n;
				            }*/
				            Node n = new Node(new String("not"),((FactorContext)_localctx).f1.treeS,null);
				            ((FactorContext)_localctx).treeS =  n;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(534); 
				((FactorContext)_localctx).f2 = function_call(idTH, set);
				((FactorContext)_localctx).typeS =  null; ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).f2.treeS; /*if(isSet && _localctx.set!=null){((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).f2.treeS;}*/
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(537); 
				((FactorContext)_localctx).s = specialFunctions(idTH, set);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).s.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).s.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).s.pos; ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).s.treeS; /*if(isSet && ((FactorContext)_localctx).s.treeS!=null && _localctx.set!=null){ ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).s.treeS;}*/
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
			setState(563);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(542); 
				((SpecialFunctionsContext)_localctx).t = ((SpecialFunctionsContext)_localctx).tail = tail(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).tail.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).tail.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).tail.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).t.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).t.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).t.treeS;}*/
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(545); 
				((SpecialFunctionsContext)_localctx).h = ((SpecialFunctionsContext)_localctx).head = head(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).head.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).head.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).head.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).h.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).h.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).h.treeS;}*/
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(548); 
				((SpecialFunctionsContext)_localctx).c = ((SpecialFunctionsContext)_localctx).cons = cons(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).cons.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).cons.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).cons.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).c.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).c.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).c.treeS;}*/
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 4);
				{
				setState(551); 
				((SpecialFunctionsContext)_localctx).m = ((SpecialFunctionsContext)_localctx).member = member(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).member.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).member.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).member.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).m.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).m.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).m.treeS;}*/
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 5);
				{
				setState(554); 
				((SpecialFunctionsContext)_localctx).i = ((SpecialFunctionsContext)_localctx).is_empty = is_empty(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).is_empty.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).is_empty.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).is_empty.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).i.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).i.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).i.treeS;}*/
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 6);
				{
				setState(557); 
				((SpecialFunctionsContext)_localctx).l = ((SpecialFunctionsContext)_localctx).length = length(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).length.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).length.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).length.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).l.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).l.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).l.treeS;}*/
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 7);
				{
				setState(560); 
				((SpecialFunctionsContext)_localctx).d = ((SpecialFunctionsContext)_localctx).delete = delete(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).delete.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).delete.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).delete.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).d.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).d.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).d.treeS;}*/
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
			setState(573);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(565); 
				((Add_opContext)_localctx).a = match(T__17);
				((Add_opContext)_localctx).typeS =  "integer"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(567); 
				((Add_opContext)_localctx).a = match(T__18);
				((Add_opContext)_localctx).typeS =  "integer"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(569); 
				((Add_opContext)_localctx).a = match(T__29);
				((Add_opContext)_localctx).typeS =  "boolean"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(571); 
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
			setState(583);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(575); 
				((Mul_opContext)_localctx).m = match(T__31);
				((Mul_opContext)_localctx).typeS =  "integer"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(577); 
				((Mul_opContext)_localctx).m = match(T__32);
				((Mul_opContext)_localctx).typeS =  "integer"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(579); 
				((Mul_opContext)_localctx).m = match(T__33);
				((Mul_opContext)_localctx).typeS =  "boolean"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(581); 
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
			setState(599);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(585); 
				((Rel_opContext)_localctx).r = match(T__35);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(587); 
				((Rel_opContext)_localctx).r = match(T__36);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(589); 
				((Rel_opContext)_localctx).r = match(T__37);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(591); 
				((Rel_opContext)_localctx).r = match(T__38);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 5);
				{
				setState(593); 
				((Rel_opContext)_localctx).r = match(T__39);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(595); 
				((Rel_opContext)_localctx).r = match(T__40);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 7);
				{
				setState(597); 
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
			setState(601); 
			write_expr();
			setState(602); 
			match(T__25);
			setState(603); 
			print_what(idTH);
			setState(604); 
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
			setState(606);
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
			setState(612);
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
				setState(609); 
				((Print_whatContext)_localctx).e = expression(idTH, tree);
				if( ((Print_whatContext)_localctx).e.typeS == null || ((Print_whatContext)_localctx).e.typeS.equals("set")){e.addMessage(((Print_whatContext)_localctx).e.line,((Print_whatContext)_localctx).e.pos,ErrorMessage.semantic((((Print_whatContext)_localctx).e!=null?_input.getText(((Print_whatContext)_localctx).e.start,((Print_whatContext)_localctx).e.stop):null),ErrorMessage.type(((Print_whatContext)_localctx).e.typeS,"integer | boolean | sequence | array")));}
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
			setState(614); 
			match(T__44);
			setState(615); 
			match(T__25);
			setState(616); 
			((Read_statementContext)_localctx).i = identifier();
			setState(617); 
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
			setState(620); 
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
			setState(624);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(622); 
				for_stat(idTH);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(623); 
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
			setState(626); 
			match(T__45);
			setState(627); 
			match(T__25);
			setState(628); 
			((If_then_else_statContext)_localctx).e1 = expression(idTH, tree);
			setState(629); 
			match(T__26);
			 if(!(((If_then_else_statContext)_localctx).e1.typeS!=null && ((If_then_else_statContext)_localctx).e1.typeS.equals("boolean"))){e.addMessage(((If_then_else_statContext)_localctx).e1.line,((If_then_else_statContext)_localctx).e1.pos,ErrorMessage.semantic((((If_then_else_statContext)_localctx).e1!=null?_input.getText(((If_then_else_statContext)_localctx).e1.start,((If_then_else_statContext)_localctx).e1.stop):null),ErrorMessage.type(((If_then_else_statContext)_localctx).e1.typeS,"boolean")));}
			setState(631); 
			match(T__46);
			setState(632); 
			match(T__1);
			setState(633); 
			((If_then_else_statContext)_localctx).s = statements(idTH);
			setState(634); 
			match(T__4);
			setState(635); 
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
			setState(643);
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
				setState(638); 
				match(T__47);
				setState(639); 
				match(T__1);
				setState(640); 
				statements(idTH);
				setState(641); 
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
			setState(645); 
			match(T__48);
			setState(646); 
			match(T__25);
			setState(647); 
			interval(idTH);
			setState(648); 
			match(T__26);
			setState(649); 
			step();
			setState(650); 
			satisfy(idTH);
			setState(651); 
			match(T__1);
			setState(652); 
			statements(idTH);
			setState(653); 
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
			setState(655); 
			((IntervalContext)_localctx).i = identifier();
			setState(656); 
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
			setState(665);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(659); 
				match(T__41);
				setState(660); 
				range(idTH);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(661); 
				match(T__49);
				setState(662); 
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
			setState(667); 
			minimum(idTH);
			setState(668); 
			match(T__50);
			setState(669); 
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
			setState(675);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(671); 
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(672); 
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
			setState(681);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(677); 
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(678); 
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
			setState(687);
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
				setState(684); 
				up_down();
				setState(685); 
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
			setState(689);
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
			setState(696);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(692); 
				match(T__53);
				setState(693); 
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
			setState(698); 
			match(T__54);
			setState(699); 
			match(T__25);
			setState(700); 
			((While_statContext)_localctx).e = expression(idTH, tree);
			setState(701); 
			match(T__26);
			 if(!(((While_statContext)_localctx).e.typeS!=null && ((While_statContext)_localctx).e.typeS.equals("boolean"))){e.addMessage(((While_statContext)_localctx).e.line,((While_statContext)_localctx).e.pos,ErrorMessage.semantic((((While_statContext)_localctx).e!=null?_input.getText(((While_statContext)_localctx).e.start,((While_statContext)_localctx).e.stop):null),ErrorMessage.type(((While_statContext)_localctx).e.typeS,"boolean")));}
			setState(703); 
			match(T__1);
			setState(704); 
			statements(idTH);
			setState(705); 
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
			setState(707); 
			succ_pred();
			setState(708); 
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
			setState(711);
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
			setState(713); 
			((TailContext)_localctx).t = match(T__57);
			setState(714); 
			match(T__25);
			setState(715); 
			((TailContext)_localctx).e = expression(idTH, set);
			setState(716); 
			match(T__26);

			        ((TailContext)_localctx).line =  (((TailContext)_localctx).t!=null?((TailContext)_localctx).t.getLine():0);
			        ((TailContext)_localctx).pos =  (((TailContext)_localctx).t!=null?((TailContext)_localctx).t.getCharPositionInLine():0);
			        if((((TailContext)_localctx).e.typeS != null) && ((TailContext)_localctx).e.typeS.equals("sequence")){
			            ((TailContext)_localctx).typeS =  ((TailContext)_localctx).e.typeS;
			        }else{
			            e.addMessage(((TailContext)_localctx).e.line,((TailContext)_localctx).e.pos,ErrorMessage.semantic((((TailContext)_localctx).e!=null?_input.getText(((TailContext)_localctx).e.start,((TailContext)_localctx).e.stop):null),ErrorMessage.type(((TailContext)_localctx).e.typeS,"sequence")));
			        }

			        /*if(_localctx.set!=null && isSet){
			            Node left = new Node(new String("tail"),null,null);
			            Node n = new Node(new String("call"),left,new Node(new String("args"),((TailContext)_localctx).e.treeS,null));
			            ((TailContext)_localctx).treeS =  n;
			        }*/

			        Node left = new Node(new String("tail"),null,null);
			        Node n = new Node(new String("call"),left,new Node(new String("args"),((TailContext)_localctx).e.treeS,null));
			        ((TailContext)_localctx).treeS =  n;
			     
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
			setState(719); 
			((HeadContext)_localctx).h = match(T__58);
			setState(720); 
			match(T__25);
			setState(721); 
			((HeadContext)_localctx).e = expression(idTH, set);
			setState(722); 
			match(T__26);

			        ((HeadContext)_localctx).line =  (((HeadContext)_localctx).h!=null?((HeadContext)_localctx).h.getLine():0);
			        ((HeadContext)_localctx).pos =  (((HeadContext)_localctx).h!=null?((HeadContext)_localctx).h.getCharPositionInLine():0);
			        if((((HeadContext)_localctx).e.typeS != null) && ((HeadContext)_localctx).e.typeS.equals("sequence")){
			            ((HeadContext)_localctx).typeS =  "integer"; 
			        }else{ 
			            e.addMessage(((HeadContext)_localctx).e.line,((HeadContext)_localctx).e.pos,ErrorMessage.semantic((((HeadContext)_localctx).e!=null?_input.getText(((HeadContext)_localctx).e.start,((HeadContext)_localctx).e.stop):null),ErrorMessage.type(((HeadContext)_localctx).e.typeS,"sequence")));
			        }

			        /*if(_localctx.set!=null && isSet){
			            Node left = new Node(new String("head"),null,null);
			            Node n = new Node(new String("call"),left,new Node(new String("args"),((HeadContext)_localctx).e.treeS,null));
			            ((HeadContext)_localctx).treeS =  n;
			        }*/

			        Node left = new Node(new String("head"),null,null);
			        Node n = new Node(new String("call"),left,new Node(new String("args"),((HeadContext)_localctx).e.treeS,null));
			        ((HeadContext)_localctx).treeS =  n;
			     
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
			setState(725); 
			((ConsContext)_localctx).c = match(T__59);
			setState(726); 
			match(T__25);
			setState(727); 
			((ConsContext)_localctx).e1 = expression(idTH, set);
			setState(728); 
			match(T__7);
			setState(729); 
			((ConsContext)_localctx).e2 = expression(idTH, set);
			setState(730); 
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
			            /*if(_localctx.set!=null && isSet){
			                Node left = new Node(new String("cons"),null,null);
			                Node n = new Node(new String("call"),left,new Node(new String("args"),((ConsContext)_localctx).e1.treeS,new Node(new String("args"),((ConsContext)_localctx).e2.treeS,null)));
			                ((ConsContext)_localctx).treeS =  n;
			            }*/

			            Node left = new Node(new String("cons"),null,null);
			            Node n = new Node(new String("call"),left,new Node(new String("args"),((ConsContext)_localctx).e1.treeS,new Node(new String("args"),((ConsContext)_localctx).e2.treeS,null)));
			            ((ConsContext)_localctx).treeS =  n;
			        
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
			setState(733); 
			((DeleteContext)_localctx).d = match(T__60);
			setState(734); 
			match(T__25);
			setState(735); 
			((DeleteContext)_localctx).e1 = expression(idTH, set);
			setState(736); 
			match(T__7);
			setState(737); 
			((DeleteContext)_localctx).e2 = expression(idTH, set);
			setState(738); 
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
			            /*if(_localctx.set!=null && isSet){
			                Node left = new Node(new String("delete"),null,null);
			                Node n = new Node(new String("call"),left,new Node(new String("args"),((DeleteContext)_localctx).e1.treeS,new Node(new String("args"),((DeleteContext)_localctx).e2.treeS,null)));
			                ((DeleteContext)_localctx).treeS =  n;
			            }*/

			            Node left = new Node(new String("delete"),null,null);
			            Node n = new Node(new String("call"),left,new Node(new String("args"),((DeleteContext)_localctx).e1.treeS,new Node(new String("args"),((DeleteContext)_localctx).e2.treeS,null)));
			            ((DeleteContext)_localctx).treeS =  n;
			        
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
			setState(741); 
			match(T__61);
			setState(742); 
			match(T__25);
			setState(743); 
			((Copy_statementContext)_localctx).i1 = identifier();
			setState(744); 
			match(T__7);
			setState(745); 
			((Copy_statementContext)_localctx).i2 = identifier();
			setState(746); 
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
			setState(749); 
			match(T__62);
			setState(750); 
			match(T__25);
			setState(751); 
			((Cat_statementContext)_localctx).i1 = identifier();
			setState(752); 
			match(T__7);
			setState(753); 
			((Cat_statementContext)_localctx).i2 = identifier();
			setState(754); 
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
			setState(757); 
			((Is_emptyContext)_localctx).i = match(T__63);
			setState(758); 
			match(T__25);
			setState(759); 
			((Is_emptyContext)_localctx).e1 = expression(idTH, set);
			setState(760); 
			match(T__26);

			            ((Is_emptyContext)_localctx).line =  (((Is_emptyContext)_localctx).i!=null?((Is_emptyContext)_localctx).i.getLine():0);
			            ((Is_emptyContext)_localctx).pos =  (((Is_emptyContext)_localctx).i!=null?((Is_emptyContext)_localctx).i.getCharPositionInLine():0);
			            if((((Is_emptyContext)_localctx).e1.typeS != null) && ((Is_emptyContext)_localctx).e1.typeS.equals("sequence")){
			                ((Is_emptyContext)_localctx).typeS =  "boolean";
			            }else{
			                e.addMessage(((Is_emptyContext)_localctx).e1.line,((Is_emptyContext)_localctx).e1.pos,ErrorMessage.semantic((((Is_emptyContext)_localctx).e1!=null?_input.getText(((Is_emptyContext)_localctx).e1.start,((Is_emptyContext)_localctx).e1.stop):null),ErrorMessage.type(((Is_emptyContext)_localctx).e1.typeS,"sequence")));
			            }
			            /*if(_localctx.set!=null && isSet){
			                Node left = new Node(new String("is_empty"),null,null);
			                Node n = new Node(new String("call"),left,new Node(new String("args"),((Is_emptyContext)_localctx).e1.treeS,null));
			                ((Is_emptyContext)_localctx).treeS =  n;
			            }*/

			             Node left = new Node(new String("is_empty"),null,null);
			             Node n = new Node(new String("call"),left,new Node(new String("args"),((Is_emptyContext)_localctx).e1.treeS,null));
			             ((Is_emptyContext)_localctx).treeS =  n;
			         
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
			setState(763); 
			((LengthContext)_localctx).l = match(T__64);
			setState(764); 
			match(T__25);
			setState(765); 
			((LengthContext)_localctx).e1 = expression(idTH, set);
			setState(766); 
			match(T__26);

			          ((LengthContext)_localctx).line =  (((LengthContext)_localctx).l!=null?((LengthContext)_localctx).l.getLine():0);
			          ((LengthContext)_localctx).pos =  (((LengthContext)_localctx).l!=null?((LengthContext)_localctx).l.getCharPositionInLine():0);
			          if((((LengthContext)_localctx).e1.typeS != null) && ((LengthContext)_localctx).e1.typeS.equals("sequence")){
			              ((LengthContext)_localctx).typeS =  "integer";
			          }else{
			              e.addMessage(((LengthContext)_localctx).e1.line,((LengthContext)_localctx).e1.pos,ErrorMessage.semantic((((LengthContext)_localctx).e1!=null?_input.getText(((LengthContext)_localctx).e1.start,((LengthContext)_localctx).e1.stop):null),ErrorMessage.type(((LengthContext)_localctx).e1.typeS,"sequence")));
			          }
			          /*if(_localctx.set!=null && isSet){
			             Node left = new Node(new String("length"),null,null);
			             Node n = new Node(new String("call"),left,new Node(new String("args"),((LengthContext)_localctx).e1.treeS,null));
			             ((LengthContext)_localctx).treeS =  n;
			          }*/
			          Node left = new Node(new String("length"),null,null);
			          Node n = new Node(new String("call"),left,new Node(new String("args"),((LengthContext)_localctx).e1.treeS,null));
			          ((LengthContext)_localctx).treeS =  n;
			       
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
			setState(769); 
			((MemberContext)_localctx).im = match(T__65);
			setState(770); 
			match(T__25);
			setState(771); 
			((MemberContext)_localctx).e = expression(idTH, set);
			setState(772); 
			match(T__7);
			setState(773); 
			((MemberContext)_localctx).i = identifier();
			setState(774); 
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
			          //if(_localctx.set!=null && isSet){
			          if(_localctx.set!=null){
			            Node d = _localctx.set.getIdentifier().get(0);
			            Node left = new Node(new String("member"),null,null);
			            Node n = null;
			            if(d.getData().equals((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null))){
			                n = new Node(new String("call"),left,new Node(new String("args"),((MemberContext)_localctx).e.treeS,new Node(new String("args"),d,null)));
			            }else{
			                n = new Node(new String("call"),left,new Node(new String("args"),((MemberContext)_localctx).e.treeS,new Node(new String("args"),new Node(new String((((MemberContext)_localctx).i!=null?_input.getText(((MemberContext)_localctx).i.start,((MemberContext)_localctx).i.stop):null)),null,null),null)));
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
			setState(777); 
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
		public String valueS;
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
			setState(779); 
			((NumberContext)_localctx).NBR = match(NBR);
			((NumberContext)_localctx).numberS =  Integer.parseInt((((NumberContext)_localctx).NBR!=null?((NumberContext)_localctx).NBR.getText():null));((NumberContext)_localctx).line =  (((NumberContext)_localctx).NBR!=null?((NumberContext)_localctx).NBR.getLine():0);((NumberContext)_localctx).pos =  (((NumberContext)_localctx).NBR!=null?((NumberContext)_localctx).NBR.getCharPositionInLine():0); ((NumberContext)_localctx).valueS =  (((NumberContext)_localctx).NBR!=null?((NumberContext)_localctx).NBR.getText():null);
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
			setState(782); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u0314\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\7\5\u00af\n\5\f\5\16\5\u00b2\13\5"+
		"\3\5\7\5\u00b5\n\5\f\5\16\5\u00b8\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00c8\n\7\f\7\16\7\u00cb\13\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00d8\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e7\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u00ef\n\13\f\13\16\13\u00f2\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0102\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u010c\n\r\3\16\3\16\3\16\5\16\u0111\n\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u011f\n\20\f\20\16\20\u0122"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u012a\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\5\23\u0135\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u013d\n\24\f\24\16\24\u0140\13\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0151\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u016a\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u0172\n\32\f\32\16\32\u0175\13\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u0183\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u018b\n\35\3\36\7\36\u018e\n\36\f\36\16\36\u0191"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u01ad\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01be"+
		"\n\"\3#\3#\3#\3#\3#\3#\7#\u01c6\n#\f#\16#\u01c9\13#\3#\3#\3$\3$\3$\3$"+
		"\3$\3$\3%\3%\3%\3%\5%\u01d7\n%\3&\3&\3&\3&\3&\3&\7&\u01df\n&\f&\16&\u01e2"+
		"\13&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01ec\n\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\7(\u01f6\n(\f(\16(\u01f9\13(\3(\3(\3)\3)\3)\3)\3)\3)\7)\u0203\n)"+
		"\f)\16)\u0206\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\5*\u021f\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\5+\u0236\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0240\n"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\5-\u024a\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\5.\u025a\n.\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\5"+
		"\61\u0267\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\5\64"+
		"\u0273\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u0286\n\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\59\u029c\n9\3:\3:\3"+
		":\3:\3;\3;\3;\3;\5;\u02a6\n;\3<\3<\3<\3<\5<\u02ac\n<\3=\3=\3=\3=\5=\u02b2"+
		"\n=\3>\3>\3?\3?\3?\3?\3?\5?\u02bb\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A"+
		"\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3L"+
		"\3L\3M\3M\3M\3N\3N\3N\3N\2\2O\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\2\5\3\2-.\3\2\66\67\3\2:;\u030e\2\u009c\3\2\2\2\4\u00a1\3\2\2\2\6\u00ab"+
		"\3\2\2\2\b\u00b0\3\2\2\2\n\u00bb\3\2\2\2\f\u00c1\3\2\2\2\16\u00ce\3\2"+
		"\2\2\20\u00d7\3\2\2\2\22\u00e6\3\2\2\2\24\u00e8\3\2\2\2\26\u0101\3\2\2"+
		"\2\30\u010b\3\2\2\2\32\u0110\3\2\2\2\34\u0112\3\2\2\2\36\u0116\3\2\2\2"+
		" \u0129\3\2\2\2\"\u012b\3\2\2\2$\u0134\3\2\2\2&\u0136\3\2\2\2(\u0143\3"+
		"\2\2\2*\u0150\3\2\2\2,\u0152\3\2\2\2.\u015b\3\2\2\2\60\u0169\3\2\2\2\62"+
		"\u016b\3\2\2\2\64\u0178\3\2\2\2\66\u0182\3\2\2\28\u018a\3\2\2\2:\u018f"+
		"\3\2\2\2<\u01ac\3\2\2\2>\u01ae\3\2\2\2@\u01b3\3\2\2\2B\u01bd\3\2\2\2D"+
		"\u01bf\3\2\2\2F\u01cc\3\2\2\2H\u01d6\3\2\2\2J\u01d8\3\2\2\2L\u01e5\3\2"+
		"\2\2N\u01ef\3\2\2\2P\u01fc\3\2\2\2R\u021e\3\2\2\2T\u0235\3\2\2\2V\u023f"+
		"\3\2\2\2X\u0249\3\2\2\2Z\u0259\3\2\2\2\\\u025b\3\2\2\2^\u0260\3\2\2\2"+
		"`\u0266\3\2\2\2b\u0268\3\2\2\2d\u026e\3\2\2\2f\u0272\3\2\2\2h\u0274\3"+
		"\2\2\2j\u0285\3\2\2\2l\u0287\3\2\2\2n\u0291\3\2\2\2p\u029b\3\2\2\2r\u029d"+
		"\3\2\2\2t\u02a5\3\2\2\2v\u02ab\3\2\2\2x\u02b1\3\2\2\2z\u02b3\3\2\2\2|"+
		"\u02ba\3\2\2\2~\u02bc\3\2\2\2\u0080\u02c5\3\2\2\2\u0082\u02c9\3\2\2\2"+
		"\u0084\u02cb\3\2\2\2\u0086\u02d1\3\2\2\2\u0088\u02d7\3\2\2\2\u008a\u02df"+
		"\3\2\2\2\u008c\u02e7\3\2\2\2\u008e\u02ef\3\2\2\2\u0090\u02f7\3\2\2\2\u0092"+
		"\u02fd\3\2\2\2\u0094\u0303\3\2\2\2\u0096\u030b\3\2\2\2\u0098\u030d\3\2"+
		"\2\2\u009a\u0310\3\2\2\2\u009c\u009d\7\3\2\2\u009d\u009e\5\u009aN\2\u009e"+
		"\u009f\5\4\3\2\u009f\u00a0\b\2\1\2\u00a0\3\3\2\2\2\u00a1\u00a2\7\4\2\2"+
		"\u00a2\u00a3\7\5\2\2\u00a3\u00a4\b\3\1\2\u00a4\u00a5\5\6\4\2\u00a5\u00a6"+
		"\7\6\2\2\u00a6\u00a7\b\3\1\2\u00a7\u00a8\5:\36\2\u00a8\u00a9\b\3\1\2\u00a9"+
		"\u00aa\7\7\2\2\u00aa\5\3\2\2\2\u00ab\u00ac\5\b\5\2\u00ac\7\3\2\2\2\u00ad"+
		"\u00af\5\n\6\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b6\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\5,\27\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\b\5\1\2\u00ba\t\3\2\2\2\u00bb\u00bc\5\f\7\2\u00bc\u00bd\7\b\2\2"+
		"\u00bd\u00be\5\22\n\2\u00be\u00bf\7\t\2\2\u00bf\u00c0\b\6\1\2\u00c0\13"+
		"\3\2\2\2\u00c1\u00c2\5\16\b\2\u00c2\u00c9\b\7\1\2\u00c3\u00c4\7\n\2\2"+
		"\u00c4\u00c5\5\16\b\2\u00c5\u00c6\b\7\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\b\7\1\2\u00cd\r\3\2\2\2"+
		"\u00ce\u00cf\5\u009aN\2\u00cf\u00d0\5\20\t\2\u00d0\u00d1\b\b\1\2\u00d1"+
		"\17\3\2\2\2\u00d2\u00d8\b\t\1\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\5\26"+
		"\f\2\u00d5\u00d6\b\t\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7"+
		"\u00d3\3\2\2\2\u00d8\21\3\2\2\2\u00d9\u00da\7\f\2\2\u00da\u00e7\b\n\1"+
		"\2\u00db\u00dc\7\r\2\2\u00dc\u00e7\b\n\1\2\u00dd\u00de\7\16\2\2\u00de"+
		"\u00e7\b\n\1\2\u00df\u00e0\7\17\2\2\u00e0\u00e7\b\n\1\2\u00e1\u00e2\7"+
		"\20\2\2\u00e2\u00e3\7\21\2\2\u00e3\u00e4\5\24\13\2\u00e4\u00e5\b\n\1\2"+
		"\u00e5\u00e7\3\2\2\2\u00e6\u00d9\3\2\2\2\u00e6\u00db\3\2\2\2\u00e6\u00dd"+
		"\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e7\23\3\2\2\2\u00e8"+
		"\u00e9\5\u0098M\2\u00e9\u00f0\b\13\1\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec"+
		"\5\u0098M\2\u00ec\u00ed\b\13\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00ea\3\2\2"+
		"\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\b\13\1\2\u00f4\25\3\2\2\2\u00f5"+
		"\u00f6\5\30\r\2\u00f6\u00f7\b\f\1\2\u00f7\u0102\3\2\2\2\u00f8\u00f9\5"+
		"\34\17\2\u00f9\u00fa\b\f\1\2\u00fa\u0102\3\2\2\2\u00fb\u00fc\5(\25\2\u00fc"+
		"\u00fd\b\f\1\2\u00fd\u0102\3\2\2\2\u00fe\u00ff\5\"\22\2\u00ff\u0100\b"+
		"\f\1\2\u0100\u0102\3\2\2\2\u0101\u00f5\3\2\2\2\u0101\u00f8\3\2\2\2\u0101"+
		"\u00fb\3\2\2\2\u0101\u00fe\3\2\2\2\u0102\27\3\2\2\2\u0103\u0104\5\32\16"+
		"\2\u0104\u0105\5\u0098M\2\u0105\u0106\b\r\1\2\u0106\u010c\3\2\2\2\u0107"+
		"\u0108\7\22\2\2\u0108\u010c\b\r\1\2\u0109\u010a\7\23\2\2\u010a\u010c\b"+
		"\r\1\2\u010b\u0103\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\31\3\2\2\2\u010d\u0111\3\2\2\2\u010e\u0111\7\24\2\2\u010f\u0111\7\25"+
		"\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111"+
		"\33\3\2\2\2\u0112\u0113\7\26\2\2\u0113\u0114\5\36\20\2\u0114\u0115\7\27"+
		"\2\2\u0115\35\3\2\2\2\u0116\u0117\b\20\1\2\u0117\u0118\5 \21\2\u0118\u0120"+
		"\b\20\1\2\u0119\u011a\7\n\2\2\u011a\u011b\b\20\1\2\u011b\u011c\5 \21\2"+
		"\u011c\u011d\b\20\1\2\u011d\u011f\3\2\2\2\u011e\u0119\3\2\2\2\u011f\u0122"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0124\b\20\1\2\u0124\37\3\2\2\2\u0125\u0126\5\u0098"+
		"M\2\u0126\u0127\b\21\1\2\u0127\u012a\3\2\2\2\u0128\u012a\5\34\17\2\u0129"+
		"\u0125\3\2\2\2\u0129\u0128\3\2\2\2\u012a!\3\2\2\2\u012b\u012c\7\30\2\2"+
		"\u012c\u012d\5$\23\2\u012d\u012e\b\22\1\2\u012e\u012f\7\31\2\2\u012f#"+
		"\3\2\2\2\u0130\u0135\b\23\1\2\u0131\u0132\5&\24\2\u0132\u0133\b\23\1\2"+
		"\u0133\u0135\3\2\2\2\u0134\u0130\3\2\2\2\u0134\u0131\3\2\2\2\u0135%\3"+
		"\2\2\2\u0136\u0137\5\u0098M\2\u0137\u013e\b\24\1\2\u0138\u0139\7\n\2\2"+
		"\u0139\u013a\5\u0098M\2\u013a\u013b\b\24\1\2\u013b\u013d\3\2\2\2\u013c"+
		"\u0138\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\b\24\1\2\u0142"+
		"\'\3\2\2\2\u0143\u0144\7\4\2\2\u0144\u0145\5*\26\2\u0145\u0146\b\25\1"+
		"\2\u0146\u0147\7\7\2\2\u0147\u0148\b\25\1\2\u0148)\3\2\2\2\u0149\u0151"+
		"\b\26\1\2\u014a\u014b\5\u009aN\2\u014b\u014c\b\26\1\2\u014c\u014d\7\32"+
		"\2\2\u014d\u014e\5L\'\2\u014e\u014f\b\26\1\2\u014f\u0151\3\2\2\2\u0150"+
		"\u0149\3\2\2\2\u0150\u014a\3\2\2\2\u0151+\3\2\2\2\u0152\u0153\7\33\2\2"+
		"\u0153\u0154\5\u009aN\2\u0154\u0155\7\34\2\2\u0155\u0156\5\60\31\2\u0156"+
		"\u0157\7\35\2\2\u0157\u0158\5\66\34\2\u0158\u0159\5.\30\2\u0159\u015a"+
		"\b\27\1\2\u015a-\3\2\2\2\u015b\u015c\7\4\2\2\u015c\u015d\7\5\2\2\u015d"+
		"\u015e\b\30\1\2\u015e\u015f\5\6\4\2\u015f\u0160\7\6\2\2\u0160\u0161\b"+
		"\30\1\2\u0161\u0162\5:\36\2\u0162\u0163\58\35\2\u0163\u0164\7\7\2\2\u0164"+
		"/\3\2\2\2\u0165\u016a\b\31\1\2\u0166\u0167\5\62\32\2\u0167\u0168\b\31"+
		"\1\2\u0168\u016a\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u016a"+
		"\61\3\2\2\2\u016b\u016c\5\64\33\2\u016c\u0173\b\32\1\2\u016d\u016e\7\t"+
		"\2\2\u016e\u016f\5\64\33\2\u016f\u0170\b\32\1\2\u0170\u0172\3\2\2\2\u0171"+
		"\u016d\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\b\32\1\2\u0177"+
		"\63\3\2\2\2\u0178\u0179\5\u009aN\2\u0179\u017a\7\b\2\2\u017a\u017b\5\22"+
		"\n\2\u017b\u017c\b\33\1\2\u017c\65\3\2\2\2\u017d\u0183\b\34\1\2\u017e"+
		"\u017f\7\b\2\2\u017f\u0180\5\22\n\2\u0180\u0181\b\34\1\2\u0181\u0183\3"+
		"\2\2\2\u0182\u017d\3\2\2\2\u0182\u017e\3\2\2\2\u0183\67\3\2\2\2\u0184"+
		"\u018b\3\2\2\2\u0185\u0186\7\36\2\2\u0186\u0187\5L\'\2\u0187\u0188\b\35"+
		"\1\2\u0188\u0189\7\t\2\2\u0189\u018b\3\2\2\2\u018a\u0184\3\2\2\2\u018a"+
		"\u0185\3\2\2\2\u018b9\3\2\2\2\u018c\u018e\5<\37\2\u018d\u018c\3\2\2\2"+
		"\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192"+
		"\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\b\36\1\2\u0193;\3\2\2\2\u0194"+
		"\u0195\5> \2\u0195\u0196\7\t\2\2\u0196\u0197\b\37\1\2\u0197\u01ad\3\2"+
		"\2\2\u0198\u0199\5\\/\2\u0199\u019a\7\t\2\2\u019a\u01ad\3\2\2\2\u019b"+
		"\u019c\5b\62\2\u019c\u019d\7\t\2\2\u019d\u01ad\3\2\2\2\u019e\u01ad\5d"+
		"\63\2\u019f\u01ad\5f\64\2\u01a0\u01a1\5F$\2\u01a1\u01a2\7\t\2\2\u01a2"+
		"\u01ad\3\2\2\2\u01a3\u01a4\5\u0080A\2\u01a4\u01a5\7\t\2\2\u01a5\u01ad"+
		"\3\2\2\2\u01a6\u01a7\5\u008cG\2\u01a7\u01a8\7\t\2\2\u01a8\u01ad\3\2\2"+
		"\2\u01a9\u01aa\5\u008eH\2\u01aa\u01ab\7\t\2\2\u01ab\u01ad\3\2\2\2\u01ac"+
		"\u0194\3\2\2\2\u01ac\u0198\3\2\2\2\u01ac\u019b\3\2\2\2\u01ac\u019e\3\2"+
		"\2\2\u01ac\u019f\3\2\2\2\u01ac\u01a0\3\2\2\2\u01ac\u01a3\3\2\2\2\u01ac"+
		"\u01a6\3\2\2\2\u01ac\u01a9\3\2\2\2\u01ad=\3\2\2\2\u01ae\u01af\5@!\2\u01af"+
		"\u01b0\7\13\2\2\u01b0\u01b1\5L\'\2\u01b1\u01b2\b \1\2\u01b2?\3\2\2\2\u01b3"+
		"\u01b4\5\u009aN\2\u01b4\u01b5\5B\"\2\u01b5\u01b6\b!\1\2\u01b6A\3\2\2\2"+
		"\u01b7\u01be\b\"\1\2\u01b8\u01b9\7\26\2\2\u01b9\u01ba\5D#\2\u01ba\u01bb"+
		"\7\27\2\2\u01bb\u01bc\b\"\1\2\u01bc\u01be\3\2\2\2\u01bd\u01b7\3\2\2\2"+
		"\u01bd\u01b8\3\2\2\2\u01beC\3\2\2\2\u01bf\u01c0\5N(\2\u01c0\u01c7\b#\1"+
		"\2\u01c1\u01c2\7\n\2\2\u01c2\u01c3\5N(\2\u01c3\u01c4\b#\1\2\u01c4\u01c6"+
		"\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\b#"+
		"\1\2\u01cbE\3\2\2\2\u01cc\u01cd\5\u009aN\2\u01cd\u01ce\7\34\2\2\u01ce"+
		"\u01cf\5H%\2\u01cf\u01d0\7\35\2\2\u01d0\u01d1\b$\1\2\u01d1G\3\2\2\2\u01d2"+
		"\u01d7\b%\1\2\u01d3\u01d4\5J&\2\u01d4\u01d5\b%\1\2\u01d5\u01d7\3\2\2\2"+
		"\u01d6\u01d2\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d7I\3\2\2\2\u01d8\u01d9\5"+
		"L\'\2\u01d9\u01e0\b&\1\2\u01da\u01db\7\n\2\2\u01db\u01dc\5L\'\2\u01dc"+
		"\u01dd\b&\1\2\u01dd\u01df\3\2\2\2\u01de\u01da\3\2\2\2\u01df\u01e2\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e3\u01e4\b&\1\2\u01e4K\3\2\2\2\u01e5\u01e6\5N(\2\u01e6"+
		"\u01eb\b\'\1\2\u01e7\u01e8\5Z.\2\u01e8\u01e9\5N(\2\u01e9\u01ea\b\'\1\2"+
		"\u01ea\u01ec\3\2\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01ed\u01ee\b\'\1\2\u01eeM\3\2\2\2\u01ef\u01f0\5P)\2\u01f0\u01f7"+
		"\b(\1\2\u01f1\u01f2\5V,\2\u01f2\u01f3\5P)\2\u01f3\u01f4\b(\1\2\u01f4\u01f6"+
		"\3\2\2\2\u01f5\u01f1\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\b("+
		"\1\2\u01fbO\3\2\2\2\u01fc\u01fd\5R*\2\u01fd\u0204\b)\1\2\u01fe\u01ff\5"+
		"X-\2\u01ff\u0200\5R*\2\u0200\u0201\b)\1\2\u0201\u0203\3\2\2\2\u0202\u01fe"+
		"\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\b)\1\2\u0208Q\3\2\2\2\u0209"+
		"\u020a\5\26\f\2\u020a\u020b\b*\1\2\u020b\u021f\3\2\2\2\u020c\u020d\5@"+
		"!\2\u020d\u020e\b*\1\2\u020e\u021f\3\2\2\2\u020f\u0210\7\34\2\2\u0210"+
		"\u0211\5L\'\2\u0211\u0212\7\35\2\2\u0212\u0213\b*\1\2\u0213\u021f\3\2"+
		"\2\2\u0214\u0215\7\37\2\2\u0215\u0216\5R*\2\u0216\u0217\b*\1\2\u0217\u021f"+
		"\3\2\2\2\u0218\u0219\5F$\2\u0219\u021a\b*\1\2\u021a\u021f\3\2\2\2\u021b"+
		"\u021c\5T+\2\u021c\u021d\b*\1\2\u021d\u021f\3\2\2\2\u021e\u0209\3\2\2"+
		"\2\u021e\u020c\3\2\2\2\u021e\u020f\3\2\2\2\u021e\u0214\3\2\2\2\u021e\u0218"+
		"\3\2\2\2\u021e\u021b\3\2\2\2\u021fS\3\2\2\2\u0220\u0221\5\u0084C\2\u0221"+
		"\u0222\b+\1\2\u0222\u0236\3\2\2\2\u0223\u0224\5\u0086D\2\u0224\u0225\b"+
		"+\1\2\u0225\u0236\3\2\2\2\u0226\u0227\5\u0088E\2\u0227\u0228\b+\1\2\u0228"+
		"\u0236\3\2\2\2\u0229\u022a\5\u0094K\2\u022a\u022b\b+\1\2\u022b\u0236\3"+
		"\2\2\2\u022c\u022d\5\u0090I\2\u022d\u022e\b+\1\2\u022e\u0236\3\2\2\2\u022f"+
		"\u0230\5\u0092J\2\u0230\u0231\b+\1\2\u0231\u0236\3\2\2\2\u0232\u0233\5"+
		"\u008aF\2\u0233\u0234\b+\1\2\u0234\u0236\3\2\2\2\u0235\u0220\3\2\2\2\u0235"+
		"\u0223\3\2\2\2\u0235\u0226\3\2\2\2\u0235\u0229\3\2\2\2\u0235\u022c\3\2"+
		"\2\2\u0235\u022f\3\2\2\2\u0235\u0232\3\2\2\2\u0236U\3\2\2\2\u0237\u0238"+
		"\7\24\2\2\u0238\u0240\b,\1\2\u0239\u023a\7\25\2\2\u023a\u0240\b,\1\2\u023b"+
		"\u023c\7 \2\2\u023c\u0240\b,\1\2\u023d\u023e\7!\2\2\u023e\u0240\b,\1\2"+
		"\u023f\u0237\3\2\2\2\u023f\u0239\3\2\2\2\u023f\u023b\3\2\2\2\u023f\u023d"+
		"\3\2\2\2\u0240W\3\2\2\2\u0241\u0242\7\"\2\2\u0242\u024a\b-\1\2\u0243\u0244"+
		"\7#\2\2\u0244\u024a\b-\1\2\u0245\u0246\7$\2\2\u0246\u024a\b-\1\2\u0247"+
		"\u0248\7%\2\2\u0248\u024a\b-\1\2\u0249\u0241\3\2\2\2\u0249\u0243\3\2\2"+
		"\2\u0249\u0245\3\2\2\2\u0249\u0247\3\2\2\2\u024aY\3\2\2\2\u024b\u024c"+
		"\7&\2\2\u024c\u025a\b.\1\2\u024d\u024e\7\'\2\2\u024e\u025a\b.\1\2\u024f"+
		"\u0250\7(\2\2\u0250\u025a\b.\1\2\u0251\u0252\7)\2\2\u0252\u025a\b.\1\2"+
		"\u0253\u0254\7*\2\2\u0254\u025a\b.\1\2\u0255\u0256\7+\2\2\u0256\u025a"+
		"\b.\1\2\u0257\u0258\7,\2\2\u0258\u025a\b.\1\2\u0259\u024b\3\2\2\2\u0259"+
		"\u024d\3\2\2\2\u0259\u024f\3\2\2\2\u0259\u0251\3\2\2\2\u0259\u0253\3\2"+
		"\2\2\u0259\u0255\3\2\2\2\u0259\u0257\3\2\2\2\u025a[\3\2\2\2\u025b\u025c"+
		"\5^\60\2\u025c\u025d\7\34\2\2\u025d\u025e\5`\61\2\u025e\u025f\7\35\2\2"+
		"\u025f]\3\2\2\2\u0260\u0261\t\2\2\2\u0261_\3\2\2\2\u0262\u0267\3\2\2\2"+
		"\u0263\u0264\5L\'\2\u0264\u0265\b\61\1\2\u0265\u0267\3\2\2\2\u0266\u0262"+
		"\3\2\2\2\u0266\u0263\3\2\2\2\u0267a\3\2\2\2\u0268\u0269\7/\2\2\u0269\u026a"+
		"\7\34\2\2\u026a\u026b\5\u009aN\2\u026b\u026c\7\35\2\2\u026c\u026d\b\62"+
		"\1\2\u026dc\3\2\2\2\u026e\u026f\5h\65\2\u026fe\3\2\2\2\u0270\u0273\5l"+
		"\67\2\u0271\u0273\5~@\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273"+
		"g\3\2\2\2\u0274\u0275\7\60\2\2\u0275\u0276\7\34\2\2\u0276\u0277\5L\'\2"+
		"\u0277\u0278\7\35\2\2\u0278\u0279\b\65\1\2\u0279\u027a\7\61\2\2\u027a"+
		"\u027b\7\4\2\2\u027b\u027c\5:\36\2\u027c\u027d\7\7\2\2\u027d\u027e\5j"+
		"\66\2\u027ei\3\2\2\2\u027f\u0286\3\2\2\2\u0280\u0281\7\62\2\2\u0281\u0282"+
		"\7\4\2\2\u0282\u0283\5:\36\2\u0283\u0284\7\7\2\2\u0284\u0286\3\2\2\2\u0285"+
		"\u027f\3\2\2\2\u0285\u0280\3\2\2\2\u0286k\3\2\2\2\u0287\u0288\7\63\2\2"+
		"\u0288\u0289\7\34\2\2\u0289\u028a\5n8\2\u028a\u028b\7\35\2\2\u028b\u028c"+
		"\5x=\2\u028c\u028d\5|?\2\u028d\u028e\7\4\2\2\u028e\u028f\5:\36\2\u028f"+
		"\u0290\7\7\2\2\u0290m\3\2\2\2\u0291\u0292\5\u009aN\2\u0292\u0293\5p9\2"+
		"\u0293\u0294\b8\1\2\u0294o\3\2\2\2\u0295\u0296\7,\2\2\u0296\u029c\5r:"+
		"\2\u0297\u0298\7\64\2\2\u0298\u0299\5\u009aN\2\u0299\u029a\b9\1\2\u029a"+
		"\u029c\3\2\2\2\u029b\u0295\3\2\2\2\u029b\u0297\3\2\2\2\u029cq\3\2\2\2"+
		"\u029d\u029e\5t;\2\u029e\u029f\7\65\2\2\u029f\u02a0\5v<\2\u02a0s\3\2\2"+
		"\2\u02a1\u02a6\5\u0098M\2\u02a2\u02a3\5\u009aN\2\u02a3\u02a4\b;\1\2\u02a4"+
		"\u02a6\3\2\2\2\u02a5\u02a1\3\2\2\2\u02a5\u02a2\3\2\2\2\u02a6u\3\2\2\2"+
		"\u02a7\u02ac\5\u0098M\2\u02a8\u02a9\5\u009aN\2\u02a9\u02aa\b<\1\2\u02aa"+
		"\u02ac\3\2\2\2\u02ab\u02a7\3\2\2\2\u02ab\u02a8\3\2\2\2\u02acw\3\2\2\2"+
		"\u02ad\u02b2\3\2\2\2\u02ae\u02af\5z>\2\u02af\u02b0\5\u0098M\2\u02b0\u02b2"+
		"\3\2\2\2\u02b1\u02ad\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b2y\3\2\2\2\u02b3"+
		"\u02b4\t\3\2\2\u02b4{\3\2\2\2\u02b5\u02bb\3\2\2\2\u02b6\u02b7\78\2\2\u02b7"+
		"\u02b8\5L\'\2\u02b8\u02b9\b?\1\2\u02b9\u02bb\3\2\2\2\u02ba\u02b5\3\2\2"+
		"\2\u02ba\u02b6\3\2\2\2\u02bb}\3\2\2\2\u02bc\u02bd\79\2\2\u02bd\u02be\7"+
		"\34\2\2\u02be\u02bf\5L\'\2\u02bf\u02c0\7\35\2\2\u02c0\u02c1\b@\1\2\u02c1"+
		"\u02c2\7\4\2\2\u02c2\u02c3\5:\36\2\u02c3\u02c4\7\7\2\2\u02c4\177\3\2\2"+
		"\2\u02c5\u02c6\5\u0082B\2\u02c6\u02c7\5\u009aN\2\u02c7\u02c8\bA\1\2\u02c8"+
		"\u0081\3\2\2\2\u02c9\u02ca\t\4\2\2\u02ca\u0083\3\2\2\2\u02cb\u02cc\7<"+
		"\2\2\u02cc\u02cd\7\34\2\2\u02cd\u02ce\5L\'\2\u02ce\u02cf\7\35\2\2\u02cf"+
		"\u02d0\bC\1\2\u02d0\u0085\3\2\2\2\u02d1\u02d2\7=\2\2\u02d2\u02d3\7\34"+
		"\2\2\u02d3\u02d4\5L\'\2\u02d4\u02d5\7\35\2\2\u02d5\u02d6\bD\1\2\u02d6"+
		"\u0087\3\2\2\2\u02d7\u02d8\7>\2\2\u02d8\u02d9\7\34\2\2\u02d9\u02da\5L"+
		"\'\2\u02da\u02db\7\n\2\2\u02db\u02dc\5L\'\2\u02dc\u02dd\7\35\2\2\u02dd"+
		"\u02de\bE\1\2\u02de\u0089\3\2\2\2\u02df\u02e0\7?\2\2\u02e0\u02e1\7\34"+
		"\2\2\u02e1\u02e2\5L\'\2\u02e2\u02e3\7\n\2\2\u02e3\u02e4\5L\'\2\u02e4\u02e5"+
		"\7\35\2\2\u02e5\u02e6\bF\1\2\u02e6\u008b\3\2\2\2\u02e7\u02e8\7@\2\2\u02e8"+
		"\u02e9\7\34\2\2\u02e9\u02ea\5\u009aN\2\u02ea\u02eb\7\n\2\2\u02eb\u02ec"+
		"\5\u009aN\2\u02ec\u02ed\7\35\2\2\u02ed\u02ee\bG\1\2\u02ee\u008d\3\2\2"+
		"\2\u02ef\u02f0\7A\2\2\u02f0\u02f1\7\34\2\2\u02f1\u02f2\5\u009aN\2\u02f2"+
		"\u02f3\7\n\2\2\u02f3\u02f4\5\u009aN\2\u02f4\u02f5\7\35\2\2\u02f5\u02f6"+
		"\bH\1\2\u02f6\u008f\3\2\2\2\u02f7\u02f8\7B\2\2\u02f8\u02f9\7\34\2\2\u02f9"+
		"\u02fa\5L\'\2\u02fa\u02fb\7\35\2\2\u02fb\u02fc\bI\1\2\u02fc\u0091\3\2"+
		"\2\2\u02fd\u02fe\7C\2\2\u02fe\u02ff\7\34\2\2\u02ff\u0300\5L\'\2\u0300"+
		"\u0301\7\35\2\2\u0301\u0302\bJ\1\2\u0302\u0093\3\2\2\2\u0303\u0304\7D"+
		"\2\2\u0304\u0305\7\34\2\2\u0305\u0306\5L\'\2\u0306\u0307\7\n\2\2\u0307"+
		"\u0308\5\u009aN\2\u0308\u0309\7\35\2\2\u0309\u030a\bK\1\2\u030a\u0095"+
		"\3\2\2\2\u030b\u030c\7H\2\2\u030c\u0097\3\2\2\2\u030d\u030e\7E\2\2\u030e"+
		"\u030f\bM\1\2\u030f\u0099\3\2\2\2\u0310\u0311\7F\2\2\u0311\u0312\bN\1"+
		"\2\u0312\u009b\3\2\2\2*\u00b0\u00b6\u00c9\u00d7\u00e6\u00f0\u0101\u010b"+
		"\u0110\u0120\u0129\u0134\u013e\u0150\u0169\u0173\u0182\u018a\u018f\u01ac"+
		"\u01bd\u01c7\u01d6\u01e0\u01eb\u01f7\u0204\u021e\u0235\u023f\u0249\u0259"+
		"\u0266\u0272\u0285\u029b\u02a5\u02ab\u02b1\u02ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}