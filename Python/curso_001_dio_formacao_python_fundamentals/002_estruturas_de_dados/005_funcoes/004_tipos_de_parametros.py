print()

# Definindo uma função que demonstra diferentes tipos de parâmetros
def tipos_de_parametros(a, b=2, *args, **kwargs):
    print(f"a: {a}")
    print(f"b: {b}")
    print(f"args: {args}") # tupla de argumentos adicionais
    print(f"kwargs: {kwargs}\n") # dicionário de argumentos nomeados adicionais

# Chamando a função com diferentes tipos de argumentos
tipos_de_parametros(1)
tipos_de_parametros(1, 3, 4, 5, nome="Alice", idade=30)
tipos_de_parametros(10, nome="Bob")




# Positionais vs Nomeados
def funcao_exemplo(a, b, c):
    print(f"a: {a}, b: {b}, c: {c}")

funcao_exemplo(1, 2, 3)         # Chamando a função usando argumentos posicionais
funcao_exemplo(c=6, a=4, b=5)   # Chamando a função usando argumentos nomeados
funcao_exemplo(7, c=9, b=8)     # Chamando a função misturando posicionais e nomeados
print()




# Restringido as maneiras de passar argumentos
'''
    Tudo o que vem antes da barra (/) deve ser passado como argumento posicional.
    Tudo o que vem entre a barra (/) e o asterisco (*) pode ser passado como argumento posicional ou nomeado.
    Tudo o que vem depois do asterisco (*) deve ser passado como argumento nomeado.
'''
def funcao_restrita(a, b, /, c, d, *, e, f):
    print(f"a: {a}, b: {b}, c: {c}, d: {d}, e: {e}, f: {f}\n")

# Chamando a função respeitando as restrições
funcao_restrita(1, 2, 3, 4, e=5, f=6)
