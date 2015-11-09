// Generated from /Developer/Github/Liss-SDE/src/Application/Liss.g4 by ANTLR 4.5.1
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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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

	    boolean functionState = false;

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
			 m.addDataInstruction(m.dataTextOriginal()); m.textExitCode(); System.out.println(e.toString()); if(e.isNull()){ m.write();}
			}
		}
		catch (RecognitionException re) {
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
			declarations(idTH,null);
			setState(163);
			match(T__3);
			isDeclarations = false;
			setState(165);
			((BodyContext)_localctx).s = statements(idTH);
			setState(166);
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
		public HashMap<String,Object> varInfo;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeclarationsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, HashMap<String,Object> varInfo) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.varInfo = varInfo;
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

	public final DeclarationsContext declarations(IdentifiersTable idTH,HashMap<String,Object> varInfo) throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState(), idTH, varInfo);
		enterRule(_localctx, 4, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			declaration(idTH, varInfo);
			}
		}
		catch (RecognitionException re) {
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
		public HashMap<String,Object> varInfo;
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
		public DeclarationContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, HashMap<String,Object> varInfo) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.varInfo = varInfo;
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

	public final DeclarationContext declaration(IdentifiersTable idTH,HashMap<String,Object> varInfo) throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState(), idTH, varInfo);
		enterRule(_localctx, 6, RULE_declaration);

		                 HashMap<String, HashMap<String, Object>> hashmapVar = new HashMap<String, HashMap<String,Object>>();
		            
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(170);
				variable_declaration(idTH);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}


			                //It is necessary to the add function ASAP on the idTH due to consistencyof the idTH ! And to add it, we must know ASAP when we know the stack frame size !! Even before a subprogram is detected or a statement !!
			                if(functionState == true && varInfo!=null){
			                    _localctx.idTH.pushSP(m.numberOfRegistersInBytes()); //only add when subprogram are activated !!!!
			                    varInfo.put("address",_localctx.idTH.getSizeSP(level));

			                    String nameFunction = (String) varInfo.get("nameFunction");
			                    varInfo.remove("nameFunction");
			                    hashmapVar.put(nameFunction,varInfo);

			                    _localctx.idTH.add(e,hashmapVar,"function",level-1); //Name of the function is always one level below (for this part of the code) !
			                    //Code below generate the mipscode for functions
			                    String mipsCodeS = m.increaseStackFrameSP(_localctx.idTH.getSizeSP(level));
			                    mipsCodeS += m.saveRegistersAndReturnAddressBeginFunctions(_localctx.idTH.getSizeSP(level));
			                    m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);
			                    //add the rest of the mipsCode of variable_Declaration NT

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

			                System.out.println("-------");
			                _localctx.idTH.printSP();
			                //_localctx.idTH.popSP();
			                //_localctx.idTH.printSP();
			                System.out.println("-------");
			              
			}
		}
		catch (RecognitionException re) {
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

			                                        if(functionState == false){
			                                            m.addTextInstruction("\t##### Initialize Array :"+i+"#####\n");
			                                        }
			                                        for(ArrayList<Integer> array :accessArray){
			                                            int valueOfThePositionOfTheArray = array.get(array.size()-1);
			                                            array.remove(array.size()-1);

			                                            //System.out.println(mipsCodeS);

			                                            int res = 0;
			                                            for(int j=0; j< array.size(); j++){
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

			                                            res = res*4;
			                                            //Add the value of the array firstly
			                                            mipsCodeS = m.loadImmediateWord(String.valueOf(valueOfThePositionOfTheArray), (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos")); //generate mips code for value of the array
			                                            //Add the address of the value of the array
			                                            mipsCodeS += m.loadImmediateWord(String.valueOf(res), (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));//generate mips code for position of the array
			                                            if(functionState == false){
			                                                //Function for adding the value and the address of the value to the given array
			                                                mipsCodeS += m.storeWordArray(i,(int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));
			                                                //Add the instruction to the assembly
			                                                m.addTextInstruction(mipsCodeS);
			                                            }else if(functionState == true){
			                                                //What it does is,
			                                                mipsCodeS += m.loadImmediateWord(((Info)_localctx.idTH.getInfoIdentifiersTable(i)).getAddress().toString(), (int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"))+m.textAdd((int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));
			                                                //è necessario adicionar o endereço da stack frame a posicao calculado do endereço array (para acceder bem)
			                                                mipsCodeS += m.storeWordArraySP((int)varsH.get(i).get("line"), (int)varsH.get(i).get("pos"));
			                                                m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);
			                                            }

			                                        }
			                                        if(functionState == false){
			                                            m.addTextInstruction("\t#######################################\n");
			                                        }
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
			                                for(String i : varsH.keySet()){
			                                    Node n1 = new Node(new String("2"),null,null);
			                                    Node n2 = new Node(new String("3"),null,null);
			                                    Node n3 = new Node(new String("+"),n1,n2);

			                                    Application.Set ss= (Application.Set) varsH.get(i).get("set");
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
			                            //for(String i : varsH.keySet()){
			                            //    System.out.println("Variable: "+i+" "+varsH.get(i).toString());
			                            //}


			                            _localctx.idTH.add(e,varsH,((Variable_declarationContext)_localctx).type.typeS,level);

			                            //MIPS
			                            if(functionState == false){
			                                m.addDataInstructions(varsH,((Variable_declarationContext)_localctx).type.typeS);
			                            }else{

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
				((ConstantContext)_localctx).typeS =  "boolean"; ((ConstantContext)_localctx).line =  (((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getLine():0); ((ConstantContext)_localctx).pos =  (((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getCharPositionInLine():0); if(isDeclarations){ ((ConstantContext)_localctx).mipsCodeS =  m.dataBoolean(true,(((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getLine():0),(((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getCharPositionInLine():0));}else{ ((ConstantContext)_localctx).mipsCodeS =  m.loadBoolTrue((((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getLine():0),(((ConstantContext)_localctx).t!=null?((ConstantContext)_localctx).t.getCharPositionInLine():0));} 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				((ConstantContext)_localctx).f = match(T__16);
				((ConstantContext)_localctx).typeS =  "boolean"; ((ConstantContext)_localctx).line =  (((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getLine():0); ((ConstantContext)_localctx).pos =  (((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getCharPositionInLine():0); if(isDeclarations){ ((ConstantContext)_localctx).mipsCodeS =  m.dataBoolean(false,(((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getLine():0),(((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getCharPositionInLine():0));}else{ ((ConstantContext)_localctx).mipsCodeS =  m.loadBoolFalse((((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getLine():0), (((ConstantContext)_localctx).f!=null?((ConstantContext)_localctx).f.getCharPositionInLine():0));} 
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
		public F_bodyContext f2;
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

		                        HashMap<String,Object> varInfo = new HashMap<String, Object>();

		                        //If level == 0 , then it means that it will enter to a subprogram and must activate the flag of functionState (state which is saying if it is on a subprogram or not) to true !!!
		                        if(level == 0){functionState = true;}
		                        level++;
		                        _localctx.idTH.setAddress(0);
		                      
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__24);
			setState(337);
			((Subprogram_definitionContext)_localctx).i = identifier();
			 m.addNameFunction((((Subprogram_definitionContext)_localctx).i!=null?_input.getText(((Subprogram_definitionContext)_localctx).i.start,((Subprogram_definitionContext)_localctx).i.stop):null)); 
			setState(339);
			match(T__25);
			setState(340);
			((Subprogram_definitionContext)_localctx).f = formal_args(idTH);
			setState(341);
			match(T__26);
			setState(342);
			((Subprogram_definitionContext)_localctx).r = return_type();

			                            //Info we must create for adding to the identifier table (regarding to the FUNCTION)
			                            varInfo.put("line",((Subprogram_definitionContext)_localctx).i.line);
			                            varInfo.put("pos",((Subprogram_definitionContext)_localctx).i.pos);
			                            varInfo.put("return",((Subprogram_definitionContext)_localctx).r.typeS);
			                            varInfo.put("numberArguments", ((Subprogram_definitionContext)_localctx).f.numberArgumentS);
			                            varInfo.put("typeList",((Subprogram_definitionContext)_localctx).f.typeListS);
			                            varInfo.put("nameFunction",(((Subprogram_definitionContext)_localctx).i!=null?_input.getText(((Subprogram_definitionContext)_localctx).i.start,((Subprogram_definitionContext)_localctx).i.stop):null));
			                        
			setState(344);
			((Subprogram_definitionContext)_localctx).f2 = f_body(idTH, varInfo);


			                            //MIPS
			                            String mipsCodeS = m.textEndFunction(_localctx.idTH.getSizeSP(level),((Subprogram_definitionContext)_localctx).f2.returnMipsCodeS);
			                            m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);
			                            m.removeMipsCodeFunction();


			                            //Pre-Condition : Remover todas as variaveis do nivel actual
			                            _localctx.idTH.removeLevel(level);
			                            //System.out.println(m.getNameFunction());
			                            m.removeNameFunction();

			                            //Remove the last SP !
			                            if(level != 0){
			                                _localctx.idTH.popSP();
			                            }
			                            //Decrease level by one
			                            level--;

			                            if(!((Subprogram_definitionContext)_localctx).r.typeS.equals(((Subprogram_definitionContext)_localctx).f2.typeS)){
			                                e.addMessage(((Subprogram_definitionContext)_localctx).i.line,((Subprogram_definitionContext)_localctx).i.pos,ErrorMessage.semanticSubProgram((((Subprogram_definitionContext)_localctx).i!=null?_input.getText(((Subprogram_definitionContext)_localctx).i.start,((Subprogram_definitionContext)_localctx).i.stop):null),ErrorMessage.returnType(((Subprogram_definitionContext)_localctx).f2.typeS,((Subprogram_definitionContext)_localctx).r.typeS)));
			                            }


			                            //If the level is equal to zero, then it means that it exited a subprogram and the behaviour is different from now on ! Everything is related to global variables !
			                            if(level == 0){functionState = false; }

			                        
			}
		}
		catch (RecognitionException re) {
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
		public HashMap<String,Object> varInfo;
		public String typeS;
		public String returnS;
		public String returnMipsCodeS;
		public ReturnSubPrgContext r;
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
		public F_bodyContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, HashMap<String,Object> varInfo) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.varInfo = varInfo;
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

	public final F_bodyContext f_body(IdentifiersTable idTH,HashMap<String,Object> varInfo) throws RecognitionException {
		F_bodyContext _localctx = new F_bodyContext(_ctx, getState(), idTH, varInfo);
		enterRule(_localctx, 44, RULE_f_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__1);
			setState(348);
			match(T__2);
			isDeclarations = true;
			setState(350);
			declarations(idTH, varInfo);
			setState(351);
			match(T__3);
			isDeclarations = false;
			setState(353);
			statements(idTH);
			setState(354);
			((F_bodyContext)_localctx).r = returnSubPrg(idTH);
			((F_bodyContext)_localctx).typeS =  ((F_bodyContext)_localctx).r.typeS; ((F_bodyContext)_localctx).returnS =  (((F_bodyContext)_localctx).r!=null?_input.getText(((F_bodyContext)_localctx).r.start,((F_bodyContext)_localctx).r.stop):null); ((F_bodyContext)_localctx).returnMipsCodeS =  ((F_bodyContext)_localctx).r.mipsCodeS;
			setState(356);
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
			setState(362);
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
				setState(359);
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
			setState(364);
			((F_argsContext)_localctx).f1 = formal_arg();

			            numberArgument++;
			            _localctx.idTH.add(e,((F_argsContext)_localctx).f1.hashmapVarS,((F_argsContext)_localctx).f1.typeS,level);
			            typeList.add(((F_argsContext)_localctx).f1.typeS);
			          
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(366);
				match(T__6);
				setState(367);
				((F_argsContext)_localctx).f2 = formal_arg();

				            numberArgument++;
				            _localctx.idTH.add(e,((F_argsContext)_localctx).f2.hashmapVarS,((F_argsContext)_localctx).f2.typeS,level);
				            typeList.add(((F_argsContext)_localctx).f2.typeS);
				          
				}
				}
				setState(374);
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
		public TypeContext type;
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
			setState(377);
			((Formal_argContext)_localctx).i = identifier();
			setState(378);
			match(T__5);
			setState(379);
			((Formal_argContext)_localctx).t = ((Formal_argContext)_localctx).type = type();

			            varInfo.put("line",((Formal_argContext)_localctx).i.line);
			            varInfo.put("pos",((Formal_argContext)_localctx).i.pos);

			            if(((Formal_argContext)_localctx).t.typeS.equals("array")){
			                varInfo.put("dimension",((Formal_argContext)_localctx).type.arrayDimension);
			            }

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
			setState(387);
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
				setState(383);
				match(T__5);
				setState(384);
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
		public int line;
		public int pos;
		public String mipsCodeS;
		public Token r;
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
		                ((ReturnSubPrgContext)_localctx).typeS =  "null";

		             
		try {
			setState(395);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				((ReturnSubPrgContext)_localctx).mipsCodeS =  null;
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				((ReturnSubPrgContext)_localctx).r = match(T__27);
				setState(391);
				((ReturnSubPrgContext)_localctx).e = expression(idTH,tree);
				((ReturnSubPrgContext)_localctx).typeS =  ((ReturnSubPrgContext)_localctx).e.typeS; ((ReturnSubPrgContext)_localctx).mipsCodeS =  ((ReturnSubPrgContext)_localctx).e.mipsCodeS;
				setState(393);
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
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__48 - 43)) | (1L << (T__54 - 43)) | (1L << (T__55 - 43)) | (1L << (T__56 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (ID - 43)))) != 0)) {
				{
				{
				 m.resetRegister(); 
				setState(398);
				((StatementsContext)_localctx).s = statement(idTH);
				 ((StatementsContext)_localctx).line =  ((StatementsContext)_localctx).s.line; ((StatementsContext)_localctx).pos =  ((StatementsContext)_localctx).s.pos; 
				}
				}
				setState(405);
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
		public int line;
		public int pos;
		public AssignmentContext a;
		public Write_statementContext w;
		public Read_statementContext r;
		public Conditional_statementContext c;
		public Iterative_statementContext i;
		public Function_callContext f;
		public Succ_or_predContext s;
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
			setState(438);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				((StatementContext)_localctx).a = assignment(idTH);
				setState(407);
				match(T__6);
				((StatementContext)_localctx).line = ((StatementContext)_localctx).a.line; ((StatementContext)_localctx).pos = ((StatementContext)_localctx).a.pos;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				((StatementContext)_localctx).w = write_statement(idTH);
				setState(411);
				match(T__6);
				((StatementContext)_localctx).line = ((StatementContext)_localctx).w.line; ((StatementContext)_localctx).pos = ((StatementContext)_localctx).w.pos;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				((StatementContext)_localctx).r = read_statement(idTH);
				setState(415);
				match(T__6);
				((StatementContext)_localctx).line = ((StatementContext)_localctx).r.line; ((StatementContext)_localctx).pos = ((StatementContext)_localctx).r.pos;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				((StatementContext)_localctx).c = conditional_statement(idTH);
				((StatementContext)_localctx).line = ((StatementContext)_localctx).c.line; ((StatementContext)_localctx).pos = ((StatementContext)_localctx).c.pos;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(421);
				((StatementContext)_localctx).i = iterative_statement(idTH);
				((StatementContext)_localctx).line = ((StatementContext)_localctx).i.line; ((StatementContext)_localctx).pos = ((StatementContext)_localctx).i.pos;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(424);
				((StatementContext)_localctx).f = function_call(idTH, set);
				setState(425);
				match(T__6);
				((StatementContext)_localctx).line = ((StatementContext)_localctx).f.line; ((StatementContext)_localctx).pos = ((StatementContext)_localctx).f.pos;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(428);
				((StatementContext)_localctx).s = succ_or_pred(idTH);
				setState(429);
				match(T__6);
				((StatementContext)_localctx).line = ((StatementContext)_localctx).s.line; ((StatementContext)_localctx).pos = ((StatementContext)_localctx).s.pos;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(432);
				copy_statement(idTH);
				setState(433);
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(435);
				cat_statement(idTH);
				setState(436);
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
			setState(440);
			((AssignmentContext)_localctx).designator = designator(idTH, set, side);
			setState(441);
			((AssignmentContext)_localctx).r = match(T__8);
			setState(442);
			((AssignmentContext)_localctx).expression = expression(idTH,set);

			              ((AssignmentContext)_localctx).line =  (((AssignmentContext)_localctx).r!=null?((AssignmentContext)_localctx).r.getLine():0);
			              ((AssignmentContext)_localctx).pos =  (((AssignmentContext)_localctx).r!=null?((AssignmentContext)_localctx).r.getCharPositionInLine():0);
			                  if((((AssignmentContext)_localctx).designator.typeS != null && ((AssignmentContext)_localctx).expression.typeS != null) && ((AssignmentContext)_localctx).designator.typeS.equals(((AssignmentContext)_localctx).expression.typeS)){
			                    ((AssignmentContext)_localctx).typeS =  ((AssignmentContext)_localctx).designator.typeS;
			                    System.out.println(((AssignmentContext)_localctx).designator.line+"Funcionou ;D");

			                    //MIPS
			                    if(((AssignmentContext)_localctx).expression.mipsCodeS != null){
			                        //System.out.println("INICIO <- assignment");
			                        //System.out.println(((AssignmentContext)_localctx).expression.mipsCodeS);
			                        //System.out.println("FIM <- assignment");
			                        String mipsCodeS = "";
			                        if(((AssignmentContext)_localctx).designator.arrayS == false){
			                            mipsCodeS = ((AssignmentContext)_localctx).expression.mipsCodeS;
			                            if(_localctx.idTH.getInfoIdentifiersTable((((AssignmentContext)_localctx).designator!=null?_input.getText(((AssignmentContext)_localctx).designator.start,((AssignmentContext)_localctx).designator.stop):null)).getLevel().equals(0)){
			                                mipsCodeS += m.storeWord((((AssignmentContext)_localctx).designator!=null?_input.getText(((AssignmentContext)_localctx).designator.start,((AssignmentContext)_localctx).designator.stop):null), ((AssignmentContext)_localctx).designator.line, ((AssignmentContext)_localctx).designator.pos);
			                            }else{ //if(!_localctx.idTH.getInfoIdentifiersTable((((AssignmentContext)_localctx).designator!=null?_input.getText(((AssignmentContext)_localctx).designator.start,((AssignmentContext)_localctx).designator.stop):null)).getLevel().equals(0)){
			                                mipsCodeS += m.storeWordSP(_localctx.idTH.getValueSP(level,(((AssignmentContext)_localctx).designator!=null?_input.getText(((AssignmentContext)_localctx).designator.start,((AssignmentContext)_localctx).designator.stop):null)));
			                            }
			                            //m.addTextInstruction((((AssignmentContext)_localctx).designator!=null?_input.getText(((AssignmentContext)_localctx).designator.start,((AssignmentContext)_localctx).designator.stop):null),((AssignmentContext)_localctx).expression.mipsCodeS,((AssignmentContext)_localctx).designator.typeS,((AssignmentContext)_localctx).designator.line,((AssignmentContext)_localctx).designator.pos);
			                        }else if(((AssignmentContext)_localctx).designator.arrayS == true){
			                            mipsCodeS = ((AssignmentContext)_localctx).designator.mipsCodeS;
			                            mipsCodeS += ((AssignmentContext)_localctx).expression.mipsCodeS;
			                            mipsCodeS += m.storeWordArrayText(((AssignmentContext)_localctx).designator.identifierS, ((AssignmentContext)_localctx).designator.line, ((AssignmentContext)_localctx).designator.pos);
			                        }
			                        if(functionState == false){
			                            m.addTextInstruction(mipsCodeS);
			                        }else if(functionState == true){
			                            m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);
			                        }
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
			setState(445);
			((DesignatorContext)_localctx).i = ((DesignatorContext)_localctx).identifier = identifier();
			setState(446);
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

			                                                    if(_localctx.side.equals("right")){
			                                                        if(_localctx.typeS.equals("integer") || _localctx.typeS.equals("boolean")){
			                                                            if(v.getLevel().equals(0)){
			                                                                ((DesignatorContext)_localctx).mipsCodeS =  m.loadWord((((DesignatorContext)_localctx).i!=null?_input.getText(((DesignatorContext)_localctx).i.start,((DesignatorContext)_localctx).i.stop):null), ((DesignatorContext)_localctx).i.line, ((DesignatorContext)_localctx).i.pos);
			                                                                //System.out.println(_localctx.mipsCodeS);
			                                                            }else if(!v.getLevel().equals(0)){
			                                                                int addressOfVariable = _localctx.idTH.getValueSP(level,(((DesignatorContext)_localctx).i!=null?_input.getText(((DesignatorContext)_localctx).i.start,((DesignatorContext)_localctx).i.stop):null));
			                                                                ((DesignatorContext)_localctx).mipsCodeS =  m.loadWordSP(addressOfVariable);
			                                                                //((DesignatorContext)_localctx).mipsCodeS =  m.loadWord((((DesignatorContext)_localctx).i!=null?_input.getText(((DesignatorContext)_localctx).i.start,((DesignatorContext)_localctx).i.stop):null), ((DesignatorContext)_localctx).i.line, ((DesignatorContext)_localctx).i.pos);
			                                                                System.out.println(_localctx.mipsCodeS+" "+(((DesignatorContext)_localctx).identifier!=null?_input.getText(((DesignatorContext)_localctx).identifier.start,((DesignatorContext)_localctx).identifier.stop):null)+" line: "+((DesignatorContext)_localctx).i.line);
			                                                            }

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
			setState(455);
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
				setState(450);
				match(T__19);
				setState(451);
				((Array_accessContext)_localctx).e = ((Array_accessContext)_localctx).elem_array = elem_array(idTH, set, id);
				setState(452);
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
			setState(457);
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
			                                    
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(459);
				match(T__7);
				setState(460);
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
				setState(467);
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
		public int line;
		public int pos;
		public String typeS;
		public String mipsCodeS;
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
			setState(470);
			((Function_callContext)_localctx).i = identifier();
			setState(471);
			match(T__25);
			setState(472);
			((Function_callContext)_localctx).s = sub_prg_args(idTH, set, (((Function_callContext)_localctx).i!=null?_input.getText(((Function_callContext)_localctx).i.start,((Function_callContext)_localctx).i.stop):null));
			setState(473);
			match(T__26);

			                    ((Function_callContext)_localctx).line =  ((Function_callContext)_localctx).i.line;
			                    ((Function_callContext)_localctx).pos =  ((Function_callContext)_localctx).i.pos;
			                    if(_localctx.idTH.getIdentifiersTable().containsKey((((Function_callContext)_localctx).i!=null?_input.getText(((Function_callContext)_localctx).i.start,((Function_callContext)_localctx).i.stop):null))){
			                        if(_localctx.idTH.getInfoIdentifiersTable((((Function_callContext)_localctx).i!=null?_input.getText(((Function_callContext)_localctx).i.start,((Function_callContext)_localctx).i.stop):null)) instanceof Function){
			                            Function f = (Function) _localctx.idTH.getInfoIdentifiersTable((((Function_callContext)_localctx).i!=null?_input.getText(((Function_callContext)_localctx).i.start,((Function_callContext)_localctx).i.stop):null));
			                            ((Function_callContext)_localctx).typeS =  f.getInfoType();

			                            //MIPS
			                            boolean returnBoolean = false;
			                            if(!_localctx.typeS.equals("null")){
			                                returnBoolean = true;
			                            }
			                            ((Function_callContext)_localctx).mipsCodeS =  m.textFunctionCall((((Function_callContext)_localctx).i!=null?_input.getText(((Function_callContext)_localctx).i.start,((Function_callContext)_localctx).i.stop):null), ((Function_callContext)_localctx).i.line, ((Function_callContext)_localctx).i.pos, returnBoolean,((Function_callContext)_localctx).s.argumentsMipsCodeS);
			                            System.out.println(_localctx.mipsCodeS);
			                        }
			                    }else{
			                        ((Function_callContext)_localctx).typeS =  null;
			                        e.addMessage(((Function_callContext)_localctx).i.line,((Function_callContext)_localctx).i.pos,ErrorMessage.semanticSubProgram((((Function_callContext)_localctx).i!=null?_input.getText(((Function_callContext)_localctx).i.start,((Function_callContext)_localctx).i.stop):null),ErrorMessage.functionDoesntExist()));
			                    }

			                    if( _localctx.set!=null){
			                        Node m = new Node(new String("call"),new Node(new String((((Function_callContext)_localctx).i!=null?_input.getText(((Function_callContext)_localctx).i.start,((Function_callContext)_localctx).i.stop):null)),null,null),((Function_callContext)_localctx).s.treeS);
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

	public static class Sub_prg_argsContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public Set set;
		public String nameOfTheFunction;
		public Node treeS;
		public String argumentsMipsCodeS;
		public ArgsContext a;
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Sub_prg_argsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Sub_prg_argsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set, String nameOfTheFunction) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
			this.nameOfTheFunction = nameOfTheFunction;
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

	public final Sub_prg_argsContext sub_prg_args(IdentifiersTable idTH,Set set,String nameOfTheFunction) throws RecognitionException {
		Sub_prg_argsContext _localctx = new Sub_prg_argsContext(_ctx, getState(), idTH, set, nameOfTheFunction);
		enterRule(_localctx, 70, RULE_sub_prg_args);
		try {
			setState(480);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				 ((Sub_prg_argsContext)_localctx).argumentsMipsCodeS =  null; ((Sub_prg_argsContext)_localctx).treeS =  null; /*if(isSet && _localctx.set!=null){((Sub_prg_argsContext)_localctx).treeS =  null;}*/
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
				setState(477);
				((Sub_prg_argsContext)_localctx).a = args(idTH, set, nameOfTheFunction);
				 ((Sub_prg_argsContext)_localctx).argumentsMipsCodeS =  ((Sub_prg_argsContext)_localctx).a.mipsCodeS; ((Sub_prg_argsContext)_localctx).treeS =  ((Sub_prg_argsContext)_localctx).a.treeS;/*if(isSet && $set!=null){$treeS = $a.treeS;}*/
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
		public String nameOfTheFunction;
		public Node treeS;
		public String mipsCodeS;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArgsContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, Set set, String nameOfTheFunction) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.set = set;
			this.nameOfTheFunction = nameOfTheFunction;
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

	public final ArgsContext args(IdentifiersTable idTH,Set set,String nameOfTheFunction) throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState(), idTH, set, nameOfTheFunction);
		enterRule(_localctx, 72, RULE_args);

		        Node head = null;
		        Node m1 = null;
		        Integer addressOfArgumentsOnSF = 0;
		        Integer sizeOfSFFunction = 0;
		        if(_localctx.idTH.doesExist(nameOfTheFunction)){
		            sizeOfSFFunction = ((Info)_localctx.idTH.getInfoIdentifiersTable(nameOfTheFunction)).getAddress();
		        }
		     
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			((ArgsContext)_localctx).e1 = expression(idTH, set);
			  ((ArgsContext)_localctx).mipsCodeS =  ((ArgsContext)_localctx).e1.mipsCodeS+m.storeArgumentsSP(sizeOfSFFunction-addressOfArgumentsOnSF); addressOfArgumentsOnSF += m.numberOfBytesForEachAddress(); head = new Node(new String("args"),((ArgsContext)_localctx).e1.treeS,null); m1 = head;/*if(isSet && _localctx.set!=null){ head = new Node(new String("args"),((ArgsContext)_localctx).e1.treeS,null); m = head;}*/
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(484);
				match(T__7);
				setState(485);
				((ArgsContext)_localctx).e2 = expression(idTH, set);
				  _localctx.mipsCodeS += ((ArgsContext)_localctx).e2.mipsCodeS+m.storeArgumentsSP(sizeOfSFFunction-addressOfArgumentsOnSF); addressOfArgumentsOnSF += m.numberOfBytesForEachAddress(); m1.setRight(new Node(new String("args"),((ArgsContext)_localctx).e2.treeS,null)); m1 = m1.getRight();/*if(isSet && _localctx.set!=null){ m.setRight(new Node(new String("args"),((ArgsContext)_localctx).e2.treeS,null)); m = m.getRight();}*/
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        //System.out.println("/*******************ARGUMENTS MIPSCODE***********************/");
			        //System.out.println(_localctx.mipsCodeS);
			        //System.out.println("/******************************************/");

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
		public boolean relationExp;
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
			setState(495);
			((ExpressionContext)_localctx).s1 = single_expression(idTH, set);
			 ((ExpressionContext)_localctx).line =  ((ExpressionContext)_localctx).s1.line; ((ExpressionContext)_localctx).pos =  ((ExpressionContext)_localctx).s1.pos; n = ((ExpressionContext)_localctx).s1.treeS; ((ExpressionContext)_localctx).setS =  ((ExpressionContext)_localctx).s1.setS; if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null) == null){((ExpressionContext)_localctx).mipsCodeS =  ((ExpressionContext)_localctx).s1.mipsCodeS;}
			setState(501);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(497);
				((ExpressionContext)_localctx).rel_op = rel_op();
				setState(498);
				((ExpressionContext)_localctx).s2 = single_expression(idTH,set);
				   relationExp = true;
				                    if(!(((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("in")){
				                        if((((ExpressionContext)_localctx).s1.typeS != null) && ((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("==") || (((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("!=")) && ((ExpressionContext)_localctx).s1.typeS.equals("boolean")){
				                            if((((ExpressionContext)_localctx).s2.typeS !=null) && ((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("==") || (((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("!=")) && ((ExpressionContext)_localctx).s2.typeS.equals("boolean")){
				                                //MIPS

				                                if(!isDeclarations && !isSet){
				                                    ((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + ((ExpressionContext)_localctx).s2.mipsCodeS;
				                                    //System.out.println("/*****************************123**********************/");
				                                    //System.out.println(_localctx.mipsCodeS);
				                                    //System.out.println("/*****************************123**********************/");

				                                    if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("==")){
				                                        ((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textEquals(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                    }else if((((ExpressionContext)_localctx).rel_op!=null?_input.getText(((ExpressionContext)_localctx).rel_op.start,((ExpressionContext)_localctx).rel_op.stop):null).equals("!=")){
				                                        ((ExpressionContext)_localctx).mipsCodeS =  _localctx.mipsCodeS + m.textDifferent(((ExpressionContext)_localctx).rel_op.line,((ExpressionContext)_localctx).rel_op.pos);
				                                    }

				                                }
				                                //System.out.println(_localctx.mipsCodeS);

				                                //END_MIPS
				                            }else{
				                                correctType = false;
				                            }
				                        }else if((((ExpressionContext)_localctx).s1.typeS != null) && ((ExpressionContext)_localctx).s1.typeS.equals(((ExpressionContext)_localctx).rel_op.typeS)){ //Tratar as relacoes em que os tipos sao inteiros
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
			                ((ExpressionContext)_localctx).relationExp =  relationExp;

			            
			}
		}
		catch (RecognitionException re) {
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
			setState(505);
			((Single_expressionContext)_localctx).t1 = ((Single_expressionContext)_localctx).term = term(idTH, set);
			((Single_expressionContext)_localctx).line =  ((Single_expressionContext)_localctx).term.line; ((Single_expressionContext)_localctx).pos =  ((Single_expressionContext)_localctx).term.pos; errorManagement.add(new ErrorInfo((((Single_expressionContext)_localctx).t1!=null?_input.getText(((Single_expressionContext)_localctx).t1.start,((Single_expressionContext)_localctx).t1.stop):null),((Single_expressionContext)_localctx).t1.typeS,((Single_expressionContext)_localctx).t1.line,((Single_expressionContext)_localctx).t1.pos)); n = ((Single_expressionContext)_localctx).t1.treeS; ((Single_expressionContext)_localctx).setS =  ((Single_expressionContext)_localctx).t1.setS; ((Single_expressionContext)_localctx).mipsCodeS =  ((Single_expressionContext)_localctx).t1.mipsCodeS;
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				{
				setState(507);
				((Single_expressionContext)_localctx).a = ((Single_expressionContext)_localctx).add_op = add_op();
				setState(508);
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
				setState(515);
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
			setState(518);
			((TermContext)_localctx).f1 = factor(idTH, set);
			 ((TermContext)_localctx).line =  ((TermContext)_localctx).f1.line; ((TermContext)_localctx).pos =  ((TermContext)_localctx).f1.pos;  errorManagement.add(new ErrorInfo((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null), ((TermContext)_localctx).f1.typeS, ((TermContext)_localctx).f1.line,((TermContext)_localctx).f1.pos)); n = ((TermContext)_localctx).f1.treeS; if(((TermContext)_localctx).f1.setS == null && !isDeclarations){ if(_localctx.idTH.doesExist((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null))){if(_localctx.idTH.getInfoIdentifiersTable((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null)) instanceof SymbolTable.Set){SymbolTable.Set s = (SymbolTable.Set) _localctx.idTH.getInfoIdentifiersTable((((TermContext)_localctx).f1!=null?_input.getText(((TermContext)_localctx).f1.start,((TermContext)_localctx).f1.stop):null)); ((TermContext)_localctx).setS =  s.getSet();}}}else{((TermContext)_localctx).setS =  ((TermContext)_localctx).f1.setS;} ((TermContext)_localctx).mipsCodeS =  ((TermContext)_localctx).f1.mipsCodeS; 
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				{
				setState(520);
				((TermContext)_localctx).m = ((TermContext)_localctx).mul_op = mul_op();
				setState(521);
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
				setState(528);
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
			setState(552);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				((FactorContext)_localctx).i = inic_var(idTH, set);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).i.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).i.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).i.pos; ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).i.treeS; ((FactorContext)_localctx).setS =  ((FactorContext)_localctx).i.setS; /*if(isSet && ((FactorContext)_localctx).i.treeS!=null && _localctx.set!=null){ ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).i.treeS;}*/ ((FactorContext)_localctx).mipsCodeS =  ((FactorContext)_localctx).i.mipsCodeS;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				((FactorContext)_localctx).d = designator(idTH, set, side);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).d.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).d.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).d.pos; ((FactorContext)_localctx).mipsCodeS =  ((FactorContext)_localctx).d.mipsCodeS; ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).d.treeS;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				match(T__25);
				setState(538);
				((FactorContext)_localctx).e = expression(idTH, set);
				setState(539);
				match(T__26);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).e.typeS; ((FactorContext)_localctx).line =  ((FactorContext)_localctx).e.line; ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).e.pos; ((FactorContext)_localctx).mipsCodeS =  ((FactorContext)_localctx).e.mipsCodeS; ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).e.treeS; ((FactorContext)_localctx).setS =  ((FactorContext)_localctx).e.setS;/*if(isSet && $e.treeS!=null && $set!=null){ $treeS = $e.treeS;}*/
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				match(T__28);
				setState(543);
				((FactorContext)_localctx).f1 = factor(idTH, set);

				            ((FactorContext)_localctx).line =  ((FactorContext)_localctx).f1.line;
				            ((FactorContext)_localctx).pos =  ((FactorContext)_localctx).f1.pos;
				            if(((FactorContext)_localctx).f1.typeS!=null && ((FactorContext)_localctx).f1.typeS.equals("boolean")){
				                ((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).f1.typeS;
				                ((FactorContext)_localctx).mipsCodeS =  ((FactorContext)_localctx).f1.mipsCodeS + m.textNot(((FactorContext)_localctx).f1.line, ((FactorContext)_localctx).f1.pos);
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
				setState(546);
				((FactorContext)_localctx).f2 = function_call(idTH, set);
				((FactorContext)_localctx).typeS =  ((FactorContext)_localctx).f2.typeS; ((FactorContext)_localctx).mipsCodeS =  ((FactorContext)_localctx).f2.mipsCodeS; ((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).f2.treeS; /*if(isSet && _localctx.set!=null){((FactorContext)_localctx).treeS =  ((FactorContext)_localctx).f2.treeS;}*/
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(549);
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
			setState(575);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				((SpecialFunctionsContext)_localctx).t = ((SpecialFunctionsContext)_localctx).tail = tail(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).tail.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).tail.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).tail.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).t.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).t.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).t.treeS;}*/
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				((SpecialFunctionsContext)_localctx).h = ((SpecialFunctionsContext)_localctx).head = head(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).head.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).head.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).head.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).h.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).h.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).h.treeS;}*/
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				((SpecialFunctionsContext)_localctx).c = ((SpecialFunctionsContext)_localctx).cons = cons(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).cons.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).cons.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).cons.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).c.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).c.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).c.treeS;}*/
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				((SpecialFunctionsContext)_localctx).m = ((SpecialFunctionsContext)_localctx).member = member(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).member.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).member.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).member.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).m.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).m.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).m.treeS;}*/
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 5);
				{
				setState(566);
				((SpecialFunctionsContext)_localctx).i = ((SpecialFunctionsContext)_localctx).is_empty = is_empty(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).is_empty.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).is_empty.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).is_empty.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).i.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).i.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).i.treeS;}*/
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 6);
				{
				setState(569);
				((SpecialFunctionsContext)_localctx).l = ((SpecialFunctionsContext)_localctx).length = length(idTH, set);
				((SpecialFunctionsContext)_localctx).typeS =  ((SpecialFunctionsContext)_localctx).length.typeS; ((SpecialFunctionsContext)_localctx).line =  ((SpecialFunctionsContext)_localctx).length.line; ((SpecialFunctionsContext)_localctx).pos =  ((SpecialFunctionsContext)_localctx).length.pos; ((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).l.treeS; /*if(isSet && ((SpecialFunctionsContext)_localctx).l.treeS!=null && _localctx.set!=null){((SpecialFunctionsContext)_localctx).treeS =  ((SpecialFunctionsContext)_localctx).l.treeS;}*/
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 7);
				{
				setState(572);
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
			setState(585);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				((Add_opContext)_localctx).a = match(T__17);
				((Add_opContext)_localctx).typeS =  "integer"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				((Add_opContext)_localctx).a = match(T__18);
				((Add_opContext)_localctx).typeS =  "integer"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				((Add_opContext)_localctx).a = match(T__29);
				((Add_opContext)_localctx).typeS =  "boolean"; ((Add_opContext)_localctx).line =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getLine():0); ((Add_opContext)_localctx).pos =  (((Add_opContext)_localctx).a!=null?((Add_opContext)_localctx).a.getCharPositionInLine():0);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(583);
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
			setState(595);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				((Mul_opContext)_localctx).m = match(T__31);
				((Mul_opContext)_localctx).typeS =  "integer"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				((Mul_opContext)_localctx).m = match(T__32);
				((Mul_opContext)_localctx).typeS =  "integer"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				((Mul_opContext)_localctx).m = match(T__33);
				((Mul_opContext)_localctx).typeS =  "boolean"; ((Mul_opContext)_localctx).line =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getLine():0); ((Mul_opContext)_localctx).pos =  (((Mul_opContext)_localctx).m!=null?((Mul_opContext)_localctx).m.getCharPositionInLine():0);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(593);
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
			setState(611);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				((Rel_opContext)_localctx).r = match(T__35);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				((Rel_opContext)_localctx).r = match(T__36);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				((Rel_opContext)_localctx).r = match(T__37);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(603);
				((Rel_opContext)_localctx).r = match(T__38);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 5);
				{
				setState(605);
				((Rel_opContext)_localctx).r = match(T__39);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(607);
				((Rel_opContext)_localctx).r = match(T__40);
				((Rel_opContext)_localctx).typeS =  "integer"; ((Rel_opContext)_localctx).line =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getLine():0); ((Rel_opContext)_localctx).pos =  (((Rel_opContext)_localctx).r!=null?((Rel_opContext)_localctx).r.getCharPositionInLine():0);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 7);
				{
				setState(609);
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
		public int line;
		public int pos;
		public Write_exprContext w;
		public Print_whatContext p;
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
			setState(613);
			((Write_statementContext)_localctx).w = write_expr();
			setState(614);
			match(T__25);
			setState(615);
			((Write_statementContext)_localctx).p = print_what(idTH);
			setState(616);
			match(T__26);

			                    ((Write_statementContext)_localctx).line =  ((Write_statementContext)_localctx).w.line;
			                    ((Write_statementContext)_localctx).pos =  ((Write_statementContext)_localctx).w.pos;
			                    if(functionState == false){
			                        if(((Write_statementContext)_localctx).p.mipsCodeS != null){
			                            if(((Write_statementContext)_localctx).w.write == true){
			                            //Means that it is only write !
			                                String s1 = m.textWrite(((Write_statementContext)_localctx).p.mipsCodeS, ((Write_statementContext)_localctx).w.write, ((Write_statementContext)_localctx).w.line, ((Write_statementContext)_localctx).w.pos);
			                                if(functionState == false){
			                                    m.addTextInstruction(s1);
			                                }else if(functionState == true){
			                                    m.addMipsCodeFunction(m.getNameFunction(),s1);
			                                }
			                            }else if(((Write_statementContext)_localctx).w.write == false){
			                            //Means that it is only writeln !
			                                String s2 = m.textWrite(((Write_statementContext)_localctx).p.mipsCodeS, ((Write_statementContext)_localctx).w.write, ((Write_statementContext)_localctx).w.line, ((Write_statementContext)_localctx).w.pos);
			                                if(functionState == false){
			                                    m.addTextInstruction(s2);
			                                }else if(functionState == true){
			                                    m.addMipsCodeFunction(m.getNameFunction(),s2);
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

	public static class Write_exprContext extends ParserRuleContext {
		public boolean write;
		public int line;
		public int pos;
		public Token w;
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
		try {
			setState(623);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				((Write_exprContext)_localctx).w = match(T__42);
				 ((Write_exprContext)_localctx).write =  true; ((Write_exprContext)_localctx).line =  (((Write_exprContext)_localctx).w!=null?((Write_exprContext)_localctx).w.getLine():0); ((Write_exprContext)_localctx).pos =  (((Write_exprContext)_localctx).w!=null?((Write_exprContext)_localctx).w.getCharPositionInLine():0);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				((Write_exprContext)_localctx).w = match(T__43);
				 ((Write_exprContext)_localctx).write =  false; ((Write_exprContext)_localctx).line =  (((Write_exprContext)_localctx).w!=null?((Write_exprContext)_localctx).w.getLine():0); ((Write_exprContext)_localctx).pos =  (((Write_exprContext)_localctx).w!=null?((Write_exprContext)_localctx).w.getCharPositionInLine():0);
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

	public static class Print_whatContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public String mipsCodeS;
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
			setState(629);
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
				setState(626);
				((Print_whatContext)_localctx).e = expression(idTH, tree);

				                if( ((Print_whatContext)_localctx).e.typeS == null || ((Print_whatContext)_localctx).e.typeS.equals("set")){
				                    e.addMessage(((Print_whatContext)_localctx).e.line,((Print_whatContext)_localctx).e.pos,ErrorMessage.semantic((((Print_whatContext)_localctx).e!=null?_input.getText(((Print_whatContext)_localctx).e.start,((Print_whatContext)_localctx).e.stop):null),ErrorMessage.type(((Print_whatContext)_localctx).e.typeS,"integer | boolean | sequence | array")));
				                }else{
				                    ((Print_whatContext)_localctx).mipsCodeS =  ((Print_whatContext)_localctx).e.mipsCodeS;
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

	public static class Read_statementContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public int line;
		public int pos;
		public Token in;
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
			setState(631);
			((Read_statementContext)_localctx).in = match(T__44);
			setState(632);
			match(T__25);
			setState(633);
			((Read_statementContext)_localctx).i = identifier();
			setState(634);
			match(T__26);

			                  ((Read_statementContext)_localctx).line =  (((Read_statementContext)_localctx).in!=null?((Read_statementContext)_localctx).in.getLine():0);
			                  ((Read_statementContext)_localctx).pos =  (((Read_statementContext)_localctx).in!=null?((Read_statementContext)_localctx).in.getCharPositionInLine():0);
			                  if(functionState == false){
			                  Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((Read_statementContext)_localctx).i!=null?_input.getText(((Read_statementContext)_localctx).i.start,((Read_statementContext)_localctx).i.stop):null));
			                      if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //verificar se existe e é tipo inteiro e class VAR
			                        e.addMessage(((Read_statementContext)_localctx).i.line,((Read_statementContext)_localctx).i.pos,ErrorMessage.semantic((((Read_statementContext)_localctx).i!=null?_input.getText(((Read_statementContext)_localctx).i.start,((Read_statementContext)_localctx).i.stop):null),ErrorMessage.type(v.getInfoType(),"integer")));
			                      }else{
			                        String mipsCodeS,s;

			                        if(_localctx.idTH.getInfoIdentifiersTable((((Read_statementContext)_localctx).i!=null?_input.getText(((Read_statementContext)_localctx).i.start,((Read_statementContext)_localctx).i.stop):null)).getLevel().equals(0)){
			                            mipsCodeS = m.storeWord((((Read_statementContext)_localctx).i!=null?_input.getText(((Read_statementContext)_localctx).i.start,((Read_statementContext)_localctx).i.stop):null),((Read_statementContext)_localctx).i.line,((Read_statementContext)_localctx).i.pos);
			                        }else{
			                            mipsCodeS = m.storeWordSP(_localctx.idTH.getValueSP(level,(((Read_statementContext)_localctx).i!=null?_input.getText(((Read_statementContext)_localctx).i.start,((Read_statementContext)_localctx).i.stop):null)));
			                        }
			                        s = m.textRead(mipsCodeS, ((Read_statementContext)_localctx).i.line, ((Read_statementContext)_localctx).i.pos);
			                        if(functionState == false){
			                            m.addTextInstruction(s);
			                        }else if(functionState == true){
			                            m.addMipsCodeFunction(m.getNameFunction(),s);
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public int line;
		public int pos;
		public If_then_else_statContext i;
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
			setState(637);
			((Conditional_statementContext)_localctx).i = if_then_else_stat(idTH);
			 ((Conditional_statementContext)_localctx).line =  ((Conditional_statementContext)_localctx).i.line; ((Conditional_statementContext)_localctx).pos =  ((Conditional_statementContext)_localctx).i.pos; m.removeLastStack();
			}
		}
		catch (RecognitionException re) {
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
		public int line;
		public int pos;
		public For_statContext f;
		public While_statContext w;
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
			setState(646);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				((Iterative_statementContext)_localctx).f = for_stat(idTH);
				((Iterative_statementContext)_localctx).line =  ((Iterative_statementContext)_localctx).f.line; ((Iterative_statementContext)_localctx).pos =  ((Iterative_statementContext)_localctx).f.pos;
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				((Iterative_statementContext)_localctx).w = while_stat(idTH);
				((Iterative_statementContext)_localctx).line =  ((Iterative_statementContext)_localctx).w.line; ((Iterative_statementContext)_localctx).pos =  ((Iterative_statementContext)_localctx).w.pos;
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
		public int line;
		public int pos;
		public Token i;
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
		                    String mipsCodeS = null;
		                  
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			((If_then_else_statContext)_localctx).i = match(T__45);
			setState(649);
			match(T__25);
			setState(650);
			((If_then_else_statContext)_localctx).e1 = expression(idTH, tree);
			setState(651);
			match(T__26);

			                          ((If_then_else_statContext)_localctx).line =  (((If_then_else_statContext)_localctx).i!=null?((If_then_else_statContext)_localctx).i.getLine():0);
			                          ((If_then_else_statContext)_localctx).pos =  (((If_then_else_statContext)_localctx).i!=null?((If_then_else_statContext)_localctx).i.getCharPositionInLine():0);
			                          if(!(((If_then_else_statContext)_localctx).e1.typeS!=null && ((If_then_else_statContext)_localctx).e1.typeS.equals("boolean"))){
			                            e.addMessage(((If_then_else_statContext)_localctx).e1.line,((If_then_else_statContext)_localctx).e1.pos,ErrorMessage.semantic((((If_then_else_statContext)_localctx).e1!=null?_input.getText(((If_then_else_statContext)_localctx).e1.start,((If_then_else_statContext)_localctx).e1.stop):null),ErrorMessage.type(((If_then_else_statContext)_localctx).e1.typeS,"boolean")));
			                          }else{
			                            mipsCodeS = ((If_then_else_statContext)_localctx).e1.mipsCodeS;
			                            mipsCodeS += m.textIfThenElse((((If_then_else_statContext)_localctx).i!=null?((If_then_else_statContext)_localctx).i.getLine():0), (((If_then_else_statContext)_localctx).i!=null?((If_then_else_statContext)_localctx).i.getCharPositionInLine():0));
			                            if(functionState == false){
			                                m.addTextInstruction(mipsCodeS);
			                            }else if(functionState == true){
			                                m.addMipsCodeFunction(m.getNameFunction(),mipsCodeS);
			                            }
			                          }
			                        
			setState(653);
			match(T__46);
			setState(654);
			match(T__1);
			setState(655);
			((If_then_else_statContext)_localctx).s = statements(idTH);
			setState(656);
			match(T__4);
			setState(657);
			((If_then_else_statContext)_localctx).e2 = else_expression(idTH, (((If_then_else_statContext)_localctx).i!=null?((If_then_else_statContext)_localctx).i.getLine():0), (((If_then_else_statContext)_localctx).i!=null?((If_then_else_statContext)_localctx).i.getCharPositionInLine():0));
			}
		}
		catch (RecognitionException re) {
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
		public int line;
		public int pos;
		public Token e;
		public StatementsContext s;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Else_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Else_expressionContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, int line, int pos) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.line = line;
			this.pos = pos;
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

	public final Else_expressionContext else_expression(IdentifiersTable idTH,int line,int pos) throws RecognitionException {
		Else_expressionContext _localctx = new Else_expressionContext(_ctx, getState(), idTH, line, pos);
		enterRule(_localctx, 104, RULE_else_expression);

		                    String mipsCodeS = null;
		                
		try {
			setState(667);
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
				 String s1 = m.textElse(line,pos); if(s1 != null){ if(functionState == false){m.addTextInstruction(s1);}else if(functionState == true){ m.addMipsCodeFunction(m.getNameFunction(),s1);}}
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				((Else_expressionContext)_localctx).e = match(T__47);
				setState(661);
				match(T__1);

				                        String s2 = m.textJumpBeforeElse((((Else_expressionContext)_localctx).e!=null?((Else_expressionContext)_localctx).e.getLine():0), (((Else_expressionContext)_localctx).e!=null?((Else_expressionContext)_localctx).e.getCharPositionInLine():0));
				                        if(s2 !=  null){
				                            if(functionState == false){
				                                m.addTextInstruction(s2);
				                            }else if(functionState == true){
				                                m.addMipsCodeFunction(m.getNameFunction(),s2);
				                            }
				                        }
				                    
				setState(663);
				((Else_expressionContext)_localctx).s = statements(idTH);
				 String s3 = m.textJumpAfterElse((((Else_expressionContext)_localctx).e!=null?((Else_expressionContext)_localctx).e.getLine():0), (((Else_expressionContext)_localctx).e!=null?((Else_expressionContext)_localctx).e.getCharPositionInLine():0)); if(s3 != null){ if(functionState == false){m.addTextInstruction(s3);}else if(functionState == true){ m.addMipsCodeFunction(m.getNameFunction(),s3);}}
				setState(665);
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
		public int line;
		public int pos;
		public Token f;
		public IntervalContext i;
		public StepContext s;
		public SatisfyContext s2;
		public StatementsContext s3;
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
			setState(669);
			((For_statContext)_localctx).f = match(T__48);
			setState(670);
			match(T__25);
			setState(671);
			((For_statContext)_localctx).i = interval(idTH);
			setState(672);
			match(T__26);
			setState(673);
			((For_statContext)_localctx).s = step();

			                ((For_statContext)_localctx).line =  (((For_statContext)_localctx).f!=null?((For_statContext)_localctx).f.getLine():0);
			                ((For_statContext)_localctx).pos =  (((For_statContext)_localctx).f!=null?((For_statContext)_localctx).f.getCharPositionInLine():0);
			                if(((For_statContext)_localctx).i.inArray == true && ((For_statContext)_localctx).s.stepS == true){
			                    e.addMessage((((For_statContext)_localctx).f!=null?((For_statContext)_localctx).f.getLine():0), (((For_statContext)_localctx).f!=null?((For_statContext)_localctx).f.getCharPositionInLine():0), ErrorMessage.forEachStep());
			                }else{
			                    String s1 = ((For_statContext)_localctx).i.mipsCodeS;
			                    Integer positionFromSP = 0, variableLevel = _localctx.idTH.getInfoIdentifiersTable(((For_statContext)_localctx).i.variableS).getLevel(); //we must declare that for textForCondition function, it is needed for the use of variables for functions and also, not including IdentifiersTable into Mips class
			                    if(!variableLevel.equals(0)){
			                        positionFromSP = _localctx.idTH.getValueSP(level, ((For_statContext)_localctx).i.variableS);
			                    }
			                    Integer positionFromSPArray = 0, arrayLevel = 0;
			                    if(((For_statContext)_localctx).i.inArray){
			                        positionFromSPArray = _localctx.idTH.getValueSP(level, ((For_statContext)_localctx).i.arrayS);
			                        arrayLevel = _localctx.idTH.getInfoIdentifiersTable(((For_statContext)_localctx).i.arrayS).getLevel();
			                    }
			                    s1 += m.textForCondition(((For_statContext)_localctx).i.inArray,((For_statContext)_localctx).i.variableS,variableLevel,positionFromSP,((For_statContext)_localctx).i.arrayS, positionFromSPArray, arrayLevel, ((For_statContext)_localctx).i.maximumMipsCodeS, ((For_statContext)_localctx).s.stepUp, (((For_statContext)_localctx).f!=null?((For_statContext)_localctx).f.getLine():0), (((For_statContext)_localctx).f!=null?((For_statContext)_localctx).f.getCharPositionInLine():0));
			                    if(functionState == false){
			                        m.addTextInstruction(s1);
			                    }else if(functionState == true){
			                        m.addMipsCodeFunction(m.getNameFunction(),s1);
			                    }
			                }

			            
			setState(675);
			((For_statContext)_localctx).s2 = satisfy(idTH);


			                if(((For_statContext)_localctx).i.inArray == true && ((For_statContext)_localctx).s2.satisfyingS == true){
			                    e.addMessage((((For_statContext)_localctx).f!=null?((For_statContext)_localctx).f.getLine():0), (((For_statContext)_localctx).f!=null?((For_statContext)_localctx).f.getCharPositionInLine():0), ErrorMessage.forEachSatisfying());
			                }else if(((For_statContext)_localctx).s2.mipsCodeS!=null){
			                    String s = m.textForSatisfyingInit(((For_statContext)_localctx).s2.mipsCodeS, ((For_statContext)_localctx).s2.line, ((For_statContext)_localctx).s2.pos); //Fazer isto !!!
			                    if(functionState == false){
			                        m.addTextInstruction(s);
			                    }else if(functionState == true){
			                        m.addMipsCodeFunction(m.getNameFunction(),s);
			                    }
			                }

			            
			setState(677);
			match(T__1);
			setState(678);
			((For_statContext)_localctx).s3 = statements(idTH);
			setState(679);
			match(T__4);

			                String  l = null;
			                if(((For_statContext)_localctx).s2.mipsCodeS!=null){
			                    l = m.textForSatisfyingEnd(((For_statContext)_localctx).s3.line, ((For_statContext)_localctx).s3.pos);
			                }
			                //P.C. = inArray, stepBoolean, StepValue
			                Integer levelVariable = 0, positionFromSP = 0;
			                if(!_localctx.idTH.getInfoIdentifiersTable(((For_statContext)_localctx).i.variable).getLevel().equals(0)){
			                    levelVariable = _localctx.idTH.getInfoIdentifiersTable(((For_statContext)_localctx).i.variable).getLevel();
			                    positionFromSP = _localctx.idTH.getValueSP(level, ((For_statContext)_localctx).i.variable);
			                }
			                if(l!=null){
			                    l += m.textForStep(((For_statContext)_localctx).i.variable,levelVariable,positionFromSP, ((For_statContext)_localctx).i.inArray, ((For_statContext)_localctx).s.stepUp, ((For_statContext)_localctx).s.numberS, ((For_statContext)_localctx).s3.line, ((For_statContext)_localctx).s3.pos);
			                }else{
			                    l = m.textForStep(((For_statContext)_localctx).i.variable,levelVariable,positionFromSP, ((For_statContext)_localctx).i.inArray, ((For_statContext)_localctx).s.stepUp, ((For_statContext)_localctx).s.numberS, ((For_statContext)_localctx).s3.line, ((For_statContext)_localctx).s3.pos);
			                }
			                if(functionState == false){
			                    m.addTextInstruction(l);
			                }else if(functionState == true){
			                    m.addMipsCodeFunction(m.getNameFunction(),l);
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

	public static class IntervalContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public String mipsCodeS;
		public boolean inArray;
		public String maximumMipsCodeS;
		public String variable;
		public String arrayS;
		public String variableS;
		public IdentifierContext i;
		public Type_intervalContext t;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_intervalContext type_interval() {
			return getRuleContext(Type_intervalContext.class,0);
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

		            ((IntervalContext)_localctx).mipsCodeS =  null;
		            ((IntervalContext)_localctx).arrayS =  null;
		            ((IntervalContext)_localctx).variableS =  null;
		         
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			((IntervalContext)_localctx).i = identifier();
			setState(683);
			((IntervalContext)_localctx).t = type_interval(idTH,(((IntervalContext)_localctx).i!=null?_input.getText(((IntervalContext)_localctx).i.start,((IntervalContext)_localctx).i.stop):null));

			            Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((IntervalContext)_localctx).i!=null?_input.getText(((IntervalContext)_localctx).i.start,((IntervalContext)_localctx).i.stop):null));
			            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){   //identifier tem que pertencer a tabela, cat VAR e tipo inteiro
			                e.addMessage(((IntervalContext)_localctx).i.line,((IntervalContext)_localctx).i.pos,ErrorMessage.semantic((((IntervalContext)_localctx).i!=null?_input.getText(((IntervalContext)_localctx).i.start,((IntervalContext)_localctx).i.stop):null),ErrorMessage.type(v.getInfoType(),"integer")));
			            }else{
			                ((IntervalContext)_localctx).mipsCodeS =  ((IntervalContext)_localctx).t.minimumMipsCodeS;
			                ((IntervalContext)_localctx).inArray =  ((IntervalContext)_localctx).t.inArrayS;
			                ((IntervalContext)_localctx).maximumMipsCodeS =  ((IntervalContext)_localctx).t.maximumMipsCodeS;
			                ((IntervalContext)_localctx).variable =  (((IntervalContext)_localctx).i!=null?_input.getText(((IntervalContext)_localctx).i.start,((IntervalContext)_localctx).i.stop):null);
			                ((IntervalContext)_localctx).arrayS =  ((IntervalContext)_localctx).t.arrayS;
			                ((IntervalContext)_localctx).variableS =  (((IntervalContext)_localctx).i!=null?_input.getText(((IntervalContext)_localctx).i.start,((IntervalContext)_localctx).i.stop):null);
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
		public String variable;
		public String minimumMipsCodeS;
		public String maximumMipsCodeS;
		public boolean inArrayS;
		public String arrayS;
		public RangeContext r;
		public IdentifierContext i;
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_intervalContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Type_intervalContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, String variable) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.variable = variable;
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

	public final Type_intervalContext type_interval(IdentifiersTable idTH,String variable) throws RecognitionException {
		Type_intervalContext _localctx = new Type_intervalContext(_ctx, getState(), idTH, variable);
		enterRule(_localctx, 110, RULE_type_interval);

		                ((Type_intervalContext)_localctx).inArrayS =  false;
		                ((Type_intervalContext)_localctx).arrayS =  null;
		              
		try {
			setState(694);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				match(T__41);
				setState(687);
				((Type_intervalContext)_localctx).r = range(idTH,variable,_localctx.inArrayS);
				((Type_intervalContext)_localctx).minimumMipsCodeS =  ((Type_intervalContext)_localctx).r.minimumMipsCodeS; ((Type_intervalContext)_localctx).maximumMipsCodeS =  ((Type_intervalContext)_localctx).r.maximumMipsCodeS;
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				match(T__49);
				setState(691);
				((Type_intervalContext)_localctx).i = identifier();

				                                        ((Type_intervalContext)_localctx).inArrayS =  true;
				                                        Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((Type_intervalContext)_localctx).i!=null?_input.getText(((Type_intervalContext)_localctx).i.start,((Type_intervalContext)_localctx).i.stop):null));
				                                        if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("array"))){   //identifier => Array e cat VAR
				                                            e.addMessage(((Type_intervalContext)_localctx).i.line,((Type_intervalContext)_localctx).i.pos,ErrorMessage.semantic((((Type_intervalContext)_localctx).i!=null?_input.getText(((Type_intervalContext)_localctx).i.start,((Type_intervalContext)_localctx).i.stop):null),ErrorMessage.type(v.getInfoType(),"integer")));
				                                        }else{
				                                            if(_localctx.inArrayS == true){
				                                                String s = m.loadImmediateWord("0", ((Type_intervalContext)_localctx).i.line, ((Type_intervalContext)_localctx).i.pos); // 0 because "inArray" is a foreach !! So it must pass to every position of the array. That's why we begin by 0 until the maximum of the dimension of the array.

				                                                Integer levelVariable = 0, positionFromSP = 0;
				                                                if(!_localctx.idTH.getInfoIdentifiersTable(_localctx.variable).getLevel().equals(0)){
				                                                    levelVariable = _localctx.idTH.getInfoIdentifiersTable(_localctx.variable).getLevel();
				                                                    positionFromSP = _localctx.idTH.getValueSP(level,_localctx.variable);
				                                                }
				                                                ((Type_intervalContext)_localctx).minimumMipsCodeS =  m.textForInit(_localctx.inArrayS,_localctx.variable,levelVariable,positionFromSP,s, ((Type_intervalContext)_localctx).i.line, ((Type_intervalContext)_localctx).i.pos);

				                                                // We need to do the code for maximum ! we need to calculate the size of the array !
				                                                Array a = (Array) _localctx.idTH.getInfoIdentifiersTable((((Type_intervalContext)_localctx).i!=null?_input.getText(((Type_intervalContext)_localctx).i.start,((Type_intervalContext)_localctx).i.stop):null));
				                                                Integer res =  new Integer(1);
				                                                for(Integer i : a.getLimits()){
				                                                    res = res * i;
				                                                }
				                                                res = res-1; //This is needed due to calculation of the array ! For example : [3|2] => 6 positions but the address goes to [0..20] and not 3*2*4 (=24)
				                                                res = res*4;

				                                                ((Type_intervalContext)_localctx).maximumMipsCodeS =  m.loadImmediateWord(res.toString(), ((Type_intervalContext)_localctx).i.line, ((Type_intervalContext)_localctx).i.pos);
				                                                ((Type_intervalContext)_localctx).arrayS =  (((Type_intervalContext)_localctx).i!=null?_input.getText(((Type_intervalContext)_localctx).i.start,((Type_intervalContext)_localctx).i.stop):null);
				                                            }
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
		public String variable;
		public boolean inArray;
		public String minimumMipsCodeS;
		public String maximumMipsCodeS;
		public MinimumContext m1;
		public MaximumContext m2;
		public MinimumContext minimum() {
			return getRuleContext(MinimumContext.class,0);
		}
		public MaximumContext maximum() {
			return getRuleContext(MaximumContext.class,0);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RangeContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, String variable, boolean inArray) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.variable = variable;
			this.inArray = inArray;
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

	public final RangeContext range(IdentifiersTable idTH,String variable,boolean inArray) throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState(), idTH, variable, inArray);
		enterRule(_localctx, 112, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			((RangeContext)_localctx).m1 = minimum(idTH,variable,_localctx.inArray);
			setState(697);
			match(T__50);
			setState(698);
			((RangeContext)_localctx).m2 = maximum(idTH);
			 ((RangeContext)_localctx).minimumMipsCodeS =  ((RangeContext)_localctx).m1.mipsCodeS; ((RangeContext)_localctx).maximumMipsCodeS =  ((RangeContext)_localctx).m2.mipsCodeS;
			}
		}
		catch (RecognitionException re) {
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
		public String variable;
		public boolean inArray;
		public String mipsCodeS;
		public NumberContext n;
		public IdentifierContext i;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MinimumContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MinimumContext(ParserRuleContext parent, int invokingState, IdentifiersTable idTH, String variable, boolean inArray) {
			super(parent, invokingState);
			this.idTH = idTH;
			this.variable = variable;
			this.inArray = inArray;
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

	public final MinimumContext minimum(IdentifiersTable idTH,String variable,boolean inArray) throws RecognitionException {
		MinimumContext _localctx = new MinimumContext(_ctx, getState(), idTH, variable, inArray);
		enterRule(_localctx, 114, RULE_minimum);
		try {
			setState(707);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				((MinimumContext)_localctx).n = number();

				                            String s = m.loadImmediateWord((((MinimumContext)_localctx).n!=null?_input.getText(((MinimumContext)_localctx).n.start,((MinimumContext)_localctx).n.stop):null), ((MinimumContext)_localctx).n.line, ((MinimumContext)_localctx).n.pos);
				                            Integer variableLevel = 0,  positionFromSP = 0;
				                            if(!_localctx.idTH.getInfoIdentifiersTable(_localctx.variable).getLevel().equals(0)){
				                                variableLevel = _localctx.idTH.getInfoIdentifiersTable(_localctx.variable).getLevel();
				                                positionFromSP = _localctx.idTH.getValueSP(level,_localctx.variable);
				                            }
				                            ((MinimumContext)_localctx).mipsCodeS =  m.textForInit(_localctx.inArray,_localctx.variable,variableLevel,positionFromSP,s, ((MinimumContext)_localctx).n.line, ((MinimumContext)_localctx).n.pos);
				                          
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				((MinimumContext)_localctx).i = identifier();

				            Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((MinimumContext)_localctx).i!=null?_input.getText(((MinimumContext)_localctx).i.start,((MinimumContext)_localctx).i.stop):null));
				            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //tem que existir e tem que ser variavel tipo inteiro , cat VAR
				                e.addMessage(((MinimumContext)_localctx).i.line,((MinimumContext)_localctx).i.pos,ErrorMessage.semantic((((MinimumContext)_localctx).i!=null?_input.getText(((MinimumContext)_localctx).i.start,((MinimumContext)_localctx).i.stop):null),ErrorMessage.type(v.getInfoType(),"integer")));
				            }else{
				                String s;
				                if(_localctx.idTH.getInfoIdentifiersTable((((MinimumContext)_localctx).i!=null?_input.getText(((MinimumContext)_localctx).i.start,((MinimumContext)_localctx).i.stop):null)).getLevel().equals(0)){
				                    s = m.loadWord((((MinimumContext)_localctx).i!=null?_input.getText(((MinimumContext)_localctx).i.start,((MinimumContext)_localctx).i.stop):null), ((MinimumContext)_localctx).i.line, ((MinimumContext)_localctx).i.pos);
				                }else{
				                    s = m.loadWordSP(_localctx.idTH.getValueSP(level,(((MinimumContext)_localctx).i!=null?_input.getText(((MinimumContext)_localctx).i.start,((MinimumContext)_localctx).i.stop):null)));
				                }
				                Integer variableLevel = 0,  positionFromSP = 0;
				                if(!_localctx.idTH.getInfoIdentifiersTable(_localctx.variable).getLevel().equals(0)){
				                    variableLevel = _localctx.idTH.getInfoIdentifiersTable(_localctx.variable).getLevel();
				                    positionFromSP = _localctx.idTH.getValueSP(level,_localctx.variable);
				                }
				                ((MinimumContext)_localctx).mipsCodeS =  m.textForInit(_localctx.inArray,_localctx.variable,variableLevel,positionFromSP,s, ((MinimumContext)_localctx).i.line, ((MinimumContext)_localctx).i.pos);
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
		public String mipsCodeS;
		public NumberContext n;
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
			setState(715);
			switch (_input.LA(1)) {
			case NBR:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				((MaximumContext)_localctx).n = number();
				 ((MaximumContext)_localctx).mipsCodeS =  m.loadImmediateWord((((MaximumContext)_localctx).n!=null?_input.getText(((MaximumContext)_localctx).n.start,((MaximumContext)_localctx).n.stop):null), ((MaximumContext)_localctx).n.line, ((MaximumContext)_localctx).n.pos); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				((MaximumContext)_localctx).i = identifier();

				            Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((MaximumContext)_localctx).i!=null?_input.getText(((MaximumContext)_localctx).i.start,((MaximumContext)_localctx).i.stop):null));
				            if(!(v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer"))){       //tem que existir e tem que ser variavel tipo inteiro , cat VAR
				                e.addMessage(((MaximumContext)_localctx).i.line,((MaximumContext)_localctx).i.pos,ErrorMessage.semantic((((MaximumContext)_localctx).i!=null?_input.getText(((MaximumContext)_localctx).i.start,((MaximumContext)_localctx).i.stop):null),ErrorMessage.type(v.getInfoType(),"integer")));
				            }else{
				                //String s;
				                if(_localctx.idTH.getInfoIdentifiersTable((((MaximumContext)_localctx).i!=null?_input.getText(((MaximumContext)_localctx).i.start,((MaximumContext)_localctx).i.stop):null)).getLevel().equals(0)){
				                    ((MaximumContext)_localctx).mipsCodeS =  m.loadWord((((MaximumContext)_localctx).i!=null?_input.getText(((MaximumContext)_localctx).i.start,((MaximumContext)_localctx).i.stop):null), ((MaximumContext)_localctx).i.line, ((MaximumContext)_localctx).i.pos);
				                }else{
				                    ((MaximumContext)_localctx).mipsCodeS =  m.loadWordSP(_localctx.idTH.getValueSP(level,(((MaximumContext)_localctx).i!=null?_input.getText(((MaximumContext)_localctx).i.start,((MaximumContext)_localctx).i.stop):null)));
				                }
				                //((MaximumContext)_localctx).mipsCodeS =  m.loadWord((((MaximumContext)_localctx).i!=null?_input.getText(((MaximumContext)_localctx).i.start,((MaximumContext)_localctx).i.stop):null), ((MaximumContext)_localctx).i.line, ((MaximumContext)_localctx).i.pos);
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
		public boolean stepS;
		public boolean stepUp;
		public String numberS;
		public Up_downContext u;
		public NumberContext n;
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
			setState(722);
			switch (_input.LA(1)) {
			case T__1:
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				 ((StepContext)_localctx).stepUp =  true; ((StepContext)_localctx).stepS =  false;
				}
				break;
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				((StepContext)_localctx).u = up_down();
				setState(719);
				((StepContext)_localctx).n = number();

				                              ((StepContext)_localctx).stepUp =  ((StepContext)_localctx).u.stepUp; ((StepContext)_localctx).numberS =  (((StepContext)_localctx).n!=null?_input.getText(((StepContext)_localctx).n.start,((StepContext)_localctx).n.stop):null); ((StepContext)_localctx).stepS =  true;
				                            
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
		public boolean stepUp;
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

		            ((Up_downContext)_localctx).stepUp =  false;
		        
		try {
			setState(727);
			switch (_input.LA(1)) {
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				match(T__51);
				 ((Up_downContext)_localctx).stepUp =  true; 
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				match(T__52);
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

	public static class SatisfyContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public String mipsCodeS;
		public boolean satisfyingS;
		public int line;
		public int pos;
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
		            ((SatisfyContext)_localctx).mipsCodeS =  null;
		        
		try {
			setState(734);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				((SatisfyContext)_localctx).mipsCodeS =  null; ((SatisfyContext)_localctx).satisfyingS =  false;
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				match(T__53);
				setState(731);
				((SatisfyContext)_localctx).e = expression(idTH, tree);
				   ((SatisfyContext)_localctx).line =  ((SatisfyContext)_localctx).e.line;
				            ((SatisfyContext)_localctx).pos =  ((SatisfyContext)_localctx).e.pos;
				            ((SatisfyContext)_localctx).satisfyingS =  true;
				            if(!(((SatisfyContext)_localctx).e.typeS !=null && ((SatisfyContext)_localctx).e.typeS.equals("boolean"))){
				                e.addMessage(((SatisfyContext)_localctx).e.line,((SatisfyContext)_localctx).e.pos,ErrorMessage.semantic((((SatisfyContext)_localctx).e!=null?_input.getText(((SatisfyContext)_localctx).e.start,((SatisfyContext)_localctx).e.stop):null),ErrorMessage.type(((SatisfyContext)_localctx).e.typeS,"boolean")));
				            }else{
				                ((SatisfyContext)_localctx).mipsCodeS =  ((SatisfyContext)_localctx).e.mipsCodeS;
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
		public int line;
		public int pos;
		public Token w;
		public ExpressionContext e;
		public Token l;
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
			setState(736);
			((While_statContext)_localctx).w = match(T__54);
			setState(737);
			match(T__25);
			setState(738);
			((While_statContext)_localctx).e = expression(idTH, tree);
			setState(739);
			match(T__26);

			                  ((While_statContext)_localctx).line =  (((While_statContext)_localctx).w!=null?((While_statContext)_localctx).w.getLine():0);
			                  ((While_statContext)_localctx).pos =  (((While_statContext)_localctx).w!=null?((While_statContext)_localctx).w.getCharPositionInLine():0);
			                  if(!(((While_statContext)_localctx).e.typeS!=null && ((While_statContext)_localctx).e.typeS.equals("boolean"))){
			                    e.addMessage(((While_statContext)_localctx).e.line,((While_statContext)_localctx).e.pos,ErrorMessage.semantic((((While_statContext)_localctx).e!=null?_input.getText(((While_statContext)_localctx).e.start,((While_statContext)_localctx).e.stop):null),ErrorMessage.type(((While_statContext)_localctx).e.typeS,"boolean")));
			                  }else{
			                    if(((While_statContext)_localctx).e.mipsCodeS != null){
			                        String s1 = m.textWhile(((While_statContext)_localctx).e.mipsCodeS, ((While_statContext)_localctx).e.line, ((While_statContext)_localctx).e.pos);
			                        if(functionState==false){
			                            m.addTextInstruction(s1);
			                        }else if(functionState==true){
			                            //generate mips assembly code for functions
			                            m.addMipsCodeFunction(m.getNameFunction(),s1);
			                        }
			                        //m.resetRegister();
			                    }
			                  }
			                
			setState(741);
			match(T__1);
			setState(742);
			statements(idTH);
			setState(743);
			((While_statContext)_localctx).l = match(T__4);

			                if(((While_statContext)_localctx).e.mipsCodeS != null){
			                    String s2 = m.textWhileExit((((While_statContext)_localctx).l!=null?((While_statContext)_localctx).l.getLine():0), (((While_statContext)_localctx).l!=null?((While_statContext)_localctx).l.getCharPositionInLine():0));
			                    if(functionState == false){
			                        m.addTextInstruction(s2);
			                    }else if(functionState == true){
			                        //generate mips assembly code for functions
			                        m.addMipsCodeFunction(m.getNameFunction(),s2);
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

	public static class Succ_or_predContext extends ParserRuleContext {
		public IdentifiersTable idTH;
		public int line;
		public int pos;
		public Succ_predContext s;
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
			setState(746);
			((Succ_or_predContext)_localctx).s = succ_pred();
			setState(747);
			((Succ_or_predContext)_localctx).i = identifier();

			                ((Succ_or_predContext)_localctx).line =  ((Succ_or_predContext)_localctx).s.line;
			                ((Succ_or_predContext)_localctx).pos =  ((Succ_or_predContext)_localctx).s.pos;
			                Var v = (Var) _localctx.idTH.getInfoIdentifiersTable((((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null));
			                if( !( (((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null).matches("^[0-9]+$") || (v != null && v.getCategory().equals("VAR") && v.getInfoType().equals("integer")) ) ){
			                    e.addMessage(((Succ_or_predContext)_localctx).i.line,((Succ_or_predContext)_localctx).i.pos,ErrorMessage.semantic((((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null),ErrorMessage.type("null","integer")));
			                }else{
			                    if(((Succ_or_predContext)_localctx).s.succ == true){
			                    //It means that succ is being used
			                        String s1;
			                        //we need to know the level of the identifier
			                        if(_localctx.idTH.getInfoIdentifiersTable((((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null)).getLevel().equals(0)){
			                            s1 = m.textSucc((((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null), ((Succ_or_predContext)_localctx).s.line, ((Succ_or_predContext)_localctx).s.pos);
			                        }else{
			                            s1 = m.textSuccSF(_localctx.idTH.getValueSP(level,(((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null)), ((Succ_or_predContext)_localctx).s.line, ((Succ_or_predContext)_localctx).s.pos);
			                        }

			                        //this is needed for knowing where the instruction will be added to the mips assembly code
			                        if(functionState == false){
			                            m.addTextInstruction(s1);
			                        }else if(functionState == true){
			                            m.addMipsCodeFunction(m.getNameFunction(),s1);
			                        }
			                    }else if(((Succ_or_predContext)_localctx).s.succ == false){
			                    //It means that pred is being used
			                        String s2;
			                        //we need to know the level of the identifier
			                        if(_localctx.idTH.getInfoIdentifiersTable((((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null)).getLevel().equals(0)){
			                            s2 = m.textPred((((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null), ((Succ_or_predContext)_localctx).s.line, ((Succ_or_predContext)_localctx).s.pos);
			                        }else{
			                            s2 = m.textPredSF(_localctx.idTH.getValueSP(level,(((Succ_or_predContext)_localctx).i!=null?_input.getText(((Succ_or_predContext)_localctx).i.start,((Succ_or_predContext)_localctx).i.stop):null)),((Succ_or_predContext)_localctx).s.line,((Succ_or_predContext)_localctx).s.pos);
			                        }

			                        if(functionState == false){
			                            m.addTextInstruction(s2);
			                        }else if(functionState == true){
			                            m.addMipsCodeFunction(m.getNameFunction(),s2);
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

	public static class Succ_predContext extends ParserRuleContext {
		public boolean succ;
		public int line;
		public int pos;
		public Token s;
		public Token p;
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
		try {
			setState(754);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				((Succ_predContext)_localctx).s = match(T__55);
				 ((Succ_predContext)_localctx).succ =  true; ((Succ_predContext)_localctx).line =  (((Succ_predContext)_localctx).s!=null?((Succ_predContext)_localctx).s.getLine():0); ((Succ_predContext)_localctx).pos = (((Succ_predContext)_localctx).s!=null?((Succ_predContext)_localctx).s.getCharPositionInLine():0);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				((Succ_predContext)_localctx).p = match(T__56);
				 ((Succ_predContext)_localctx).succ =  false; ((Succ_predContext)_localctx).line =  (((Succ_predContext)_localctx).p!=null?((Succ_predContext)_localctx).p.getLine():0); ((Succ_predContext)_localctx).pos =  (((Succ_predContext)_localctx).p!=null?((Succ_predContext)_localctx).p.getCharPositionInLine():0);
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
			setState(756);
			((TailContext)_localctx).t = match(T__57);
			setState(757);
			match(T__25);
			setState(758);
			((TailContext)_localctx).e = expression(idTH, set);
			setState(759);
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
			setState(762);
			((HeadContext)_localctx).h = match(T__58);
			setState(763);
			match(T__25);
			setState(764);
			((HeadContext)_localctx).e = expression(idTH, set);
			setState(765);
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
			setState(768);
			((ConsContext)_localctx).c = match(T__59);
			setState(769);
			match(T__25);
			setState(770);
			((ConsContext)_localctx).e1 = expression(idTH, set);
			setState(771);
			match(T__7);
			setState(772);
			((ConsContext)_localctx).e2 = expression(idTH, set);
			setState(773);
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
			setState(776);
			((DeleteContext)_localctx).d = match(T__60);
			setState(777);
			match(T__25);
			setState(778);
			((DeleteContext)_localctx).e1 = expression(idTH, set);
			setState(779);
			match(T__7);
			setState(780);
			((DeleteContext)_localctx).e2 = expression(idTH, set);
			setState(781);
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
			setState(784);
			match(T__61);
			setState(785);
			match(T__25);
			setState(786);
			((Copy_statementContext)_localctx).i1 = identifier();
			setState(787);
			match(T__7);
			setState(788);
			((Copy_statementContext)_localctx).i2 = identifier();
			setState(789);
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
			setState(792);
			match(T__62);
			setState(793);
			match(T__25);
			setState(794);
			((Cat_statementContext)_localctx).i1 = identifier();
			setState(795);
			match(T__7);
			setState(796);
			((Cat_statementContext)_localctx).i2 = identifier();
			setState(797);
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
			setState(800);
			((Is_emptyContext)_localctx).i = match(T__63);
			setState(801);
			match(T__25);
			setState(802);
			((Is_emptyContext)_localctx).e1 = expression(idTH, set);
			setState(803);
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
			setState(806);
			((LengthContext)_localctx).l = match(T__64);
			setState(807);
			match(T__25);
			setState(808);
			((LengthContext)_localctx).e1 = expression(idTH, set);
			setState(809);
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
			setState(812);
			((MemberContext)_localctx).im = match(T__65);
			setState(813);
			match(T__25);
			setState(814);
			((MemberContext)_localctx).e = expression(idTH, set);
			setState(815);
			match(T__7);
			setState(816);
			((MemberContext)_localctx).i = identifier();
			setState(817);
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
			setState(820);
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
			setState(822);
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
			setState(825);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3H\u033f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\7\5\u00ae\n\5\f\5\16\5\u00b1\13\5\3\5"+
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
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u016d\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0175\n\32\f\32\16\32\u0178\13\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34\u0186"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u018e\n\35\3\36\3\36\3\36\3\36"+
		"\7\36\u0194\n\36\f\36\16\36\u0197\13\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01b9"+
		"\n\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ca\n\""+
		"\3#\3#\3#\3#\3#\3#\7#\u01d2\n#\f#\16#\u01d5\13#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\5%\u01e3\n%\3&\3&\3&\3&\3&\3&\7&\u01eb\n&\f&\16&\u01ee\13"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01f8\n\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\7(\u0202\n(\f(\16(\u0205\13(\3(\3(\3)\3)\3)\3)\3)\3)\7)\u020f\n)\f)"+
		"\16)\u0212\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u022b\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\5+\u0242\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u024c\n,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\5-\u0256\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\5.\u0266\n.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\5\60\u0272\n"+
		"\60\3\61\3\61\3\61\3\61\5\61\u0278\n\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0289\n\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u029e\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\39\39\39\59\u02b9"+
		"\n9\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\5;\u02c6\n;\3<\3<\3<\3<\3<\3<\5<"+
		"\u02ce\n<\3=\3=\3=\3=\3=\5=\u02d5\n=\3>\3>\3>\5>\u02da\n>\3?\3?\3?\3?"+
		"\3?\5?\u02e1\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B"+
		"\5B\u02f5\nB\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3L"+
		"\3L\3M\3M\3M\3N\3N\3N\3N\2\2O\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\2\2\u033c\2\u009c\3\2\2\2\4\u00a1\3\2\2\2\6\u00aa\3\2\2\2\b\u00af\3\2"+
		"\2\2\n\u00bb\3\2\2\2\f\u00c1\3\2\2\2\16\u00ce\3\2\2\2\20\u00d7\3\2\2\2"+
		"\22\u00e6\3\2\2\2\24\u00e8\3\2\2\2\26\u0101\3\2\2\2\30\u010b\3\2\2\2\32"+
		"\u0110\3\2\2\2\34\u0112\3\2\2\2\36\u0116\3\2\2\2 \u0129\3\2\2\2\"\u012b"+
		"\3\2\2\2$\u0134\3\2\2\2&\u0136\3\2\2\2(\u0143\3\2\2\2*\u0150\3\2\2\2,"+
		"\u0152\3\2\2\2.\u015d\3\2\2\2\60\u016c\3\2\2\2\62\u016e\3\2\2\2\64\u017b"+
		"\3\2\2\2\66\u0185\3\2\2\28\u018d\3\2\2\2:\u0195\3\2\2\2<\u01b8\3\2\2\2"+
		">\u01ba\3\2\2\2@\u01bf\3\2\2\2B\u01c9\3\2\2\2D\u01cb\3\2\2\2F\u01d8\3"+
		"\2\2\2H\u01e2\3\2\2\2J\u01e4\3\2\2\2L\u01f1\3\2\2\2N\u01fb\3\2\2\2P\u0208"+
		"\3\2\2\2R\u022a\3\2\2\2T\u0241\3\2\2\2V\u024b\3\2\2\2X\u0255\3\2\2\2Z"+
		"\u0265\3\2\2\2\\\u0267\3\2\2\2^\u0271\3\2\2\2`\u0277\3\2\2\2b\u0279\3"+
		"\2\2\2d\u027f\3\2\2\2f\u0288\3\2\2\2h\u028a\3\2\2\2j\u029d\3\2\2\2l\u029f"+
		"\3\2\2\2n\u02ac\3\2\2\2p\u02b8\3\2\2\2r\u02ba\3\2\2\2t\u02c5\3\2\2\2v"+
		"\u02cd\3\2\2\2x\u02d4\3\2\2\2z\u02d9\3\2\2\2|\u02e0\3\2\2\2~\u02e2\3\2"+
		"\2\2\u0080\u02ec\3\2\2\2\u0082\u02f4\3\2\2\2\u0084\u02f6\3\2\2\2\u0086"+
		"\u02fc\3\2\2\2\u0088\u0302\3\2\2\2\u008a\u030a\3\2\2\2\u008c\u0312\3\2"+
		"\2\2\u008e\u031a\3\2\2\2\u0090\u0322\3\2\2\2\u0092\u0328\3\2\2\2\u0094"+
		"\u032e\3\2\2\2\u0096\u0336\3\2\2\2\u0098\u0338\3\2\2\2\u009a\u033b\3\2"+
		"\2\2\u009c\u009d\7\3\2\2\u009d\u009e\5\u009aN\2\u009e\u009f\5\4\3\2\u009f"+
		"\u00a0\b\2\1\2\u00a0\3\3\2\2\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\7\5\2\2"+
		"\u00a3\u00a4\b\3\1\2\u00a4\u00a5\5\6\4\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7"+
		"\b\3\1\2\u00a7\u00a8\5:\36\2\u00a8\u00a9\7\7\2\2\u00a9\5\3\2\2\2\u00aa"+
		"\u00ab\5\b\5\2\u00ab\7\3\2\2\2\u00ac\u00ae\5\n\6\2\u00ad\u00ac\3\2\2\2"+
		"\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b6\b\5\1\2\u00b3\u00b5\5,\27\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\b\5\1\2\u00ba"+
		"\t\3\2\2\2\u00bb\u00bc\5\f\7\2\u00bc\u00bd\7\b\2\2\u00bd\u00be\5\22\n"+
		"\2\u00be\u00bf\7\t\2\2\u00bf\u00c0\b\6\1\2\u00c0\13\3\2\2\2\u00c1\u00c2"+
		"\5\16\b\2\u00c2\u00c9\b\7\1\2\u00c3\u00c4\7\n\2\2\u00c4\u00c5\5\16\b\2"+
		"\u00c5\u00c6\b\7\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\b\7\1\2\u00cd\r\3\2\2\2\u00ce\u00cf\5\u009a"+
		"N\2\u00cf\u00d0\5\20\t\2\u00d0\u00d1\b\b\1\2\u00d1\17\3\2\2\2\u00d2\u00d8"+
		"\b\t\1\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\5\26\f\2\u00d5\u00d6\b\t\1\2"+
		"\u00d6\u00d8\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\21"+
		"\3\2\2\2\u00d9\u00da\7\f\2\2\u00da\u00e7\b\n\1\2\u00db\u00dc\7\r\2\2\u00dc"+
		"\u00e7\b\n\1\2\u00dd\u00de\7\16\2\2\u00de\u00e7\b\n\1\2\u00df\u00e0\7"+
		"\17\2\2\u00e0\u00e7\b\n\1\2\u00e1\u00e2\7\20\2\2\u00e2\u00e3\7\21\2\2"+
		"\u00e3\u00e4\5\24\13\2\u00e4\u00e5\b\n\1\2\u00e5\u00e7\3\2\2\2\u00e6\u00d9"+
		"\3\2\2\2\u00e6\u00db\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6"+
		"\u00e1\3\2\2\2\u00e7\23\3\2\2\2\u00e8\u00e9\5\u0098M\2\u00e9\u00f0\b\13"+
		"\1\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\5\u0098M\2\u00ec\u00ed\b\13\1\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\b\13\1\2\u00f4\25\3\2\2\2\u00f5\u00f6\5\30\r\2\u00f6\u00f7\b\f"+
		"\1\2\u00f7\u0102\3\2\2\2\u00f8\u00f9\5\34\17\2\u00f9\u00fa\b\f\1\2\u00fa"+
		"\u0102\3\2\2\2\u00fb\u00fc\5(\25\2\u00fc\u00fd\b\f\1\2\u00fd\u0102\3\2"+
		"\2\2\u00fe\u00ff\5\"\22\2\u00ff\u0100\b\f\1\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00f5\3\2\2\2\u0101\u00f8\3\2\2\2\u0101\u00fb\3\2\2\2\u0101\u00fe\3\2"+
		"\2\2\u0102\27\3\2\2\2\u0103\u0104\5\32\16\2\u0104\u0105\5\u0098M\2\u0105"+
		"\u0106\b\r\1\2\u0106\u010c\3\2\2\2\u0107\u0108\7\22\2\2\u0108\u010c\b"+
		"\r\1\2\u0109\u010a\7\23\2\2\u010a\u010c\b\r\1\2\u010b\u0103\3\2\2\2\u010b"+
		"\u0107\3\2\2\2\u010b\u0109\3\2\2\2\u010c\31\3\2\2\2\u010d\u0111\3\2\2"+
		"\2\u010e\u0111\7\24\2\2\u010f\u0111\7\25\2\2\u0110\u010d\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\33\3\2\2\2\u0112\u0113\7\26\2"+
		"\2\u0113\u0114\5\36\20\2\u0114\u0115\7\27\2\2\u0115\35\3\2\2\2\u0116\u0117"+
		"\b\20\1\2\u0117\u0118\5 \21\2\u0118\u0120\b\20\1\2\u0119\u011a\7\n\2\2"+
		"\u011a\u011b\b\20\1\2\u011b\u011c\5 \21\2\u011c\u011d\b\20\1\2\u011d\u011f"+
		"\3\2\2\2\u011e\u0119\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\b\20"+
		"\1\2\u0124\37\3\2\2\2\u0125\u0126\5\u0098M\2\u0126\u0127\b\21\1\2\u0127"+
		"\u012a\3\2\2\2\u0128\u012a\5\34\17\2\u0129\u0125\3\2\2\2\u0129\u0128\3"+
		"\2\2\2\u012a!\3\2\2\2\u012b\u012c\7\30\2\2\u012c\u012d\5$\23\2\u012d\u012e"+
		"\b\22\1\2\u012e\u012f\7\31\2\2\u012f#\3\2\2\2\u0130\u0135\b\23\1\2\u0131"+
		"\u0132\5&\24\2\u0132\u0133\b\23\1\2\u0133\u0135\3\2\2\2\u0134\u0130\3"+
		"\2\2\2\u0134\u0131\3\2\2\2\u0135%\3\2\2\2\u0136\u0137\5\u0098M\2\u0137"+
		"\u013e\b\24\1\2\u0138\u0139\7\n\2\2\u0139\u013a\5\u0098M\2\u013a\u013b"+
		"\b\24\1\2\u013b\u013d\3\2\2\2\u013c\u0138\3\2\2\2\u013d\u0140\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0141\u0142\b\24\1\2\u0142\'\3\2\2\2\u0143\u0144\7\4\2\2\u0144"+
		"\u0145\5*\26\2\u0145\u0146\b\25\1\2\u0146\u0147\7\7\2\2\u0147\u0148\b"+
		"\25\1\2\u0148)\3\2\2\2\u0149\u0151\b\26\1\2\u014a\u014b\5\u009aN\2\u014b"+
		"\u014c\b\26\1\2\u014c\u014d\7\32\2\2\u014d\u014e\5L\'\2\u014e\u014f\b"+
		"\26\1\2\u014f\u0151\3\2\2\2\u0150\u0149\3\2\2\2\u0150\u014a\3\2\2\2\u0151"+
		"+\3\2\2\2\u0152\u0153\7\33\2\2\u0153\u0154\5\u009aN\2\u0154\u0155\b\27"+
		"\1\2\u0155\u0156\7\34\2\2\u0156\u0157\5\60\31\2\u0157\u0158\7\35\2\2\u0158"+
		"\u0159\5\66\34\2\u0159\u015a\b\27\1\2\u015a\u015b\5.\30\2\u015b\u015c"+
		"\b\27\1\2\u015c-\3\2\2\2\u015d\u015e\7\4\2\2\u015e\u015f\7\5\2\2\u015f"+
		"\u0160\b\30\1\2\u0160\u0161\5\6\4\2\u0161\u0162\7\6\2\2\u0162\u0163\b"+
		"\30\1\2\u0163\u0164\5:\36\2\u0164\u0165\58\35\2\u0165\u0166\b\30\1\2\u0166"+
		"\u0167\7\7\2\2\u0167/\3\2\2\2\u0168\u016d\b\31\1\2\u0169\u016a\5\62\32"+
		"\2\u016a\u016b\b\31\1\2\u016b\u016d\3\2\2\2\u016c\u0168\3\2\2\2\u016c"+
		"\u0169\3\2\2\2\u016d\61\3\2\2\2\u016e\u016f\5\64\33\2\u016f\u0176\b\32"+
		"\1\2\u0170\u0171\7\t\2\2\u0171\u0172\5\64\33\2\u0172\u0173\b\32\1\2\u0173"+
		"\u0175\3\2\2\2\u0174\u0170\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017a\b\32\1\2\u017a\63\3\2\2\2\u017b\u017c\5\u009aN\2\u017c\u017d\7"+
		"\b\2\2\u017d\u017e\5\22\n\2\u017e\u017f\b\33\1\2\u017f\65\3\2\2\2\u0180"+
		"\u0186\b\34\1\2\u0181\u0182\7\b\2\2\u0182\u0183\5\22\n\2\u0183\u0184\b"+
		"\34\1\2\u0184\u0186\3\2\2\2\u0185\u0180\3\2\2\2\u0185\u0181\3\2\2\2\u0186"+
		"\67\3\2\2\2\u0187\u018e\b\35\1\2\u0188\u0189\7\36\2\2\u0189\u018a\5L\'"+
		"\2\u018a\u018b\b\35\1\2\u018b\u018c\7\t\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u0187\3\2\2\2\u018d\u0188\3\2\2\2\u018e9\3\2\2\2\u018f\u0190\b\36\1\2"+
		"\u0190\u0191\5<\37\2\u0191\u0192\b\36\1\2\u0192\u0194\3\2\2\2\u0193\u018f"+
		"\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		";\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\5> \2\u0199\u019a\7\t\2\2\u019a"+
		"\u019b\b\37\1\2\u019b\u01b9\3\2\2\2\u019c\u019d\5\\/\2\u019d\u019e\7\t"+
		"\2\2\u019e\u019f\b\37\1\2\u019f\u01b9\3\2\2\2\u01a0\u01a1\5b\62\2\u01a1"+
		"\u01a2\7\t\2\2\u01a2\u01a3\b\37\1\2\u01a3\u01b9\3\2\2\2\u01a4\u01a5\5"+
		"d\63\2\u01a5\u01a6\b\37\1\2\u01a6\u01b9\3\2\2\2\u01a7\u01a8\5f\64\2\u01a8"+
		"\u01a9\b\37\1\2\u01a9\u01b9\3\2\2\2\u01aa\u01ab\5F$\2\u01ab\u01ac\7\t"+
		"\2\2\u01ac\u01ad\b\37\1\2\u01ad\u01b9\3\2\2\2\u01ae\u01af\5\u0080A\2\u01af"+
		"\u01b0\7\t\2\2\u01b0\u01b1\b\37\1\2\u01b1\u01b9\3\2\2\2\u01b2\u01b3\5"+
		"\u008cG\2\u01b3\u01b4\7\t\2\2\u01b4\u01b9\3\2\2\2\u01b5\u01b6\5\u008e"+
		"H\2\u01b6\u01b7\7\t\2\2\u01b7\u01b9\3\2\2\2\u01b8\u0198\3\2\2\2\u01b8"+
		"\u019c\3\2\2\2\u01b8\u01a0\3\2\2\2\u01b8\u01a4\3\2\2\2\u01b8\u01a7\3\2"+
		"\2\2\u01b8\u01aa\3\2\2\2\u01b8\u01ae\3\2\2\2\u01b8\u01b2\3\2\2\2\u01b8"+
		"\u01b5\3\2\2\2\u01b9=\3\2\2\2\u01ba\u01bb\5@!\2\u01bb\u01bc\7\13\2\2\u01bc"+
		"\u01bd\5L\'\2\u01bd\u01be\b \1\2\u01be?\3\2\2\2\u01bf\u01c0\5\u009aN\2"+
		"\u01c0\u01c1\5B\"\2\u01c1\u01c2\b!\1\2\u01c2A\3\2\2\2\u01c3\u01ca\b\""+
		"\1\2\u01c4\u01c5\7\26\2\2\u01c5\u01c6\5D#\2\u01c6\u01c7\7\27\2\2\u01c7"+
		"\u01c8\b\"\1\2\u01c8\u01ca\3\2\2\2\u01c9\u01c3\3\2\2\2\u01c9\u01c4\3\2"+
		"\2\2\u01caC\3\2\2\2\u01cb\u01cc\5N(\2\u01cc\u01d3\b#\1\2\u01cd\u01ce\7"+
		"\n\2\2\u01ce\u01cf\5N(\2\u01cf\u01d0\b#\1\2\u01d0\u01d2\3\2\2\2\u01d1"+
		"\u01cd\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\b#\1\2\u01d7"+
		"E\3\2\2\2\u01d8\u01d9\5\u009aN\2\u01d9\u01da\7\34\2\2\u01da\u01db\5H%"+
		"\2\u01db\u01dc\7\35\2\2\u01dc\u01dd\b$\1\2\u01ddG\3\2\2\2\u01de\u01e3"+
		"\b%\1\2\u01df\u01e0\5J&\2\u01e0\u01e1\b%\1\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01de\3\2\2\2\u01e2\u01df\3\2\2\2\u01e3I\3\2\2\2\u01e4\u01e5\5L\'\2\u01e5"+
		"\u01ec\b&\1\2\u01e6\u01e7\7\n\2\2\u01e7\u01e8\5L\'\2\u01e8\u01e9\b&\1"+
		"\2\u01e9\u01eb\3\2\2\2\u01ea\u01e6\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f0\b&\1\2\u01f0K\3\2\2\2\u01f1\u01f2\5N(\2\u01f2\u01f7\b\'\1\2\u01f3"+
		"\u01f4\5Z.\2\u01f4\u01f5\5N(\2\u01f5\u01f6\b\'\1\2\u01f6\u01f8\3\2\2\2"+
		"\u01f7\u01f3\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa"+
		"\b\'\1\2\u01faM\3\2\2\2\u01fb\u01fc\5P)\2\u01fc\u0203\b(\1\2\u01fd\u01fe"+
		"\5V,\2\u01fe\u01ff\5P)\2\u01ff\u0200\b(\1\2\u0200\u0202\3\2\2\2\u0201"+
		"\u01fd\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\b(\1\2\u0207"+
		"O\3\2\2\2\u0208\u0209\5R*\2\u0209\u0210\b)\1\2\u020a\u020b\5X-\2\u020b"+
		"\u020c\5R*\2\u020c\u020d\b)\1\2\u020d\u020f\3\2\2\2\u020e\u020a\3\2\2"+
		"\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213"+
		"\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\b)\1\2\u0214Q\3\2\2\2\u0215\u0216"+
		"\5\26\f\2\u0216\u0217\b*\1\2\u0217\u022b\3\2\2\2\u0218\u0219\5@!\2\u0219"+
		"\u021a\b*\1\2\u021a\u022b\3\2\2\2\u021b\u021c\7\34\2\2\u021c\u021d\5L"+
		"\'\2\u021d\u021e\7\35\2\2\u021e\u021f\b*\1\2\u021f\u022b\3\2\2\2\u0220"+
		"\u0221\7\37\2\2\u0221\u0222\5R*\2\u0222\u0223\b*\1\2\u0223\u022b\3\2\2"+
		"\2\u0224\u0225\5F$\2\u0225\u0226\b*\1\2\u0226\u022b\3\2\2\2\u0227\u0228"+
		"\5T+\2\u0228\u0229\b*\1\2\u0229\u022b\3\2\2\2\u022a\u0215\3\2\2\2\u022a"+
		"\u0218\3\2\2\2\u022a\u021b\3\2\2\2\u022a\u0220\3\2\2\2\u022a\u0224\3\2"+
		"\2\2\u022a\u0227\3\2\2\2\u022bS\3\2\2\2\u022c\u022d\5\u0084C\2\u022d\u022e"+
		"\b+\1\2\u022e\u0242\3\2\2\2\u022f\u0230\5\u0086D\2\u0230\u0231\b+\1\2"+
		"\u0231\u0242\3\2\2\2\u0232\u0233\5\u0088E\2\u0233\u0234\b+\1\2\u0234\u0242"+
		"\3\2\2\2\u0235\u0236\5\u0094K\2\u0236\u0237\b+\1\2\u0237\u0242\3\2\2\2"+
		"\u0238\u0239\5\u0090I\2\u0239\u023a\b+\1\2\u023a\u0242\3\2\2\2\u023b\u023c"+
		"\5\u0092J\2\u023c\u023d\b+\1\2\u023d\u0242\3\2\2\2\u023e\u023f\5\u008a"+
		"F\2\u023f\u0240\b+\1\2\u0240\u0242\3\2\2\2\u0241\u022c\3\2\2\2\u0241\u022f"+
		"\3\2\2\2\u0241\u0232\3\2\2\2\u0241\u0235\3\2\2\2\u0241\u0238\3\2\2\2\u0241"+
		"\u023b\3\2\2\2\u0241\u023e\3\2\2\2\u0242U\3\2\2\2\u0243\u0244\7\24\2\2"+
		"\u0244\u024c\b,\1\2\u0245\u0246\7\25\2\2\u0246\u024c\b,\1\2\u0247\u0248"+
		"\7 \2\2\u0248\u024c\b,\1\2\u0249\u024a\7!\2\2\u024a\u024c\b,\1\2\u024b"+
		"\u0243\3\2\2\2\u024b\u0245\3\2\2\2\u024b\u0247\3\2\2\2\u024b\u0249\3\2"+
		"\2\2\u024cW\3\2\2\2\u024d\u024e\7\"\2\2\u024e\u0256\b-\1\2\u024f\u0250"+
		"\7#\2\2\u0250\u0256\b-\1\2\u0251\u0252\7$\2\2\u0252\u0256\b-\1\2\u0253"+
		"\u0254\7%\2\2\u0254\u0256\b-\1\2\u0255\u024d\3\2\2\2\u0255\u024f\3\2\2"+
		"\2\u0255\u0251\3\2\2\2\u0255\u0253\3\2\2\2\u0256Y\3\2\2\2\u0257\u0258"+
		"\7&\2\2\u0258\u0266\b.\1\2\u0259\u025a\7\'\2\2\u025a\u0266\b.\1\2\u025b"+
		"\u025c\7(\2\2\u025c\u0266\b.\1\2\u025d\u025e\7)\2\2\u025e\u0266\b.\1\2"+
		"\u025f\u0260\7*\2\2\u0260\u0266\b.\1\2\u0261\u0262\7+\2\2\u0262\u0266"+
		"\b.\1\2\u0263\u0264\7,\2\2\u0264\u0266\b.\1\2\u0265\u0257\3\2\2\2\u0265"+
		"\u0259\3\2\2\2\u0265\u025b\3\2\2\2\u0265\u025d\3\2\2\2\u0265\u025f\3\2"+
		"\2\2\u0265\u0261\3\2\2\2\u0265\u0263\3\2\2\2\u0266[\3\2\2\2\u0267\u0268"+
		"\5^\60\2\u0268\u0269\7\34\2\2\u0269\u026a\5`\61\2\u026a\u026b\7\35\2\2"+
		"\u026b\u026c\b/\1\2\u026c]\3\2\2\2\u026d\u026e\7-\2\2\u026e\u0272\b\60"+
		"\1\2\u026f\u0270\7.\2\2\u0270\u0272\b\60\1\2\u0271\u026d\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0272_\3\2\2\2\u0273\u0278\3\2\2\2\u0274\u0275\5L\'\2\u0275"+
		"\u0276\b\61\1\2\u0276\u0278\3\2\2\2\u0277\u0273\3\2\2\2\u0277\u0274\3"+
		"\2\2\2\u0278a\3\2\2\2\u0279\u027a\7/\2\2\u027a\u027b\7\34\2\2\u027b\u027c"+
		"\5\u009aN\2\u027c\u027d\7\35\2\2\u027d\u027e\b\62\1\2\u027ec\3\2\2\2\u027f"+
		"\u0280\5h\65\2\u0280\u0281\b\63\1\2\u0281e\3\2\2\2\u0282\u0283\5l\67\2"+
		"\u0283\u0284\b\64\1\2\u0284\u0289\3\2\2\2\u0285\u0286\5~@\2\u0286\u0287"+
		"\b\64\1\2\u0287\u0289\3\2\2\2\u0288\u0282\3\2\2\2\u0288\u0285\3\2\2\2"+
		"\u0289g\3\2\2\2\u028a\u028b\7\60\2\2\u028b\u028c\7\34\2\2\u028c\u028d"+
		"\5L\'\2\u028d\u028e\7\35\2\2\u028e\u028f\b\65\1\2\u028f\u0290\7\61\2\2"+
		"\u0290\u0291\7\4\2\2\u0291\u0292\5:\36\2\u0292\u0293\7\7\2\2\u0293\u0294"+
		"\5j\66\2\u0294i\3\2\2\2\u0295\u029e\b\66\1\2\u0296\u0297\7\62\2\2\u0297"+
		"\u0298\7\4\2\2\u0298\u0299\b\66\1\2\u0299\u029a\5:\36\2\u029a\u029b\b"+
		"\66\1\2\u029b\u029c\7\7\2\2\u029c\u029e\3\2\2\2\u029d\u0295\3\2\2\2\u029d"+
		"\u0296\3\2\2\2\u029ek\3\2\2\2\u029f\u02a0\7\63\2\2\u02a0\u02a1\7\34\2"+
		"\2\u02a1\u02a2\5n8\2\u02a2\u02a3\7\35\2\2\u02a3\u02a4\5x=\2\u02a4\u02a5"+
		"\b\67\1\2\u02a5\u02a6\5|?\2\u02a6\u02a7\b\67\1\2\u02a7\u02a8\7\4\2\2\u02a8"+
		"\u02a9\5:\36\2\u02a9\u02aa\7\7\2\2\u02aa\u02ab\b\67\1\2\u02abm\3\2\2\2"+
		"\u02ac\u02ad\5\u009aN\2\u02ad\u02ae\5p9\2\u02ae\u02af\b8\1\2\u02afo\3"+
		"\2\2\2\u02b0\u02b1\7,\2\2\u02b1\u02b2\5r:\2\u02b2\u02b3\b9\1\2\u02b3\u02b9"+
		"\3\2\2\2\u02b4\u02b5\7\64\2\2\u02b5\u02b6\5\u009aN\2\u02b6\u02b7\b9\1"+
		"\2\u02b7\u02b9\3\2\2\2\u02b8\u02b0\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b9q"+
		"\3\2\2\2\u02ba\u02bb\5t;\2\u02bb\u02bc\7\65\2\2\u02bc\u02bd\5v<\2\u02bd"+
		"\u02be\b:\1\2\u02bes\3\2\2\2\u02bf\u02c0\5\u0098M\2\u02c0\u02c1\b;\1\2"+
		"\u02c1\u02c6\3\2\2\2\u02c2\u02c3\5\u009aN\2\u02c3\u02c4\b;\1\2\u02c4\u02c6"+
		"\3\2\2\2\u02c5\u02bf\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c6u\3\2\2\2\u02c7"+
		"\u02c8\5\u0098M\2\u02c8\u02c9\b<\1\2\u02c9\u02ce\3\2\2\2\u02ca\u02cb\5"+
		"\u009aN\2\u02cb\u02cc\b<\1\2\u02cc\u02ce\3\2\2\2\u02cd\u02c7\3\2\2\2\u02cd"+
		"\u02ca\3\2\2\2\u02cew\3\2\2\2\u02cf\u02d5\b=\1\2\u02d0\u02d1\5z>\2\u02d1"+
		"\u02d2\5\u0098M\2\u02d2\u02d3\b=\1\2\u02d3\u02d5\3\2\2\2\u02d4\u02cf\3"+
		"\2\2\2\u02d4\u02d0\3\2\2\2\u02d5y\3\2\2\2\u02d6\u02d7\7\66\2\2\u02d7\u02da"+
		"\b>\1\2\u02d8\u02da\7\67\2\2\u02d9\u02d6\3\2\2\2\u02d9\u02d8\3\2\2\2\u02da"+
		"{\3\2\2\2\u02db\u02e1\b?\1\2\u02dc\u02dd\78\2\2\u02dd\u02de\5L\'\2\u02de"+
		"\u02df\b?\1\2\u02df\u02e1\3\2\2\2\u02e0\u02db\3\2\2\2\u02e0\u02dc\3\2"+
		"\2\2\u02e1}\3\2\2\2\u02e2\u02e3\79\2\2\u02e3\u02e4\7\34\2\2\u02e4\u02e5"+
		"\5L\'\2\u02e5\u02e6\7\35\2\2\u02e6\u02e7\b@\1\2\u02e7\u02e8\7\4\2\2\u02e8"+
		"\u02e9\5:\36\2\u02e9\u02ea\7\7\2\2\u02ea\u02eb\b@\1\2\u02eb\177\3\2\2"+
		"\2\u02ec\u02ed\5\u0082B\2\u02ed\u02ee\5\u009aN\2\u02ee\u02ef\bA\1\2\u02ef"+
		"\u0081\3\2\2\2\u02f0\u02f1\7:\2\2\u02f1\u02f5\bB\1\2\u02f2\u02f3\7;\2"+
		"\2\u02f3\u02f5\bB\1\2\u02f4\u02f0\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u0083"+
		"\3\2\2\2\u02f6\u02f7\7<\2\2\u02f7\u02f8\7\34\2\2\u02f8\u02f9\5L\'\2\u02f9"+
		"\u02fa\7\35\2\2\u02fa\u02fb\bC\1\2\u02fb\u0085\3\2\2\2\u02fc\u02fd\7="+
		"\2\2\u02fd\u02fe\7\34\2\2\u02fe\u02ff\5L\'\2\u02ff\u0300\7\35\2\2\u0300"+
		"\u0301\bD\1\2\u0301\u0087\3\2\2\2\u0302\u0303\7>\2\2\u0303\u0304\7\34"+
		"\2\2\u0304\u0305\5L\'\2\u0305\u0306\7\n\2\2\u0306\u0307\5L\'\2\u0307\u0308"+
		"\7\35\2\2\u0308\u0309\bE\1\2\u0309\u0089\3\2\2\2\u030a\u030b\7?\2\2\u030b"+
		"\u030c\7\34\2\2\u030c\u030d\5L\'\2\u030d\u030e\7\n\2\2\u030e\u030f\5L"+
		"\'\2\u030f\u0310\7\35\2\2\u0310\u0311\bF\1\2\u0311\u008b\3\2\2\2\u0312"+
		"\u0313\7@\2\2\u0313\u0314\7\34\2\2\u0314\u0315\5\u009aN\2\u0315\u0316"+
		"\7\n\2\2\u0316\u0317\5\u009aN\2\u0317\u0318\7\35\2\2\u0318\u0319\bG\1"+
		"\2\u0319\u008d\3\2\2\2\u031a\u031b\7A\2\2\u031b\u031c\7\34\2\2\u031c\u031d"+
		"\5\u009aN\2\u031d\u031e\7\n\2\2\u031e\u031f\5\u009aN\2\u031f\u0320\7\35"+
		"\2\2\u0320\u0321\bH\1\2\u0321\u008f\3\2\2\2\u0322\u0323\7B\2\2\u0323\u0324"+
		"\7\34\2\2\u0324\u0325\5L\'\2\u0325\u0326\7\35\2\2\u0326\u0327\bI\1\2\u0327"+
		"\u0091\3\2\2\2\u0328\u0329\7C\2\2\u0329\u032a\7\34\2\2\u032a\u032b\5L"+
		"\'\2\u032b\u032c\7\35\2\2\u032c\u032d\bJ\1\2\u032d\u0093\3\2\2\2\u032e"+
		"\u032f\7D\2\2\u032f\u0330\7\34\2\2\u0330\u0331\5L\'\2\u0331\u0332\7\n"+
		"\2\2\u0332\u0333\5\u009aN\2\u0333\u0334\7\35\2\2\u0334\u0335\bK\1\2\u0335"+
		"\u0095\3\2\2\2\u0336\u0337\7H\2\2\u0337\u0097\3\2\2\2\u0338\u0339\7E\2"+
		"\2\u0339\u033a\bM\1\2\u033a\u0099\3\2\2\2\u033b\u033c\7F\2\2\u033c\u033d"+
		"\bN\1\2\u033d\u009b\3\2\2\2-\u00af\u00b6\u00c9\u00d7\u00e6\u00f0\u0101"+
		"\u010b\u0110\u0120\u0129\u0134\u013e\u0150\u016c\u0176\u0185\u018d\u0195"+
		"\u01b8\u01c9\u01d3\u01e2\u01ec\u01f7\u0203\u0210\u022a\u0241\u024b\u0255"+
		"\u0265\u0271\u0277\u0288\u029d\u02b8\u02c5\u02cd\u02d4\u02d9\u02e0\u02f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}