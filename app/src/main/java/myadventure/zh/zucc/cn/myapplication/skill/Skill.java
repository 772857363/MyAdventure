package myadventure.zh.zucc.cn.myapplication.skill;

import java.util.ArrayList;

import myadventure.zh.zucc.cn.myapplication.buff.Buff;

/**
 * Created by nick on 2016/5/17.
 */
public class Skill {
    /**技能名称*/
    public String name;
    /**技能伤害倍率*/
    public double rate;
    /**技能伤害敌方个数*/
    public int num;
    /**技能等级*/
    public int level;
    /**技能消耗*/
    public int consume;
    /**技能说明*/
    public String introduce;
    /**技能buff的容器*/
    public ArrayList<Buff> buffs = new ArrayList<Buff>();

    /**
     * 可以向buff池里放buff
     * @param buff
     */
    public void addBuff(Buff buff){
        buffs.add(buff);
    }

    public Skill(String name, double rate, int num, int level, int consume,String introduce) {
        this.name = name;
        this.rate = rate;
        this.num = num;
        this.level = level;
        this.consume = consume;
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getConsume() {
        return consume;
    }

    public void setConsume(int consume) {
        this.consume = consume;
    }
}
