package com.luminousail.resourcehub.controller;


import com.luminousail.resourcehub.Service.GameService;
import com.luminousail.resourcehub.adapter.DataResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    GameService gameService;

    /**
     * 获取全部游戏
     * url:"http://host/game/getAllGames
     *
     * @param
     * @return DataResponse
     */
    @ResponseBody
    @RequestMapping(value="/test1",method= RequestMethod.GET)
    public ArrayList getAllGames(@RequestParam(defaultValue = "1") Integer pageNum,
                                 @RequestParam(defaultValue = "12") Integer pageSize){

        return gameService.test();

    }

}
