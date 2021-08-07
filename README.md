# Calculo_IMC

Crear una clase llamada Persona que siga las siguientes condiciones:

(Req 1) atributos son: nombre, edad, CC, genero (H hombre, M mujer), peso y

estatura. (Aplicar encapsulamiento).

(Req 2) Crear los modificadores de acceso para los atributos, el atributo CC no puede ser modificable.

(Req 3) Se implantaran varios constructores:

Un constructor por defecto.

Un constructor con el nombre, edad y genero, el resto por defecto.

Un constructor con todos los atributos como parámetro.

(Req 4) Los métodos que se implementaran son:

1.                 calcularIMC(): calculara si la persona esta en su peso ideal (peso en

kg/( estatura ^2 en m)), si esta fórmula devuelve un valor menor que 20, la

función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos),

significa que esta por debajo de su peso ideal la función devuelve un 0 y si

devuelve un valor mayor que 25 significa que tiene sobrepeso, la función

devuelve un 1.

2.             esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.

3.             comprobarGenero(char genero): comprueba que el genero introducido es

correcto. Si no es correcto, será H.

4.             toString(): devuelve toda la información del objeto.

5.             generaCC(): genera un número aleatorio de 8 cifras,

(Req 5) Crear una clase Main que haga lo siguiente:

a.     Pide por teclado el nombre, la edad, genero, peso y estatura.

b.     Crear 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores

variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores

menos el peso y la estatura y el último por defecto, para este último utiliza los

métodos set para darle a los atributos un valor.

c.     Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o

por debajo de su peso ideal con un mensaje.

d.     Indicar para cada objeto si es mayor de edad.

e.     Por último, mostrar la información de cada objeto.

Puede usar métodos en la clase Main.
