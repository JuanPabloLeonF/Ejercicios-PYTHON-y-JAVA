

numero1 = int(input("Digite un numero: "))
numero2 = int(input("Digite otro numero: "))
print("############MENU##########")
print("1: SUMA")
print("2: RESTA")
print("3: DIVISION")
print("4: MULTIPLICACION")
print("5: MODULO")
print("6: POTENCIACION")
print("##########################")

opcion = int(input("Digite un numero si quiere usar alguna de las opciones: "))

if (opcion == 1):
    print(f"suma: {numero1 + numero2}")
elif (opcion == 2):
    print(f"resta: {numero1 - numero2}")
elif (opcion == 3):
    print(f"resta: {numero1 / numero2}")
elif (opcion == 4):
    print(f"resta: {numero1 * numero2}")
elif (opcion == 5):
    print(f"resta: {numero1 % numero2}")
elif (opcion == 6):
    print(f"potenciacion: {numero1 ^ numero2}")
else:
    print("Por favor debes elegir una de las opciones.")
