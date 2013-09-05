package ar.edu.tadp.ageofempires

class Tanque(val potencialOfensivo:Int) extends Atacante with Defensor {

  def potencialDefensivo(): Int = 100

  def atacarA(unGuerrero:Guerrero) = {
    super.atacarA(unGuerrero)
  }
  
  override def atacarA(unDefensor: Defensor) = {
    unDefensor.perderEnergia(200)
  }
}