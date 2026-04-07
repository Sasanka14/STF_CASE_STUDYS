// Old Way 
function add(a,b){
    return a + b;
}
console.log(add(2,3));

// New Way
const add1 = (a,b) =>
    a+b

console.log(add1(6,9))

function hello(fname,lame){
    console.log(`Hello ${fname} ${lame}`);
}
hello("Sasanka")

let greet = function(fname,lame){
    console.log(`Hello ${fname} ${lame}`);
}
greet("Sasanka","S Kundu")

function add2 (num1,num2){
    return num1 + num2
}
console.log(add2(1))

