import sys
expr = sys.argv[1]
def evaluate(expr):
    # write code from here
    st = []
    expr = expr.split()
    expr = expr[::-1]
    for elem in expr:
        if elem not in "+-*/":  
            st.append(elem) 
        else:   
            y = st.pop()    
            x = st.pop()
            st.append(str(int(eval(y+elem+x))))
    return st.pop()
    # ends here
print(evaluate(expr))
