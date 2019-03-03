
import scala.collection.mutable.ListBuffer
import scala.io.StdIn._
object EliminarPalabra {
  def main(args: Array[String]): Unit = {
    eliminarPalabra()
    
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
   def eliminarPalabra()={
     val list=llenarLista()
     
     println("Ingrese la palabra a eliminar")
     var pal=readLine()
      
     
     println("Lista Ingresada: "+list)
     var cont=0
  
   for(e <-list){
     cont+=1
     if(e.equals(pal)){
       list.remove(cont-1)
     }
   }
      println("Lista actualizada: "+list)
     
    
  }//Eliminar Palabra 
    
}