def h(x):
    return 4 * x + 11

def g(x, h):
   return 6 * h(x) + 1
   
def enca(x, g):
    return 8 * g(x, h) + 20

a = int(input())   
reSuma = enca(a, g)
print(reSuma)
