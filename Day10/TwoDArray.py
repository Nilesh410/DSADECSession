arr=[]
row=3
clmn=3

# Initialize the array elements 
print("Enter the array elements:")
for i in range (row):
    temp=[]
    for j in range (clmn):
        ele=int(input(f"arr[{i}][{j}]="))
        temp.append(ele)
    arr.append(temp)

# Display the array elements
print("Display the array elements:")
for i in range (0,len(arr)):
    for j in range (0,len(arr[0])):
        print(arr[i][j],end=" ")
    print("")

# Search an element in 2 D array
key=int(input("Enter the element to search:"))
flag=0
for i in range (0,len(arr)):
    for j in range (0,len(arr[0])):
        if(arr[i][j]==key):
            flag=1
            print("Element is present")
            break
if(flag==0):
    print("Element is not present")