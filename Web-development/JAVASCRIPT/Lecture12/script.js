const products = [{
    id: 1,
    name: "Laptop",
    price: 1000
},{
    id: 2,
    name: "Phone",
    price: 500
},{
    id: 3,
    name: "Tablet",
    price: 300
}];

const product = products.filter((p)=> {
     p.price < 1000
})

console.log(collect(products).where('price', '<', 1000));