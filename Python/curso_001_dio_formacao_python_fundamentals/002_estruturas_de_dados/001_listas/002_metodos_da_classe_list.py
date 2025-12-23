# region Adição de propriedades na lista
lista_1 = []
lista_1.append(1)
lista_1.append("Python")
lista_1.append([40, 30, 20])
print(f"\nlista 1: {lista_1}")  # lista 1: [1, "Python", [40, 30, 20]]
# endregion

# Copia a lista para uma nova variável
lista_2 = lista_1.copy()

# region Limpa a lista
lista_1.clear()
print(f"lista 1: {lista_1}\n")  # lista 1: []
print(f"lista 2: {lista_2}\n")  # lista 2: [1, "Python", [40, 30, 20]] (dados copiados de lista_1)
# endregion

# region Conta quantas vezes uma propriedade aparece na lista
cores = ["vermelho", "azul", "verde", "azul"]
print(f"vermelho: {cores.count("vermelho")}")   # vermelho: 1
print(f"azul: {cores.count("azul")}")           # azul: 2
print(f"verde: {cores.count("verde")}\n")       # verde: 1
#endregion

# region Junta uma lista a outra
linguagens = ["python", "js", "C"]
print(f"linguagens: {linguagens}") # linguagens: ["python", "js", "C"]

novas_linguagens = ["java", "C#"]
linguagens.extend(novas_linguagens)
print(f"linguagens: {linguagens}\n") # linguagens: ["python", "js", "C", "java", "C#"]
# endregion

# region Rertorna o índice (posição) da primeira ocorrência do elemento consultado na lista
print(f"índice java: {linguagens.index("java")}")       # índice java: 3
print(f"índice python: {linguagens.index("python")}\n") # índice python: 0
# endregion

# region Reverte a posição dos elementos
linguagens.reverse()
print(f"linguagens: {linguagens}")      # linguagens: ["C#", "java", "C", "js", "python"]
linguagens.reverse()
print(f"linguagens: {linguagens}\n")    # linguagens: ["python", "js", "C", "java", "C#"]
# endregion

# region Indica o tamanho da lista
print("Indica o tamanho da lista")
print(f"Tamanho linguagens: {len(linguagens)}\n")
#endregion

# region Ordenação da lista
print("Ordenação da lista")

# Ordena a lista de forma alfabética
linguagens.sort() 
print(f"linguagens: {linguagens}")  # linguagens: ["C", "C#", "java", "js", "python"]

# Ordena a lista de forma alfabética, mas com a ordenação invertida
linguagens.sort(reverse=True)
print(f"linguagens: {linguagens}")  # linguagens: ["python", "js", "java", "C#", "C"]

# Ordena por tamanho da propriedade
linguagens.sort(key=lambda x: len(x))
print(f"linguagens: {linguagens}")  # linguagens: ['C', 'js', 'C#', 'java', 'python']

# Ordena por tamanho da propriedade, mas com a ordenação invertida
linguagens.sort(key=lambda x: len(x), reverse=True)
print(f"linguagens: {linguagens}")  # linguagens: ['python', 'java', 'js', 'C#', 'C']

# Outra propriedade para ordenação, além do sort é o sorted
print(f"linguagens: {sorted(linguagens)}\n")  # linguagens: ['C', 'js', 'C#', 'java', 'python']

# endregion

# region Remoção de elementos da lista

# Remove, por padrão, o último elemento da pilha
print(f"linguagens: {linguagens}")  # linguagens: ["python", "js", "C", "java", "C#"]
linguagens.pop()
print(f"linguagens: {linguagens}")  # linguagens: ["python", "js", "C", "java"]
linguagens.pop()
print(f"linguagens: {linguagens}")  # linguagens: ["python", "js", "C"]
linguagens.pop()
print(f"linguagens: {linguagens}")  # linguagens: ["python", "js"]

# Remove o elemento no índice indicado
linguagens.pop(linguagens.index("python"))
print(f"linguagens: {linguagens}")    # linguagens: ["js"]

# Outra forma de remover um elemento de uma lista
linguagens.remove("js")
print(f"linguagens: {linguagens}\n")    # linguagens: []

# endregion