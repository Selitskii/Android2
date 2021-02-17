package com.example.myapplication

class Admin(id: Int,name:String,var consumerList: MutableList<Consumer>): User(id,name){
    fun ToStr() : String{
        var str:String
         str ="\nAdmin: $name , ID: $id:\nConsumers:"
        for (n in consumerList){
            str=str+"\n Name: ${n.name} ID: ${n.id} Age: ${n.age}"
        }
        return str
    }
}