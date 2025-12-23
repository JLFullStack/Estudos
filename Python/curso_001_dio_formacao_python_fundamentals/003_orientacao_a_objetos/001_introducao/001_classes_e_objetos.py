class Cachorro:
    def __init__(self, nome, cor, acordado=True):
        self.nome = nome
        self.cor = cor  
        self.acordado = acordado

    def latir(self):
        print("Au Au!")

    def dormir(self):
        self.acordado = False
        print("Zzzzz...")

# Criando objetos da classe Cachorro
cao_1 = Cachorro("Rex", "Marrom", acordado=False)
cao_2 = Cachorro("Luna", "Preto")

cao_1.latir()  # Au Au!

print(cao_2.acordado)  # True
cao_2.dormir()  # Zzzzz...
print(cao_2.acordado)  # False