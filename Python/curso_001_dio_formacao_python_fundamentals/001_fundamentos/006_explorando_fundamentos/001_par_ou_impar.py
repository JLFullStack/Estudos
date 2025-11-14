'''
DESCRIÇÃO
    Neste desafio, você deve escrever uma solução que receba um número inteiro como entrada e determine 
    se ele é par ou ímpar. Dessa forma, a solução deve retornar uma string indicando Par se o número 
    for par e Ímpar se o número for ímpar.

Entrada
A entrada do programa é um único número inteiro.

Saída
A saída do programa é uma string que será Par se o número for par e Ímpar se o número for ímpar.
'''

while(True):
    numero = int(input("\ndigite um número: "))

    if (numero % 2 == 0):
        print("Par")
    else:
        print("Ímpar")
