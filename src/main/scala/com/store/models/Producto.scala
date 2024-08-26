package com.store.models

case class Producto(
  id: Int,
  nombre: String,
  precio: Double,
  stock: Int
)

object Producto {
  def aplicarDescuento(producto: Producto, descuento: Double): Producto = {
    producto.copy(precio = producto.precio * (1 - descuento))
  }

  def actualizarStock(producto: Producto, cantidad: Int): Producto = {
    producto.copy(stock = producto.stock + cantidad)
  }

  def estaDisponible(producto: Producto): Boolean = {
    producto.stock > 0
  }
}