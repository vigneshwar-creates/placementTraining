# Take 10 elements in an array and find the sum of all elements.

# Constraints:
# 0 <= arr[i] <= 1000 ; 0<=i<=9

# Input:
# An array of 10 integer elements, each in a new line.
# Output:
# A single integers obtained when all the array elements are added.

# Example:

# Input:
# 1
# 2
# 3
# 4
# 5
# 1
# 2
# 3
# 4
# 5
# Output
# 30


arr = []
for i in range(10):
    arr.append(int(input()))

print(sum(arr))
