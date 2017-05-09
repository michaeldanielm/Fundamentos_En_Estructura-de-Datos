# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

import random

array = []

for i in range (10):
  array.append(random.randint(0 , 1 ))
  
print array

t= int(len(array)/2)
t= t*2
tam = (len(array) - i + 1 )

for i in range (t,0,-2):

  for j in range (t,tam):
    
    cout0=0
    cout1=0
    
    for k in range () :
      
      if k == 0:
        cout0 = cout0 + 1
        
      else: 
        cout1 = cout1 +1
print tam