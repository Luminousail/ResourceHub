package com.luminousail.resourcehub.controller;


import com.github.pagehelper.Page;
import com.luminousail.resourcehub.Service.GameService;
import com.luminousail.resourcehub.adapter.DataResponse;
import com.luminousail.resourcehub.pojo.Game;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/game")
public class GameController {

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
    @RequestMapping(value="/getAllGames",method= RequestMethod.GET)
    public DataResponse getAllGames(@RequestParam(defaultValue = "1") Integer pageNum,
                                    @RequestParam(defaultValue = "12") Integer pageSize){

        return gameService.getAllGames(pageNum,pageSize);

    }

    /**
     * 检索游戏
     * url:"http://host/game/searchGame
     *
     * @param
     * @return DataResponse
     */
    @ResponseBody
    @RequestMapping(value="/searchGame",method= RequestMethod.GET)
    public DataResponse searchGame(@RequestParam(defaultValue = "1") Integer pageNum,
                                    @RequestParam(defaultValue = "12") Integer pageSize,
                                   @RequestParam(defaultValue = "") String name){

        return gameService.searchGame(pageNum,pageSize,name);

    }
}
