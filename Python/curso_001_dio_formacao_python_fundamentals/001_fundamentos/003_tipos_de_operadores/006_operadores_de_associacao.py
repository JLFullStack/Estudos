# O que são operadores de associação em Python?
# Operadores de associação são usados para verificar se um valor ou variável está presente em uma sequência
# (como listas, tuplas, dicionários, conjuntos ou strings). Os dois principais operadores de associação são:
# - in: Retorna True se o valor estiver presente na sequência.
# - not in: Retorna True se o valor não estiver presente na sequência.



# Exemplos de uso dos operadores de associação:

# Listas
frutas = ['maçã', 'banana', 'laranja']
print(f'\nfrutas: {frutas}')
print(f"'banana' in frutas: {'banana' in frutas}")      # Saída: True
print(f"'uva' not in frutas: {'uva' not in frutas}")    # Saída: True


# Tuplas
cores = ('vermelho', 'verde', 'azul')
print(f'\ncores: {cores}')
print(f"'verde' in cores: {'verde' in cores}")                # Saída: True
print(f"'amarelo' not in cores: {'amarelo' not in cores}")    # Saída: True


# Dicionários (verifica as chaves)
pessoa = {'nome': 'João', 'idade': 30}
print(f'\npessoa: {pessoa}')
print(f"'nome' in pessoa: {'nome' in pessoa}")                  # Saída: True
print(f"'endereço' not in pessoa: {'endereço' not in pessoa}")  # Saída: True


# Conjuntos
numeros = {1, 2, 3, 4, 5}
print(f'\nnumeros: {numeros}')
print(f"3 in numeros: {3 in numeros}")            # Saída: True
print(f"6 not in numeros: {6 not in numeros}")    # Saída: True


# Strings
mensagem = "Olá, bem-vindo ao curso de Python!"
print(f'\nmensagem: {mensagem}')
print(f"'Python' in mensagem: {'Python' in mensagem}")        # Saída: True
print(f"'Java' not in mensagem: {'Java' not in mensagem}")    # Saída: True

# os operadores de associação são case-sensitive, ou seja, diferenciam maiúsculas de minúsculas.
estados = ['São Paulo', 'Rio de Janeiro', 'Minas Gerais']
print(f'\nestados: {estados}')
print(f"'são paulo' in estados: {'são paulo' in estados}")      # Saída: False
print(f"'São Paulo' in estados: {'São Paulo' in estados}\n")        # Saída: True


# Esses operadores são muito úteis para verificar a existência de elementos em coleções de dados.
# Eles são amplamente utilizados em estruturas de controle, como condicionais e loops.