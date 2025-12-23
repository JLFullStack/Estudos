'''
    Dicionários são variáveis que contém listas de propriedades com chave + valor, 
    onde a chave é o nome da propriedade e valor é o valor atribuído a esta propriedade.

    exemplo: nome = "Guilherme"

    A chave nome recebeu o valor Guilherme
''' 

# Exemplos de como declarar um dicionário:

pessoa = {"nome": "Guilherme", "idade": 28}
print(f"\npessoa: {pessoa}")    # {'nome': 'Guilherme', 'idade': 28}

pessoa = dict(nome = "Guilherme", idade = 28)
print(f"pessoa: {pessoa}")  # {'nome': 'Guilherme', 'idade': 28}

pessoa["telefone"] = "1111-1111"
print(f"pessoa: {pessoa}\n")  # {'nome': 'Guilherme', 'idade': 28, 'telefone': '1111-1111'}




# Exemplos de como acessar as propriedades de um dicionário:
print(f"nome: {pessoa['nome']}")            # Guilherme
print(f"idade: {pessoa['idade']}")          # 28
print(f"telefone: {pessoa['telefone']}\n")  # 1111-1111




# Exemplo de como sobrescrever as propriedades de um dicionário:
pessoa["nome"] = "Maria"
pessoa["idade"] = 18
pessoa["telefone"] = "2222-2222"
print(f"\npessoa: {pessoa}")    # {'nome': 'Maria', 'idade': 18, 'telefone': '2222-2222'} 




# Exemplo de dicionário com dicionários aninhados:
contatos = {
    "Guilherme": {
        "email": "guilherme@gmail.com", 
        "telefone": "1111-1111"
    },
    "Maria": {
        "email": "maria@gmail.com", 
        "telefone": "2222-2222"
    },
}
print(f"\ncontatos: {contatos}")

telefone_guilherme = contatos["Guilherme"]["telefone"]
print(f"telefone guilherme: {telefone_guilherme}")  # 1111-1111

telefone_maria = contatos["Maria"]["telefone"]
print(f"telefone maria: {telefone_maria}\n")        # 2222-2222




# Exemplos de acesso aos dados de um dicionário utilizando iteração:
for chave in contatos:
    print(chave, contatos[chave])

print()

for chave, valor in contatos.items():
    print(chave, valor)