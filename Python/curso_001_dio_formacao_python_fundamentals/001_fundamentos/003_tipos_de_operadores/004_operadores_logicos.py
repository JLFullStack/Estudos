# o que são operadores lógicos?
# operadores lógicos são utilizados para realizar operações lógicas entre valores booleanos (True ou False).
# também são utilizados em conjunto com os operadores de comparação para formar expressões mais complexas.
# os principais operadores lógicos em python são: and, or, not.

# exemplo de uso dos operadores lógicos:
a = True
b = False

# operador and
print("a and b:", a and b)  # retorna False, pois ambos os valores precisam ser True
print("a and a:", a and a)  # retorna True, pois ambos os valores são True
print("b and b:", b and b)  # retorna False, pois ambos os valores são False

# operador or
print("a or b:", a or b)    # retorna True, pois pelo menos um dos valores é True
print("a or a:", a or a)    # retorna True, pois ambos os valores são True
print("b or b:", b or b)    # retorna False, pois ambos os valores  são False

# operador not inverte o valor lógico
print("not a:", not a)      # retorna False, pois inverte o valor de a
print("not b:", not b)      # retorna True, pois inverte o valor de b

# combinação de operadores lógicos
print("(a and b) or (not b):", (a and b) or (not b)) # retorna True
print("not (a or b):", not (a or b))                 # retorna False

# exemplo com operadores de comparação
x = 10
y = 5

print("(x > y) and (y < 10):", (x > y) and (y < 10)) # retorna True
print("(x < y) or (y == 5):", (x < y) or (y == 5))   # retorna True
print("not (x == 10):", not (x == 10))               # retorna False