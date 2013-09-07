package ar.edu.tadp.ageofempires

import org.junit.Test
import org.junit.Before
import org.junit.Assert._

class AgeOfEmpiresTests {
  
  var guerrero:Guerrero = null
  var espadachin:Espadachin = null
  var misil:Misil = null
  var muralla:Muralla = null
  var tanque:Tanque = null
  
  @Before
  def setUp() = {
    guerrero = new Guerrero(30, 20)
    espadachin = new Espadachin(20, 20, 0.5, new Espada(20))
    misil = new Misil
    muralla = new Muralla(25)
    tanque = new Tanque(50, 50)
  }
  
  @Test
  def unGuerreroAtacaAUnEspadachin() = {
    guerrero.atacarA(espadachin)
    assertEquals(90, espadachin.energia)
  }
  
  @Test
  def potencialOfensivoEspadachin() = {
    assertEquals(30, espadachin.potencialOfensivo)
  }
  
  @Test
  def unEspadachinAtacaAUnGuerrero() = {
    espadachin.atacarA(guerrero)
    assertEquals(90, guerrero.energia)
  }
  
  @Test
  def unMisilAtacaAUnGuerrero() = {
    misil.atacarA(guerrero)
    assertEquals(0, guerrero.energia)
  }
  
  @Test
  def unEspadachinAtacaAUnaMuralla() = {
    espadachin.atacarA(muralla)
    assertEquals(95, muralla.energia)
  }
  
  @Test
  def unTanqueAtacaAUnGuerreroYUnaMuralla() = {
    tanque.atacarA(guerrero)
    assertEquals(70, guerrero.energia)
    
    tanque.atacarA(muralla)
    assertEquals(0, muralla.energia)
  }
  
  @Test
  def unTanqueAtacaAUnGuerreroYUnaMurallaEnUnaLista() = {
    tanque.atacarA(List(guerrero,muralla))
    assertEquals(70, guerrero.energia)
    assertEquals(0, muralla.energia)
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}