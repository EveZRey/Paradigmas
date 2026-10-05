opA = lambda: sum(range(101))
opB = lambda: sum(range(200))

def elegirOp(condicion, op1, op2):
    if condicion == "A":
        return op1()
    else:
        return op2()

print(elegirOp("A", opA, opB))
