"""
O que é interpolação de variáveis?
Interpolation (interpolação) é inserir valores de variáveis dentro de strings de forma legível
e segura. Em Python existem várias formas comuns:
    - f-strings (recomendado, Python 3.6+)
    - str.format()
    - operador % (estilo antigo)

Exemplos abaixo demonstram cada abordagem.
"""

# region Exemplo 1: f-strings (mais legível e eficiente)

nome = "Ana"
idade = 28
print(f"\nOlá, meu nome é {nome} e tenho {idade} anos.")

# Formatação avançada com f-strings
pi = 3.14159265
print(f"Valor de pi arredondado: {pi:.2f}")  # duas casas decimais

# endregion

# region Exemplo 2: str.format()

produto = "caneta"
preco = 2.5
print("Comprei uma {0} por R$ {1:.2f}".format(produto, preco))
print("Usuário: {user}, Status: {status}".format(user="joao", status="ativo")) # nomes como argumentos

#endregion

# region Exemplo 3: operador % (estilo antigo)
saldo = 1234.5678
print("Saldo disponível: R$ %.2f" % saldo)

#endregion

# Evitar concatenação manual: usa interpolação para legibilidade
cidade = "São Paulo"
# ruim: print("Estou em " + cidade + " hoje.")
print(f"Estou em {cidade} hoje.")  # melhor

# Interpolação com dicionários
dados = {"x": 10, "y": 20}
print("Coordenadas: x={x}, y={y}".format(**dados))
print(f"Coordenadas (f-string): x={dados['x']}, y={dados['y']}")

# Quando precisar incluir chaves literais em f-strings/format(), dobre-as:
print(f"Exemplo de chaves: {{chave}}")
print("Exemplo de chaves com format: {{}}".format())

"""
Observação:
    - Prefira f-strings para código novo (mais concisas e rápidas).
    - Use format() quando precisar de formatação mais dinâmica ou compatibilidade pré-3.6.
    - Evite concatenação excessiva de strings com +.
"""