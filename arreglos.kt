fun main(){ //Se define la función main la cual indica
//el punto de entrada
    val array = intArrayOf(12, 8, 6, 5) //se crea el arreglo de valores enteros
    var sum = 0 //Aquí se inicia la variable sum que inicia en 0
    //para asi almacenar los datos del areglo
    for (num in array){ //se utiliza el bucle for para iterar a traves del arreglo
        sum += num //Dentro del bucle for, agrega el valor actual del elemento del arreglo a la variable sum.
    }
    println ("La suma de los elementos del arreglo es: $sum") //se imprime el resultado
}