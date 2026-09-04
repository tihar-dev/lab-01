package com.example.petshop

class Angry(date: String) : Mood(date){
    override fun describeMood(): String{
        return "Feeling angry"
    }
}