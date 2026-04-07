const scaryStories = [
  "At midnight, Rohan heard footsteps outside his locked room. When he checked, the corridor was empty—but his phone showed a missed call from his own number.",
  "The doll blinked when nobody touched it. By morning, it was sitting beside my bed, smiling wider than before.",
  "Every night, the mirror whispered my name. Tonight, it whispered, 'Behind you.'",
  "She waved goodbye to her family at the station. Later, they found her already asleep at home.",
  "The baby monitor crackled, 'He’s standing right behind you.' But we don’t own a baby.",
  "I saw my reflection blink before I did.",
  "The grave had fresh footprints—leading out, not in.",
  "My alarm rang at 3:17 AM. The screen said: ‘RUN’.",
  "I heard breathing under my bed. I live alone.",
  "The shadow on the wall waved back when I lifted my hand."
];

const funnyStories = [
  "Tom tried to impress his crush by doing a backflip. He impressed the hospital staff instead.",
  "My dog learned how to open the fridge. Now he pays rent with stolen cheese.",
  "I waved at someone who waved at me. Turns out it was a mirror. Confidence destroyed.",
  "I put my phone in rice. Now I have 27 uncooked messages.",
  "My alarm and I are in a toxic relationship. It wakes me up, I hate it, we repeat.",
  "I told my computer I needed a break. It froze immediately.",
  "I ran a marathon… on Netflix.",
  "I tried cooking for the first time. The fire alarm reviewed it as ‘disastrous.’",
  "My wallet and I are no longer on speaking terms.",
  "I started jogging, but only to catch the ice cream truck."
];

const adventureStories = [
  "Lost in the jungle, Arjun followed the glowing river and discovered a hidden city of gold beneath the roots of an ancient tree.",
  "The map led her beyond the desert, where floating islands drifted across a purple sky.",
  "With only a compass and courage, he crossed the frozen sea to find the dragon’s last egg.",
  "They sailed into the storm and found a kingdom hidden inside the clouds.",
  "A secret door in the library opened into a tunnel of endless stairs and forgotten worlds.",
  "She climbed the forbidden mountain and met the guardian of time itself.",
  "The old key unlocked not a chest—but another universe.",
  "On the final island, the treasure turned out to be a sleeping giant.",
  "He followed the starlight trail and discovered a city built on shooting stars.",
  "Beyond the waterfall lay a bridge made of crystal, leading to destiny."
];

function getRandomStory(stories) {
  const index = Math.floor(Math.random() * stories.length);
  return stories[index];
}

function generateStory(type) {
  const storyText = document.getElementById("storyText");

  let story = "";

  if (type === "scary") {
    story = getRandomStory(scaryStories);
  } 
  else if (type === "funny") {
    story = getRandomStory(funnyStories);
  } 
  else if (type === "adventure") {
    story = getRandomStory(adventureStories);
  }

  storyText.innerText = story;
}
