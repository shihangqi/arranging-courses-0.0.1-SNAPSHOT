package com.hut.kwk.util;

import com.github.pagehelper.PageInfo;
import com.hut.kwk.constant.LayerResponse;
import com.hut.kwk.constant.ServerResponse;
import com.hut.kwk.model.entity.User;

import java.util.List;

/**
 * Create by kwk on 2019-04-21
 *
 * @author kwk
 */
public class ToLayerUtil {
    public static LayerResponse<List<User>> toLayer(ServerResponse<PageInfo<User>> serverResponse){
    	LayerResponse<List<User>> layerResponse = new LayerResponse<List<User>>();
    	layerResponse.setCode(serverResponse.getStatus());;
    	layerResponse.setCount(serverResponse.getData().getTotal());
    	layerResponse.setMsg(serverResponse.getMsg());
    	layerResponse.setData(serverResponse.getData().getList());
    	return layerResponse;
    }
}
