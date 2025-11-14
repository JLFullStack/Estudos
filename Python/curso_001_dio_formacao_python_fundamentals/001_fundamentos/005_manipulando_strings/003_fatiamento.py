"""
Fatiamento (slicing) é uma técnica para extrair uma subsequência de 
caracteres de uma string usando índices. É como pegar um "pedaço" do texto.

Sintaxe básica
início: índice onde começa (incluído) - padrão: 0
fim: índice onde termina (excluído) - padrão: fim da string
passo: intervalo entre caracteres - padrão: 1
"""

# Exemplos práticos:
texto = "Python"

# Caracteres do índice 0 ao 2 (3 não incluído)
print(texto[0:3])  # "Pyt"

# Do índice 2 até o final
print(texto[2:])   # "thon"

# Primeiros 4 caracteres
print(texto[:4])   # "Pyth"

# Com passo: cada 2º caractere
print(texto[::2])  # "Pto"

# Invertendo a string
print(texto[::-1]) # "nohtyP"

# Índices negativos (contam do final)
print(texto[-3:])  # "hon"

"""
Observação:
    - Índices negativos: -1 é o último caractere, -2 é o penúltimo, etc.
    - Fim exclusivo: [0:3] pega índices 0, 1, 2 (não o 3)
    - Sem erros: fatiamento nunca gera erro mesmo com índices fora do alcance
"""