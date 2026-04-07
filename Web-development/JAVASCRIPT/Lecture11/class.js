class Car {
  // properties / variables
  static fname;
  // function / methods
  constructor(bike, model){
    this.bike = bike;
    this.model = model;
  }
  honk() {
    // console.log("Beep Beep");
    return 'honking..';
  }
  static startRace(bike) {
    console.log("3..2..1..Go!", bike);
  }
}
const myCar = new Car();
myCar.honk();
Car.startRace('r15');

class Bmw extends Car {
    constructor(model, color) {
        super( model);
        this.color = color;
    }
    selectColor (color, model) {
        console.log(model,color,"car is ",this.honk());
    }

}

const myBmw = new Bmw();
console.log(myBmw)
myBmw.selectColor('red','r15');