package ar.edu.tadp.ageofempires

import scala.collection.mutable.ArrayBuffer

class Guerrero(potencialOfensivoValue: Int, val potencialDefensivo: Int) extends Atacante with Defensor with Observable[Guerrero] {
  
  def potencialOfensivo: Int = potencialOfensivoValue

  def descansar() = {
    energia += 10
  }
  
  override def perderEnergia(cantidad:Int) = {
    super.perderEnergia(cantidad)
    if(energia <= 30) {
      this.notifyObservers
    }
  } 
  
}