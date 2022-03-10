//Leetcode 393 - https://leetcode.com/problems/utf-8-validation/
class $17utf8Validation {
    public boolean validUtf8(int[] data) {
        int rembytes = 0;
        for(int val : data){
            if(rembytes == 0){//means we haven't found any 2-4 bytes char
                if((val>>7) == 0b0){//#1 after shifting left 7 times if the bit is equal to 0 then 1 byte
                    rembytes = 0;
                }else if((val>>5) == 0b110){//after 5 shift equals to 110 then 2 bytes and rem is 10xxx
                    rembytes = 1;
                }else if((val>>4) == 0b1110){//after 4 shift equals to 1110 then rem is 10 and 10 so 2
                    rembytes = 2;   
                }else if((val>>3) == 0b11110){//after 3 shift equal to 11110 then rem 3 bytes 10,10,10
                    rembytes = 3;
                }else{//as if there is only one val then return false
                    return false;
                }
            }//else we have remaining bytes then check for them
            else{
                if((val>>6) == 0b10){//it should be equal to 10 else not staisfies then return false
                    rembytes--;
                }else{
                    return false;
                }
            }
        }
        //0b is for binary values check
        return rembytes == 0;//rembytes should be 0
    }
}