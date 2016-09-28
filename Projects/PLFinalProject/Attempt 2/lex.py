#------------------------------------------------------------
# lex.py
#
# tokenizer
# ------------------------------------------------------------

import ply.lex as lex

# Reserved words
reserved = {
    'if'     : 'IF',
    'iff'    : 'IFF',
    'else'   : 'ELSE',
    'while'  : 'WHILE',
    'for'    : 'FOR',
    'float'  : 'FLOAT',
    'bool'   : 'BOOL',
    'void'   : 'VOID',
    'list'   : 'LIST',
    'tuple'  : 'TUPLE',
    'object' : 'OBJECT',
    'string' : 'STRING',
    'return' : 'RETURN',
    'true'   : 'TRUE',
    'false'  : 'FALSE',
    'var'    : 'VAR',
    'nil'    : 'NIL',
    'let'    : 'LET',
}

# List of token names.
tokens = [
             'AND_OP', 'ID', 'TEXT', 'OR_OP', 'LPAREN', 'RPAREN', 'LBRACE', 'REV_DIV', 'RBRACE', 'LCURLY', 'RCURLY', \
             'SEMI', 'EQ_OP', 'NE_OP', 'LE_OP', 'GE_OP', 'ELEM', 'PIPE', 'EQUALS', \
             'LT_OP', 'GT_OP', 'PRCNT', 'BANG', \
             'COMMA', 'SQUOTE', 'LAMBDA', 'MAP_TO', \
             'INT', 'IDENTIFIER', 'CLFLOAT', 'CLSTRING',  \
             ] + list(reserved.values())

# Regular expression rules for simple tokens
t_AND_OP = r'&&'
t_OR_OP  = r'\|\|'
t_LPAREN = r'\('
t_RPAREN = r'\)'
t_LBRACE = r'\['
t_REV_DIV = r'\\'
t_RBRACE = r']'
t_LCURLY = r'{'
t_RCURLY = r'}'
t_SEMI   = r';'
t_EQ_OP  = r'=='
t_NE_OP  = r'!='
t_LE_OP  = r'<='
t_GE_OP  = r'>='
t_ELEM   = r'<-'
t_PIPE   = r'\|'
t_EQUALS = r'='
t_LT_OP  = r'<'
t_GT_OP  = r'>'
t_PRCNT  = r'%'
t_BANG   = r'!'
t_COMMA  = r','
t_SQUOTE = r"'"
t_MAP_TO = r'->'


def t_FLOAT(t):
    r'-?[0-9]\d*(\.\d+)'
    try:
        t.value = float(t.value)
    except ValueError:
        print "Line %d: Float Number %s is too large!" % (t.lineno,t.value)
        t.value = 0
    return t

def t_INT(t):
    r'-?\d+'
    # added -? for negative numbers
    try:
        t.value = int(t.value)
    except ValueError:
        print "Line %d: Integer Number %s is too large!" % (t.lineno,t.value)
        t.value = 0
    return t


def t_ID(t):
    r'[a-zA-Z_\+\*\/-][a-zA-Z0-9_]*'
    t.type = reserved.get(t.value,'ID')    # Check for reserved words
    return t

def t_TEXT(t):
    r'"[a-zA-Z0-9_+\*\- :,]*"'
    t.type = reserved.get(t.value,'TEXT')    # Check for reserved words
    return t

# Define a rule so we can track line numbers
def t_newline(t):
    r'\n+'
    t.lexer.lineno += len(t.value)

# A string containing ignored characters (spaces and tabs)
t_ignore  = ' \t'

# Error handling rule
def t_error(t):
    print "Illegal character '%s'" % t.value[0]
    t.lexer.skip(1)

# Build the lexer
lex.lex()

if __name__ == '__main__':
    lex.runmain()
