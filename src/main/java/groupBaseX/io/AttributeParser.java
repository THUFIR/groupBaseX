package groupBaseX.io;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AttributeParser {

    private static final Logger log = Logger.getLogger(AttributeParser.class.getName());
    private List<String> attributes = new ArrayList<>();

    private AttributeParser() {
    }

    public AttributeParser(List<String> attributes) {
        this.attributes = attributes;
    }

    // ^(\+\d{1,2}\s)?\(?\d{3}\)?[\s.-]\d{3}[\s.-]\d{4}$  phone
    // ^\d{5}(?:[-\s]\d{4})?$     zip
    private void foo() {

        boolean isPhone = false;
        boolean isZip = false;
        for (String s : attributes) {
            int x = 3;
            isPhone = false;
            isZip = false;
            
            
            
            
            
        }
    }

}
