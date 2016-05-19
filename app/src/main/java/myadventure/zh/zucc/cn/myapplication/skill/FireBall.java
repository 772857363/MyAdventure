package myadventure.zh.zucc.cn.myapplication.skill;

import myadventure.zh.zucc.cn.myapplication.buff.TimeBuff;
import myadventure.zh.zucc.cn.myapplication.exception.MyException;

/**
 * Created by nick on 2016/5/18.
 * 火球术的类
 */
public class FireBall extends Skill{

    public FireBall(double rate, int level) {
        super("火球术", rate, 1, level, 30, "顾名思义。。。");
    }

    /**
     * 得到不同等级的技能
     * @param level
     * @return
     * @throws MyException
     */
    public static FireBall getLevelSkill(int level) throws MyException {
        FireBall fireBall;
        TimeBuff fired;
        switch (level){
            case 1:
                return new FireBall(1.5,level);
            case 2:
                return new FireBall(1.6,level);
            case 3:
                return new FireBall(1.8,level);
            case 4:
                return new FireBall(2.0,level);
            case 5:
                fireBall = new FireBall(2.0,level);
                fired = new TimeBuff("灼烧","HP",30,3);
                fireBall.addBuff(fired);//得到了灼烧的能力
                return fireBall;
            case 6:
                fireBall = new FireBall(2.2,level);
                fired = new TimeBuff("灼烧","HP",30,5);
                fireBall.addBuff(fired);//得到了灼烧的能力
                return fireBall;
            case 7:
                fireBall = new FireBall(2.4,level);
                fired = new TimeBuff("灼烧","HP",50,5);
                fireBall.addBuff(fired);//得到了灼烧的能力
                return fireBall;
            case 8:
                fireBall = new FireBall(2.6,level);
                fired = new TimeBuff("灼烧","HP",70,5);
                fireBall.addBuff(fired);//得到了灼烧的能力
                return fireBall;
            case 9:
                fireBall = new FireBall(2.8,level);
                fired = new TimeBuff("灼烧","HP",100,5);
                fireBall.addBuff(fired);//得到了灼烧的能力
                return fireBall;
            case 10:
                fireBall = new FireBall(3.0,level);
                fired = new TimeBuff("灼烧","HP",200,5);
                fireBall.addBuff(fired);//得到了灼烧的能力
                return fireBall;
            default:
                throw new MyException("你的技能等级有问题");
        }
    }
}
