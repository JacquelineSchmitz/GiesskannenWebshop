package com.example.giekannenwebshop.data

import com.example.giekannenwebshop.R
import com.example.giekannenwebshop.data.model.Kanne

class Datasource() {
    fun loadKanne():List<Kanne>{


        return listOf(
            Kanne(
                "Blaue Kanne",
                15.00,
                R.drawable.can1,
                false

            ),
        Kanne(
            "Grüne Kanne", 15.00, R.drawable.can2, false

        ),

        Kanne(
            "Rote Kanne", 10.00, R.drawable.can3, false

        ),

        Kanne(
            "Silberne Kanne", 20.00, R.drawable.can4, true

        ),

        Kanne(
            "Goldene Kanne", 30.00, R.drawable.can5, false

        ),

        Kanne(
            "Gelbe Kanne", 12.00, R.drawable.can6, true
        ))
    }
}
