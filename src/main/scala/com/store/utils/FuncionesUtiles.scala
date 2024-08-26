package com.store.utils

import com.store.models._

object FuncionesUtiles {
  // Funciones de orden superior
  def filtrarProductos(productos: List[Producto])(criterio: Producto => Boolean): List[Producto] = {
    productos.filter(criterio)
  }

  //Abstracción y Reutilización
  def aplicarOperacion[A](lista: List[A])(operacion: A => A): List[A] = {
    lista.map(operacion)
  }
  //val productosConDescuento = FuncionesUtiles.aplicarOperacion(productos)(Producto.aplicarDescuento(_, 0.1))
  //val clientesConPuntosExtra = FuncionesUtiles.aplicarOperacion(clientes)(cliente => cliente.copy(puntos = cliente.puntos + 100))

  // Funciones para cálculos financieros
  val calcularTotal: List[Producto] => Double = _.map(_.precio).sum

  val aplicarIVA: Double => Double = _ * 1.21
  val redondear: Double => Double = math.round(_).toDouble
  val calcularPrecioFinal: Double => Double = aplicarIVA andThen redondear

  def aplicarImpuesto(impuesto: Double)(precio: Double): Double = precio * (1 + impuesto)

  def aplicarDescuentoYImpuesto(descuento: Double)(impuesto: Double)(precio: Double): Double = {
    val precioConDescuento = precio * (1 - descuento)
    precioConDescuento * (1 + impuesto)
  }

  // Funciones para crear otras funciones
  def crearCalculadoraDescuento(descuento: Double): Producto => Producto = {
    producto => Producto.aplicarDescuento(producto, descuento)
  }

  def crearContadorPedidos(): () => Int = {
    var contador = 0
    () => {
      contador += 1
      contador
    }
  }

  // Partially applied function
  val aplicarIVAEstandar = aplicarImpuesto(0.21) _
}