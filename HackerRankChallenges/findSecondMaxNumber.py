# Given an array of integers of size N, write a program to find and print the second largest (2nd maximum) element in the array.

# Note: The second maximum is the largest number excluding the maximum. Assume the array has at least two distinct elements.

# Input Format

# The first line contains an integer N (size of the array).

# The second line contains N space-separated integers representing the array elements.

# Constraints

# 2 ≤ N ≤ 10⁵

# -10⁹ ≤ array elements ≤ 10⁹

# Output Format

# Print a single integer — the second maximum element of the array. Note: If all elements are equal, the second maximum is considered the same as the maximum.

# Sample Input 0

# 5
# 2 8 1 6 3
# Sample Output 0

# 6
# Explanation 0

# Maximum = 8

# Second maximum = 6

arrNum = int(input())
arrInput = list(set(map(int, input().split())))

arrInput.sort() 

if (arrNum >= 2 and arrNum <= pow(10,9)) and (len(arrInput) >= pow(-10,9) and len(arrInput)<= pow(10,9)):
    if len(arrInput) == 1:
        print(arrInput[0])
    else:
        print(arrInput[-2])
