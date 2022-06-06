fun main(){
    val warAndPeace = WarAndPeace("Война и мир", "Толстой", 1250, 1865)
    val crimeAndPunishment = CrimeAndPunishment("Преступление и наказание", "Достоевский", 331, 1886)
    var currentBook: Book
    while (true){
        println("Hello! Choose a book!")
        println("1. War&Peace\n2. Crime&Punishment\n\n0. Exit")

        currentBook = when (readLine()){
            "1" -> warAndPeace

            "2" -> crimeAndPunishment
            "0" -> break
            else -> {
                println ("Error")
                continue
            }

        }
    currentBook.read()
    }
}
