def aplicarFun(fun, x, y):
    return fun(x,y)

def sum(x,y):
    return x + y

def mul(x, y):
    return x * y

resultadoSum = aplicarFun(sum,555,33)
resultadoMul = aplicarFun(mul,562,34)

print(f"Resultado de la suma: {resultadoSum}, resultado de la multiplicación {resultadoMul}")
