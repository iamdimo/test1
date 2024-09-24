package com.example.myapplication

class DataSource {

    fun getPlaces() : List<Place>
    {
        return listOf(
            Place(R.drawable.branden,R.string.banden),
            Place(R.drawable.burgeltz,R.string.burg),
            Place(R.drawable.colognedom,R.string.koln),
            Place(R.drawable.germany,R.string.spring),
            Place(R.drawable.eastsidegallery,R.string.gallery),
            Place(R.drawable.neuschwanstein_castle,R.string.neuschweinstein),
            Place(R.drawable.park,R.string.park),
            Place(R.drawable.reichstagbuilding,R.string.reich),
            Place(R.drawable.winter,R.string.winter),


        )
    }
}