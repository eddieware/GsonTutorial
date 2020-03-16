package com.example.gsontutorial

data class User (val name:String, val likesOranges:Boolean){
    override fun toString(): String = "$name - $likesOranges"
    }
