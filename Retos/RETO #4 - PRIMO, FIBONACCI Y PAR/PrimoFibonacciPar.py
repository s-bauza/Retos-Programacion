def Fibonacci(num, a=0, b=1):
    if num == a:
        return True
    elif a > num:
        return False
    else:
        return Fibonacci(num, b, a+b)


for num in range(0, 101):
    esFibonacci = "no es Fibonacci"
    esPrimo = "no es primo"
    esParImpar = "par"

    if Fibonacci(num):
        esFibonacci="es Fibonacci"
    

    if num % 2 == 0:
        esParImpar = "par"
        if num == 2:
            esPrimo = "es primo"

    else:
        esParImpar = "impar"
        if num == 3 or num == 5 or num % 3 != 0:
            esPrimo = "es primo"

    print(f"{num} {esPrimo}, {esFibonacci} y es {esParImpar} {Fibonacci(num)}")

