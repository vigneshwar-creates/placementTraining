# Write a program to print the even numbers between 0 to n

number = int(input())

indexCount = int((number / 2) + 1)

for i in range(indexCount):
  if i == indexCount - 1:
    print(i * 2)
  else:
      print(i * 2, end=",")
