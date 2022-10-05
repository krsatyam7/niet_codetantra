op = {"+", "-", "*", "/", "(", ",", ")", "^", }


def eval_postf(exp):
    stack = []
    for i in exp:
        if i not in op:
            stack.append(i)
        else:
            a = int(stack.pop())
            b = int(stack.pop())

            if i == "+":
                res = b+a
            elif i == "-":
                res = b-a
            elif i == "*":
                res = b*a
            elif i == "%":
                res = b % a
            elif i == "/":
                res = b/a
            elif i == "**":
                res = b**a

            stack.append(res)
    return "".join(map(str, stack))


exp = input("Enter Postfix expression")
print(f"Result of Postfix expression {exp} is", eval_postf(exp))
