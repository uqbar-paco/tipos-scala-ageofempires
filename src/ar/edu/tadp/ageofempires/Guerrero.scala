package ar.edu.tadp.ageofempires

class Guerrero(potencialOfensivoValue: Int, val potencialDefensivo: Int) extends Atacante {

  var energia = 100
  
  def potencialOfensivo:Int = potencialOfensivoValue

  def perderEnergia(cantidad: Int) = {
    energia = (energia - cantidad).max(0)
  }
}