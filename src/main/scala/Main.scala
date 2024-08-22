
import com.pagos.{Pedido, TipoPago}
import com.inventario.{Producto, Tienda}
import com.practicas.Alumno;
import com.practicas.{Coche, Moto}
import com.practicas.Persona

object Main extends App {
  println("**** Hello, World! ****");

  val alumno = new Alumno("Juan", 20);

  println(alumno.nombre);

  alumno.saludar();

  println(' ');
  println("**** Clases y Herencia ****");

  val miCoche = new Coche("Toyota", "Corolla", 4)
  miCoche.arrancar()
  miCoche.tocarClaxon()
  miCoche.detener()

  val miMoto = new Moto("Yamaha", "R1", "Deportiva")
  miMoto.arrancar()
  miMoto.hacerCaballito()
  miMoto.detener()

  println(' ');
  println("**** Clases con Traits y Enumeration ****");

  val pedido1 = new Pedido(1, 99.99, TipoPago.Tarjeta)
  val pedido2 = new Pedido(2, 49.99, TipoPago.Paypal)

  pedido1.procesarPago()
  pedido2.procesarPago()

  println(' ');
  println("**** Constructores auxiliares ****");

  val tienda1 = new Tienda("Tienda A", "Calle Principal 123")
  val tienda2 = new Tienda("Tienda B")

  val producto1 = new Producto("Producto X", 10.0)
  val producto2 = new Producto("Producto Y")
  val producto3 = new Producto("Producto Z", "Un producto de ejemplo")

  tienda1.agregarProducto(producto1)
  tienda2.agregarProducto(producto2)
  tienda1.agregarProducto(producto3)

  println(' ');
  println("*** Case Classes ****");
  
  val persona1 = Persona("Mario", 30) // No es necesario usar `new`
  println(persona1.nombre) 
  println(persona1.edad) 

  // Utilización de métodos generados automáticamente
  val persona2 = persona1.copy(edad = 31)
  println(persona2) 

  println(persona1 == persona2) // false
  println(persona1 == Persona("Mario", 30)) // true

  // Pattern Matching
  persona1 match {
    case Persona(nombre, edad) => println(s"Nombre: $nombre, Edad: $edad")
  }

}
 