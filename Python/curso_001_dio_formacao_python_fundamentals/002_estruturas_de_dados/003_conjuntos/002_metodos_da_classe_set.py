conjunto_a = {1, 2, 3,}
conjunto_b = {2, 3, 4,}
print(f"\nconjunto a: {conjunto_a}")    # {1, 2, 3}
print(f"conjunto b: {conjunto_b}")      # {2, 3, 4}




# union cria a união de dois conjuntos, rejeitando os elementos iguais
uniao_conjuntos = conjunto_a.union(conjunto_b)
print(f"união dos conjuntos: {uniao_conjuntos}")  # {1, 2, 3, 4}




# intersection cria a interseção de dois conjuntos, mostrando quais elementos eles têm em iguais
intersecao_conjuntos = conjunto_a.intersection(conjunto_b)
print(f"interseção dos conjuntos: {intersecao_conjuntos}")  # {2, 3}




# difference mostra quais elementos têm em um conjunto, mas não tem em outro.
diferenca_conjunto_a = conjunto_a.difference(conjunto_b)
diferenca_conjunto_b = conjunto_b.difference(conjunto_a)

print(f"diferença de a -> b: {diferenca_conjunto_a}")   # {1}
print(f"diferença de b -> a: {diferenca_conjunto_b}")   # {4}




# diferença simétrica cria uma união com os elementros da diferença dos conjuntos
diferenca_simetrica = conjunto_a.symmetric_difference(conjunto_b)
print(f"diferença simétrica entre a e b: {diferenca_simetrica}\n")    # {1, 4}




# issubset verifica se um conjunto é subconjunto de outro conjunto
cores_a = {"vermelho", "azul",}
cores_b = {"roxo", "amarelo", "vermelho", "azul",}
print(f"cores conjunto a: {cores_a}")                                   # {'vermelho', 'azul'}
print(f"cores conjunto b: {cores_b}")                                   # {'amarelo', 'roxo', 'vermelho', 'azul'}
print(f"conjunto a é subconjunto de b: {cores_a.issubset(cores_b)}")    # True
print(f"conjunto b é subconjunto de a: {cores_b.issubset(cores_a)}")    # False




# issuperset verifica se um conjunto A é superconjunto de um conjunto B
print(f"conjunto a é superconjunto de b: {cores_a.issuperset(cores_b)}")    # False, pois nem todos elementros de B estão em A 
print(f"conjunto b é superconjunto de a: {cores_b.issuperset(cores_a)}")    # True, pois todos os elementos de A estão em B




# isdisjoint verifica se os elementos de um conjunto não fazem parte de outro cunjunto
cores_c = {"preto", "branco",}
print(f"conjunto a e b não contém elementos iguais: {cores_a.isdisjoint(cores_b)}")     # False, pois os dois conjuntos contém elementos iguais 2 e 3
print(f"conjunto a e c não contém elementos iguais: {cores_a.isdisjoint(cores_c)}\n")   # True, pois nenhum elementro de A estão em C



# add adiciona um elemento novo em um conjunto, caso o mesmo ainda não o tenha
sorteio = {1, 23}
print(f"sorteio: {sorteio}")    # {1, 23}

sorteio.add(25)
print(f"sorteio: {sorteio}")    # {1, 25, 23}

sorteio.add(42)
print(f"sorteio: {sorteio}")    # {1, 42, 25, 23}

sorteio.add(25)
print(f"sorteio: {sorteio}\n")    # {1, 42, 25, 23} "25" não foi adicionado, pois já existia no conjunto




# len identifica quantos elementos existem no conjunto
print(f"tamanho sorteio: {len(sorteio)}\n") # {1, 42, 25, 23}




# verifica se um elemento existe em um conjunto
print(f"42 existem em sorteio: {42 in sorteio}")    # True
print(f"40 existem em sorteio: {40 in sorteio}\n")  # False




# copy copia um conjunto para outro
novo_sorteio = sorteio.copy()
print(f"novo sorteio: {novo_sorteio}")  # {1, 42, 25, 23}




# discard exclui um elemento de um conjunto
novo_sorteio.discard(1)
print(f"novo sorteio: {novo_sorteio}")  # {42, 25, 23}

novo_sorteio.discard(45)
print(f"novo sorteio: {novo_sorteio}")  # {42, 25, 23} permanece idêntico, pois 45 não existe no conjunto




# pop exlui o elemento da primeira posição
novo_sorteio.pop()
print(f"novo sorteio: {novo_sorteio}")  # {25, 23}




# remove exlui o elemento passado como parâmetro
novo_sorteio.remove(23)
print(f"novo sorteio: {novo_sorteio}")  # {25}




# clear limpa um conjunto
novo_sorteio.clear()
print(f"novo sorteio: {novo_sorteio}")    # {}