size=int(input("Enter the size of array"))

arr=[]

print(f"Enter the {size} elements:")

print("Enter the array elements=")
for i in range(size):
    value=int(input(f"arr[{i}]="))
    arr.append(value)

print("Array elements are=")
for i in range(size):
    print(f"arr[{i}]={arr[i]}") 


