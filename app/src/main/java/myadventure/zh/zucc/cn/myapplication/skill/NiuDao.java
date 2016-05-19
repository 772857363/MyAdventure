package myadventure.zh.zucc.cn.myapplication.skill;

import myadventure.zh.zucc.cn.myapplication.exception.MyException;

/**
 * Created by nick on 2016/5/18.
 * 牛刀小试的类
 */
public class NiuDao extends Skill{

    public NiuDao(double rate, int level) {
        super("牛刀小试", rate, 1, level, 20, "江湖上比较普通的刀法，能造成比普通攻击高一些的伤害");
    }

    /**
     * 得到不同等级的技能
     * @param level
     * @return
     * @throws MyException
     */
    public static NiuDao getLevelSkill(int level) throws MyException {
        switch (level){
            case 1:
                return new NiuDao(1.2,level);
            case 2:
                return new NiuDao(1.3,level);
            case 3:
                return new NiuDao(1.4,level);
            case 4:
                return new NiuDao(1.5,level);
            case 5:
                return new NiuDao(1.6,level);
            case 6:
                return new NiuDao(1.7,level);
            case 7:
                return new NiuDao(1.8,level);
            case 8:
                return new NiuDao(1.9,level);
            case 9:
                return new NiuDao(2.0,level);
            case 10:
                return new NiuDao(2.5,level);
            default:
                throw new MyException("你的技能等级有问题");
        }
    }
}
