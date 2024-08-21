package com.pagos

import com.pagos.TipoPago._

class Pedido(val id: Int, val monto: Double, val tipoPago: TipoPago) extends PagoConTarjeta with PagoConPaypal {

  println(s"Creando pedido con id $id y monto $$${monto}")

  def procesarPago(): Unit = {
    tipoPago match {
      case Tarjeta => pagarConTarjeta(monto)
      case Paypal => pagarConPaypal(monto)
      case _ => println("Método de pago no soportado.")
    }
  }
}