fun main() {
    val conjunto1 = setOf("lizeth", "dahiana")// Se crea un conjunto de cadenas llamado conjunto1
    val conjunto2 = setOf("vaca", "archila")// Se crea el segundo de cadenas llamado conjunto2
    val conjuntoUnido = conjunto1.union(conjunto2) // Se unen los dos conjuntos utilizando la función de extensión "union"
    println(conjuntoUnido) //se imprime el conjunto unido
}