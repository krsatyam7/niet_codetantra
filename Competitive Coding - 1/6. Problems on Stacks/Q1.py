import sys
expr = sys.argv[1]
def evaluate(expr):
    # write code from here 
    st = []
    expr = expr.split()
    for elem in expr:
        if elem not in "+-*/":
            st.append(elem)
        else:
            x = st.pop()
            y = st.pop()
            st.append(str(int(eval(y+elem+x))))
    return st.pop()
    # ends here
print(evaluate(expr))
