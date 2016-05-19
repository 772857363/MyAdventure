package myadventure.zh.zucc.cn.myapplication.bean;

import java.util.ArrayList;

import myadventure.zh.zucc.cn.myapplication.skill.Skill;

/**
 * Created by nick on 2016/5/17.
 */
public class Living {
    /**生物名称*/
    public String name;
    /**生物的HP*/
    public long HP;
    /**生物的攻击力*/
    public int ad;
    /**生物的物理防御*/
    public int defenceP;
    /**生物的魔法防御*/
    public int defenceM;
    /**生物的闪避值*/
    public int speed;
    /**生物的法术强度*/
    public int ap;
    /**生物的暴击值*/
    public double crits;

    /**技能容器*/
    public ArrayList<Skill> skills = new ArrayList<Skill>();

    /**
     * 增加一个技能到技能池里
     * @param skill
     */
    public void addSkill(Skill skill){
        this.skills.add(skill);
    }

    public double getCrits() {
        return crits;
    }

    public void setCrits(double crits) {
        this.crits = crits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHP() {
        return HP;
    }

    public void setHP(long HP) {
        this.HP = HP;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getDefenceP() {
        return defenceP;
    }

    public void setDefenceP(int defenceP) {
        this.defenceP = defenceP;
    }

    public int getDefenceM() {
        return defenceM;
    }

    public void setDefenceM(int defenceM) {
        this.defenceM = defenceM;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }
}
