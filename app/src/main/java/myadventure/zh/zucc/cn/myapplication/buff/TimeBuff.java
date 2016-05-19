package myadventure.zh.zucc.cn.myapplication.buff;

/**
 * Created by nick on 2016/5/19.
 * 几个回合能受到加成或是dot
 */
public class TimeBuff extends Buff{
    private int time;

    public TimeBuff(String name, String property, int added, int time) {
        super(name, property, added);
        this.time = time;
    }
}
