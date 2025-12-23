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
print(f"\ncontatos: {contatos}")    # {'Guilherme': {'email': '




# O método copy() cria uma cópia rasa (shallow copy) de um dicionário:
contatos_copia = contatos.copy()
print(f"cópia de contatos: {contatos_copia}\n") # {'Guilherme': {'email': '




# O método clear() remove todos os itens de um dicionário:
contatos.clear()
print(f"contatos após clear(): {contatos}\n")   # {}




# O método fromkeys() cria um novo dicionário a partir de uma sequência de chaves fornecidas:
chaves = ["nome", "idade", "telefone"]
valores_padrao = None
novo_dicionario = dict.fromkeys(chaves, valores_padrao)
print(f"novo_dicionario criado com fromkeys(): {novo_dicionario}\n")    # {'nome': None, 'idade': None, 'telefone': None}




# O método get() retorna o valor para a chave especificada, ou um valor padrão se a chave não existir:
email_guilherme = contatos_copia.get("Guilherme", {}).get("email", {})
print(f"email de Guilherme: {email_guilherme}\n")  # guilherme@gmail.com 




# O método items() retorna uma visão dos itens (pares chave-valor) do dicionário:
itens = contatos_copia.items()
print(f"itens de contatos_copia: {itens}\n")   # dict_items([('Guilherme', {'email': '


# O método keys() retorna uma visão das chaves do dicionário:
chaves_contatos = contatos_copia.keys()
print(f"chaves de contatos_copia: {chaves_contatos}\n")



# O método setdefault() retorna o valor da chave, caso não exista, insere a chave e seu valor:
print(f"contatos_copia antes do setdefault(): {contatos_copia}")
contatos_copia.setdefault("Giovanna")
print(f"contatos_copia após o setdefault()  : {contatos_copia}")



# O método popiitem() remove e retorna um par chave-valor específico:
contatos_copia.popitem()
print(f"contatos_copia após o popitem()     : {contatos_copia}")




# O método pop() remove a chave especificada e retorna o valor correspondente:
contatos_copia.pop("Guilherme", {})
print(f"contatos_copia após o pop()         : {contatos_copia}")




# O método update() atualiza o dicionário com os pares chave-valor de outro dicionário:
contatos_copia.update({
    "Ana": {
        "email": "Ana@gmail.com",
        "telefone": "3333-3333"
    }
})

print(f"contatos_copia após o update()      : {contatos_copia}\n") # {'Maria': {'email': '




# O método values() retorna uma visão dos valores do dicionário:
valores_contatos = contatos_copia.values()
print(f"valores de contatos_copia: {valores_contatos}\n")




# O método in verifica se uma chave existe no dicionário:
existe_maria = "Maria" in contatos_copia
print(f"Maria está em contatos_copia? {existe_maria}") # True

idade_maria = "idade" in contatos_copia.get("Maria", {})
print(f"Maria tem idade cadastrada? {idade_maria}") # False

telefone_ana = "telefone" in contatos_copia.get("Ana", {})
print(f"Ana tem telefone cadastrado? {telefone_ana}\n") # True




# O método del remove um par chave-valor específico do dicionário:
del contatos_copia["Maria"]["telefone"]
del contatos_copia["Ana"]["email"]
print(f"contatos_copia após del : {contatos_copia}\n") # {'Maria': {'email': '