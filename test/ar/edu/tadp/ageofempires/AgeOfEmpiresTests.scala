package ar.edu.tadp.ageofempires

import org.junit.Test
import org.junit.Before
import org.junit.Assert._

class AgeOfEmpiresTests {
  
  var guerrero:Guerrero = null
  var espadachin:Espadachin = null
  var misil:Misil = null
  var muralla: Muralla = null
  var tanque: Tanque = null
  
  @Before
  def setUp() = {
    guerrero = new Guerrero(30, 20)
    espadachin = new Espadachin(20, 20, 0.5, new Espada(20))
    misil = new Misil
    muralla = new Muralla(25)
    tanque = new Tanque(50)
  }
  
  @Test
  def unGuerreroAtacaAUnEspadachin() = {
    guerrero.atacarA(espadachin)
    assertEquals(espadachin.energia, 90)
  }
  
  @Test
  def potencialOfensivoEspadachin() = {
    assertEquals(espadachin.potencialOfensivo, 30)
  }
  
  @Test
  def unEspadachinAtacaAUnGuerrero() = {
    espadachin.atacarA(guerrero)
    assertEquals(guerrero.energia, 90)
  }
  
  @Test
  def unMisilAtacaAUnGuerrero() = {
    misil.atacarA(guerrero)
    assertEquals(guerrero.energia, 0)
  }
  
  @Test
  def unEspadachinAtacaAUnaMuralla() = {
    espadachin.atacarA(muralla)
    assertEquals(muralla.energia, 95)
  }
  
  @Test
  def unTanqueAtacaAUnGuerreroConAmetralladora() = {
    tanque.atacarA(guerrero)
    assertEquals(guerrero.energia, 70)
  }
  
  @Test
  def unTanqueAtacaAVariosObjetivos() = {
    tanque.atacarA(List(guerrero, espadachin, muralla))
    assertEquals(guerrero.energia, 70)
    assertEquals(espadachin.energia, 70)
    assertEquals(muralla.energia, 0)
  }
  
}