def espiral(n):
    aux=1
    aux2 = n
    aux3 = 3
    print('═'*(n-1)+'╗')    
    while aux < n/2: 
        print('║'*(aux-1)+'╔'+'═'*(aux2-aux3)+'╗'+'║'*(aux))
        aux3 += 2
        aux += 1
    if n%2 == 0:
        aux3 -= 1
    else:
        aux3 -= 3
    while aux < n-1:            
            print('║'*(n-(aux+1))+'╚'+'═'*(aux2-aux3)+'╝'+'║'*(n-(aux+1)))
            aux3 -= 2
            aux += 1
    if n != 1:
        print('╚'+'═'*(n-2)+'╝')
    
# Always  n > 0
espiral(1)
espiral(2)
espiral(3)
espiral(5)
espiral(20)
espiral(50)
espiral(100)
espiral(101)
