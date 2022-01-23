//Non - primitive -> array, object, function
// fn def -> 

function sayHi(param){
    // console.log("Hello guys") ;
    // console.log("param received " + param) ;
    let rval = Math.random() > 0.5 ? true : "less than 0.5" ;
    return rval ;
    // return "returned from sayHi " ;

}


// sayHi(10) ;
// sayHi("hello js") ;
// sayHi([1, 2, 3, 4, 5]) ;

//output

// Hello guys
// param received 10       
// Hello guys
// param received hello js 
// Hello guys
// param received 1,2,3,4,5

let rval = sayHi([1, 2, 3, 4, 5]) ;
console.log("rval", rval) ;

