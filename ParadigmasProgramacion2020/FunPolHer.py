class Animal:
    def hacerSonido(self):
        pass

class Perro(Animal):
    def hacerSonido(self):
        return "Guau guau"

class Gato(Animal):
    def hacerSonido(self):
        return "Miau miau"

def reproducirSonido(animal):
    print(animal.hacerSonido())

perro = Perro()
gato = Gato()

reproducirSonido(perro)
reproducirSonido(gato)