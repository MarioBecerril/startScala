package com.store.models

case class Cliente(
  id: Int,
  nombre: String,
  email: String,
  puntos: Int = 0
)

object Cliente {
  def aplicarPuntos(cliente: Cliente, puntosNuevos: Int): Cliente = {
    cliente.copy(puntos = cliente.puntos + puntosNuevos)
  }

  def esClientePremium(cliente: Cliente): Boolean = {
    cliente.puntos > 1000
  }
}