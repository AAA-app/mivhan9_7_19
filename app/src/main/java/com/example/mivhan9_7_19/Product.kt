package com.example.mivhan9_7_19

class Product () {
    var prace: Double = 0.0  //mehir
    var name: String = ""   // sug product
    var barCode: Int = 0
    var quatity: Double = 0.0 // kamut product
    var madeIn: String = ""



    constructor(prace: Double, name: String, quatity: Double, madeIn: String, barCode: Int) : this() {
        this.prace = prace
        this.name = name
        this.quatity = quatity
        this.madeIn = madeIn
        this.barCode = barCode

    }

}