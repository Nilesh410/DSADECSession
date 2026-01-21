def isValidString(s:str)->bool:
    st=[]
    for i in s:
        if i in "([{":
            st.append(i)
        else:
            if(not st):
                return False
            else:
                ch=st[-1]
                if (ch=='(' and  i==')') or \
                    (ch=='{' and i=='}') or \
                    (ch=='[' and i==']'):
                    st.pop()
                else:
                    return False
    return not st




s="[{()]}"
result=isValidString(s)
if result:
    print("Is a valid string")
else:
    print("is not a valid string")