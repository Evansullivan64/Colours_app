
import java.util.*


class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")


    //This method returns the full list of colours.
    fun getAll (): List<String>{

        return listOf(colours.toString())
    }


    //this method returns the amount of colours listed
    fun numberOfColours (): Int{

        return colours.size
    }


    //this method returns the first colour listed by selecting index 0
    fun firstColour() : String{

        return colours[0]
    }


    //this method returns the last colour listed by selecting index 0
    fun lastColour() : String{

        return colours[colours.size-1]
    }



    //this emthod sorts the list and stores that in a new variable and then returns that variable
    fun coloursInAplhabeticOrder() : List<String> {

        val order = colours.sortedBy { it }
        return order

    }




    //this method converts all colours listed to upper case and retuns them
    fun coloursInAllCapitals() : List<String>{

        return listOf(colours.toString().uppercase())
    }



    //this emthod searches for colours begining with a ceratin letter and stores in a new variable, and then returns that variable
    fun coloursStartingWithLetter(letter: Char) : List<String>{

        var word1:List<String> = listOf()
        for(i:Int in 0..colours.size-1){
            var word:String = colours[i]
            if(word.startsWith(letter)){
                 word1 = listOf(word)
            }
        }

        return word1
    }



    //this method returns the colours that have the requested amount of characters
    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{

        var word:List<String> = listOf()

        for(i:Int in 0..colours.size-1){
            if(colours[i].length == size){
              word+= colours[i]
            }
        }
        return word
    }



    //this method returns the colours that have less than the requested amount of characters
    fun coloursWithLessCharsThan(size: Int) : List<String>{

        var listofwords = listOf<String>()
        colours.forEach{ word ->
            if(word.length < size){
                 listofwords+=word
            }
        }
        return listofwords
    }



    //this method checks if the colour requested is in the list, if not return false, if it is return true
    fun isColourInTheList(colour : String) : Boolean{
        var ans:Boolean = false
        for(i:Int in 0..colours.size-1){
            if(colours[i].equals(colour)){
                ans = true
            }else {
                ans == false
            }
        }

        return ans
    }




    //this method returns the colour in the given index
    fun returnthecolour(position: Int): List<String> {
        return listOf(colours[position])
    }



    //this method returns the list backwards
    fun reversethelist(): List<String> {
       return colours.asReversed()
    }




    //this method returns all the colours that have more than the characters requested
    fun coloursWithmoreCharsThan(size: Int) : List<String>{

        var listofwords = listOf<String>()
        colours.forEach{ word ->
            if(word.length > size){
                listofwords+=word
            }
        }
        return listofwords
    }




}