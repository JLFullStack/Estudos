"""
O que são operadores de identidade em Python?
Operadores de identidade são usados para comparar objetos, verificando se eles são o mesmo objeto na memória.
Em Python, existem dois operadores de identidade:
is: Retorna True se ambos os operandos referem-se ao mesmo objeto.
is not: Retorna True se ambos os operandos não referem-se ao mesmo objeto (ou seja, são objetos diferentes).
"""

# Exemplo de uso dos operadores de identidade:
a = [1, 2, 3]
b = a 
print(f"\n\na: {a}")
print(f"b: {b}")

print(f"a is b: {a is b}")      # True, pois ambos referenciam o mesmo objeto
print(f"a is not b: {a is not b}")  # False, pois ambos referenciam o mesmo objeto   


c = [1, 2, 3]  # c é um novo objeto com o mesmo conteúdo de a
print(f"\nc: {c}")

print(f"a is c: {a is c}")      # False, pois a e c são objetos diferentes
print(f"a is not c: {a is not c}\n")  # True, pois a e c são objetos diferentes
