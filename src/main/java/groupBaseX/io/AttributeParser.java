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

}
