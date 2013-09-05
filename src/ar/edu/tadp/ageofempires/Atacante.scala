package ar.edu.tadp.ageofempires

abstract class Atacante {

  def potencialOfensivo: Int

  def atacarA(unDefensor: {def perderEnergia(value:Int); def potencialDefensivo:Int}) = {
    if (unDefensor.potencialDefensivo < this.potencialOfensivo) {
      unDefensor.perderEnergia(this.potencialOfensivo - unDefensor.potencialDefensivo)
    }
  }
}
