# O que são estruturas condicionais?
# Estruturas condicionais são usadas para tomar decisões no código com base em condições específicas.
# Elas permitem que o programa execute diferentes blocos de código dependendo do resultado de uma condição.
# Em Python, as principais estruturas condicionais são: if, elif e else.

# Exemplo básico de estrutura condicional em Python:
MAIOR_IDADE = 18
idade = 18
if idade >= MAIOR_IDADE:
    print("Você é maior de idade.")

# Exemplo com if, elif e else:
nota = 85   
if nota >= 90:
    print("Você recebeu um A.")
elif nota >= 80:
    print("Você recebeu um B.")
else:
    print("Você recebeu uma nota abaixo de B.")

# Estruturas condicionais aninhadas:
numero = 10
if numero > 0:
    if numero % 2 == 0:
        print("O número é positivo e par.")
    else:
        print("O número é positivo e ímpar.")
else:
    print("O número é negativo ou zero.")

# Uso de operadores lógicos em condições:
idade = 25
renda = 3000
if idade >= 18 and renda >= 2000:
    print("Você é elegível para o empréstimo.")
if idade < 18 or renda < 2000:
    print("Você não é elegível para o empréstimo.")

