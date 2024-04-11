# fact = 1
# for i in range(1, 4):
#     fact = fact * i
# print(fact)
# i = 1
# while(i<= 3):
#     fact *= i
#     i += 1
# print(fact)
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)
fact = factorial(5)
print(fact)
