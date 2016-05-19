package myadventure.zh.zucc.cn.myapplication.skill;

/**
 * Created by nick on 2016/5/19.
 * 致命一击的类
 */
public class DeathBlow extends Skill{
    public DeathBlow(double rate, int level) {
        super("致命一击", rate, 1, level, 50, "对敌方致命处攻击，暴击率增加一倍，但最高达到百分百");
    }
}
