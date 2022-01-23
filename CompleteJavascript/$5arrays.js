//declaraion 
let arr = [] ;

arr = [1, 2, 3, 4, 5] ;

console.log(arr) ;
console.log(arr.length) ;


// let i = 0 ;
// while(i < arr.length){
//     console.log("elem at idx :", i, " is", arr[i]) ;
//     i ++ ;
// }

// for(let i = 0; i < arr.length; i++){
//     console.log(arr[i]) ;
// }

//functions in array...
//Add -> push, unshift
arr.push("add at last idx") ;
arr.unshift("add at first idx") ;
console.log(arr) ;

//remove -> pop, shift
arr.pop() ; // remove from the last idx
arr.shift() ; //remove from the first idx
console.log(arr) ;

//splice and slice...
// let partOfAnArray = arr.slice(1, 4) ; //slice is basically similar to substring function of a string in java..
// console.log(partOfAnArray) ;
// let partAfterAnIdx = arr.slice(2) ;
// console.log(partAfterAnIdx) ;

//splice
// console.log(arr) ;
// arr.splice(2, 1) ; // takes splice(idx, count), note idx here is 1 based indexing.. and count
// console.log(arr) ;
arr.push(0) ;
arr.push(15) ;
arr.push(21) ;
console.log(arr) ;
console.log("------------------------------------");
// arr.splice(3, 4) ;
// console.log(arr) ;



//index of, includes..
console.log(arr.indexOf(5)) ;

let isIncluded = arr.includes(5, 11) ;
console.log(isIncluded) ;
console.log(arr) ;

const fruits = ["Banana", "Orange", "Apple", "Mango"];
let check = fruits.includes("Banana", 0);
console.log(check) ;




