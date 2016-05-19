package myadventure.zh.zucc.cn.myapplication.tool;

import myadventure.zh.zucc.cn.myapplication.skill.Skill;

/**
 * Created by nick on 2016/5/17.
 * 技能的集合
 */
public class SkillCollection {
    /**战士技能--牛刀小试*/
    public static Skill niu_dao = new Skill("牛刀小试",1.2,1,1,20,"江湖上比较普通的刀法，能造成比普通攻击高一些的伤害");
    /** 法师技能--火球术*/
    public static Skill fireball = new Skill("火球术",1.5,1,1,30,"顾名思义。。。");
    /**刺客技能--致命一击*/
    public static Skill deathblow = new Skill("致命一击",1.0,1,1,50,"对敌方致命处攻击，暴击率增加一倍，但最高达到百分百");
}
