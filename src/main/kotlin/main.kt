fun main(){
    var banking=CurrentAccount("Ft12345","Apolo smei",3500.0)
    banking.depositmoney(450.0)
    banking.withdraw(430.0)
    words()
    banking.details("dallen","3500.0")

    }
           // var statement=Product("soap",3,450,"white star")
              //println(statement.name)

//}
//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format:"account number xwith balance y is operated by z

class CurrentAccount(var accountnumber:String, var accountname:String, var balance:Double){
    fun depositmoney(amount:Double){
         balance++
        println(balance)
    }
    fun withdraw(amount:Double){
        balance--
        println(balance)
    }
    fun details(name: String,balance: Double,accountnumber: String){
        println("account number $accountnumber with balance$balance,")
    }
}
class SavingsAccount(var accountnumber: String,var accountname: String,var withdraws:Int){
    fun withDraw(d:Int){

            println()
    }
}
//.A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its cate
data class Product(var name:String,var weight:Int,var Price:Int,var category:String){
    fun items(products:String):String{
        var item=("$name has bought $weight kilograms of $category at a price of$Price")
        return item
    }

}
//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return "bnn"
fun words(){
    var word="banana"
    println(word[0].toString()+word[2]+word[4])
}