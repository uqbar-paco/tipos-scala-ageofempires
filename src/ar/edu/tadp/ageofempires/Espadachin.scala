package ar.edu.tadp.ageofempires

class Espadachin(potencialOfensivo: Int, potencialDefensivo: Int, val habilidad: Double, val espada: Espada) 
extends Guerrero(potencialOfensivo, potencialDefensivo) {

  override def potencialOfensivo = {
    (super.potencialOfensivo + espada.poder * habilidad).toInt
  }
  
  def saludar = "Soy un espadachin. Hola."
    
  def espadear(unEspadachin: Espadachin) = {
    this.atacarA(unEspadachin)
    unEspadachin.atacarA(this);
  }
}