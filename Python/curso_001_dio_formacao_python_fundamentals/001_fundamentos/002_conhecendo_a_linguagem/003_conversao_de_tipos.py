"""
O que é conversão de tipos?
É quando convertemos um tipo de dado em outro tipo de dado    
por exemplo, converter um número inteiro em um número decimal (float)
existem duas formas de fazer a conversão de tipos em python:
    1 - implícita
    2 - explícita]
"""
# conversão implícita
print('\nconversão implícita')    
inteiro = 10
print(inteiro)  
print(type(inteiro))

# conversão explicita
print('\nconversão explícita')
decimal = float(inteiro)
print(decimal)
print(type(decimal))

# -------------------------------------------------------------------

print('\nconversão de inteiro para float')
preco = 10

print(preco)
print(float(preco))

# ao dividir um inteiro, é feita a conversão para float
print(10 / 2)

# -------------------------------------------------------------------

print('\nconversão de float para int')
preco = 10.30

print(preco)
print(int(preco))

# ao dividir um float com duas barras, é feita a conversão para inteiro
print(5.0 // 2)

# -------------------------------------------------------------------

print('\nconversão de número para string')
preco = 10.30
idade = 28

print(str(preco))
print(str(idade))
print(f'idade:{idade} preco:{preco}')

# -------------------------------------------------------------------

print('\nconversão de string para número')
preco = '10.30'
idade = '28'

print(float(preco))
print(int(idade))

# 
print('\nnão é possível converter string de texto para float')
nome = 'python'
print(float(nome))