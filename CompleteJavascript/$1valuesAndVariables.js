//variables -> Types : Primitive - numbers, Strings, boolean, null

var myName = "Anshul Jangwal"
// console.log(myName) ;

myAge = 26 ;

// console.log(myAge) ;

//variables names are case sensitive..

// myAge  != myage

// console.log("Hello Javascript");

let a ; //declare variable..
// console.log(a) ;

a = 10.1 ; //initialization...
a = "Hello i am also a String" ;

// variables
// console.log(a) ;

// //loops
// let number = 10 ;
// for(let i = 0; i < number; i++){
//     console.log("Number is ", i) ;
// }
//is prime
let number = 23 ;
let flag = true ;
for(let div = 2; div * div <= number; div++){
    if(number % div == 0){
        flag = false ;
        break ;
    }
}

if(flag == true){
    console.log("Number is prime" + " " + number) ;

}else{
    console.log("Number is not prime ", number) ;

}
