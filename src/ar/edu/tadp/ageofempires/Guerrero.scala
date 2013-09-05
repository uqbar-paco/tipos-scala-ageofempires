package ar.edu.tadp.ageofempires

class Guerrero(potencialOfensivoValue: Int, val potencialDefensivo: Int) extends Atacante with Defensor {
  def potencialOfensivo: Int = potencialOfensivoValue
  
  override def sosAtacadoPorTanque(unTanque:Tanque) = {
    unTanque.atacarConAmetralladora(this)
  }
}