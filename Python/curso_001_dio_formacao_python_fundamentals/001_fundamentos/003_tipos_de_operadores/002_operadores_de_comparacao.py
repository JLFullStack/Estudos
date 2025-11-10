# O que são operadores de comparação?
# Operadores de comparação são utilizados para comparar dois valores
# o resultado da comparação é sempre um valor booleano: True ou False

saldo = 450
saque = 200

print("\nsaldo: ", saldo)
print("saque: ", saque)

# exemplos de operadores de comparação:

print("\nOperadores de comparação:")
print(f"saldo == saque = {saldo == saque}")   # igual
print(f"saldo > saque = {saldo > saque}")    # maior que
print(f"saldo < saque = {saldo < saque}")    # menor que
print(f"saldo >= saque = {saldo >= saque}")   # maior ou igual a
print(f"saldo <= saque = {saldo <= saque}")   # menor ou igual a
print(f"saldo != saque = {saldo != saque}")   # diferente
print(f"saldo < 500 and saque < 300 = {saldo < 500 and saque < 300}")  # ambas as condições são verdadeiras
print(f"saldo < 500 or saque > 300 = {saldo < 500 or saque > 300}")   # pelo menos uma das condições é verdadeira
print(f"not(saldo < saque) = {not(saldo < saque)}")  # inverte o valor lógico da expressão
print(f"saldo is saque = {saldo is saque}")   # verifica se ambos referenciam o mesmo objeto
print(f"saldo is not saque = {saldo is not saque}\n") # verifica se ambos não referenciam o mesmo objeto
