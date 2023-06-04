
# Escribe un programa que se encargue de comprobar si un número es o no primo.
# Hecho esto, imprime los números primos entre 1 y 100.

#########funcion comprobar si es o no primo 
def es_primo(numero):
    if numero % 2 != 0:
        return f"Es primo: {numero}"
    return f"No primo: {numero}"

#######################codigo principal#####################
numero = 20  
print(es_primo(numero))
print("")
print("Numeros primos: ")
for i in range(2,101):
    if i < 2:    
        print("")
    elif i % 2 != 0:
        print(i)
