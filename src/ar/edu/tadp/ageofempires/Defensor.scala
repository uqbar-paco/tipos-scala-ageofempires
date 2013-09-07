package ar.edu.tadp.ageofempires

trait Defensor {
  
  def potencialDefensivo:Int
  
  var energia = 100

  def perderEnergia(cantidad: Int) = {
    energia = (energia - cantidad).max(0)
  }
}
