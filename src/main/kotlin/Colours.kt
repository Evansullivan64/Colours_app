
import java.util.*


class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{

        return listOf(colours.toString())
    }

    fun numberOfColours (): Int{

        return colours.size
    }

    fun firstColour() : String{

        return colours[0]
    }

    fun lastColour() : String{

        return colours[colours.size-1]
    }

    fun coloursInAplhabeticOrder() : List<String> {

        val order = colours.sortedBy { it }
        return order

    }

    fun coloursInAllCapitals() : List<String>{

        return listOf(colours.toString().uppercase())
    }


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

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{

        var word:List<String> = listOf()

        for(i:Int in 0..colours.size-1){
            if(colours[i].length == size){
              word+= colours[i]
            }
        }
        return word
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{

        var listofwords = listOf<String>()
        colours.forEach{ word ->
            if(word.length < size){
                 listofwords+=word
            }
        }
        return listofwords
    }

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

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

    fun returnthecolour(position: Int): List<String> {
        return listOf(colours[position])
    }

    fun reversethelist(): List<String> {
       return colours.asReversed()
    }


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