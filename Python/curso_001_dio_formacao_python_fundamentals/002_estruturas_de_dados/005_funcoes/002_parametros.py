# Definindo uma função que recebe parâmetros e retorna um valor
def soma(a, b):
    return int(a) + int(b)

# Chamando a função soma e armazenando o resultado
a = input("\nDigite o primeiro número: ")
b = input("Digite o segundo número: ")
resultado = soma(a, b)
print(f"A soma de {a} e {b} é: {resultado}\n")
