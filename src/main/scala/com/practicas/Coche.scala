package com.practicas

class Coche(marca: String, modelo: String, val puertas: Int) extends Vehiculo(marca, modelo) {
  def tocarClaxon(): Unit = {
    println(s"El coche $marca $modelo está tocando el claxon.")
    println(s"El coche $marca $modelo tiene $puertas puertas.")
  }
}