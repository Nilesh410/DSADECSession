class StackImp:
    def __init__(self):
        self.arr=[]
    
    def isEmpty(self):
        if(len(self.arr)==0):
            return True
        else:
            return False
    def push(self,num):
        self.arr.append(num)

    def pop(self):
        if(self.isEmpty()):
            print("We cant remove any element ")
        else:
            result=self.arr.pop()
            print("pop element=",result)
    
    def display(self):
        for i in reversed (self.arr):
            print(i,end=" ")
        print("")
    
    def peek(self):
        print("Top element:=",self.arr[-1])

    def size(self):
        print("Size of stack=",len(self.arr))


obj= StackImp()
obj.push(12)
obj.push(23)
obj.push(34)
obj.display()
obj.pop()
obj.pop()
print("stack element:")
obj.display() 

obj.peek()
obj.size()



