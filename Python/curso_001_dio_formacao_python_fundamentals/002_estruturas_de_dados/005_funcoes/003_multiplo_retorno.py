# Definindo uma função que retorna múltiplos valores
def operacoes_matematicas(x, y):
    soma = x + y
    subtracao = x - y
    multiplicacao = x * y
    divisao = x / y if y != 0 else None
    return soma, subtracao, multiplicacao, divisao

# Chamando a função e desempacotando os valores retornados
num1 = 10
num2 = 5
soma, subtracao, multiplicacao, divisao = operacoes_matematicas(num1, num2)
print(f"\nOperações matemáticas entre {num1} e {num2}:")
print(f"Soma: {soma}")
print(f"Subtração: {subtracao}")
print(f"Multiplicação: {multiplicacao}")
print(f"Divisão: {divisao}\n")
