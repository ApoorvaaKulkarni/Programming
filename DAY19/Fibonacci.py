num = int(input("Enter a number: "))
f = [0,1]
for i in range(2,num):
    next = f[i - 1] + f[i - 2]
    if next <= num:
        f.append(next)
    else:
        break
print(f)