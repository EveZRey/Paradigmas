def genNum():
    print("Generando 1")
    yield 1 
    print("Generando 2")
    yield 2
    print("Generando 3")
    yield 3

gen = genNum()

print(f"Recibido: {next(gen)}")
#print(f"Recibido: {next(gen)}")
#print(f"Recibido: {next(gen)}")
