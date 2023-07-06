fun main(){
var species=Species("carnivorous","plants only","preditor location","small lifespan")
  species.eat()
    println("${species.specie} diet is: ${species.diet}")

    var species1=Species("Water snakes","plants only","preditor location","small lifespan")
println( species1.Migration("river"))


    var species2=Preditor("Lion","plants only","preditor location","small lifespan","Striking")
println(species2.hunting())

    var species3=Prey("Lion","plants only","preditor location","30 years")
    println(species3.escapePreditor())


    
var library=LibraryCatalog()
    println(library.addBook("Evaa","reterrr",67))
}
open class Species(var specie:String,var diet:String,var migrationpatterns:String,var typicallifespan:String){
    fun eat():String{
        if(specie=="herbivorous"){
           diet="plants only"
        }
        else if(specie=="omnivorous"){
            diet="both plants and meat."
        }
        else if(specie=="carnivorous"){
            diet=" only meat"

        }
        return diet
}
    fun Migration(habitat:String):String{

        if(habitat=="water"){
        migrationpatterns="$specie will migrate to dry land during winter"
        }
        else if(habitat=="dry land"){
          migrationpatterns="$specie will migrate to water  during winter inorder to stay safe and warm"
        }
        else{
            migrationpatterns="$specie will not migrate"
        }
        return migrationpatterns
    }

}
class Preditor(specie:String,diet:String,migrationpatterns:String,typicallifespan:String,var huntingMethod:String):Species(specie,diet,migrationpatterns,typicallifespan){
  fun hunting():String{
      if(huntingMethod=="Stoking preys"){
          return "$specie stocks its pray before striking"
      }
      else if (huntingMethod=="Striking"){
         return "$specie wait for the right moment before striking its prey"
      }
      else{
      return "Preditor hunts using another technique"
      }
  }
}
class Prey(specie:String,diet:String,migrationpatterns:String,typicallifespan:String):Species(specie,diet,migrationpatterns,typicallifespan) {
    fun escapePreditor():String{
        if(typicallifespan>="30 years"){
         return "$specie is easy to be hunted by priditors"
        }
        else if (specie>"20 years"){
            return  "Animals can run away from the priditors"
        }
        else{
            return "Not easy to be hunted"
        }
    }
}
//Create a LibraryCatalog class that handles the cataloging and management of
//books in a library. Implement methods to add new books, search for books by
//title or author, keep track of available copies, and display book details.
class Book(var title:String,var author:String,var availableCopies: Int)
    class LibraryCatalog{
        var books :MutableList<Book> = mutableListOf()
        fun addBook(title: String, author: String, availableCopies: Int){
            var newbook = Book(title, author, availableCopies)
            books.add(newbook)
        }


}