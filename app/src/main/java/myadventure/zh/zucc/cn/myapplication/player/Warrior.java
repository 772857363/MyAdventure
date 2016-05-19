package myadventure.zh.zucc.cn.myapplication.player;

import myadventure.zh.zucc.cn.myapplication.bean.Person;
import myadventure.zh.zucc.cn.myapplication.tool.SkillCollection;

/**
 * Created by nick on 2016/5/17.
 * 战士的类
 */
public class Warrior extends Person {
    /**战士的怒气值*/
    public int angeryValue;

    public Warrior(String name) {
        this.name = name;
        this.HP = 200;
        this.experience = 0;
        this.angeryValue = 100;
        this.ad = 10;
        this.ap = 5;
        this.defenceM = 5;
        this.defenceP = 10;
        this.speed = 5;
        this.crits = 0.1;
        this.skills.add(SkillCollection.niu_dao);//初始技能牛刀小试
    }


}
