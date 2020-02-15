def miniMaxSum(arr):
    arr.sort()
    max = 0
    min = 0
    for i in range(len(arr) - 4, len(arr)):
        max = max + arr[i]
    for i in range(0, 4):
        min = min + arr[i]
    print(min, max)
