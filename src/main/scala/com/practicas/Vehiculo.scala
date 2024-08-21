package com.practicas

class Vehiculo(val marca: String, val modelo: String) {
  def arrancar(): Unit = {
    println(s"El vehículo $marca $modelo está arrancando.")
  }

  def detener(): Unit = {
    println(s"El vehículo $marca $modelo se ha detenido.")
  }
}