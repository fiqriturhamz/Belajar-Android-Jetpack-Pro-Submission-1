package com.example.imovie.utilities

import com.example.imovie.R
import com.example.imovie.model.DataMovie

object MovieList {
    fun getMovieList(): ArrayList<DataMovie> {
        return arrayListOf(
            DataMovie(
                0, R.drawable.godzilavskong1, "Godzila Vs Kong",
                "Godzilla vs. Kong is a 2021 American monster film directed by Adam Wingard. A sequel to Kong: Skull Island (2017) and Godzilla: King of the Monsters (2019), it is the fourth film in Legendary's MonsterVerse. It is also the 36th film in the Godzilla franchise, the 12th film in the King Kong franchise, and the fourth Godzilla film to be completely produced by a Hollywood studio.[b] The film stars Alexander Skarsgård, Millie Bobby Brown, Rebecca Hall, Brian Tyree Henry, Shun Oguri, Eiza González, Julian Dennison, Lance Reddick, Kyle Chandler, and Demián Bichir. In the film, Kong clashes with Godzilla as humans lure the ape into the Hollow Earth to retrieve a power source for a secret weapon to stop Godzilla's mysterious rampages",
                "PG | 2h 16min | Drama, Adventure, Sci-Fi,Action", 4.9
            ),
            DataMovie(
                1, R.drawable.whoami1, "Who Am I",
                "Who Am I (German: Who Am I – Kein System ist sicher; English: \"Who Am I: No System Is Safe\") is a 2014 German techno-thriller film directed by Baran bo Odar. It is centered on a computer hacker group in Berlin geared towards global fame. It was screened in the Contemporary World Cinema section at the 2014 Toronto International Film Festival. The film was shot in Berlin and Rostock. Because of its storyline and some elements, the film is often compared to Fight Club and Mr. Robot.",
                "PG | 2h 20min | Action,Crime,Comedy,Adventure", 4.7
            ),

            DataMovie(
                2, R.drawable.aquaman1, "Aquaman (2018)",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled " +
                        "by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and " +
                        "then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "PG | 2h 23min | Action, Adventure, Fantasy", 4.8
            ),

            DataMovie(
                3, R.drawable.avengers1, "Avengers: Infinity War (2018)",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, " +
                        "a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all " +
                        "six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. " +
                        "Everything the Avengers have fought for has led up to this moment - " +
                        "the fate of Earth and existence itself has never been more uncertain.",
                "PG | 2h 29min | Action, Adventure, Sci-Fi", 4.8
            ),

            DataMovie(
                4, R.drawable.batwoman1, "Batwoman",
                "Batwoman is an American superhero television series developed by Caroline Dries for The CW. Based on the DC Comics character of the same name, it is part of the Arrowverse continuity. The first season follows Kate Kane, the cousin of vigilante Bruce Wayne, who becomes Batwoman in his absence. Beginning with the second season, the series focuses on former convict Ryan Wilder as she protects Gotham City in the role of Batwoman.",
                "PG | 2h 10min | Drama, Mystery,Crime", 4.7
            ),

            DataMovie(
                5, R.drawable.titans1, "Titans",
                "Titans is an American superhero streaming television series created by Akiva Goldsman, Geoff Johns, and Greg Berlanti. Based on the DC Comics team Teen Titans, the series depicts a group of young heroes who join forces in their fight against evil. Featured as members of the eponymous Titans are Dick Grayson (Brenton Thwaites), Kory Anders (Anna Diop), Rachel Roth (Teagan Croft), Gar Logan (Ryan Potter), Jason Todd (Curran Walters), Donna Troy (Conor Leslie), Hank Hall (Alan Ritchson), Dawn Granger (Minka Kelly), Rose Wilson (Chelsea Zhang), and Conner (Joshua Orpin).",

                "PG | 2h 14min | Adventure, Family, Fantasy", 4.6
            ),

            DataMovie(
                6, R.drawable.fastfurious21, "Fast Furious 2",
                "Fast 2 Furious is a 2003 action film directed by John Singleton and written by Michael Brandt and Derek Haas, with a story also credited to Gary Scott Thompson. A standalone sequel to The Fast and the Furious (2001), it is the second installment in the Fast & Furious franchise. The film stars Paul Walker, Tyrese Gibson, Eva Mendes, Cole Hauser, Chris \"Ludacris\" Bridges, and James Remar. 2 Fast 2 Furious follows Brian O'Conner and Roman Pearce who go undercover for the U.S. Customs Service to apprehend a drug lord in exchange for the erasure of their criminal records.",
                "PG | 1h 48min | Drama,Crime", 4.5
            ),

            DataMovie(
                7, R.drawable.venom1, "Venom",
                "Venom is a 2018 American superhero film featuring the Marvel Comics character of the same name, produced by Columbia Pictures in association with Marvel[5] and Tencent Pictures. Distributed by Sony Pictures Releasing, it is the first film in Sony's Spider-Man Universe. Directed by Ruben Fleischer from a screenplay by Jeff Pinkner, Scott Rosenberg, and Kelly Marcel, it stars Tom Hardy as Eddie Brock and Venom, alongside Michelle Williams, Riz Ahmed, Scott Haze, and Reid Scott. In the film, journalist Eddie Brock gains superpowers after becoming the host of Venom, an alien symbiote whose species plans to invade Earth and annihilate humanity.",
                "PG | 2h 8min | Action, Horror, Fantasy,Crime", 4.9
            ),

            DataMovie(
                8, R.drawable.flash1, "Flash (2014)",
                "After returning home to England, aristocrat Robin of Loxley learns that the evil Sheriff of Nottingham " +
                        "has seized his family estate. He soon joins forces with Friar Tuck and Little John -- a fierce Arabian warrior who wants to put " +
                        "an end to the Crusades. Armed with arrows and dubbed Robin Hood, Loxley leads a band of oppressed rebels in a daring plan to rob " +
                        "the Sheriff of his money and take away his power.",
                "PG | 1h 56min | Action, Adventure, Crime", 4.8
            ),

            DataMovie(
                9, R.drawable.antman12, "Ant Man",
                "Ant-Man is a 2015 American superhero film based on the Marvel Comics characters of the same name: Scott Lang and Hank Pym. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the 12th film in the Marvel Cinematic Universe (MCU). The film was directed by Peyton Reed from a screenplay by the writing teams of Edgar Wright and Joe Cornish, and Adam McKay and Paul Rudd. It stars Rudd as Scott Lang / Ant-Man alongside Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Tip \"T.I.\" Harris, Anthony Mackie, Wood Harris, Judy Greer, David Dastmalchian, and Michael Douglas as Hank Pym. In the film, Lang must help defend Pym's Ant-Man shrinking technology and plot a heist with worldwide ramifications.",
                "PG | 1h 57min | Comedy, Action,Crime", 4.5
            )
        )
    }
}