// Generated from /Developer/Github/Liss-SDE/src/Application/Liss.g4 by ANTLR 4.5.1
package Application;

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
	void enterLiss(LissParser.LissContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#liss}.
	 * @param ctx the parse tree
	 */
	void exitLiss(LissParser.LissContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LissParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LissParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(LissParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(LissParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LissParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LissParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(LissParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(LissParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(LissParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(LissParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LissParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LissParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#value_var}.
	 * @param ctx the parse tree
	 */
	void enterValue_var(LissParser.Value_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#value_var}.
	 * @param ctx the parse tree
	 */
	void exitValue_var(LissParser.Value_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LissParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LissParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(LissParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(LissParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#inic_var}.
	 * @param ctx the parse tree
	 */
	void enterInic_var(LissParser.Inic_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#inic_var}.
	 * @param ctx the parse tree
	 */
	void exitInic_var(LissParser.Inic_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(LissParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(LissParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(LissParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(LissParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition(LissParser.Array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition(LissParser.Array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#array_initialization}.
	 * @param ctx the parse tree
	 */
	void enterArray_initialization(LissParser.Array_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#array_initialization}.
	 * @param ctx the parse tree
	 */
	void exitArray_initialization(LissParser.Array_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(LissParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(LissParser.ElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#sequence_definition}.
	 * @param ctx the parse tree
	 */
	void enterSequence_definition(LissParser.Sequence_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#sequence_definition}.
	 * @param ctx the parse tree
	 */
	void exitSequence_definition(LissParser.Sequence_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#sequence_initialization}.
	 * @param ctx the parse tree
	 */
	void enterSequence_initialization(LissParser.Sequence_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#sequence_initialization}.
	 * @param ctx the parse tree
	 */
	void exitSequence_initialization(LissParser.Sequence_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(LissParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(LissParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#set_definition}.
	 * @param ctx the parse tree
	 */
	void enterSet_definition(LissParser.Set_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#set_definition}.
	 * @param ctx the parse tree
	 */
	void exitSet_definition(LissParser.Set_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#set_initialization}.
	 * @param ctx the parse tree
	 */
	void enterSet_initialization(LissParser.Set_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#set_initialization}.
	 * @param ctx the parse tree
	 */
	void exitSet_initialization(LissParser.Set_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#subprogram_definition}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_definition(LissParser.Subprogram_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#subprogram_definition}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_definition(LissParser.Subprogram_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#f_body}.
	 * @param ctx the parse tree
	 */
	void enterF_body(LissParser.F_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#f_body}.
	 * @param ctx the parse tree
	 */
	void exitF_body(LissParser.F_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void enterFormal_args(LissParser.Formal_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#formal_args}.
	 * @param ctx the parse tree
	 */
	void exitFormal_args(LissParser.Formal_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#f_args}.
	 * @param ctx the parse tree
	 */
	void enterF_args(LissParser.F_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#f_args}.
	 * @param ctx the parse tree
	 */
	void exitF_args(LissParser.F_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#formal_arg}.
	 * @param ctx the parse tree
	 */
	void enterFormal_arg(LissParser.Formal_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#formal_arg}.
	 * @param ctx the parse tree
	 */
	void exitFormal_arg(LissParser.Formal_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(LissParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(LissParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#returnSubPrg}.
	 * @param ctx the parse tree
	 */
	void enterReturnSubPrg(LissParser.ReturnSubPrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#returnSubPrg}.
	 * @param ctx the parse tree
	 */
	void exitReturnSubPrg(LissParser.ReturnSubPrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(LissParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(LissParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LissParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LissParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LissParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LissParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(LissParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(LissParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#array_access}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(LissParser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#array_access}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(LissParser.Array_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#elem_array}.
	 * @param ctx the parse tree
	 */
	void enterElem_array(LissParser.Elem_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#elem_array}.
	 * @param ctx the parse tree
	 */
	void exitElem_array(LissParser.Elem_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(LissParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(LissParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#sub_prg_args}.
	 * @param ctx the parse tree
	 */
	void enterSub_prg_args(LissParser.Sub_prg_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#sub_prg_args}.
	 * @param ctx the parse tree
	 */
	void exitSub_prg_args(LissParser.Sub_prg_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(LissParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(LissParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LissParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LissParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#single_expression}.
	 * @param ctx the parse tree
	 */
	void enterSingle_expression(LissParser.Single_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#single_expression}.
	 * @param ctx the parse tree
	 */
	void exitSingle_expression(LissParser.Single_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LissParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LissParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LissParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LissParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#specialFunctions}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunctions(LissParser.SpecialFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#specialFunctions}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunctions(LissParser.SpecialFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(LissParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(LissParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void enterMul_op(LissParser.Mul_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void exitMul_op(LissParser.Mul_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(LissParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(LissParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(LissParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(LissParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void enterWrite_expr(LissParser.Write_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#write_expr}.
	 * @param ctx the parse tree
	 */
	void exitWrite_expr(LissParser.Write_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#print_what}.
	 * @param ctx the parse tree
	 */
	void enterPrint_what(LissParser.Print_whatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#print_what}.
	 * @param ctx the parse tree
	 */
	void exitPrint_what(LissParser.Print_whatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead_statement(LissParser.Read_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead_statement(LissParser.Read_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(LissParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(LissParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#iterative_statement}.
	 * @param ctx the parse tree
	 */
	void enterIterative_statement(LissParser.Iterative_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#iterative_statement}.
	 * @param ctx the parse tree
	 */
	void exitIterative_statement(LissParser.Iterative_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#if_then_else_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else_stat(LissParser.If_then_else_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#if_then_else_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else_stat(LissParser.If_then_else_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#else_expression}.
	 * @param ctx the parse tree
	 */
	void enterElse_expression(LissParser.Else_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#else_expression}.
	 * @param ctx the parse tree
	 */
	void exitElse_expression(LissParser.Else_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(LissParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(LissParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(LissParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(LissParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#type_interval}.
	 * @param ctx the parse tree
	 */
	void enterType_interval(LissParser.Type_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#type_interval}.
	 * @param ctx the parse tree
	 */
	void exitType_interval(LissParser.Type_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(LissParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(LissParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#minimum}.
	 * @param ctx the parse tree
	 */
	void enterMinimum(LissParser.MinimumContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#minimum}.
	 * @param ctx the parse tree
	 */
	void exitMinimum(LissParser.MinimumContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#maximum}.
	 * @param ctx the parse tree
	 */
	void enterMaximum(LissParser.MaximumContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#maximum}.
	 * @param ctx the parse tree
	 */
	void exitMaximum(LissParser.MaximumContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(LissParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(LissParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#up_down}.
	 * @param ctx the parse tree
	 */
	void enterUp_down(LissParser.Up_downContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#up_down}.
	 * @param ctx the parse tree
	 */
	void exitUp_down(LissParser.Up_downContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#satisfy}.
	 * @param ctx the parse tree
	 */
	void enterSatisfy(LissParser.SatisfyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#satisfy}.
	 * @param ctx the parse tree
	 */
	void exitSatisfy(LissParser.SatisfyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(LissParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(LissParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#succ_or_pred}.
	 * @param ctx the parse tree
	 */
	void enterSucc_or_pred(LissParser.Succ_or_predContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#succ_or_pred}.
	 * @param ctx the parse tree
	 */
	void exitSucc_or_pred(LissParser.Succ_or_predContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#succ_pred}.
	 * @param ctx the parse tree
	 */
	void enterSucc_pred(LissParser.Succ_predContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#succ_pred}.
	 * @param ctx the parse tree
	 */
	void exitSucc_pred(LissParser.Succ_predContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(LissParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(LissParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(LissParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(LissParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#cons}.
	 * @param ctx the parse tree
	 */
	void enterCons(LissParser.ConsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#cons}.
	 * @param ctx the parse tree
	 */
	void exitCons(LissParser.ConsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(LissParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(LissParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#copy_statement}.
	 * @param ctx the parse tree
	 */
	void enterCopy_statement(LissParser.Copy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#copy_statement}.
	 * @param ctx the parse tree
	 */
	void exitCopy_statement(LissParser.Copy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#cat_statement}.
	 * @param ctx the parse tree
	 */
	void enterCat_statement(LissParser.Cat_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#cat_statement}.
	 * @param ctx the parse tree
	 */
	void exitCat_statement(LissParser.Cat_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#is_empty}.
	 * @param ctx the parse tree
	 */
	void enterIs_empty(LissParser.Is_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#is_empty}.
	 * @param ctx the parse tree
	 */
	void exitIs_empty(LissParser.Is_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(LissParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(LissParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(LissParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(LissParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LissParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LissParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LissParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LissParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LissParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LissParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LissParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LissParser.IdentifierContext ctx);
}