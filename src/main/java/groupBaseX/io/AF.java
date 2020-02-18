package groupBaseX.io;

// ^(\+\d{1,2}\s)?\(?\d{3}\)?[\s.-]\d{3}[\s.-]\d{4}$  phone
// ^\d{5}(?:[-\s]\d{4})?$     zip
public enum AF {
    HOME_PHONE,
    CELL_PHONE,
    ADDRESS1,
    ADDRESS2,
    GARBAGE;

    public AF getType(String s) {
        return AF.HOME_PHONE;
    }
}
