class WarAndPeace (name:String, author: String, amount: Int, year: Int): Book (name,author,amount,year){
    override var name = "War And Peace"
    override var author = "Tolstoy"
    override var amount = 1250
    override var year = 1865
    override fun read() {
        println(name)
        println(author)
        println(amount)
        println(year)
    }
}