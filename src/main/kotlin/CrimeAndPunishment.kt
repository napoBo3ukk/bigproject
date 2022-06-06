class CrimeAndPunishment(name:String, author: String, amount: Int, year: Int): Book (name,author,amount,year){
    override var name = "Crime And Punishment"
    override var author = "Dostoevsky"
    override var amount = 331
    override var year = 1886
    override fun read() {
        println(name)
        println(author)
        println(amount)
        println(year)
    }
}