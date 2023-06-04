
# Crea una única función (importante que sólo sea una) que sea capaz
# de calcular y retornar el área de un polígono.
# La función recibirá por parámetro sólo UN polígono a la vez.
# Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
# Imprime el cálculo del área de un polígono de cada tipo.

#######################funcion###########################

def area(poligono):
#calcular area del triangulo
    if poligono == "Triangulo" or poligono == "triangulo":
        lado1 = float(input("Digite el lado 1 del triangulo: "))
        lado2 = float(input("Digite el lado 2 del triangulo: "))
        base_tri = float(input("Digite la base del triangulo: "))
        altura_tri = float(input("Digite la altura del triangulo: "))
        perimetro_tri = lado1 + lado2 + base_tri
        area_tri = (base_tri * altura_tri)/2
        return f"El area del triangulo es: {area_tri}"
#clacular area del cuadrado
    elif poligono == "Cuadrado" or poligono == "cuadrado":
        lado_cua = float(input("Digite el lado del cuadrado: ")) 
        perimetro_cua = lado_cua * 4
        area_cua = lado_cua * lado_cua
        return f"EL area del cuadrado es: {area_cua}"
#calcular area del rectangulo
    else:base_rec = float(input("Digite la base del rectangulo: "))
    altura_rec = float(input("Digite la altura del rectangulo: "))
    area_rec = base_rec * altura_rec
    return f"El area del rectangulo es: {area_rec}"

########################codigo principal#########################
x = 0
while x != 3:
    poligono = str(input("Digite el tipo de poligono: "))
    x += 1
    print(area(poligono))
    print("#####################################")