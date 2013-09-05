package ar.edu.tadp.ageofempires

class EjercitoProtector extends LastimadoObserver[Guerrero] {
  def estoyLastimado(lastimado:Guerrero) = {
    lastimado.descansar()
  }
}