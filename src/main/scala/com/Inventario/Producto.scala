package com.inventario

class Producto(val nombre: String, val precio: Double) {
  var descripcion: String = "Sin descripción"

    // Constructor auxiliar 1
  def this(nombre: String) = {
    this(nombre, 0.0)
    this.descripcion = "Sin descripción"
  }

  // Constructor auxiliar 2
  def this(nombre: String, descripcion: String) = {
    this(nombre, 0.0)
    this.descripcion = descripcion
  }

  println(s"Producto creado: $nombre, Precio: $precio, Descripción: $descripcion")
}