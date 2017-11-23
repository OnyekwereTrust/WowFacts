package com.example.tjah.wowfacts.FactBook;

import java.util.Random;


public class homeFactBook {

    //an array to store our random generated colors
    String[] facts = {
            "#1. Ants stretch when they wake up in the morning.",
            "#2. Ostriches can run faster than horses.",
            "#3. Olympic gold medals are actually made mostly of silver.",
            "#4. You are born with 300 bones; by the time you are an adult you will have 206.",
            "#5. It takes about 8 minutes for light from the Sun to reach Earth.",
            "#6. Some bamboo plants can grow almost a meter in just one day.",
            "#7. The state of Florida is bigger than England.",
            "#8. The world’s oldest piece of chewing gum is over 9,000 years old!",
            "#9. A coyote can hear a mouse moving underneath a foot of snow.",
            "#10. Some penguins can leap 2-3 meters out of the water.",
            "#11. On average, it takes 66 days to form a new habit.",
            "#12. Mammoths still walked the earth when the Great Pyramid was being built.",
            "#13. Banging your head against a wall burns 150 calories an hour",
            "#14. Bolts of lightning can shoot out of an erupting volcano.",
            "#15. New York drifts about one inch farther away from London each year.",
            "#16. A U.S. dollar bill can be folded approximately 4,000 times in the same place before it will tear.",
            "#17. A sneeze travels about 100 miles per hour.",
            "#18. Earth has traveled more than 5,000 miles in the past 5 minutes.",
            "#19. It would take a sloth one month to travel one mile.",
            "#20. 10% of the World’s population is left handed.",
            "#21.  A broken clock is right two times every day.",
            "#22. According to Amazon, the most highlighted books on Kindle are the Bible, the Steve Jobs biography, and The Hunger Games.",
            "#23. Bob Marley’s last words to his son before he died were “Money can’t buy life.”",
            "#24. A mole can dig a tunnel that is 300 feet long in only one night.",
            "#25. A hippo’s wide open mouth is big enough to fit a 4-foot-tall child in.",
            "#26. Chewing gum while you cut an onion will help keep you from crying.",
            "#27. If you were to stretch a Slinky out until it’s flat, it would measure 87 feet long.",
            "#28. Al Capone’s business card said he was a used furniture dealer",
            "#29. There are more collect calls on Father’s Day than on any other day of the year.",
            "#30. Banging your head against a wall burns 150 calories an hour.",
            "#31. 95% of people text things they could never say in person.",
            "#32. A crocodile can’t poke its tongue out.",
            "#33. It is physically impossible for pigs to look up into the sky.",
            "#34. Guinness Book of Records holds the record for being the book most often stolen from Public Libraries."


    };


    public String getfact() {
        //displays a new fact
        //Randomly displays the colors
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];

    }
}
