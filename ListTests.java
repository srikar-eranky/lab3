import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Check implements StringChecker{
    String[] strs;
    public Check(String[] strs){
        this.strs = strs;
    }
    public boolean checkString(String s){
        for(String str : strs){
            if(s.equals(str)){
                return true;
            }
        }
        return false;
    }
}

public class ListTests{
    @Test
    public void testFilter(){
        String[] arr = new String[]{"a","b","c","d","b","e"};
        List<String> list = Arrays.asList(arr);
        List<String> result = ListExamples.filter(list, new Check(new String[]{"a","b","c"}));
        // expected {"a","b","c","b"}
        String[] expectedArr = new String[]{"a","b","c","b"};
        List<String> expected = Arrays.asList(expectedArr);
        assertEquals(expected, result);
    }
}
