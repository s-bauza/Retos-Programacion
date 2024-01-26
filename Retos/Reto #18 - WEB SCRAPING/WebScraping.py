import time
from bs4 import BeautifulSoup
import requests

start_time = time.time()  # tiempo de ejecucion del programa

anime_already_seen = []   #lista para guardar los animes
anime_favorite_image_link = []  #lista para guardar los links de las imagenes de los animes

for i in range(1,12):   #bucle para recorrer las paginas de la lista de animes favoritos solo llega hasta la pagina 9 es una prueba
    
    # print(f'Page: {i}') #comprobar la pagina en la que estoy
    
    html_text = requests.get(f'https://www3.animeflv.net/perfil/Cordico/favoritos?page={i}').text #pagina a la que quiero acceder

    soup = BeautifulSoup(html_text, 'lxml')

    anime_favorite = soup.find_all('h3', class_='Title') #busco el titulo de los animes
    anime_favorite_image = soup.find_all('div', class_='Image') #busco el link de los animes
    
    anime_favorite_name = [anime.text for anime in anime_favorite] #guardo los titulos en una lista
    
    if anime_favorite_name == []:
        break
    # print()
    for favorite in anime_favorite_name:    #imprimo los titulos
        anime_already_seen.append(favorite)
        #print (favorite)
    for image in anime_favorite_image:
        anime_favorite_image_link.append(image.img['src'])
        #print (f"https://www3.animeflv.net/{image.img['src']}")
        
    # print (f"\nTotal: {len(anime_favorite_name)}")  #imprimo el total de animes 24 por pagina 
    # print()


#imprimir las dos listas de anime y link de imagen en un bucle 
   


for anime,img in zip(anime_already_seen,anime_favorite_image_link) :    #imprimo la lista de animes
    print (f"{anime} https://www3.animeflv.net/{img}")

print("Time taken: %s seconds" % (time.time() - start_time)) #imprimo el tiempo que tarda en ejecutarse el programa