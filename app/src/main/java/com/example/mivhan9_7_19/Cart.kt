package com.example.mivhan9_7_19

class Cart  (){  // agala shel super
    var product1: ArrayList<Product> = ArrayList()
    var client: ArrayList<Person> = ArrayList()


    fun getTotalCost(): Double{
        var prace = ArrayList<Double>()
        var sum = 0.0
        for (i in 0 until product1.size) {
            var productOfPrace = product1[i]
            var product = product1[i]
            sum = (productOfPrace.prace) * (product.quatity)
        }
        return sum
    }

    fun getTotallItems(): Int {
        var item = ArrayList<Int>()
        var a = 0
        var sum = 0
        for (i in 0 until product1.size){
            var quatity = product1[i]

            sum = (a * quatity.quatity).toInt()
        }
        return a
    }

    fun addItem(product: Product) {
        product1.add(product)
    }

    fun getProductMadeInIsrael(): ArrayList<Product> {
        val madeIn = ArrayList<Product>()
        for (i in 0 until product1.size) {
            var made = Product()
            if (made.madeIn == "Israel")
                madeIn.add(made)
        }
        return madeIn
    }



}