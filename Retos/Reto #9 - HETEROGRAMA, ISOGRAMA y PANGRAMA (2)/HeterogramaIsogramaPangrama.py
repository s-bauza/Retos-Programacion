def heterograma(cadenaCaracteres) -> bool:

    for caracter in cadenaCaracteres:
        if cadenaCaracteres.count(caracter) > 1 and caracter != "." and caracter != "," and caracter != " ":
            return False

    return True


def isograma(cadenaCaracteres) -> bool:

    for caracter in cadenaCaracteres:
        if cadenaCaracteres.count(caracter) > 1 and caracter != "." and caracter != "," and caracter != " ":
            return True

    return False


def panagrama(cadenaCaracteres) -> bool:

    abcedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}
    for abc in abcedario:
        if cadenaCaracteres.count(abc) == 0:
            return False
# No existe aparte del mismo abecedario hasta ahora, unicamente encontre en hebreo pengrams perfectos
    if heterograma(cadenaCaracteres):
        print("Pangrama perfecto")
    return True


print(heterograma("yuxtaponer"))
print(isograma("acondicionar"))
print(panagrama("José compró en Perú una vieja zampoña. Excusándose, Sofía tiró su whisky al desagüe de la banqueta."))
