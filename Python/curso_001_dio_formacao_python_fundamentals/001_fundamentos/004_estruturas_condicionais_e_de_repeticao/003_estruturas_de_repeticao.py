"""
Estruturas de repetição (loops) são construções que permitem executar um trecho de código 
várias vezes enquanto uma condição for verdadeira ou sobre elementos de uma coleção. Em Python as principais são:

for: itera sobre sequências (listas, tuplas, strings, range, etc.).
while: executa enquanto uma condição booleana for True.
break: interrompe o loop imediatamente.
continue: pula para a próxima iteração.
else no loop: executa quando o loop termina normalmente (sem break).
"""

# Exemplos curtos:

# for: iterando uma lista
frutas = ["maçã", "banana", "laranja"]
for fruta in frutas:
    print(fruta, end="\n")

print("\n") # pula uma linha





# for com range
for i in range(5):
    print(i, end=" ")  # 0..4

print("\n")




# while: repetindo até condição mudar
n = 5
while n > 0:
    print(n, end=" ")
    n -= 1

print("\n")




# break e continue
for i in range(10):
    if i == 3:
        continue  # pula o 3
    if i == 8:
        break     # sai do loop
    print(i, end=" ")

print("\n")




# else no loop (executa se não houve break)
for i in range(3):
    print(i, end=" ")
else:
    print("\nTerminou sem break\n")

print("\n")




# exibindo a tabuada do 5
for numero in range(0, 51, 5): # range de 0 a 51 apresentando de 5 em 5 casas
    print(numero, end=" ")

print("\n")