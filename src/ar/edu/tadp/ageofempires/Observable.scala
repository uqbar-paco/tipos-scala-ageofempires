package ar.edu.tadp.ageofempires

import scala.collection.mutable.ArrayBuffer

trait Observable[T] {
  this: T =>
  val observers: ArrayBuffer[LastimadoObserver[T]] = new ArrayBuffer

  def notifyObservers = {
    observers.foreach(_.estoyLastimado(this))
  }

  def addObserver(observer: LastimadoObserver[T]) = {
	observers.+=(observer)
  }
}