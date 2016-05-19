package myadventure.zh.zucc.cn.myapplication.buff;

import myadventure.zh.zucc.cn.myapplication.bean.Person;

/**
 * Created by nick on 2016/5/18.
 * 一个回合buff的模板
 */
public class Buff {
    /**buff的名称*/
    private String name;
    /**buff增加的是什么属性*/
    private String property;
    /**buff属性增量多少*/
    private int added;

    public Buff(String name, String property, int added) {
        this.name = name;
        this.property = property;
        this.added = added;
    }

    public void getBuff(Person p){
        switch (property){
            case "HP":
                p.setHP(p.getHP() + added);
                break;
            case "ad":
                p.setAd(p.getAd() + added);
                break;
            case "ap":
                p.setAp(p.getAp() + added);
                break;
            case "defenceP":
                p.setDefenceP(p.getDefenceP() + added);
                break;
            case "defenceM":
                p.setDefenceM(p.getDefenceM() + added);
                break;
            case "speed":
                p.setSpeed(p.getSpeed() + added);
                break;
            case "crits":
                p.setCrits(p.getCrits() + added);
                break;
        }
    }
}
