package ar.edu.tadp.ageofempires

class Tanque(val potencialOfensivo:Int, val potencialDefensivo:Int) extends Atacante with Defensor{
  
  def atacarA(unGuerrero:Guerrero) = {
    super.atacarA(unGuerrero)
  }

  override def atacarA(unDefensor:Defensor) = {
    unDefensor.perderEnergia(500)
  }
  
}