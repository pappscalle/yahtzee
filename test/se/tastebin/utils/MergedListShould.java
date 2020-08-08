package se.tastebin.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MergedListShould {
    
    @Test
    public void prependStringOntoList() {
        List apa = new MergedList("Alpha", Arrays.asList("Beta", "Gamma", "Delta"));
        assertEquals(apa, Arrays.asList("Alpha", "Beta", "Gamma", "Delta"));
    }
    
    @Test
    public void haveAllValuesInAnIterator() {
        List<String> apa = new MergedList("Alpha", Arrays.asList("Beta", "Gamma", "Delta"));
        Iterator<String> iter = apa.iterator();
         
        List<String> list = new ArrayList<>();
        while (iter.hasNext()) {
            list.add(iter.next());
        }
         
        assertEquals(list, Arrays.asList("Alpha", "Beta", "Gamma", "Delta"));
         
    }
}
