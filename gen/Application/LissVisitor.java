// Generated from /Developer/Github/Liss-SDE/src/Application/Liss.g4 by ANTLR 4.5.1
package Application;

    import java.util.HashMap;
    import java.util.LinkedList;
    import Application.SymbolTable.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LissParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LissVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LissParser#liss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiss(LissParser.LissContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LissParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(LissParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(LissParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(LissParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LissParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#value_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_var(LissParser.Value_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LissParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#typeReturnSubProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReturnSubProgram(LissParser.TypeReturnSubProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(LissParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#inic_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInic_var(LissParser.Inic_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(LissParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(LissParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#array_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_definition(LissParser.Array_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#array_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_initialization(LissParser.Array_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem(LissParser.ElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#sequence_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_definition(LissParser.Sequence_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#sequence_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_initialization(LissParser.Sequence_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(LissParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#set_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_definition(LissParser.Set_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#set_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_initialization(LissParser.Set_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#subprogram_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_definition(LissParser.Subprogram_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#f_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_body(LissParser.F_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#formal_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_args(LissParser.Formal_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#f_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF_args(LissParser.F_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#formal_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_arg(LissParser.Formal_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(LissParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#returnSubPrg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnSubPrg(LissParser.ReturnSubPrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(LissParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LissParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LissParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(LissParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#array_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access(LissParser.Array_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#elem_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_array(LissParser.Elem_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(LissParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#sub_prg_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_prg_args(LissParser.Sub_prg_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LissParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LissParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#single_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_expression(LissParser.Single_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(LissParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(LissParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#specialFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunctions(LissParser.SpecialFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(LissParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#mul_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_op(LissParser.Mul_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(LissParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#write_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_statement(LissParser.Write_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#write_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_expr(LissParser.Write_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#print_what}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_what(LissParser.Print_whatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#read_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_statement(LissParser.Read_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(LissParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#iterative_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterative_statement(LissParser.Iterative_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#if_then_else_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else_stat(LissParser.If_then_else_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#else_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_expression(LissParser.Else_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(LissParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(LissParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#type_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_interval(LissParser.Type_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(LissParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#minimum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinimum(LissParser.MinimumContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#maximum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaximum(LissParser.MaximumContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(LissParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#up_down}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUp_down(LissParser.Up_downContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#satisfy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSatisfy(LissParser.SatisfyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(LissParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#succ_or_pred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSucc_or_pred(LissParser.Succ_or_predContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#succ_pred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSucc_pred(LissParser.Succ_predContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(LissParser.TailContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(LissParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons(LissParser.ConsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(LissParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#copy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_statement(LissParser.Copy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#cat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCat_statement(LissParser.Cat_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#is_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_empty(LissParser.Is_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(LissParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(LissParser.MemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LissParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LissParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LissParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LissParser.IdentifierContext ctx);
}