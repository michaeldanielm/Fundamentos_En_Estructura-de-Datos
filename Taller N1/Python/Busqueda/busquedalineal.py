# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

def Busquedalineal(item,lista):
    Encontro = False
    posicion = 0
    while posicion < len(lista) and not Encontro:
        if lista[posicion] == item:
            Encontro = True
        posicion = posicion + 1
    return Encontro
lista=[40,45,56,25,18,48,27,35,30,37,91,96,67,28,73,81,47,90,51,55,9,36,64,61,74,39,89,99,21,69,17,87,8,70,53,6,20,97,3,86,52,79,82,44,1,19,2,34,11,72,85,88,15,92,16,66,24,77,33,10,49,14,13,65,76,43,68,75,71,26,84,60,41,46,94,12,7,23,22,93,38,54,50,57,100,31,83,32,5,4,63,62,80,95,58,29,42,59,98,78]
print(lista)
item = input("Ingrese el Numero que desea Buscar:")
itemFound = Busquedalineal(item, lista)
if itemFound:
    print("El Numero Se encuentra en el arreglo")
else:
    print("El Numero No Se encuentra en el arreglo")