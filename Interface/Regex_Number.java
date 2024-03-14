package Interface;

public interface Regex_Number {
    public static final int Zero = 0;
    public static final int One = 1;
    public static final int Two = 2;
    public static final int Three = 3;
    public static final int Four = 4;
    public static final int Five = 5;
    public static final int Six = 6;
    public static final int Seven = 7;
    public static final int Eight = 8;
    public static final int Nine = 9;
    public static final String YMDRegex = "^(\\d{4})-(0?[1-9]|1[0-2])-(0?[1-9]|[12][0-9]|3[01])$";
    public static final String TitleRegex = "^[a-zA-Z0-9\\s]+$";
    public static final String GenreRegex = "^[a-zA-Z\\s]+$";
    public static final String PriceRegex = "^[0-9]{1,15}$";
    public static final String RatingRegex = "^(10(\\.0{1,2})?|[0-9](\\.\\d{1,2})?)$";
    public static final String GenreErrorMessage = "Thể loại không hợp lệ. Vui lòng nhập lại:";
    public static final String PriceErrorMessage = "Giá game không hợp lệ. Vui lòng nhập lại:";
    public static final String RatingErrorMessage = "Số điểm không hợp lệ. Vui lòng nhập lại:";
    public static final String TitleErrorMessage= "Tên không hợp lệ. Vui lòng nhập lại:";
    public static final String DateErrorMessage = "Ngày phát hành không hợp lệ. Vui lòng nhập lại:";
}
