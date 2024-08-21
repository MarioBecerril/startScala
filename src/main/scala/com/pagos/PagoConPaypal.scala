package com.pagos

trait PagoConPaypal {
  def pagarConPaypal(monto: Double): Unit = {
    println(s"Procesando el pago de $$${monto} con PayPal.")
  }
}