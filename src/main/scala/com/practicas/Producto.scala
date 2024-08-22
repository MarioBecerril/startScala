package com.practicas


class Producto(val nombre: String, val precio: Double) {
  def mostrarInfo(): Unit = {
    println(s"Producto: $nombre, Precio: $precio")
  }
}

object Producto {
  // Método apply para crear instancias sin new
  def apply(nombre: String, precio: Double): Producto = {
    new Producto(nombre, precio)
  }

  // Método adicional en el Companion Object
  def productoGratis(nombre: String): Producto = {
    new Producto(nombre, 0.0)
  }
}

/**
 * Uso de la clase Producto y su Companion Object
  * val producto1 = Producto("Laptop", 1500.0)
  * val producto2 = Producto.productoGratis("Mouse")
  * producto1.mostrarInfo() // Producto: Laptop, Precio: 1500.0
  * producto2.mostrarInfo() // Producto: Mouse, Precio: 0.0
  */