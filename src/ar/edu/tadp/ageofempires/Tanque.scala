package ar.edu.tadp.ageofempires

class Tanque(val potencialOfensivo: Int) extends Atacante with Defensor {

  def potencialDefensivo(): Int = 100

  override def atacarA(unDefensor: Defensor) = {
    unDefensor match {
      case guerrero: Guerrero => super.atacarA(guerrero)
      case unDefensor => unDefensor.perderEnergia(200)
    }
  }

}