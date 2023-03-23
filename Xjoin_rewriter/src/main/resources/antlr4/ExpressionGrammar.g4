grammar ExpressionGrammar ;

@header {
package parsers;
}

/*Rules*/
//prog :	(exp)+  EOF;
//exp:	exp OP exp      #Expr_Binary
//    |	number          #Expr_Number
//    |   variable        #Expr_Variable
//    |	LPR exp RPR     #Expr_Parentheses
//    ;
//number:
// NUM
//;
//variable:
//ID
//;
//
///*Tokens*/
//LPR: '(';
//RPR: ')';
//OP : ('*'|'/' | '+');
//ID : [a-zA-Z][a-zA-Z_0-9]*;
//NUM :  '0' | '-'?[1-9][0-9]* ;
//WS: [ \t\n\r]+ -> skip;

/*Rules*/
prog	: xq EOF
		;
		
xq		:	var					#Xq_Var
		| 	STRINGCONSTANT 		#Xq_String
		| 	ap					#Xq_Ap
		|	'(' xq ')'			#Xq_Parentheses
		| 	xq ',' xq 			#Xq_Concat
		| 	xq '/' rp 			#Xq_Children
		|	xq '//' rp			#Xq_Descendent
		|	'<' tagName '>' '{' xq '}' '</' tagName '>' 		#Xq_tags
		|	letClause xq		#Xq_LetClause
		|	forClause letClause? whereClause? returnClause		#Xq_FLWR
		;
		
letClause 	: 'let' var ':=' xq (',' var ':=' xq)*
			;
			
forClause 	: 'for' var 'in' xq (',' var 'in' xq)*
			;
		
whereClause	: 'where' cond
			;
			
returnClause: 'return' xq
			;

cond 	:	xq EQ xq			#Cond_XqEqual
		|	xq IS xq 			#Cond_XqIs
		|	'empty' '(' xq ')'		#Cond_Empty
		|	'some' var 'in' xq (',' var 'in' xq)* 'satisfies' cond	#Cond_SomeSatisfies
		|	'(' cond ')' 		#Cond_Parentheses
		|	cond 'and' cond 	#Cond_And
		| 	cond 'or' cond 		#Cond_Or
		|	'not' cond			#Cond_Not
		;
		
var		:  	'$' WORD
		;		

ap		:	doc 		#Ap_doc
		|	doc '/' rp	#Ap_Children
		|	doc '//' rp	#Ap_Descendants
		;
		
doc		:	DOC '(' fileName ')' #Document 
		;
	
rp 		:	tagName				#Rp_Tagname
		|	'*'					#Rp_Children
		|	'.'					#Rp_Self
		|	'..'				#Rp_Parent
		|	'text()'			#Rp_text
		|	'@' attName			#Rp_Attribute
		|	'(' rp ')'			#Rp_Rp
		|	rp '/' rp			#Rp_RpChildren
		|	rp '//' rp 			#Rp_RpDescendant
		| 	rp '[' filter ']'	#Rp_Filter
		| 	rp ',' rp			#Rp_Concat
		;
	
filter	:	rp						#Fltr_Rp	
		|	rp EQ rp 				#Fltr_RpEqual	
		|	rp IS rp 				#Fltr_RpIs
		|	rp EQ STRINGCONSTANT	#Fltr_RpIsStringConstant
		|	'(' filter ')'			#Fltr_Parenthesis
		| 	filter 'and' filter		#Fltr_And
		|	filter 'or' filter		#Fltr_Or
		|	'not' filter			#Fltr_not
		;

/* Tokens */
DOC: [dD][oO][cC] | 'document';
fileName: STRINGCONSTANT;
tagName: WORD;
attName: WORD;
EQ: 'eq' | '=';
IS: 'is' | '==';
WORD: [_a-zA-Z][a-zA-Z_0-9-]*;
STRINGCONSTANT: '"'[a-zA-Z0-9_ .,!?;'"-]+'"';
WS: [ \t\r\n]+ -> skip;
