package ar.edu.tadp.ageofempires

abstract class Atacante {

  def potencialOfensivo: Int

  def atacarA(guerrero: Guerrero) = {
    if (guerrero.potencialDefensivo < this.potencialOfensivo) {
      guerrero.perderEnergia(this.potencialOfensivo - guerrero.potencialDefensivo)
    }
  }
}
