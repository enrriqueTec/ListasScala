
import scala.collection.mutable.ListBuffer
import scala.io.StdIn._
object Palindromas {
  def main(args: Array[String]): Unit = {
    palindroma()
    
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
  
  def palindroma()={
    var palabras=llenarLista()
    var list= new ListBuffer[String]()
    var cont1=0
    var cont2=0
    for(e<- palabras){
      
      for(f<-0 to e.length()-1){
        cont1+=1
        cont2+=1
        if(e.charAt(cont1)==e.charAt(e.length()-cont2)){
          if(cont1==cont2){
             list+=e
          }
         
        }
      }
    }
    println(list)
  }
}