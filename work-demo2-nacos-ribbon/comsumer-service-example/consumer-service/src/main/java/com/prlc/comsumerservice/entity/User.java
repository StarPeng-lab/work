package com.prlc.comsumerservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <pre>
 * classname User
 * description
 * </pre>
 *
 * @author pengruolan
 * @date 2021/4/9  20:06
 **/
@Data
public class User { /*由于我们使用RestTemplate调用Restful服务后，需要将对应的json串转换成User对象，所以需要将这个类拷贝到该工程中*/

    private Integer id;

    private String nickname;

    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH-mm-ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

}
