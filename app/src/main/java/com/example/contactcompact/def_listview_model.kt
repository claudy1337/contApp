package com.example.contactcompact

class def_listview_model { //don't using

    var name:String?= null
    var imgId:Int = 0
    var number:Int = 0

    fun getNames():String = name.toString()
    fun setNames(name:String){
        this.name = name
    }
    fun getImage():Int = imgId
    fun setImage(imgId:Int){
        this.imgId = imgId
    }
    fun getNumbers():Int = number
    fun setNumbers(number: Int){
        this.number = number
    }
}