"""Enunciado: Crea una función que reciba un texto
y retorne la vocal que más veces se repita.
Si no hay vocales podrá devolver vacío."""

def veces(texto):
    vocales = {}
    for caracter in texto:
        if caracter in 'aeiouAEIOU':
            if caracter in vocales:
                vocales[caracter] += 1
            else:
                vocales[caracter] = 1
    try:
        veces = max(vocales, key=vocales.get)
    except:
        return "vacia"
    else:
        if len(vocales) > 0:
            return f"la vocal que mas se repite es: {veces}"

#codigo principal
texto = str(input("Digite un texto una frase: "))
print(veces(texto))
