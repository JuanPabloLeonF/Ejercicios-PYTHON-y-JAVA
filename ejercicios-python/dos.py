

n = int(input("Digite el numero hasta que quieres que haga la instruccion: "))
contador = 0
while(contador != n):
    print(f"potencias de 2 * {contador}: {2**contador}")
    contador += 1
    