import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DogTest {
    Dog dog;
    @Before
    public void setUp() throws Exception {
        dog = new Dog("Lucky", "wow");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getName() {
        assertEquals("Lucky", dog.getName());
    }

    @Test
    public void getVoice() {
    }
}