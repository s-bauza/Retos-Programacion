abecedario = {'a': 'aurek', 'A': 'Aurek',
              'b': 'besh', 'B': 'Besh',
              'c': 'cresh', 'C': 'Cresh',
              'd': 'dorn', 'D': 'Dorn',
              'e': 'esk', 'E': 'Esk',
              'f': 'forn', 'F': 'Forn',
              'g': 'grek', 'G': 'Grek',
              'h': 'herf', 'H': 'Herf',
              'i': 'isk', 'I': 'Isk',
              'j': 'jenth', 'J': 'Jenth',
              'k': 'krill', 'K': 'Krill',
              'l': 'leth', 'L': 'Leth',
              'm': 'mern', 'M': 'Mern',
              'n': 'nern', 'N': 'Nern',
              'ñ': 'ñern', 'Ñ': 'Ñern',
              'o': 'osk', 'O': 'Osk',
              'p': 'peth', 'P': 'Peth',
              'q': 'qek', 'Q': 'Qek',
              'r': 'resh', 'R': 'Resh',
              's': 'senth', 'S': 'Senth',
              't': 'trill', 'T': 'Trill',
              'u': 'usk', 'U': 'Usk',
              'v': 'vev', 'V': 'Vev',
              'w': 'wesk', 'W': 'Wesk',
              'x': 'xesh', 'X': 'Xesh',
              'y': 'yirt', 'Y': 'Yirt',
              'z': 'zerek', 'Z': 'Zerek'
              }


def latinAurebesh(frase) -> str:
    nuevaFrase = ""
    for i in frase:
        if i in abecedario:
            nuevaFrase += abecedario[i]
        else:
            nuevaFrase += i
    return nuevaFrase


def aurebeshLatin(frase) -> str:
    nuevaFrase = f"{frase}"
    auxAbecedario = {}

    for key, value in abecedario.items():
        auxAbecedario.update({value: key})

    for key, value in auxAbecedario.items():
        if key in frase:
            nuevaFrase = nuevaFrase.replace(key, value)

    return nuevaFrase


op = int(input("Choose the option \n 1. translate latin to aurebesh \n 2. translate aurebesh to latin \n op: "))
print('\n')
if (int(op) == 1):
    frase = input("Write a sentence to translate:\n")
    print(latinAurebesh(frase))
elif (op == 2):
    frase = input("Write a sentence to translate:\n")
    print(aurebeshLatin(frase))
else:
    exit(1)
