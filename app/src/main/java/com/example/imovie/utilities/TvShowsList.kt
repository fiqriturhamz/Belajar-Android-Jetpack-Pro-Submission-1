package com.example.imovie.utilities

import com.example.imovie.R
import com.example.imovie.model.DataTvShows

object TvShowsList {
    fun getTvShowList(): ArrayList<DataTvShows> {
        return arrayListOf(
            DataTvShows(
                0, R.drawable.squidgame1233, "Squid Game",
                "Squid Game (Korean: 오징어 게임; RR: Ojing-eo Geim) is a South Korean survival drama television series created by Hwang Dong-hyuk for Netflix. Its cast includes Lee Jung-jae, Park Hae-soo, Wi Ha-joon, Jung Ho-yeon, O Yeong-su, Heo Sung-tae, Anupam Tripathi, and Kim Joo-ryoung.",
                "TV | 1h | Drama,Sci-Fi, Horror", 4.6
            ),

            DataTvShows(
                1, R.drawable.tusk1, "Tusk (2014)",
                "Tusk is the twelfth studio album by British-American rock band Fleetwood Mac, released as a double album on 12 October 1979.[4] It is considered more experimental than their previous albums: partly a consequence of Lindsey Buckingham's sparser songwriting arrangements and the influence of post-punk.[5] The production costs were estimated to be over \$1 million (equivalent to \$3.57 million in 2020), making it the most expensive rock album recorded to that date",
                "TV | 1h | Action, Crime, Horror", 4.7
            ),

            DataTvShows(
                2, R.drawable.dota, "Dota 2 Dragon's Blood",
                "Dota: Dragon's Blood is an animated epic fantasy streaming television series.[1] It is based on Dota 2, a 2013 MOBA video game developed and published by Valve.[2] The show is produced by Studio Mir in association with Ashley Edward Miller's company Kaiju Boulevard and animated by Production Reve.[3] The series premiered on Netflix on March 25, 2021.[4] Dragon's Blood is presented in a style that combines anime with Western animation. A second season is scheduled for a January 2022 release.",
                "TV | 43min | Action, Adventure,Fantasy", 4.4
            ),

            DataTvShows(
                3, R.drawable.attackontitan, "Attack On Titan Season 3",
                "Attack on Titan (Japanese: 進撃の巨人, Hepburn: Shingeki no Kyojin, lit. \"The Advancing Giants\") is a Japanese manga series written and illustrated by Hajime Isayama. It is set in a world where humanity lives inside cities surrounded by three enormous walls that protect them from the gigantic man-eating humanoids referred to as Titans; the story follows Eren Yeager, who vows to exterminate the Titans after a Titan brings about the destruction of his hometown and the death of his mother. Attack on Titan was serialized in Kodansha's monthly shōnen manga magazine Bessatsu Shōnen Magazine from September 2009 to April 2021, with its chapters collected in 34 tankōbon volumes.",
                "TV | 57min | Action, Adventure, Fantasy,Sci-Fi", 4.4
            ),

            DataTvShows(
                4, R.drawable.conjuring, "The Conjuring",
                "he Conjuring is a 2013 American supernatural horror film directed by James Wan and written by Chad Hayes and Carey W. Hayes. It is the inaugural film in the Conjuring Universe franchise.[4] Patrick Wilson and Vera Farmiga star as Ed and Lorraine Warren, paranormal investigators and authors associated with prominent cases of haunting. Their purportedly real-life reports inspired The Amityville Horror story and film franchise.[5] The Warrens come to the assistance of the Perron family, who experienced increasingly disturbing events in their farmhouse in Rhode Island in 1971.",
                "TV | 42min | Action, Horror", 4.5
            ),

            DataTvShows(
                5, R.drawable.spongebob, "Spongebob",
                "The SpongeBob SquarePants Movie is a 2004 American live-action/animated adventure comedy film based on the Nickelodeon animated television series SpongeBob SquarePants. The film was directed, co-written, and produced by series creator Stephen Hillenburg, with live-action sequences directed by Mark Osborne. It features the series' regular voice cast with Alec Baldwin, Scarlett Johansson, and Jeffrey Tambor voicing new characters and David Hasselhoff appearing as himself. It is the first film in the SpongeBob SquarePants film series. In this film, Plankton enacts a plan to discredit his business nemesis Mr. Krabs, steal the Krabby Patty secret formula and take over the world by stealing King Neptune's crown and framing Mr. Krabs for the crime. SpongeBob and Patrick team up to retrieve the crown from Shell City to save Mr. Krabs from Neptune's wrath and the oceanic world from Plankton's rule",
                "TV | 55min | Action, Adventure, Comedy,Fantasy", 4.8
            ),

            DataTvShows(
                6, R.drawable.fanstasyisland, "Fantasy Island",
                "Fantasy Island, also known as Blumhouse's Fantasy Island,[2] is a 2020 American supernatural horror film directed and co-written by Jeff Wadlow. Serving both as a horror reimagining and a prequel to ABC's 1977 television series of the same name, it stars Michael Peña, Maggie Q, Lucy Hale, Austin Stowell, Jimmy O. Yang, Ryan Hansen, Portia Doubleday, and Michael Rooker and follows a group of people who, while visiting the eponymous island, discover that their dream fantasies brought to life begin to turn into horrific living nightmares and they must try to survive.",
                "TV | 45min | Horror,Fantasy,Adventure", 4.9
            ),

            DataTvShows(
                7, R.drawable.monsterhunter, "Monster Hunter",
                "Monster Hunter is a 2020 monster film written, directed, and produced by Paul W. S. Anderson, based on the video game series of the same name by Capcom. The film stars Anderson's wife Milla Jovovich in their fifth outing together as director and lead actor. The other cast members include Tony Jaa, Tip Harris, Meagan Good, Diego Boneta, Josh Helman, Jin Au-Yeung, and Ron Perlman.",
                "TV | 43min | Action, Adventure, Drama", 4.6
            ),

            DataTvShows(
                8, R.drawable.onward, "Onward",
                "Onward is a 2020 American computer-animated urban fantasy adventure film produced by Pixar Animation Studios and released by Walt Disney Pictures. The film is directed by Dan Scanlon, produced by Kori Rae and written by Scanlon, Jason Headley, and Keith Bunin, and stars the voices of Tom Holland, Chris Pratt, Julia Louis-Dreyfus, and Octavia Spencer. Set in a suburban fantasy world, the film follows two elf brothers who set out on a quest to find an artifact that will temporarily bring back their dead father.",
                "TV | 1h | Action, Adventure, Fantasy,Comedy", 4.8
            ),

            DataTvShows(
                9, R.drawable.waterman, "Water Man",
                "The Water Man is a 2020 American drama film directed by David Oyelowo, in his feature directorial debut, from ahrhruruhrbrhbrhe7 screenplay by Emma Needell. It stars Oyelowo, Rosario Dawson, Lonnie Chavis, Amiah Miller, Alfred Molina and Maria Bello. Oprah Winfrey serves as an executive producer via her Harpo Films banner.",
                "TV | 44min | Action,Drama,Adventure", 4.3
            )
        )
    }
}