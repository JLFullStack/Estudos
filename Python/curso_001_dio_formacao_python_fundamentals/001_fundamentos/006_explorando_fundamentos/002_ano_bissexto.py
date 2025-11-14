'''
DESCRIÇÃO
    Escreva uma solução que informe se um determinado ano é bissexto. 
    Um ano é considerado bissexto se ele for divisível por 4. No entanto, 
    anos que são divisíveis por 100 não são bissextos, a menos que também 
    sejam divisíveis por 400. Esta regra é usada para corrigir o calendário, 
    de modo que ele fique em conformidade com o ano solar.

REGRA
    Um ano é bissexto se:
    1. Ele é divisível por 4 e não é divisível por 100.
    2. Ou ele é divisível por 400.

ENTRADA
O programa deve receber um número inteiro que representa o ano a ser verificado.

SAÍDA
O programa deve imprimir SIM se o ano for bissexto, ou NÃO se não for bissexto.

EXEMPLOS
Entrada     Saída
1975        NÃO
1986        NÃO
1992        SIM
'''

while(True):
    def verificador_ano_bissexto():
        ano = int(input("\ndigite um ano: "))
        bissexto = ((ano % 4 is 0) and (ano % 100 is not 0)) or (ano % 400 is 0)

        if(bissexto):
            print("SIM")
        else:
            print("NÃO")


    verificador_ano_bissexto()
