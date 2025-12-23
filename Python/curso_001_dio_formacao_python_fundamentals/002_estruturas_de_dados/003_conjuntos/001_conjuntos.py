'''
    Conjuntos são coleções que não possuem objetos repetidos.
    Para garantir que uma coleção seja um conjunto, é utlizado o método set para 
    comparar e eliminar duplicidade de objetos
'''




lista_numeros = [1, 2, 3, 1, 3, 4]
conjunto_numeros = set(lista_numeros)
print(f"\nlista de números: {lista_numeros}")           # [1, 2, 3, 1, 3, 4]
print(f"conjunto de números: {conjunto_numeros}\n")     # {1, 2, 3, 4}




fruta = "abacaxi"
conjunto_letras = set(fruta)
print(f"fruta: {fruta}")                            # abacaxi
print(f"conjunto de letras: {conjunto_letras}\n")   # {'a', 'b', 'x', 'c', 'i'}




tupla_carros = ("palio", "gol", "celta", "palio")
conjunto_carros = set(tupla_carros)
print(f"carros: {tupla_carros}")                    # ('palio', 'gol', 'celta', 'palio') 
print(f"conjunto de carros: {conjunto_carros}\n")   # {'celta', 'palio', 'gol'}




# Para acessar os dados de um conjunto, é necessário convertê-lo para uma lista, caso contrário, o resultado será um erro
numeros = {1, 2, 3, 2}
print(f"números: {numeros}")    # {1, 2, 3}

# Converte em lista para poder acessar os elementos
numeros = list(numeros)                 
print(f"numeros[0]: {numeros[0]}\n")    # 1