import scala.collection.mutable.ListBuffer
import scala.io.StdIn._


object BuscarPalabra {
  
def llenarLista():ListBuffer[String]={
  var list= new ListBuffer[String]()
  
  println("Ingrese el total de palabras a ingresar, ej 4")
  var num=readInt
  var pal=""
  for(i <- 0 until num){
    println("Ingrese la palabra "+i)
    pal=readLine
    list+=pal
  }
  
  return list
}
def buscarPalabra()={
     val list=llenarLista()
     
     println("Ingrese la palabra a buscar")
     var pal=readLine()
     var cont=list.takeWhile(p=> p==pal)
     
     println("La cantidad de palabras encontras son: "+cont.length)
     
     
    
  }
  
  def main(args: Array[String]): Unit = {
    buscarPalabra()
  }
}