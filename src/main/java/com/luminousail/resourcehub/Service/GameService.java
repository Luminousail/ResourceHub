package com.luminousail.resourcehub.Service;


import com.github.pagehelper.Page;
import com.luminousail.resourcehub.adapter.DataResponse;
import com.luminousail.resourcehub.pojo.Game;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

public interface GameService {


    DataResponse getAllGames(Integer pageNum, Integer pageSize);


    DataResponse searchGame(Integer pageNum, Integer pageSize,String name);

    ArrayList test();

}
