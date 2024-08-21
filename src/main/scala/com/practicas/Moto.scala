package com.practicas

class Moto(marca: String, modelo: String, val tipo: String) extends Vehiculo(marca, modelo) {
  def hacerCaballito(): Unit = {
    println(s"La moto $marca $modelo está haciendo un caballito.")
  }
}