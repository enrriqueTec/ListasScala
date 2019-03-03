import scala.collection.mutable.ListBuffer
import scala.io.StdIn._

object EliminarPalabraLista {
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
     val list2=llenarLista()
  
      
     println("Lista Ingresada: "+list)
     println("Lista Ingresada: "+list2)
     var cont=0
     var cont2=0
   for(e <-list){
      cont+=1
     for(d <-list2){
      
        if(e.equals(d)){
       list.remove(cont-1)
     }
        
     }
    
     
    
   }
      println("Lista actualizada: "+list)
     
    
  }//Eliminar Palabra 
}