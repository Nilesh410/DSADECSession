class QueueImp:
    def __init__(self):
        self.arr=[]
    
    def isEmpty(self):
        if(len(self.arr)==0):
            return True
        else:
            return False
        
    def enqueue(self,num):
        self.arr.append(num)

    def dequeue(self):
        if(self.isEmpty()):
            print("We cant remove any element ")
        else:
            result=self.arr.pop(0)
            print("pop element=",result)
    
    def display(self):
        for i in (self.arr):
            print(i,end=" ")
        print("")
    
    def peek(self):
        print("Top element:=",self.arr[0])

    def size(self):
        print("Size of stack=",len(self.arr))


obj= QueueImp()
obj.enqueue(12)
obj.enqueue(23)
obj.enqueue(34)
print("Queue element:")
obj.display()
obj.dequeue()
obj.dequeue()
print("Queue element:")
obj.display() 

obj.peek()
obj.size()



