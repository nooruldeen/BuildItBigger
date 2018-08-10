package io.bigsoft.android.jokes;

import java.util.Random;

public class JokeTeller {

    String[] jokes = {"What is fast, loud and crunchy? A rocket chip!",
            "Why did the teddy bear say no to dessert? Because she was stuffed.",
            "What has ears but cannot hear? A cornfield.",
            "What did the left eye say to the right eye? Between us, something smells!",
            "What do you get when you cross a vampire and a snowman? Frost bite!",
            "What did one plate say to the other plate Dinner is on me!",
            "Why did the student eat his homework Because the teacher told him it was a piece of cake!",
            "When you look for something, why is it always in the last place you look Because when you find it, you stop looking.",
            "What is brown, hairy and wears sunglasses A coconut on vacation.",
            "Two pickles fell out of a jar onto the floor. What did one say to the other Dill with it.",
            "What did the Dalmatian say after lunch That hit the spot!",
            "Why did the kid cross the playground To get to the other slide.",
            "How does a vampire start a letter Tomb it may concern...",
            "What do you call a droid that takes the long way around R2 detour.",
            "How do you stop an astronaut's baby from crying You rocket!",
            "Why was 6 afraid of 7 Because 7, 8, 9",
            "What is a witch's favorite subject in school Spelling!",
            "When does a joke become a \"dad\" joke When the punchline is a parent.",
            "How do you make a lemon drop Just let it fall.",
            "What did the limestone say to the geologist Don't take me for granite!",
            "What do you call a duck that gets all A's A wise quacker.",
            "Why does a seagull fly over the sea Because if it flew over the bay, it would be a baygull.",
            "What kind of water cannot freeze Hot water.",
            "What kind of tree fits in your hand A palm tree!",
            "Why did the cookie go to the hospital Because he felt crummy.",
            "Why was the baby strawberry crying Because her mom and dad were in a jam.",
            "What did the little corn say to the mama corn Where is pop corn 29. What is worse than raining cats and dogs Hailing taxis!",
            "How much does it cost a pirate to get his ears pierced About a buck an ear.",
            "Where would you find an elephant The same place as you lost her!",
            "How do you talk to a giant Use big words!",
            "What animal is always at a baseball game A bat.",
            "What falls in winter but never gets hurt Snow!",
            "What do you call a ghost's true love His ghoul-friend.",
            "What building in New York has the most stories The public library!",
            "What did one volcano say to the other I lava you!",
            "How do we know that the ocean is friendly It waves!",
            "What is a tornado's favorite game to play Twister!",
            "How does the moon cut his hair Eclipse it.",
            "How do you get a squirrel to like you Act like a nut!",
            "What do you call two birds in love Tweethearts!",
            "How does a scientist freshen her breath With experi-mints!",
            "How are false teeth like stars They come out at night!",
            "How can you tell a vampire has a cold She starts coffin.",
            "What's worse than finding a worm in your apple Finding half a worm.",
            "What is a computer's favorite snack Computer chips!!",
            "Why don't elephants chew gum They do, just not in public.",
            "What was the first animal in space The cow that jumped over the moon",
            "What did the banana say to the dog Nothing. Bananas can't talk.",
            "What time is it when the clock strikes 13 Time to get a new clock.",
            "How does a cucumber become a pickle It goes through a jarring experience.",
            "What do you call a boomerang that won't come back A stick.",
            "What do you think of that new diner on the moon Food was good, but there really wasn't much atmosphere.",
            "Why did the dinosaur cross the road Because the chicken wasn't born yet.",
            "Why can't Elsa have a balloon Because she will let it go.",
            "How do you make an octopus laugh With ten-tickles!",
            "How do you make a tissue dance You put a little boogie in it.",
            "What's green and can fly Super Pickle!",
            "Knock knock. Who's there Interrupting pirate. Interrupting pir-yarrrrrr!",
            "What did the nose say to the finger Quit picking on me!",
            "What musical instrument is found in the bathroom A tuba toothpaste.",
            "Why did the kid bring a ladder to school Because she wanted to go to high school.",
            "What is a vampire's favorite fruit A blood orange.",
            "What do elves learn in school The elf-abet.",
            "What do you call a dog magician A labracadabrador.",
            "Where do pencils go on vacation Pencil-vania.",
            "Why couldn't the pony sing a lullaby She was a little hoarse.",
            "Why didn't the skeleton go to the dance He had no body to dance with.",
            "What gets wetter the more it dries A towel.",
            "What do you call two bananas Slippers. And speaking of bananas...",
            "Why did the banana go to the doctor Because it wasn't peeling well.",
            "What do you call a fake noodle An impasta.",
            "What stays in the corner yet can travel all over the world?  A stamp.",
            "How do you fix a cracked pumpkin With a pumpkin patch.",
            "What kind of award did the dentist receive A little plaque.",
            "What do you call a funny mountain Hill-arious.",
            "Why are ghosts bad liars Because you can see right through them.",
            "Why do bees have sticky hair Because they use a honeycomb.",
            "What did the big flower say to the little flower Hi, bud!",
            "Why was the picture sent to jail It was framed.",
            "Where do rabbits go after they get married On a bunny-moon!",
            "What sound do porcupines make when they hug Ouch!",
            "Why do ducks make great detectives They always quack the case.",
            "What did one wall say to the other wall I'll meet you at the corner.",
            "What do lawyers wear to court Lawsuits.",
            "What kind of hair do oceans have Wavy.",
            "What's black & white and read all over A newspaper. (Okay, this one might require an explanation for digital-aged kids).",
            "And, what is black, white and green all over A pickle in a tuxedo.",
            "What time is it if an elephant sits on the fence Time to fix the fence!",
            "What part of your body can cause the end of the world Your apoco-lips (AJ, age 8!)",
            "What do you call an old snowman Water.",
            "Why didn't the orange win the race It ran out of juice.",
            "What dinosaur had the best vocabulary?  The thesaurus.",
            "What did one DNA strand say to the other DNA strand Do these genes make my butt look big 96. Why aren't dogs good dancers They have two left feet.",
            "What did the wolf say when it stubbed its toe Owwwww-ch! (by Henrik, age 5)",
            "Kid: What are you doing under there Mom: Under where Kid: Ha ha! You said underwear!!",
            "Why did Johnny throw the clock out of the window Because he wanted to see time fly.",
            "What did one toilet say to the other You look flushed.",
            "Why did the man put his money in the freezer He wanted cold hard cash!"};

    Random random = new Random();

    public String getJoke(){
        return jokes[random.nextInt(jokes.length)];
    }
}
