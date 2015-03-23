// Generated from /Users/damienvaz/IdeaProjects/liss/src/Application/Liss.g4 by ANTLR 4.5
package Application;

    import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LissParser}.
 */
public interface LissListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LissParser#liss}.
	 * @param ctx the parse tree
	 */
	void enterLiss(@NotNull LissParser.LissContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#liss}.
	 * @param ctx the parse tree
	 */
	void exitLiss(@NotNull LissParser.LissContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull LissParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull LissParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull LissParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull LissParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull LissParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull LissParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(@NotNull LissParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(@NotNull LissParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(@NotNull LissParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(@NotNull LissParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull LissParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull LissParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#value_var}.
	 * @param ctx the parse tree
	 */
	void enterValue_var(@NotNull LissParser.Value_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#value_var}.
	 * @param ctx the parse tree
	 */
	void exitValue_var(@NotNull LissParser.Value_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull LissParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull LissParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(@NotNull LissParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(@NotNull LissParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#inic_var}.
	 * @param ctx the parse tree
	 */
	void enterInic_var(@NotNull LissParser.Inic_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#inic_var}.
	 * @param ctx the parse tree
	 */
	void exitInic_var(@NotNull LissParser.Inic_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull LissParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull LissParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(@NotNull LissParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(@NotNull LissParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition(@NotNull LissParser.Array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition(@NotNull LissParser.Array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#array_initialization}.
	 * @param ctx the parse tree
	 */
	void enterArray_initialization(@NotNull LissParser.Array_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#array_initialization}.
	 * @param ctx the parse tree
	 */
	void exitArray_initialization(@NotNull LissParser.Array_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(@NotNull LissParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(@NotNull LissParser.ElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#sequence_definition}.
	 * @param ctx the parse tree
	 */
	void enterSequence_definition(@NotNull LissParser.Sequence_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#sequence_definition}.
	 * @param ctx the parse tree
	 */
	void exitSequence_definition(@NotNull LissParser.Sequence_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#sequence_initialization}.
	 * @param ctx the parse tree
	 */
	void enterSequence_initialization(@NotNull LissParser.Sequence_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#sequence_initialization}.
	 * @param ctx the parse tree
	 */
	void exitSequence_initialization(@NotNull LissParser.Sequence_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(@NotNull LissParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(@NotNull LissParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#set_definition}.
	 * @param ctx the parse tree
	 */
	void enterSet_definition(@NotNull LissParser.Set_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#set_definition}.
	 * @param ctx the parse tree
	 */
	void exitSet_definition(@NotNull LissParser.Set_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#set_initialization}.
	 * @param ctx the parse tree
	 */
	void enterSet_initialization(@NotNull LissParser.Set_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#set_initialization}.
	 * @param ctx the parse tree
	 */
	void exitSet_initialization(@NotNull LissParser.Set_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#subprogram_definition}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_definition(@NotNull LissParser.Subprogram_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#subprogram_definition}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_definition(@NotNull LissParser.Subprogram_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#f_body}.
	 * @param ctx the parse tree
	 */
	void enterF_body(@NotNull LissParser.F_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#f_body}.
	 * @param ctx the parse tree
	 */
	void exitF_body(@NotNull LissParser.F_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void enterFormal_args(@NotNull LissParser.Formal_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void exitFormal_args(@NotNull LissParser.Formal_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#f_args}.
	 * @param ctx the parse tree
	 */
	void enterF_args(@NotNull LissParser.F_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#f_args}.
	 * @param ctx the parse tree
	 */
	void exitF_args(@NotNull LissParser.F_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#formal_arg}.
	 * @param ctx the parse tree
	 */
	void enterFormal_arg(@NotNull LissParser.Formal_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#formal_arg}.
	 * @param ctx the parse tree
	 */
	void exitFormal_arg(@NotNull LissParser.Formal_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(@NotNull LissParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(@NotNull LissParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#returnSubPrg}.
	 * @param ctx the parse tree
	 */
	void enterReturnSubPrg(@NotNull LissParser.ReturnSubPrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#returnSubPrg}.
	 * @param ctx the parse tree
	 */
	void exitReturnSubPrg(@NotNull LissParser.ReturnSubPrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull LissParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull LissParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull LissParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull LissParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull LissParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull LissParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(@NotNull LissParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(@NotNull LissParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#array_access}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(@NotNull LissParser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#array_access}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(@NotNull LissParser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#elem_array}.
	 * @param ctx the parse tree
	 */
	void enterElem_array(@NotNull LissParser.Elem_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#elem_array}.
	 * @param ctx the parse tree
	 */
	void exitElem_array(@NotNull LissParser.Elem_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull LissParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull LissParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#sub_prg_args}.
	 * @param ctx the parse tree
	 */
	void enterSub_prg_args(@NotNull LissParser.Sub_prg_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#sub_prg_args}.
	 * @param ctx the parse tree
	 */
	void exitSub_prg_args(@NotNull LissParser.Sub_prg_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull LissParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull LissParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull LissParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull LissParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#single_expression}.
	 * @param ctx the parse tree
	 */
	void enterSingle_expression(@NotNull LissParser.Single_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#single_expression}.
	 * @param ctx the parse tree
	 */
	void exitSingle_expression(@NotNull LissParser.Single_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull LissParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull LissParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull LissParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull LissParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#specialFunctions}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunctions(@NotNull LissParser.SpecialFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#specialFunctions}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunctions(@NotNull LissParser.SpecialFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(@NotNull LissParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(@NotNull LissParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void enterMul_op(@NotNull LissParser.Mul_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void exitMul_op(@NotNull LissParser.Mul_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(@NotNull LissParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(@NotNull LissParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(@NotNull LissParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(@NotNull LissParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void enterWrite_expr(@NotNull LissParser.Write_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void exitWrite_expr(@NotNull LissParser.Write_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#print_what}.
	 * @param ctx the parse tree
	 */
	void enterPrint_what(@NotNull LissParser.Print_whatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#print_what}.
	 * @param ctx the parse tree
	 */
	void exitPrint_what(@NotNull LissParser.Print_whatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead_statement(@NotNull LissParser.Read_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead_statement(@NotNull LissParser.Read_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(@NotNull LissParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(@NotNull LissParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#iterative_statement}.
	 * @param ctx the parse tree
	 */
	void enterIterative_statement(@NotNull LissParser.Iterative_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#iterative_statement}.
	 * @param ctx the parse tree
	 */
	void exitIterative_statement(@NotNull LissParser.Iterative_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#if_then_else_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else_stat(@NotNull LissParser.If_then_else_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#if_then_else_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else_stat(@NotNull LissParser.If_then_else_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#else_expression}.
	 * @param ctx the parse tree
	 */
	void enterElse_expression(@NotNull LissParser.Else_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#else_expression}.
	 * @param ctx the parse tree
	 */
	void exitElse_expression(@NotNull LissParser.Else_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(@NotNull LissParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(@NotNull LissParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(@NotNull LissParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(@NotNull LissParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#type_interval}.
	 * @param ctx the parse tree
	 */
	void enterType_interval(@NotNull LissParser.Type_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#type_interval}.
	 * @param ctx the parse tree
	 */
	void exitType_interval(@NotNull LissParser.Type_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull LissParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull LissParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#minimum}.
	 * @param ctx the parse tree
	 */
	void enterMinimum(@NotNull LissParser.MinimumContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#minimum}.
	 * @param ctx the parse tree
	 */
	void exitMinimum(@NotNull LissParser.MinimumContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#maximum}.
	 * @param ctx the parse tree
	 */
	void enterMaximum(@NotNull LissParser.MaximumContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#maximum}.
	 * @param ctx the parse tree
	 */
	void exitMaximum(@NotNull LissParser.MaximumContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(@NotNull LissParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(@NotNull LissParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#up_down}.
	 * @param ctx the parse tree
	 */
	void enterUp_down(@NotNull LissParser.Up_downContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#up_down}.
	 * @param ctx the parse tree
	 */
	void exitUp_down(@NotNull LissParser.Up_downContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#satisfy}.
	 * @param ctx the parse tree
	 */
	void enterSatisfy(@NotNull LissParser.SatisfyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#satisfy}.
	 * @param ctx the parse tree
	 */
	void exitSatisfy(@NotNull LissParser.SatisfyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(@NotNull LissParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(@NotNull LissParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#succ_or_pred}.
	 * @param ctx the parse tree
	 */
	void enterSucc_or_pred(@NotNull LissParser.Succ_or_predContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#succ_or_pred}.
	 * @param ctx the parse tree
	 */
	void exitSucc_or_pred(@NotNull LissParser.Succ_or_predContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#succ_pred}.
	 * @param ctx the parse tree
	 */
	void enterSucc_pred(@NotNull LissParser.Succ_predContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#succ_pred}.
	 * @param ctx the parse tree
	 */
	void exitSucc_pred(@NotNull LissParser.Succ_predContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(@NotNull LissParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(@NotNull LissParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(@NotNull LissParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(@NotNull LissParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#cons}.
	 * @param ctx the parse tree
	 */
	void enterCons(@NotNull LissParser.ConsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#cons}.
	 * @param ctx the parse tree
	 */
	void exitCons(@NotNull LissParser.ConsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull LissParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull LissParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#copy_statement}.
	 * @param ctx the parse tree
	 */
	void enterCopy_statement(@NotNull LissParser.Copy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#copy_statement}.
	 * @param ctx the parse tree
	 */
	void exitCopy_statement(@NotNull LissParser.Copy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#cat_statement}.
	 * @param ctx the parse tree
	 */
	void enterCat_statement(@NotNull LissParser.Cat_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#cat_statement}.
	 * @param ctx the parse tree
	 */
	void exitCat_statement(@NotNull LissParser.Cat_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#is_empty}.
	 * @param ctx the parse tree
	 */
	void enterIs_empty(@NotNull LissParser.Is_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#is_empty}.
	 * @param ctx the parse tree
	 */
	void exitIs_empty(@NotNull LissParser.Is_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(@NotNull LissParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(@NotNull LissParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(@NotNull LissParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(@NotNull LissParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull LissParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull LissParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull LissParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull LissParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull LissParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull LissParser.IdentifierContext ctx);
}