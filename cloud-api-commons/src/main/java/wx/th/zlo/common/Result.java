package wx.th.zlo.common;


import lombok.Data;

/**
 * ClassName: Result
 * Description: TODO
 * Author: zlo
 * Date: 2022/11/1 22:29
 * Version: 1.0.0
 */
@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;
    public  static <T> Result success(T data){
        Result result = new Result();
        result.setCode(200);
        result.setMessage("ok");
        result.setData(data);
        return  result;
    }
    public  static <T> Result success(T data,String mes){
        Result result = new Result();
        result.setCode(200);
        result.setMessage(mes);
        result.setData(data);
        return  result;
    }
    public  static <T> Result fail(T data){
        Result result = new Result();
        result.setCode(200);
        result.setMessage("false");
        result.setData(data);
        return  result;
    }
}
