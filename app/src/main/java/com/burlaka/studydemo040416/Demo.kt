package com.burlaka.studydemo040416

/**
 * @author BRCJU
 * @since 04.04.2019
 */
interface ExtService

data class ShopArticle(val id: Int)


class Order(val extService: ShopService) {

    val client = Client(extService)

    fun Int.toArticle(): ShopArticle = extService.fetchArticleById(this)

    fun Client.quickOrder(article: ShopArticle): Order {
        this.login()
        this.buyStuff(article)
        this.pay()
        return this@Order
    }

}

data class Client(
    private val extService: ExtService
) {
    fun login() {/* some logic here using extService */
    }

    fun buyStuff(article: ShopArticle) {/* some logic here using extService*/
    }

    fun pay() {/* some logic here using extService*/
    }

    fun receiveStuff(): Boolean = true //some logic here
}

class ShopService : ExtService {
    fun process(block: Order.() -> Boolean) {
        val u = Order(this) //

        if (block(u))
            println("Success!")
        else
            println("Failure!")
    }

    fun fetchArticleById(id: Int): ShopArticle = ShopArticle(id)
}

//use example, with new methods to Client and Int
fun main() {

    ShopService().process {
        client.quickOrder(42.toArticle())
        client.receiveStuff()
    }
}

