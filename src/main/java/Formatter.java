public class Formatter {
    double roundedFee;
    String endWord;
    void format(double fee){
        roundedFee=Math.floor(fee);
        while (roundedFee>20){
            roundedFee-=20;
        }
        if (roundedFee==1){
            endWord="рубль";
        } else if (roundedFee>1 && roundedFee<=4) {
            endWord="рубля";
        }
        else {
            endWord="рублей";
        }
    }
}
