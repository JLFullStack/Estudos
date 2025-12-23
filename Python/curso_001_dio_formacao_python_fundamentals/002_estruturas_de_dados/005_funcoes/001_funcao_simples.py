'''
    funções são blocos de código reutilizáveis que executam uma tarefa específica.
    Elas ajudam a organizar o código, tornando-o mais legível e modular.
    Em Python, as funções são definidas usando a palavra-chave "def", seguida pelo nome da função e parênteses.
'''

# Definindo uma função simples que imprime uma mensagem
def saudacao():
    print("\nOlá! Bem-vindo ao curso de Python.")

# Chamando a função saudacao
saudacao()




# Definindo uma função com um parâmetro padrão
def saudacao_personalizada(nome="Visitante"):
    print(f"Olá, {nome}! Bem-vindo ao curso de Python.")

# Chamando a função com e sem argumento
saudacao_personalizada("Alice")
saudacao_personalizada()
print()
