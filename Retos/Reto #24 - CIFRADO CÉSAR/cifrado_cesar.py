
alphabet_C = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
alphabet_L = "abcdefghijklmnopqrstuvwxyz"

def ave_cesar (text: str, shift: int) -> str:
    result = ""
    for i in range(len(text)):
        
        if alphabet_C.find(text[i]) != -1 :
            result += alphabet_C[(alphabet_C.find(text[i])+shift)%26]
        elif alphabet_L.find(text[i]) != -1:
            result += alphabet_L[(alphabet_L.find(text[i])+shift)%26]
        else:
            result+=text[i]
    return result

def eva_rasec(text: str, shift: int ):
    result=""
    for i in range(len(text)):
        if alphabet_C.find(text[i]) != -1 :
            result += alphabet_C[(alphabet_C.find(text[i])-shift)%26]
        elif alphabet_L.find(text[i]) != -1:
            result += alphabet_L[(alphabet_L.find(text[i])-shift)%26]
        else:
            result+=text[i]
    return result

encryption =ave_cesar(""""Ustedes son el pueblo iluminado por la luz de la luna". 
Guiados en la oscuridad y las estrellas, el destino forjado por las manos del tiempo. Aunque nuestros sueños se entrelazan con las estrellas estamos destinados a caminar en un camino trazado, un futuro incierto inevitable""",24)

print(encryption)
print(eva_rasec(encryption,24))