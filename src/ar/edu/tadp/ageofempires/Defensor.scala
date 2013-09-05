package ar.edu.tadp.ageofempires

trait Defensor {
  var energia = 100
  
  def potencialDefensivo:Int

  def perderEnergia(cantidad: Int) = {
    energia = (energia - cantidad).max(0)
  }
}
