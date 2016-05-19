package myadventure.zh.zucc.cn.myapplication.player;

import myadventure.zh.zucc.cn.myapplication.bean.Person;
import myadventure.zh.zucc.cn.myapplication.tool.SkillCollection;

/**
 * Created by nick on 2016/5/18.
 */
public class Assassin extends Person {
    /**法力值*/
    private int MP;

    public Assassin(String name) {
        this.name = name;
        this.HP = 100;
        this.experience = 0;
        this.MP = 100;
        this.ad = 7;
        this.ap = 5;
        this.defenceM = 7;
        this.defenceP = 5;
        this.speed = 10;
        this.crits = 0.3;
        this.skills.add(SkillCollection.fireball);//初始技能火球术
    }
}
