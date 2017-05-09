# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


A = [5, 2, 2, 4, 3, 5, 4, 7, 3]

Repetidos = 0
for i in range(1):
    print(A)

for i in range(9):
    for j in  range(i + 1, 9):
        if(A[i] != A[j]):
            Repetidos = A[i];
print ("Numero NO Repetido")
print(Repetidos)