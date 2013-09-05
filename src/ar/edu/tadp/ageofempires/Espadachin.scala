package ar.edu.tadp.ageofempires

class Espadachin(potencialOfensivo: Int, potencialDefensivo: Int, val habilidad: Double, val espada: Espada) extends Guerrero(potencialOfensivo, potencialDefensivo) {

  override def potencialOfensivo = {
    (super.potencialOfensivo + espada.poder * habilidad).toInt
  }
}