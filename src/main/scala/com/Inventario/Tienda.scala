package com.inventario

class Tienda(val nombre: String, val direccion: String) {
  var productos: List[Producto] = List()

  // Constructor auxiliar
  def this(nombre: String) = {
    this(nombre, "Dirección no especificada")
    println(s"Tienda creada: $nombre sin dirección específica")
  }

  def agregarProducto(producto: Producto): Unit = {
    productos = producto :: productos
  }

  println(s"Tienda creada: $nombre en $direccion")
}