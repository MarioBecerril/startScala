package com.store

import com.store.models._
import com.store.utils.FuncionesUtiles

object Index {
    def ejecutar(): Unit = {
        // List productos
        val productos = List(
            Producto(1, "Camiseta", 20.0, 100),
            Producto(2, "Pantalón", 40.0, 50),
            Producto(3, "Zapatos", 60.0, 30)
        )

        // Funciones de orden superior
        val productosCostosos = FuncionesUtiles.filtrarProductos(productos)(_.precio > 30.0)
        println(s"Productos costosos: $productosCostosos")

        // Usar aplicarIVA simple
        val productosConIVA = productos.map(p => p.copy(precio = FuncionesUtiles.aplicarIVA(p.precio)))
        println(s"Productos con IVA (método simple): $productosConIVA")

        // Usar aplicarIVAEstandar (partially applied function)
        val productosConIVAEstandar = productos.map(p => p.copy(precio = FuncionesUtiles.aplicarIVAEstandar(p.precio)))
        println(s"Productos con IVA (método estándar): $productosConIVAEstandar")

        // Composición de funciones
        val precioFinal = FuncionesUtiles.calcularPrecioFinal(100.0)
        println(s"Precio final: $precioFinal")

        // Currying
        val calcularPrecioConDescuentoEIVA = FuncionesUtiles.aplicarDescuentoYImpuesto(0.1)(0.21)(_)
        val precioFinalConDescuento = calcularPrecioConDescuentoEIVA(100.0)
        println(s"Precio final con descuento e IVA: $precioFinalConDescuento")

        // Crear un pedido
        val cliente = Cliente(1, "Juan Pérez", "juan@example.com")
        val pedido = Pedido(1, cliente.id, List(
            ProductoEnPedido(1, 2, 20.0),
            ProductoEnPedido(2, 1, 40.0)
        ))

        // Calcular total del pedido
        val totalPedido = Pedido.calcularTotal(pedido)
        println(s"Total del pedido: $totalPedido")

        // Usar el contador de pedidos
        val contadorPedidos = FuncionesUtiles.crearContadorPedidos()
        println(s"Número de pedido: ${contadorPedidos()}")
        println(s"Número de pedido: ${contadorPedidos()}")

    }
}