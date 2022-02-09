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

    fun coloursInAplhabeticOrder() : List<List<String>> {

        return listOf(colours.sortedByDescending { it })
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
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        return listOf("this should return colours that have ${size} chars")
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return listOf("this should return colours less than ${size} chars")
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        return false
    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

}