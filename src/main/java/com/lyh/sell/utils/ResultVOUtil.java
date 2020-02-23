package com.lyh.sell.utils;

import com.lyh.sell.VO.ResultVO;

/**
 * @author 刘元辉
 * @date 2020/2/23 15:58
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVo = new ResultVO();
        resultVo.setData(object);
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code, String msg){
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }

}
