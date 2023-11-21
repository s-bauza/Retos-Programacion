URL = "https://retosdeprogramacion.com?year=2023&challenge=0"
parametros = []
aux = ""

for i in range(0, len(URL)):
    if URL[i] == "=":
        for j in range(i+1, len(URL)):
            if (URL[j]=="&"):
                break
            aux += URL[j]
        parametros.append(aux)
        aux=""
            
print(parametros)