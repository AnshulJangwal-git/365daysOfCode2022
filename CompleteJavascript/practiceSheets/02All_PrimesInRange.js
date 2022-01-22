let low = 6 ;
let high = 24 ;
// let count = 0 ;

for(let i = low; i <= high; i++){
    let count = 0 ;
    for(let div = 2; div * div <= i; div ++){
        if(i % div == 0){
            count ++ ;
            // console.log(i + " is prime") ;
        }
    }
    if(count == 0){
        console.log(i + " is prime") ;

    }
}
