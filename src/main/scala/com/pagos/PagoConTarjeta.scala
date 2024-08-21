package com.pagos

trait PagoConTarjeta {
  def pagarConTarjeta(monto: Double): Unit = {
    println(s"Procesando el pago de $$${monto} con tarjeta.")
  }
}