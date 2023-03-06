print("Bienvenido al comparador de edades.")
nombrePersona1 = input("Necesito el nombre de la primer persona. ¿Como se llama?: ")
nombrePersona2 = input("Necesito el nombre de la segunda persona. ¿Como se llama?: ")

edadPersona1 = int( input("¿Que edad tiene " + nombrePersona1 + "?:"  ))
edadPersona2 = int( input("¿Que edad tiene " + nombrePersona2 + "?:"))

if edadPersona1 > edadPersona2:
     print(f"{nombrePersona1} Es mayor {nombrePersona2}.")
elif edadPersona1 < edadPersona2:
     print(f"{nombrePersona2} Es mayor {nombrePersona1}.")
else: 
     print(f"!sabemos que {nombrePersona1} y {nombrePersona2}, Tiene la misma Edad!")
