# adviters-java-oop
Ejercicio:

La empresa Capcom desea desarrollador una nueva entrega del Resident Evil, nos dan unas especificaciones sobre cómo quiere que sea el Personaje:

Debe tener un nombre
Debe tener una edad (entre 18 a 50 años)
Debe tener un sexo (H hombre, M mujer) - Pueden resolverlo usando enums o variables final.
Debe tener un peso y altura (el peso puede ser un entero sin decimales entre 60 a 120 y la altura es un campo de punto flotante entre 1.45 hasta 1.85)
Debe tener un inventario que contendrá un listado de los items que dispone.
Una variable de salud que puede tener los siguientes valores:
​​​​​​​Bien (FINE)
Cuidado (WARNING)
Critico (DANGER)
El sexo por defecto será H, la salud por defecto será Bien (FINE), el resto de los campos son obligatorios:

Un constructor con todos los atributos menos sexo y salud.
Un constructor con todos los atributos.
Los items del inventario por defecto tendrán estos atributos:

Nombre del objeto
Cantidad
De estos items podemos tener tres tipos de objetos con sus respectivos atributos:

Objetos curativos:
Porcentaje de salud que recupera
Armas:
Capacidad: cantidad de balas que puede tener
Categoria (Armas pesadas, armas blancas, arma primaria, arma secundaria)
Objetos clave:
Es reutilizable (boolean)
Es necesario aclarar que los items no deberían poder instanciarse solos, sino a través de la herencia. Por lo que deberíamos hacer esa clase lo más abstracta posible.

Los métodos que se van a implementar son:

showHealth(): esto nos va a indicar la salud del personaje
showCharacterInfo(): nos indicará la información del personaje sin incluir su inventario.
showInventory(): nos indicará los items que el personaje dispone en su inventario.
getters y setters correspondientes.
En el main se va a solicitar lo siguiente:

Que se escriba por teclado los datos del personaje.
En caso que el usuario escriba un dato fuera de rango volver a solicitarle que la vuelva a ingresar (pueden usar un while para esto)
Los datos numericos no pueden ser negativos (no hay edades, ni pesos ni alturas negativos)
El inventario tiene que tener al menos 4 items de distinto tipo.
Mostrar la información del personaje y su inventario.
