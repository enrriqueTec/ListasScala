import scala.collection.mutable.ListBuffer
import scala.io.StdIn._

object InsertarPalabra {
  def main(args: Array[String]): Unit = {
    insertarPalabra()
  }
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
}//LLenar lista
  
  def insertarPalabra()={
     val list=llenarLista()
     
     println("Ingrese la palabra 1 a reemplazar")
     var pal=readLine()
      println("Ingrese la palabra 2 a reemplazar")
     var pal2=readLine()
     
     println("Lista Ingresada: "+list)
     
    list.update(1, pal)
    list.update(2, pal2)
      println("Lista actualizada: "+list)
     
    
  }//Insertar Palabra
}