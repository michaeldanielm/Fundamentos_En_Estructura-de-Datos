# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

def BusquedaBinaria(lista, first, last, target):
    if (first > last):
        index = -1  # Objetivo no en la lista original
    else:
        # Si el objetivo está en la lista
        # lista[primero] <= Objetivo <= lista[ultimo]
        mid = int(first + (last - first)/2)
        if (target == lista[mid]):
            index = mid #Objetivo encontrado en la lista[medio]
        elif (target < lista[mid]):
            # Punto X
            index = BusquedaBinaria(lista, first, mid - 1, target)
        else:
            index = BusquedaBinaria(lista, mid + 1, last, target)
    return index



miLista = [1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30]
print("Su lista es", miLista)
# para buscar el numero ingres el numero minimo del vector, luego el maximo, luego el valor a buscar en el vector + 1
print("Indice de su objetivo", BusquedaBinaria(miLista, 0, 30,9+1))