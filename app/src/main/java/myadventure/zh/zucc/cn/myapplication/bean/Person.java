package myadventure.zh.zucc.cn.myapplication.bean;

/**
 * Created by nick on 2016/5/17.
 */
public class Person {
    /*玩家名称*/
    public String name;
    /*玩家的HP*/
    public long HP;
    /*玩家的经验*/
    public long experience;
    /*玩家的攻击力*/
    public int ad;
    /*玩家的物理防御*/
    public int defenceP;
    /*玩家的魔法防御*/
    public int defenceM;
    /*玩家的闪避值*/
    public int speed;
    /*玩家的法术强度*/
    public int ap;

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

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }
}
