package ar.edu.tadp.ageofempires

class Muralla(val potencialDefensivo: Int) {
  var energia = 100

  def perderEnergia(cantidad: Int) = {
    energia = (energia - cantidad).max(0)
  }
}