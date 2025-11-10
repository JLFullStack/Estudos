# O que é indentação?
# Indentação é o espaço em branco adicionado no início de uma linha de código para
# indicar que aquele bloco de código pertence a uma estrutura específica, como
# uma função, um loop ou uma condicional.


# Exemplo de indentação em uma estrutura condicional
idade = 18
if idade >= 18:
    print("Você é maior de idade.")
    print("Pode votar nas eleições.")

# Exemplo de indentação em um loop
for i in range(5):
    print(f"Número: {i}")
    if i % 2 == 0:
        print("Este número é par.")
    else:
        print("Este número é ímpar.")

# Exemplo de indentação em uma função
def saudacao(nome):
    print(f"Olá, {nome}!")
    print("Bem-vindo ao curso de Python.")

saudacao("Maria")

# Importância da indentação
# A indentação é crucial em Python, pois define a estrutura do código. Diferente de
# outras linguagens que usam chaves ou palavras-chave para delimitar blocos de código,
# Python utiliza a indentação para esse propósito. A falta de indentação correta pode
# levar a erros de sintaxe ou a comportamentos inesperados no programa.

# Por exemplo, o código abaixo geraria um erro de sintaxe devido à falta de indentação:
# if idade >= 18:
# print("Você é maior de idade.")   # Erro de indentação
# print("Pode votar nas eleições.") # Erro de indentação

# Para evitar erros, é importante manter uma consistência na quantidade de espaços ou
# tabulações usadas para a indentação ao longo do código. A convenção mais comum é
# usar quatro espaços para cada nível de indentação. 


