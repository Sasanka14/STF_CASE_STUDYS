// Declare 

let challenge = "50 Days Of JavaScript";
console.log(challenge);
console.log(challenge.length);
console.log(challenge.toUpperCase());
console.log(challenge.toLowerCase());
console.log(challenge.slice(0,2));
console.log(challenge.slice(3,22));
console.log(challenge.includes("Script"));
console.log(challenge.split(""));
console.log(challenge.split(" "));
console.log(challenge.replace("JavaScript","Python"));
console.log(challenge.charAt(15));
console.log(challenge.charCodeAt("J"));
console.log(challenge.lastIndexOf("a"));
console.log(challenge.indexOf("a"));
console.log(challenge.trim());
console.log(challenge.startsWith("50"));
console.log(challenge.endsWith("t"));
console.log(challenge.match(/a/g));
console.log(challenge.concat(" - Challenge"));
console.log(challenge.repeat(2));


let phrase = "You cannot end a sentence with because because because is a conjunction";
console.log(phrase.indexOf("because"));
console.log(phrase.lastIndexOf("because"));
console.log(phrase.search("because"));

let social = "Facebook, Google, Microsoft, Apple, IBM, Oracle, Amazon";
console.log(social.split(','))