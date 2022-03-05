package com.runoob.java._08_modifier;

/**
 * Java修饰符
 *
 * @author chenyongjun
 * @since 2022-02-24
 */
public class _08_01_Modifier {

    /**
     * 声明为private boolean的myFlog
     */
    private boolean myFlag;

    /**
     * 声明为default final double的weeks
     */
    static final double weeks = 9.5;

    /**
     * 声明为protecded static final int的BOXWIDTH
     */
    protected static final int BOXWIDTH = 42;

    public static void main(String[] args) {
        _08_01_Modifier modifier = new _08_01_Modifier();
        modifier.myFlag = true;
        System.out.println(modifier.myFlag);
        System.out.println(_08_01_Modifier.weeks);
        System.out.println(_08_01_Modifier.BOXWIDTH);
    }
}
