package Offer;

public class Q02_�滻�ո� {
    public String replaceSpace(StringBuffer str) {
    	StringBuffer newStr = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                newStr.append("%20");
            } else {
            	newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
}