package com.example.myapplication

import android.widget.TextView
import kotlin.math.PI

abstract class Dwelling (private var  residence : Int) {
    abstract val buildingMaterial : String
    abstract val capacity : Int
    fun hasRoom(): Boolean
    {
        return capacity > residence
    }

    fun getRoom(tv: TextView) {
        if (hasRoom())
        {
            residence++
            tv.append("Good lcuk")
        }
        else
            tv.append(("sorry, no room...."))
    }

    abstract fun floorArea() : Double


}


class SquareCabin(resident : Int , private val length : Double): Dwelling(resident)
{
    override val buildingMaterial: String = "wood"
    override val capacity: Int = 6
    override fun floorArea(): Double {
        return length * length
    }

}


class  Roundhut (resi : Int ,  private val radius: Double) : Dwelling(resi)
{
    //override  val buildingMaterial : String  =  "straw"
    override val buildingMaterial: String = "straw"

    override val capacity: Int = 4

    override fun floorArea(): Double {

        return  PI * radius * radius ;
    }


}