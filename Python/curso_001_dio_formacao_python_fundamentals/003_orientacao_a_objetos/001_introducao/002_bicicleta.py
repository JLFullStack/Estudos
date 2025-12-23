class Bicicleta:
    def __init__(self, cor, modelo, ano, valor):
        self.cor = cor
        self.modelo = modelo
        self.ano = ano
        self.valor = valor

    def buzinar(self):
        print("PLIM PLIM...")

    def parar(self):
        print("A bicicleta parou.")

    def correr(self):
        print("Vrummmm...")


b1 = Bicicleta("Vermelha", "Caloi 10", 2020, 1200.00)
print(f"\nBicicleta modelo: {b1.modelo}, Cor: {b1.cor}, Ano: {b1.ano}, Valor: R${b1.valor}")

b1.buzinar()  # PLIM PLIM...
b1.correr()   # Vrummmm...
b1.parar()    # A bicicleta parou.
