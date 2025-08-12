import java.io.*;
import  java.util.*;
public class UsersMainCode {

// Read only region start

    public int main(String[] args) {
        
    }
	public int createPIN(int input1,int input2,int input3){
		// Read only region end
        while(input3>0){
		int digit1 = input1%10;
        int digit2 = input2%10;
        int digit3 = input3%10;
        int digit = 0;
        if(digit1<digit2){
            if(digit1<digit3){
                digit = digit*0 + digit1;
            }
            else{
                digit = digit*0 + digit3;
            }
        }
        else {
            if(digit2<digit3){
                digit = digit*0 + digit2;
            }
            else{
                digit = digit*0 + digit3;
            }
        }
        input1/=10;
        input2/=10;
        input3/=10;
	}
    return digit;
    }
}

