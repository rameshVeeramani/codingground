/*class ShoppingCart(
    val catalogSource: CatalogSource,
    val maximumItems: Int) 
    extends ItemBrowser with ItemContainer{
        
        import scala.collection.immutable.Vector
        
        val catalog: Catalog = catalogSource.catalog(catalogSource name) getOrElse DefaultCatalog()
        
        for (i <- Vector(1,2,3,4,5)
        
}*/

object  HelloWorld extends ItemBrowser with ItemContainer  
{
     def   main(args: Array[String]) {
      println("Hello, world!")
       import scala.collection.immutable.Vector
               
        for (i <- Vector(1,2,3,4,5)){
            println(i)
        }
        
         val message = ProcessOrder("123")
         
         Vector(1,2,3,4,5) map(e => println(e))
         
         var abc  = Vector(1,2,3,4,5)
         1 match {
             case 1 => println("ondsdafdsf adfadf dfadfe")
             case 2 => println("two")
         }
         
         val num = Vector(1,2,3,4,5,6)
         
         val ev : Vector[Int] = for  {
             n <- num
             if n % 2 == 0
         } yield n
         
         println(message)
   }
        
       
        
        
}
 
 case class ProcessOrder(orderId: String)

 
     
trait ItemBrowser{
    
    
}
trait ItemContainer{
}