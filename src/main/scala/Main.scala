
import com.pagos.{Pedido, TipoPago}
import com.practicas.Alumno;
import com.practicas.{Coche, Moto}

object Main extends App {
  println("Hello, World!");

  val alumno = new Alumno("Juan", 20);

  println(alumno.nombre);

  alumno.saludar();

  println(' ');
  println(' ');

  val miCoche = new Coche("Toyota", "Corolla", 4)
  miCoche.arrancar()
  miCoche.tocarClaxon()
  miCoche.detener()

  val miMoto = new Moto("Yamaha", "R1", "Deportiva")
  miMoto.arrancar()
  miMoto.hacerCaballito()
  miMoto.detener()

  println(' ');
  println(' ');

  val pedido1 = new Pedido(1, 99.99, TipoPago.Tarjeta)
  val pedido2 = new Pedido(2, 49.99, TipoPago.Paypal)

  pedido1.procesarPago()
  pedido2.procesarPago()

}
 