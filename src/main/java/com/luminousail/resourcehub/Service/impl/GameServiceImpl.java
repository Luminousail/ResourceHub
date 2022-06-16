package com.luminousail.resourcehub.Service.impl;



import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.luminousail.resourcehub.Service.GameService;
import com.luminousail.resourcehub.adapter.DataResponse;
import com.luminousail.resourcehub.mapper.GameMapper;
import com.luminousail.resourcehub.pojo.Game;
import com.luminousail.resourcehub.pojo.GameExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class GameServiceImpl implements GameService {

    @Resource
    GameMapper gameMapper;


    @Override
    public DataResponse getAllGames(Integer pageNum, Integer pageSize) {

//        HashMap map = new HashMap();
//        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
//        HashSet set = new HashSet();

        DataResponse dataResponse = new DataResponse();
        GameExample example = new GameExample();
        Page page = PageHelper.startPage(pageNum,pageSize);
        List<Game> list = gameMapper.selectByExample(example);
        dataResponse.setData(list);
        dataResponse.setPageNum(page.getPageNum());
        dataResponse.setPageSize(page.getPageSize());
        dataResponse.setTotal(page.getTotal());
        dataResponse.setPages(page.getPages());
        return dataResponse;
    }

    @Override
    public DataResponse searchGame(Integer pageNum, Integer pageSize, String name) {
        DataResponse dataResponse = new DataResponse();
        GameExample example = new GameExample();
        example.or().andNameLike("%"+name+"%");
        Page page = PageHelper.startPage(pageNum,pageSize);
        List<Game> list = gameMapper.selectByExample(example);
        dataResponse.setData(list);
        dataResponse.setPageNum(page.getPageNum());
        dataResponse.setPageSize(page.getPageSize());
        dataResponse.setTotal(page.getTotal());
        dataResponse.setPages(page.getPages());
        return dataResponse;
    }

    @Override
    public ArrayList test() {
        ArrayList list = new ArrayList();
        testThread testThread = new testThread("thread1");
        testThread testThread2 = new testThread("thread2");
        testThread.start();
        testThread2.start();



        return list;
    }



    public class testThread extends Thread {
        String str = "";
        testThread(String s){
            str = s;
        }


        public void run(){
//            System.out.println(str);
            for(int a=0;a<50;a++){
                System.out.println(str+a);
        }
        }

    }
}
