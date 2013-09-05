package ar.edu.tadp.ageofempires

class Tanque(val potencialOfensivo:Int) extends Atacante with Defensor {

  def potencialDefensivo(): Int = 100

  override def atacarA(unDefensor: Defensor) = {
    unDefensor.sosAtacadoPorTanque(this)
  }
  
  def atacarConAmetralladora(unGuerrero: Guerrero) = {
    super.atacarA(unGuerrero)
  }
}