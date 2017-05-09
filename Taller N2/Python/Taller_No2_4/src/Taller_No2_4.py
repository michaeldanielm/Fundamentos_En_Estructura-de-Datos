# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.


array =[2, 172, 11, 9, 7, 28, 22, 15, 5, 19, 36,  17]



n = len(array)
minimo = abs(array[0] - array[1])

for i in range (n):
  
  for j in range (n):
    
    if i<j:
      
      minimo = abs(array[i]-array[j]) if abs(array[i] - array[j]) > minimo else minimo
 

print (array)
print("Mayor Numero")
print (minimo+2)