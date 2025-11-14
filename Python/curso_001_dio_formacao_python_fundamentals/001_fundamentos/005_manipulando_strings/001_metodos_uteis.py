curso = "pYtHOn"
print(f"curso: \n{curso}")
print(curso.upper())    # Maiúsculo
print(curso.lower())    # Minúsculo
print(curso.title())    # Título

texto = "     Olá mundo!  "
print(f"\n|{texto}|")
print(f"|{texto.strip()}|")    # Elimina o espaço em branco da esquerda e da direita
print(f"|{texto.lstrip()}|")   # Elimina o espaço em branco da esquerda
print(f"|{texto.rstrip()}|")   # Elimina o espaço em branco da direita

titulo = " Curso de Python "
print(f"\n{titulo}")
print(titulo.center(21, "-"))   # Centraliza a string

vogais = "AEIOU"
print(f"\n{vogais}")
print(" ".join(vogais))   # Junta o caracter, alternando entre a string e o caracter
print("\n")