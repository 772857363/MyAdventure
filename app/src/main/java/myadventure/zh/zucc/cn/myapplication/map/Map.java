package myadventure.zh.zucc.cn.myapplication.map;

import java.util.ArrayList;

import myadventure.zh.zucc.cn.myapplication.bean.Living;

/**
 * Created by nick on 2016/5/18.
 * 地图父类
 */
public class Map {
    /**地图名称*/
    public String name;
    /**地图最低等级限制*/
    public int lowLevel;
    /**地图所有的怪物*/
    public ArrayList<Living> livings = new ArrayList<Living>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLowLevel() {
        return lowLevel;
    }

    public void setLowLevel(int lowLevel) {
        this.lowLevel = lowLevel;
    }
}
