package gov.weather;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.rmi.server.ExportException;

import static org.junit.Assert.*;

public class NdfdXMLBindingStubTest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Test
    public void latLonListZipCode() throws Exception {
        String latlongstring = null;

        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String res = binding.latLonListZipCode("53562");

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            DwmlType latlong = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(res));
            latlongstring = latlong.getLatLonList();

            logger.info(latlongstring);
        } catch (JAXBException e) {
            logger.error("Unmarshalling failed", e);
        }

        assertEquals("Failed", "43.1029,-89.5063", latlongstring);
    }
}