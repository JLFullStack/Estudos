# Tuplas são parecidas com listas, mas suas propriedades não podem ser alteradas 




'''
# ---------------------- #
    DECLARANDO TUPLAS
# ---------------------- #
''' 
# lista de frutas
lista_frutas = ["laranja", "maca", "uva"]
print(f"\nlista de frutas: {lista_frutas}") # ["laranja", "maca", "uva"]

# tupla de frutas
tupla_frutas = ("laranja", "maca", "uva",)
print(f"\ntupla de frutas: {tupla_frutas}") # ("laranja", "maca", "uva",)

letras = tuple("python")
print(f"tupla de letras: {letras}") # ('p', 'y', 't', 'h', 'o', 'n')

numeros = tuple([1, 2, 3, 4])
print(f"tupla de números: {numeros}") # (1, 2, 3, 4)

pais = ("Brasil",)
print(f"tupla com uma propriedade: {pais}\n") # ("Brasil",)




'''
# -------------------------------------------------------------------------------#
    OS MODOS DE ACESSO ÀS PROPRIEDADES DAS TUPLAS SÃO IDÊNTICOS AOS DE UMA LISTA
# -------------------------------------------------------------------------------#
''' 
print(f"Acesso à propriedade na posição  0 de frutas: {tupla_frutas[0]}")   # laranja
print(f"Acesso à propriedade na posição  2 de frutas: {tupla_frutas[1]}")   # uva
print(f"Acesso à propriedade na posição -1 de letras: {letras[-1]}")        # n
print(f"Acesso à propriedade na posição -3 de letras: {letras[-3]}\n")      # h




'''
# ---------------------- #
    MATRIZ DE TUPLAS
# ---------------------- #
''' 
matriz = (
    (1, "a", 2),
    ("b", 3, 4),
    (1, 5, "c"),
)

print(f"matriz: {matriz}")                      # ((1, 'a', 2), ('b', 3, 4), (1, 5, 'c'))
print(f"matriz[0]: {matriz[0]}")                # (1, 'a', 2)
print(f"matriz[0][0]: {matriz[0][0]}")          # 1
print(f"matriz[0][-1]: {matriz[0][-1]}")        # 2
print(f"matriz[-1][-1]: {matriz[-1][-1]}\n")    # c




'''
# ------------------------------------------------------------#
    OS FATIAMENTOS DAS TUPLAS SÃO IDÊNTICOS AOS DE UMA LISTA
# ------------------------------------------------------------#
''' 
print(f"letras: {letras}")                  # ('p', 'y', 't', 'h', 'o', 'n')
print(f"letras[2:]: {letras[2:]}")          # ('t', 'h', 'o', 'n')
print(f"letras[:2]: {letras[:2]}")          # ('p', 'y')
print(f"letras[1:3]: {letras[1:3]}")        # ('y', 't')
print(f"letras[0:5:2]: {letras[0:5:2]}")    # ('p', 't', 'o')
print(f"letras[::]: {letras[::]}")          # ('p', 'y', 't', 'h', 'o', 'n')
print(f"letras[::-1]: {letras[::-1]}\n")    # ('n', 'o', 'h', 't', 'y', 'p')




'''
# -----------------------------------------------------------#
    AS ITERAÇÕES DAS TUPLAS SÃO IDÊNCICAS AOS DE UMA LISTA
# -----------------------------------------------------------#
''' 
carros = ("gol", "celta", "palio",)

for carro in carros:
    print(f"carro: {carro}")

for indice, carro in enumerate(carros):
    print(f"índice {indice}: {carro}")
print()




'''
# ----------- #
    MÉTODOS
# ------------#
''' 
cores = ("vermelho", "azul", "verde", "azul",)
print(f"quantidade de vermelho: {cores.count("vermelho")}")     # quantidade de vermelho: 1
print(f"quantidade de azul: {cores.count("azul")}")             # quantidade de azul: 2
print(f"quantidade de verde: {cores.count("verde")}")           # quantidade de verde: 1
print(f"índice vermelho: {cores.index("verde")}")               # índice vermelho: 2
print(f"quantidade de cores: {len(cores)}\n")                   # quantidade de cores: 4


print(isinstance(carros, tuple))

'''
# ---------------------------------------------------------------------------------#
    AO TENTAR ALTERAR UMA PROPRIEDADE DE UMA TUPLA, É EXIBIDO UMA MENSAGEM DE ERRO
# ---------------------------------------------------------------------------------#
''' 
linguagem = ("PYTHON",)
linguagem[0] = "C++"