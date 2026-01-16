
def QuickSort(arr,left,right):
    if(left<right):
        p=partition(arr,left,right)
        QuickSort(arr,left,p-1)
        QuickSort(arr,p+1,right)

def partition(arr,left,rigth):
    pivot=arr[left]
    count=0
    for i in range(left+1,right+1):
        if(arr[i]<pivot):
            count=count+1
    p=left+count
    temp=arr[left]
    arr[left]=arr[p]
    arr[p]=temp
    i=left
    j=right
    while (i<p and j>p):
        while(arr[i]<pivot):
            i=i+1
        while(arr[j]>pivot):
            j=j-1
        temp1=arr[i]
        arr[i]=arr[j]
        arr[j]=temp1
    return p


arr=[51,95,66,72,42,38,39,41,15]
left=0
right=len(arr)-1
QuickSort(arr,left,right)
for i in range(0,len(arr)):
    print(arr[i],end=" ")


