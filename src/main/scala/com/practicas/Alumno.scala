package com.practicas

class Alumno(val nombre: String, val edad: Int) {
  def saludar(): Unit = {
    println(s"Hola, mi nombre es $nombre y tengo $edad años");
  }
}