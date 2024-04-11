word = input("Enter the word: ")
rev = word[::-1]
print(rev)
if(rev == word):
    print("{} is a palindrome".format(word))
else:
    print("{} is not palindrome".format(word))