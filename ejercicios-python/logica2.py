
#  Escribe una función que reciba dos palabras (String) y retorne
#  verdadero o falso (Bool) según sean o no anagramas.
#  Un Anagrama consiste en formar una palabra reordenando TODAS
#  las letras de otra palabra inicial.
#  NO hace falta comprobar que ambas palabras existan.
#  Dos palabras exactamente iguales no son anagrama.

########################funcion#############################
def palabras(palabra_1,palabra_2):
    if palabra_1 == palabra_2:
        return False
    elif palabra_1 != palabra_2:
        return True
#############################Codigo Principal##################
palabra_1 = "leon"
palabra_2 = "noel"
print(palabras(palabra_1,palabra_2))