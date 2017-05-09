# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

A = [10, 4, 1, 6, 2]
n = 5
B = [0 for i in range(n)]
print("Si A :")
producto = 1 
for i in range(1):
    
    print(A)

for i in range(n):
    producto *= A[i]

for i in range(n):
    B[i] = producto / A[i]

print("Entonce B :")
for i in range(1):
    print(B)
    