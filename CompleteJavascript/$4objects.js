//object is just a group a key-value pair
// - > gr
//declaration 


let player = {
    name : "Virat kohli" ,
    age : 33 ,
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
console.log(player.name) ;
console.log(player.age) ;
console.log(player.records[1]) ;
player.sayHi() ;
let returnedVal = player.totalTestMatchesPlayed() ;
console.log(returnedVal) ;



