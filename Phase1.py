#Value the customer Input.
#Initially getting the Optimum Solution's condition.
#By Punit Shelar

def optimumsolution(x, y):
    if x == 4 and y == 3:
        print(" 0 3 \n 3 0 \n 3 3 \n 4 2 \n 0 2 \n 2 0")
        return True
    elif x == 4 and y == 0:
        print(" 4 3 \n 0 3 \n 3 0 \n 3 3 \n 4 2 \n 0 2 \n 2 0")
        return True
    elif x == 0 and y == 3:
        print(" 3 0 \n 3 3 \n 4 2 \n 0 2 \n 2 0")
        return True
    elif x == 3 and y == 0:
        print(" 3 3 \n 4 2 \n 0 2 \n 2 0")
        return True
    elif x == 3 and y == 3:
        print(" 4 2 \n 0 2 \n 2 0")
        return True
    elif x == 4 and y == 2:
        print(" 0 2 \n 2 0")
        return True
    elif x == 0 and y == 2:
        print(" 2 0")
        return True
    elif x == 2 and y == 0:
        print(" 2 0")
        return True
    else:
        return False
print("Note : Water has to be entered in terms of Litre. "
      "Minimum 1 litre of water has to be entered in either of the Jug.")
x = int(input("Enter Water in 4 litre Jug"))
y = int(input("Enter Water in 3 litre Jug"))
currentstatus = optimumsolution(x,y)

if(bool(currentstatus) == False):
    if((x == 0 and y == 1) or (x == 1 and y == 0)):
        x = 1
        y = 0
        print(x,y)
        x = 1
        y = 3
        print(x,y)
        x = 4
        y = 0
        print(x,y)
        optimumsolution(x,y)
    elif ((x == 1 and y == 1)):
        x = 2
        y = 0
        print(x, y)
    elif ((x == 2 and y == 2)):
        x = 4
        y = 0
        print(x, y)
        optimumsolution(x, y)
    elif ((x == 1 and y == 2) or (x == 2 and y == 1)):
        x = 3
        y = 0
        print(x,y)
        optimumsolution(x, y)
    elif ((x == 1 and y == 3) or (x == 2 and y == 2) or (x == 3 and y == 1)):
        x = 4
        y = 0
        print(x,y)
        optimumsolution(x, y)
    elif ((x == 2 and y == 3) or (x==3 and y==2) or (x==4 and y==1)):
        x = 4
        y = 1
        print(x,y)
        x = 0
        y = 1
        print(x,y)
        x = 1
        y = 0
        print(x,y)
        x = 1
        y = 3
        print(x,y)
        x = 4
        y = 0
        print(x,y)
        optimumsolution(x, y)
    elif ((x == 3 and y == 3)):
        x = 4
        y = 2
        print(x,y)
        optimumsolution(x, y)
    elif ((x == 4 and y == 3)):
        x = 0
        y = 3
        print(x,y)
        optimumsolution(x, y)

print("SuccessFul")










