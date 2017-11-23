package com.example.tjah.wowfacts.FactBook;

import java.util.Random;


public class techFactBook {


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
            "#9. A coyote can hear a mouse moving underneath a foot of snow.", };



    public String getfact(){
    //displays a new fact
    //Randomly displays the colors
    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(facts.length);
    return facts[randomNumber];

    }
}
