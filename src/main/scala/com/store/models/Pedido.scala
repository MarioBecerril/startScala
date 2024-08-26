package com.store.models

case class Pedido(
  id: Int,
  clienteId: Int,
  productos: List[ProductoEnPedido],
  estado: EstadoPedido = EstadoPedido.Pendiente
)

case class ProductoEnPedido(
  productoId: Int,
  cantidad: Int,
  precioUnitario: Double
)

object Pedido {
  def calcularTotal(pedido: Pedido): Double = {
    pedido.productos.map(p => p.cantidad * p.precioUnitario).sum
  }

  def agregarProducto(pedido: Pedido, producto: Producto, cantidad: Int): Pedido = {
    val nuevoProductoEnPedido = ProductoEnPedido(producto.id, cantidad, producto.precio)
    pedido.copy(productos = pedido.productos :+ nuevoProductoEnPedido)
  }

  def actualizarEstado(pedido: Pedido, nuevoEstado: EstadoPedido): Pedido = {
    pedido.copy(estado = nuevoEstado)
  }
}

sealed trait EstadoPedido
object EstadoPedido {
  case object Pendiente extends EstadoPedido
  case object EnProceso extends EstadoPedido
  case object Enviado extends EstadoPedido
  case object Entregado extends EstadoPedido
  case object Cancelado extends EstadoPedido
}