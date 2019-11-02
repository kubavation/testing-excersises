package hashmap;

import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class HashMapTest {

    private HashMap<String, String> hashMap;

    @Before
    public void init() {
        hashMap = new HashMap<String, String>();
    }

    @Test
    public void shouldPutMethodInsertNewValue() {
        String value = "value";
        String key = "key";

        hashMap.put(key,value);

        assertEquals(value, hashMap.get(key));
    }

    @Test
    public void shouldRecordWithSameKeyOverwriteOldValue() {
        String oldValue = "oldValue";
        String newValue = "newValue";
        String key = "key";

        hashMap.put(key, oldValue);
        hashMap.put(key, newValue);

        assertEquals(newValue, hashMap.get(key));
    }



    @Test
    public void shouldClearMethodRemoveAllContent() {
        hashMap.put("1","1");
        hashMap.put("2","2");

        hashMap.clear();

        assertEquals(0, hashMap.size());
    }

    @Test
    public void shouldNullKeyBeInsertedToHashMap() {
        String nullKey = null;

        hashMap.put(nullKey, "test");

        assertEquals("test", hashMap.get(nullKey));
    }
}
