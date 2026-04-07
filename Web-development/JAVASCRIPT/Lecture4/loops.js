// For Loop Example
let string = "JavaScript is fun";
for(let i = 0; i < string.length; i++){
    console.log([i],string[i]);
}
let output = "";
for(let i = 0; i < string.length; i++){
    output +=  `[${i}] ${string[i]} ` ;
    console.log(output);
}
console.log("Output String: " + output);

for(let i = 1; i <= 5; i++){
    console.log("Iteration number: " + i);
}

let horizontalOutput = "";

for(let i = 1; i <= 5; i++){
    if(i == 2)
        break;
    horizontalOutput += "Iteration number: " + i + " ";
}
console.log(Number(horizontalOutput));

for(let i = 1; i <= 5; i++){
    console.log("Iteration number: " + i);
}

// While Loop Example
let count = 0;
while(count < 5){
    console.log("Count is: " + count);
    count++;
}

// Do-While Loop Example
let num = 0;
do {
    console.log("Number is: " + num);
    num++;
} while(num < 3);                                       