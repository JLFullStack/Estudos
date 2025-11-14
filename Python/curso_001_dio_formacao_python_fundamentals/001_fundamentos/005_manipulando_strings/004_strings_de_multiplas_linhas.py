"""
Strings de múltiplas linhas em Python são literais de string que permitem incluir quebras de 
linha diretamente no texto usando aspas triplas ('''...''' ou """"""...""""""). 
São úteis para texto longo, mensagens, docstrings e templates.

Principais pontos (resumido)

Criadas com aspas triplas: '''...''' ou """"""..."""""" — preservam quebras de linha e espaços.
Podem conter tanto " quanto ' sem precisar escapar.

Interpolação funciona com f-strings: f""""""...{var}...""""""
r""""""..."""""" define string raw (escapes não são processados).

Atenção à indentação embutida — use textwrap.dedent para remover recuos indesejados.
A string inclui exatamente o conteúdo entre as aspas (incluindo nova linha inicial/final se houver).
"""

# Exemplos práticos:
from textwrap import dedent




# string de múltiplas linhas simples
linhas = """
Linha 1
Linha 2
Linha 3
"""
print(f"\n{linhas}")


menu = """

=============== MENU ===============
    
    1 - Depositar
    2 - Sacar
    0 - Sair

====================================

"""
print(menu)




# f-string multilinha
nome = "Ana"

boas_vindas = f"""
Olá, {nome}.
Bem-vinda ao exemplo.
Hoje há 3 linhas.
"""
print(f"\n{boas_vindas}")




# raw string multilinha (backslashes não são interpretados)
caminho = r"""C:\pasta\arquivo
\Outra\linha"""
print(f"\n{repr(caminho)}")




# dentro de função
a = 5
b = 10
def soma(a, b):
    """
    Soma dois números e retorna o resultado.

    Exemplos:
        >>> soma(1, 2)
        3
    """
    return a + b

print(f"\n{a} + {b} = {soma(a, b)}")




# em recuo indesejado em literal multilinha — use dedent
texto = dedent("""\
    Texto com indentação removida
        Segunda linha alinhada à esquerda
""")
print(f"\n{texto}\n")