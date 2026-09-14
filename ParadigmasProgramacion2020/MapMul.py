def mul(a, b):
    return a * b
    
print(mul(70,40))
print()

datosMul = lambda a,b: (a * b)
print(datosMul(5,8))
print()

lisMul = list(map(lambda x: (x * x) , [2,4,5,6,7,8]))
print(lisMul)
print()

num = [8,9,10,11,12]
for n in num:
    print((lambda x: x * 2) (n))
print()
    
num = [8,9,10,11,12]
for n in num:
    print((lambda x: x * x) (n))
