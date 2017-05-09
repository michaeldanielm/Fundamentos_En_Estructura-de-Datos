# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


valores = [1,2,3,1,4,5,6,2,4,5]
repetido = []
unico = []
print "Lista Original"
print(valores) 
for x in valores:
	if x not in unico:
		unico.append(x)
	else:
		if x not in repetido:
			repetido.append(x)

print "Lista de Valores Sin numeros Repetidos"
print (unico)
print "Los Numeros Repetidos"
print (repetido)