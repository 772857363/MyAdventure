package myadventure.zh.zucc.cn.myapplication.player;

import myadventure.zh.zucc.cn.myapplication.bean.Person;
import myadventure.zh.zucc.cn.myapplication.tool.SkillCollection;

/**
 * Created by nick on 2016/5/18.
 */
public class Magician extends Person {
    /**法力值*/
    private int MP;

    public Magician(String name) {
        this.name = name;
        this.HP = 100;
        this.experience = 0;
        this.MP = 150;
        this.ad = 5;
        this.ap = 10;
        this.defenceM = 10;
        this.defenceP = 5;
        this.speed = 3;
        this.crits = 0.0;
        this.skills.add(SkillCollection.fireball);//初始技能火球术
    }
}
