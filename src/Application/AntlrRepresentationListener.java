// Generated from /Developer/Github/Liss-SDE/src/Application/AntlrRepresentation.g4 by ANTLR 4.5.1
package Application;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrRepresentationParser}.
 */
public interface AntlrRepresentationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#grammarContextFree}.
	 * @param ctx the parse tree
	 */
	void enterGrammarContextFree(AntlrRepresentationParser.GrammarContextFreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#grammarContextFree}.
	 * @param ctx the parse tree
	 */
	void exitGrammarContextFree(AntlrRepresentationParser.GrammarContextFreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#gramarline}.
	 * @param ctx the parse tree
	 */
	void enterGramarline(AntlrRepresentationParser.GramarlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#gramarline}.
	 * @param ctx the parse tree
	 */
	void exitGramarline(AntlrRepresentationParser.GramarlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#startsymbol}.
	 * @param ctx the parse tree
	 */
	void enterStartsymbol(AntlrRepresentationParser.StartsymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#startsymbol}.
	 * @param ctx the parse tree
	 */
	void exitStartsymbol(AntlrRepresentationParser.StartsymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#sentences}.
	 * @param ctx the parse tree
	 */
	void enterSentences(AntlrRepresentationParser.SentencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#sentences}.
	 * @param ctx the parse tree
	 */
	void exitSentences(AntlrRepresentationParser.SentencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(AntlrRepresentationParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(AntlrRepresentationParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(AntlrRepresentationParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(AntlrRepresentationParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(AntlrRepresentationParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(AntlrRepresentationParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#recursivity}.
	 * @param ctx the parse tree
	 */
	void enterRecursivity(AntlrRepresentationParser.RecursivityContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#recursivity}.
	 * @param ctx the parse tree
	 */
	void exitRecursivity(AntlrRepresentationParser.RecursivityContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#nonterminal}.
	 * @param ctx the parse tree
	 */
	void enterNonterminal(AntlrRepresentationParser.NonterminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#nonterminal}.
	 * @param ctx the parse tree
	 */
	void exitNonterminal(AntlrRepresentationParser.NonterminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#multiplicity}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicity(AntlrRepresentationParser.MultiplicityContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#multiplicity}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicity(AntlrRepresentationParser.MultiplicityContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(AntlrRepresentationParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(AntlrRepresentationParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrRepresentationParser#nameofnonterminal}.
	 * @param ctx the parse tree
	 */
	void enterNameofnonterminal(AntlrRepresentationParser.NameofnonterminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrRepresentationParser#nameofnonterminal}.
	 * @param ctx the parse tree
	 */
	void exitNameofnonterminal(AntlrRepresentationParser.NameofnonterminalContext ctx);
}