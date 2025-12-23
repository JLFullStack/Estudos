print()

# Variável global fica fora de qualquer função
mensagem_global = "Esta é uma variável global."

def escopo_variaveis():
    # Variável local fica dentro da função
    mensagem_local = "Esta é uma variável local."
    print(mensagem_local)   # variável local é acessível somente dentro da função
    print(mensagem_global)  # variável global é acessível dentro e fora da função

# Chamando a função para demonstrar o escopo das variáveis
escopo_variaveis()
print(f"{mensagem_global}\n") # acessando variável global fora da função




# Modificando variável global dentro da função
contador = 0
print(f"Contador: {contador}")

def incrementar_contador():
    global contador  # Declarando que queremos usar a variável global
    contador += 1
    print(f"Contador dentro da função: {contador}\n")

incrementar_contador()
