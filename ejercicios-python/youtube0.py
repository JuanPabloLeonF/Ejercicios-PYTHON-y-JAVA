"""crear una funcion que me calcule el indice de masa corporal IMC,
la funcion debe recibir como parametro de entrada la altura,el peso
y hacer el calculo.

crar una segunda funcion que evalue si el IMC esta dentro del
18.5 <= IMC <= 24.9 la persona es aludable. si IMC >=25 
la persona tiene sobrepeso. si IMC < 18.5 la persona esta bajo de peso."""

#funcion para evaluar el IMC
def salud(f):
    if 18.5 <= f <= 24.9:
        return "Estas completamente saludable"
    elif f >= 25:
        return "Estas con sobre peso"
    else: f < 18.5
    return "Estas por debajo del peso adecuado"

#funcion para calcular el IMC #1
def IMC(altura,peso):
    while True:
        try:   
            IMC = peso/(altura*altura)
        except Exception:
            print("2 Argumentos incorrectos, vuelve a intentarlo")
            print()
            try:
                altura = float(input("Digite la estatura (metros): "))
                peso = float(input("Digite el peso (kilogramos): "))
            except Exception:
                print()
        else:
            print("Tu indice de masa corporal (IMC)")
            return IMC
        
#############codigo principal############
while True:
    try:
        altura = float(input("Digite la estatura (metros): "))
        peso = float(input("Digite el peso (kilogramos): "))
    except Exception:
        print("Argumentos incorrectos, vuelve a intentarlo")
        print()
    else:
        f = IMC(altura,peso)
        print (f)
        print(salud(f))
        break
    