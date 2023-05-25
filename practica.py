#Función para crear la lista 
def crearLista():
    lista=[]
    valor= int(input())
    while(valor!=0):
        lista.append(valor)
        valor= int(input())
    return lista

#Función que se encarga de sumar los numeros en las posiciones impares
# Iniciando desde el primer impar que es la posición 1
def sumaImpares(lista):
    suma=int(0)
    for i in range(1,len(lista),2):
        suma+=lista[i]
    return suma

#Función que se encarga de promediar los numeros en las posiciones pares
# Iniciando desde el primer par que es la posición 0
def promedioPares(lista):
    suma=int(0)
    cont=int(0)
    for i in range(0,len(lista),2):
        suma+=lista[i]
        cont+=1
    promedio= round((float(suma/cont)),0)
    promedio= promedio**2
    return promedio

#Función que multiplica los valores del punto b y c
def multiplicaion(b,c):
    print(b*c)


l= crearLista()
puntoB=sumaImpares(l)
puntoC=promedioPares(l)
multiplicaion(puntoB,puntoC)
