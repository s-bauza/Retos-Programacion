
class OpcionMultiple:
    def __init__(self,pregunta,opciones,puntuaciones):
        self.pregunta = pregunta
        self.opciones = opciones
        self.puntuaciones = puntuaciones
    
    def get_Preguntas(self):
        print(self.pregunta)
        for i, opcion in enumerate(self.opciones):
            print(f"{i+1}. {opcion}")
    
    def get_Puntuaciones(self,indice):
        return self.puntuaciones[indice]


preguntas = [
    OpcionMultiple("¿Cuál de las siguientes cualidades valoras más en un amigo?",["Coraje","Sabiduría","Lealtad","Ambición"],[1,2,3,4]),
    OpcionMultiple("Si fueras un animago, ¿qué animal te gustaría ser?",["León","Águila","Serpiente","Tejón"],[1,2,3,4]),
    OpcionMultiple("¿Cuál es tu asignatura favorita en Hogwarts?",["Defensa Contra las Artes Oscuras","Astronomía","Pociones","Herbología"],[1,2,3,4]),
    OpcionMultiple("En una situación de conflicto, ¿qué harías?",["Lucharía por lo que creo que es correcto","Buscaría una solución pacífica","Protegería a mis amigos a toda costa","Haría lo necesario para alcanzar mi objetivo"],[1,2,3,4]),
    OpcionMultiple("¿Qué cualidad valoras más en ti mismo?",["Valentía","Inteligencia","Lealtad","Ambición"],[1,2,3,4]),
    OpcionMultiple("¿Cuál de las siguientes materias mágicas te gustaría estudiar?",["Adivinacion","Runas Antiguas","Cuidado de Criaturas Mágicas","Estudios Muggles"],[1,2,3,4])
]

puntuacion=0

for pregunta in preguntas:
    print()
    pregunta.get_Preguntas()
    eleccion = int(input("Selecciona tu respuesta: ")) - 1
    puntuacion+=pregunta.get_Puntuaciones(eleccion)

if 6<=puntuacion<=10:
    print("Gryffindor")
elif 11<=puntuacion<=15:
    print("Ravenclaw")
elif 16<=puntuacion<=20:
    print("Hufflepuff")
else :
    print("Slytherin")