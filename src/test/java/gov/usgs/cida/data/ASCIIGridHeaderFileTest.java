package gov.usgs.cida.data;

import java.io.File;
import java.net.URL;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author jwalker
 */
public class ASCIIGridHeaderFileTest {

    /**
     * Test of readExtents method, of class ASCIIGridHeaderFile.
     * TODO make a smaller file and test arrays
     */
    @Test
    public void testReadExtents() throws Exception {
        System.out.println("readExtents");
        URL resource = ASCIIGridHeaderFileTest.class.getClassLoader().getResource("ASCII_HEADER");
        ASCIIGridHeaderFile instance = new ASCIIGridHeaderFile(new File(resource.getFile()));
        instance.readExtents();
        assertThat(4, equalTo(instance.getXLength()));
        assertThat(4, equalTo(instance.getYLength()));
    }
}
