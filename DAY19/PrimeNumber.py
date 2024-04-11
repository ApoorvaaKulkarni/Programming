Number = int(input("Enter a number : "))
Num = int(input("Enter number constraint: "))
count = 0
for i in range(1, Num+ 1):
    if(Number % i == 0):
        count += 1
print("Number of count", count)
if(count > 2):
    print("not prime")
else:
    print("prime")