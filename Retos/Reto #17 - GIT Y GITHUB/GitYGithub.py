import requests
REPOSITORY = "s-bauza/Retos-Programacion"
COMMITS_CANT = "10"
url = "https://api.github.com/repos/" + REPOSITORY + "/commits?per_page=" + COMMITS_CANT
response = requests.get(url)
if response.status_code == 200:
    data = response.json()
    
    for i,data  in enumerate(data):
        print(f"{i+1} | {data['sha']} | {data['commit']['author']['name']} | {data['commit']['message']} | {data['commit']['author']['date']}".replace("\n",""))

else:
    print(f"Error: {response.status_code}")
