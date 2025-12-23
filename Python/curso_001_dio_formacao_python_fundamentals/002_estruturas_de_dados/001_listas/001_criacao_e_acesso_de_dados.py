'''
    Listas são utilizadas para armazenar de maneira sequencial qualquer tipo de objeto
'''

# Exemplos

frutas = ["laranja", "maca", "uva"]
print(f"\nfrutas: {frutas}")
print(f"frutas[0]: {frutas[0]}")
print(f"frutas[2]: {frutas[2]}")
print(f"frutas[-1]: {frutas[-1]}") # Último ítem da lista

frutas = []
print(f"frutas: {frutas}\n")

letras = list("python")
print(f"letras: {letras}")

numeros = list(range(10))
print(f"numeros: {numeros}")

carro = ["Ferrari", "F8", 4200000, 2020, 2900, "São Paulo", True]
print(f"carro: {carro}\n")

#Listas aninhadas (listas dentro de listas)
matriz = [
    [1, "a", 2],
    ["b", 3, 4],
    [6, 5, "c"]
]

print(f"matriz: {matriz}")
print(f"matriz[0]: {matriz[0]}")
print(f"matriz[0][0]: {matriz[0][0]}")
print(f"matriz[0][-1]: {matriz[0][-1]}")
print(f"matriz[-1][-1]: {matriz[-1][-1]}\n")


# Percorrendo uma lista
carros = ["gol", "celta", "palio"]

for carro in carros:
    print(carro)

print()

# Percorrendo uma lista com índice
for indice, carro in enumerate(carros):
    print(f"índice {indice}: {carro}")

# Filtrando dados de uma lista
numeros = [1, 30, 21, 2, 9, 65, 34]
pares = [] # declaração de uma lista vazia
impares = [] 

for numero in numeros:
    if numero % 2 is 0:
        pares.append(numero)
    else:
        impares.append(numero)

print(f"\nnumeros: {numeros}")
print(f"pares: {pares}")
print(f"ímpares: {impares}")

# uma outra forma de fazer este filtro inline
pares = [numero for numero in numeros if numero % 2 is 0]
impares = [numero for numero in numeros if numero % 2 is not 0]

print("\nfiltro inline:")
print(f"numeros: {numeros}")
print(f"pares: {pares}")
print(f"ímpares: {impares}\n")
