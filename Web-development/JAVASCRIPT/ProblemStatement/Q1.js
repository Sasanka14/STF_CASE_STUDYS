/* Q1. Map, Filter, and Reduce Lab In this lab, you will implement your own map, filter, and reduce functions in JavaScript. These functions are commonly used for array manipulation in JavaScript. Map, filter, and reduce functions are higher-order functions that accept a callback function as an argument and apply that function to the elements of the input array in different ways.
By the end of this lab, you should have 3 functional implementations for map, filter, and reduce.
Make sure to export all the functions using ESM export.
A. Export the `myMap`, `myFilter`, and `myReduce` functions as named exports from `index.js` using ESM syntax.
B. Create a map function `myMap` in `index.js` that accepts an array and a callback function as arguments and returns a new array after applying the callback function to each element of the original array.
C. Create a filter function `myFilter` in `index.js` that accepts an array and a callback function as arguments and returns a new array consisting of elements that meet the condition specified in the callback function.
D. Create a reduce function `myReduce` in `index.js` that accepts an array, a callback function, and an optional initialValue as arguments, and returns a single value after applying the callback function to each element of the array.*/

let nums =[1,2,3,4,5]
// myMap function
function myMap(array, callback) {
    const result = [];
    for (let i = 0; i < array.length; i++) {
        result.push(callback(array[i], i, array));
    }
    return result;
}
console.log(myMap(nums,(i) => i + 2 ))

// myFilter function
function myFilter(array, callback) {
    const result = [];
    for (let i = 0; i < array.length; i++) {
        if (callback(array[i], i, array)) {
            result.push(array[i]);
        }
    }
    return  result;
}
console.log(myFilter(nums,(i) => i > 2 ))
// myReduce function
function myReduce(array, callback, initialValue) {
    let accumulator = initialValue !== undefined ? initialValue : array[0];
    const startIndex = initialValue !== undefined ? 0 : 1;

    for (let i = startIndex; i < array.length; i++) {
        accumulator = callback(accumulator, array[i], i, array);
    }
    return accumulator;
}
console.log(myReduce(nums,(acc, curr) => acc + curr ,0))

export { myMap, myFilter, myReduce };