class Bank {
  static amounts = {};
  constructor(id, name, amount) {
    this.id = id;
    this.name = name;
    this.amount = amount;
    Bank.amounts[this.id] = this.amount;
  }
  createAccount() {{
    accounts.forEach(value => {
      if (value.id === this.id) {
        console.log("Account with this ID already exists.");
        return 0;
      }
      else{
        accounts.push({id,amount});
      }
    });
    }
  }
  depositMoney(id,amount){
    if(value.id === this.id) {
      Bank.amounts[this.id] += amount;
    }
    else{
      console.log("Account with this ID does not exist.");
    }
  }
  withDrawMoney(id,amount){
    if(value.id === this.id) {
      if(Bank.amounts[this.id] >= amount){
      Bank.amounts[this.id] -= amount;
      }
    }
    else{
      console.log("Account with this ID does not exist.");
    }
  }
}
class User extends Bank {
  
}