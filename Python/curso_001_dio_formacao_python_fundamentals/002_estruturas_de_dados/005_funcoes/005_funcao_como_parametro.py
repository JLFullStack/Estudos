# Definindo algumas funções simples para serem usadas como operações
def somar(a, b):
    return a + b

def multiplicar(a, b):
    return a * b

# Definindo uma função que recebe outra função como parâmetro
def aplicar_operacao(a, b, operacao):
    return operacao(a, b)

# Usando a função aplicar_operacao com diferentes operações
resultado_adicao = aplicar_operacao(5, 3, somar)    
resultado_multiplicacao = aplicar_operacao(5, 3, multiplicar)

print(f"\nSoma usando função como parâmetro: {resultado_adicao}")
print(f"Multiplicação usando função como parâmetro: {resultado_multiplicacao}\n")
