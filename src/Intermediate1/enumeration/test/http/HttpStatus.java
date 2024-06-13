package Intermediate1.enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK"), BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),INTERNAL_SERVER_ERROR(500,"Internal Server Error");

    private final int code;
    private final String message;

    private HttpStatus(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int scanCode){
        for (HttpStatus httpStatus : HttpStatus.values()){
            if(httpStatus.code == scanCode){
                return httpStatus;
            }
        }
        return null;
    }

    public boolean isSuccess(){
        if(code >=200 && code <= 299){
            return true;
        }else{
            return false;
        }
    }
}
