package lotto;

public class Exception {

    //숫자가 아닌 문자 입력시 예외처리
    public boolean isNumeric(int money){
        try {
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public boolean divThousandOfMoney(int money){
        if(money%1000==0)return true;
        return false;
    }

    public boolean lessThanThousand(int money){
        if(money<1000)return true;
        return false;
    }
}
