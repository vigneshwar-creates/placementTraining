def isPrime(n):
    for i in range (2, n):
        if n % i == 0:
            return False
        else:
            return True

a = int(input())
b = int(input())

if isPrime(a) and isPrime(n):
    print("Both are prime")
else:
    print("Not prime")
