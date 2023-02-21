fun main() {
    // Crear un mapa de cadenas y enteros que represente la cantidad de frutas en la cocina
    val frutas = mapOf("manzanas" to 5, "bananas" to 2, "naranjas" to 3)
    // Obtener la cantidad de manzanas en el mapa utilizando la notación de corchetes
    val cantidadManzanas = frutas["manzanas"] ?: 0
    // Imprimir la cantidad de manzanas
    println("Tienes $cantidadManzanas manzanas en tu cocina.")
}