tokens = ('YANG', 'KIM')

# Tokens
t_YANG = r'^[a-zA-Z]+\yang'
t_KIM = r'^[a-zA-Z]+\kim'


# Ignored characters
t_ignore = " \r\n"

def t_newline(t):
    r'\n+'
    t.lexer.lineno += t.value.count("\n")

def t_error(t):
    print("Illegal character '%s'" % t.value[0])
    t.lexer.skip(1)

# Build the lexer
import ply.lex as lex   # ply.lex comes from the ply folder in the PLY download.
lexer = lex.lex()

# Parsing rules

#global time_step
#time_step = 0

def p_start(t):
    '''start : yang
             | kim
    '''

def p_yang(t):
    'yang : YANG'
    print "Saw yang: " + str(t[1])

def p_kim(t):
    'kim : KIM'
    print "Saw kim: " + str(t[1])

def p_error(t):
    if t == None:
        print("Syntax error at '%s'" % t)
    else:
        print("Syntax error at '%s'" % t.value)


import ply.yacc as yacc   # ply.yacc comes from the ply folder in the PLY download.
parser = yacc.yacc()


while True:
    try:
        s = raw_input('')
    except EOFError:
        break
    parser.parse(s)


    # To run the parser do the following in a terminal window: cat plyParserInputs/file.out | python FredParse.py