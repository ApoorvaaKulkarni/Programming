Year = int(input("Enter a year: "))
if((Year % 4 == 0) & (Year % 100 != 0) | (Year %400 == 0)):
    print("{} is a leap Year".format(Year))
else:
    print(("{} is not a leap year".format(Year)))