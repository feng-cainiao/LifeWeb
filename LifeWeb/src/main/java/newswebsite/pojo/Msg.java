package newswebsite.pojo;

import java.util.HashMap;
import java.util.Map;

public class Msg {
    private int code;
    private String msg;
    private Map<String,Object> extend=new HashMap<String,Object>();

    public Msg() {
    }
    public static Msg success()
    {
        Msg result=new Msg();
        result.setCode(100);
        result.setMsg("处理成功");
        return result;
    }
    public static Msg fail()
    {
        Msg result=new Msg();
        result.setCode(200);
        result.setMsg("处理失败");
        return result;
    }
    public static Msg failaccount()
    {
        Msg result=new Msg();
        result.setCode(202);
        result.setMsg("处理失败");
        return result;
    }
    public static Msg failaccountno()
    {
        Msg result=new Msg();
        result.setCode(204);
        result.setMsg("处理失败");
        return result;
    }
    public static Msg failpasswordnull()
    {
        Msg result=new Msg();
        result.setCode(201);
        result.setMsg("处理失败");
        return result;
    }
    public static Msg failpassworderror()
    {
        Msg result=new Msg();
        result.setCode(203);
        result.setMsg("处理失败");
        return result;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }
    public Msg add(String key, Object value)
    {
        this.getExtend().put(key,value);
        return this;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
