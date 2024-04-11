a = int(input("Enter a number: "))
b = int(input("Enter a number: "))
c = int(input("Enter a number: "))
d = int(input("Enter a number: "))
if(a > b and a > c and a > d):
    print("greatest number is: {}".format(a))
elif(b > c and b > d and b > a):
    print("greatest number is: {}".format(b))
elif(c > a and c > b and c > d):
    print("greatest number is: {}".format(c))
elif(d > a and d > b and d > c):
    print("greatest number is: {}".format(d))