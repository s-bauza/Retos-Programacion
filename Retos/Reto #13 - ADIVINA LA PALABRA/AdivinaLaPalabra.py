import random


palabra = "Microscopio"
auxPalabra = ""
intentos = 10

tamPalabraOculta = int(len(palabra)*0.6)

# genera una lista de numeros aleatorios de un rango de la palabra manteniendo el 60% minimo
# Ej: Microscopio son 11 letras, el rango es de 0 a 10 y el 60% es en números enteros 11*0.6=6.6 -> 6
posicionesOcultar = random.sample(range(len(palabra)), tamPalabraOculta)


for i, j in enumerate(palabra):
    auxPalabra += "_" if i in posicionesOcultar else j


while True:

    print(f"Guess the hidden word {auxPalabra} tines {intentos} tries")

    texto = input("write a latter or the solution word: ")

    if texto == palabra:
        print(f"Congratulation you acert the word {palabra}.")
        break
    elif len(texto) == 1 and texto in palabra:
        nuevaAuxPalabra = ""

        for i, j in enumerate(palabra):
            if texto == j and auxPalabra[i] == "_":
                nuevaAuxPalabra += texto
            else:
                nuevaAuxPalabra += auxPalabra[i]

        auxPalabra = nuevaAuxPalabra

        if auxPalabra.count("_") == 0:
            print(f"Congratulation you acert the word {palabra}.")
            break
    else:
        print(f"Invalid: {texto}")
        intentos -= 1

    if intentos == 0:
        print(f"You lost the hidden word was {palabra}.")
        break
