/**
 * Created by alwin on 04/01/2017.
 */
//private final String string;

public class CharacterCounter {
    private String string;

    public CharacterCounter(String string) {

        this.string = string;
    }

    public int count(char character) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == character){
                counter ++;
            }

        }
        return counter;
        /*if (string.length() == 2) {
            return 2;
        }
        else
            return 1;*/
    }
}
