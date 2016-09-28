import ply.yacc as yacc

# Get the token map from the lexer.  This is required.
from lex import tokens

DEBUG = False

# Namespace & built-in functions

name = {}
let_dict = {}

global ast
ast = []

# BNF


def p_call(p):
    '''call : declaration
            | oper'''
    global ast
    if DEBUG: print "Calling", p[1], "with", p[2]
    ast = p[1]
    p[0] = ast

def p_oper(p):
    '''oper : INT ID INT
            | FLOAT ID FLOAT
            | ID ID INT
            | ID ID ID
            | INT ID ID'''
    p[0]=[p[2], p[1],p[3]]

def p_declaration(p):
    '''declaration : VAR ID EQUALS num
                 | LET ID EQUALS num
                 | LET ID EQUALS TEXT
                 | VAR ID EQUALS TEXT'''
    if p[1]== 'let':
        if p[2] in let_dict:
            p_error(p)
        else:
            p[0] = [p[1], p[2], p[4]]
            let_dict[p[2]] = p[4]
    else:
        p[0] = [p[1], p[2], p[4]]

def p_num(p):
    '''num : INT
           | FLOAT'''
    p[0] = p[1]


# Error rule for syntax errors
def p_error(p):
    print "Syntax error!! ",p

# Build the parser
# Use this if you want to build the parser using SLR instead of LALR
# yacc.yacc(method="SLR")
yacc.yacc()


