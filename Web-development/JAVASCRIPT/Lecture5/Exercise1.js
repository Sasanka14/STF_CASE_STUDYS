let empty_array = [];
console.log(empty_array);

let number  = [1, 4, 5, 8, 9,10];
console.log(number);
console.log(number.length);
console.log("Last element: " + number[number.length - 1]);
console.log("Middle element: " + number[Math.floor(number.length / 2)]);
console.log("First element: " + number[0]);

let mixed_array = [1, "Hello", true, null, 5.6, undefined];
console.log(mixed_array);
console.log(mixed_array.length);

let company = ["Google","Microsoft", "Apple", "Amazon","IBM","Facebook","Oracle"];
let formatted = company.slice(0, -1).join(", ") + " and " + company.slice(-1);
console.log(formatted); 
console.log(typeof formatted);
console.log("Number of companies: " + company.length);
console.log("First company: " + company[0]);
console.log("Middle company: " + company[Math.floor(company.length / 2)]);
console.log("Last company: " + company[company.length - 1]);
console.log(company)
for (let i = 0; i < company.length; i++) {
    console.log(company[i].toUpperCase());
}

let sentence = company.slice(0, -1).join(", ") + " and " + company.slice(-1) + " are amazing big IT companies.";
console.log(sentence);


let present = "Alphabet";
if(company.includes(present)) {
    console.log(`${present} is found in the array.`);
} else {
    console.log(`${present} is not found in the array.`);
}

let findO = [];
for (let i = 0; i < company.length; i++) {
    let currentCompany = company[i].toLowerCase();

    if (currentCompany.split('o').length > 2) {
        findO.push(company[i]);
    }
}
console.log("Companies with more than one 'o': " + findO);

company.sort();
console.log("Sorted companies: " + company);

company.reverse();
console.log("Reversed companies: " + company);
console.log("Sliced companies (first 3): " + company.slice(0, 3));
console.log("Sliced companies (last 3): " + company.slice(-3));
console.log("Sliced Middle company: " + company.slice(Math.floor((company.length - 1) / 2), Math.ceil((company.length + 1) / 2)));
console.log("Removing first company: " + company.shift());
console.log("After removing first company: " + company);
console.log("Removing middle company: " + company.splice(Math.floor((company.length - 1) / 2), 1));
console.log("After removing middle company: " + company);
console.log("Removing last company: " + company.pop());
console.log("After removing last company: " + company);
company.splice(0, company.length);
console.log("After removing all companies.... " + company);