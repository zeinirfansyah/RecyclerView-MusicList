package com.zen.recyclerview_membuatlistlagu

object DataMusik {
    private val musics = arrayOf(
        "Answer",
        "Let Her Go",
        "Love Me Like You Do",
        "See You Again",
        "Shape of You",
        "Sorry",
        "Sugar",
        "Thinking Out Loud"
    )

    private val artists = arrayOf(
        "Lilas Ikuta",
        "Passenger",
        "Ellie Goulding",
        "Charlie Puth",
        "Ed Sheeran",
        "Justin Bieber",
        "Maroon 5",
        "Ed Sheeran"
    )

    private val album = arrayOf(
        "Answer",
        "All the Little Lights",
        "Delirium",
        "Furious 7",
        "÷",
        "Purpose",
        "V",
        "x"
    )

    private val images = intArrayOf(
        R.drawable.answer,
        R.drawable.allthelittlethings,
        R.drawable.delirium,
        R.drawable.furious7,
        R.drawable.devide,
        R.drawable.purpose,
        R.drawable.v,
        R.drawable.x
    )

    val listData: ArrayList<Musik>
        get() {
            val list = arrayListOf<Musik>()
            for (position in musics.indices) {
                val music = Musik()
                music.judul = musics[position]
                music.artis = artists[position]
                music.album = album[position]
                music.gambar = images[position]
                list.add(music)
            }
            return list
        }
}