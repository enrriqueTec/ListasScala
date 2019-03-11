import scala.collection.mutable.ListBuffer
import scala.io.StdIn._
object Sumatoria {
  def main(args: Array[String]): Unit = {
    sumatoria()
  }
  
  def llenarLista():ListBuffer[Integer]={
    var list= new ListBuffer[Integer]()

					println("Ingrese el total de nùmeros a ingresar, ej 4")
					var num=readInt
					var dato=0
					for(i <- 0 until num){
						println("Ingrese nùmero "+i)
						dato=readInt()
						list+=dato
					}

		return list
  }
  
  def sumatoria()={
    var list=llenarLista()
    var sum=new ListBuffer[Integer]()
    var cont=0
    var estado=0
    
    for(e<- list){
      cont+=1
      if(cont==1){
        sum+=e
      }else{
        
        sum+=estado+e
      }
      estado+=e
    }
      print("La suma consecutiva de los numeros es: "+sum)
  }
}