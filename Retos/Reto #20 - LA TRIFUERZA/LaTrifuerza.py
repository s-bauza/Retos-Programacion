

def triforce(n):
    row = n *2
    print(f"The triforce {n}")
    for i in range(0,n):
       print(" "*(row-i) + "*"*(2*i+1))
    for i in range(0,n):
       print(" "*(n-i) + "*"*(2*i+1)+" "*(2*(n-i)-1)+"*"*(2*i+1))

triforce(1)
triforce(2)
triforce(5)
triforce(7)
triforce(20)
 




