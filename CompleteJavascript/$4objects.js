//object is just a group a key-value pair
// - > gr
//declaration 


let player = {
    name : "Virat kohli" ,
    age : 33 ,
    isBowler : true,
    skillset : "Batsman" ,

    address : {
        city : "Delhi" ,
        colony : "punjabi bagh",
        houseNo : 15
    } ,

    records : ["70 international hundreds", "captain of Indian team", "rcb captain", "married to anushka sharma"] ,
    sayHi : function() {
        console.log("virat kohli is saying hii! ") ;
    },
    totalTestMatchesPlayed : function(){
        return 99 ;
    }
} ;

//Get
// console.log(player.name) ;
// console.log(player.age) ;
// console.log(player.records[1]) ;
// player.sayHi() ;
// let returnedVal = player.totalTestMatchesPlayed() ;
// console.log(returnedVal) ;

// console.log("-------------------------------------------------") ;

// console.log("player :", player) ;
// //SetorUpdate 
// player.age = 34 ;
// player.friends = ["Shikhar Dhawan", "Ajinkya Rahane", "Chahal", "Kuldeep"] ;
// player.isBowler = false ;

// console.log("player :", player) ;

// console.log("-------------------------------") ;

//delete
// delete player.address ;
// console.log(player + " is player") ;

// player.friends = ["shikhar dhawan", "Ajinkya", "chahal"] ;

// for(let key in player){
//     console.log(key , " : ", player[key]) ;
// }


//get from the object using square bracket..
let key = "age" ;
console.log(player[key]) ;
console.log(player.age) ; //Note both are the same things just player[key] takes a value of key and search in the object the value of of that key in the object..

