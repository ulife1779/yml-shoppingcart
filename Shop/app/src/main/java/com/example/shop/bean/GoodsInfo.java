package com.example.shop.bean;


import com.example.shop.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "Samsung", "iphone", "小米", "oneplus", "VIVO", "OPPO", "Huawei", "Gionee"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Samsung/三星 Galaxy Note20 5G SM-N9810 Ultra港版韩版手机",
            "Apple/苹果iPhone 12全网通5G手机 新款原装国行苹果12Pro中国电信天翼官网旗舰店11pro max",
            "小米10至尊纪念版5G手机骁龙865官方旗舰店",
            "一加 OnePlus 8Pro 5G旗舰店120Hz柔性高通骁龙865游戏手机1+旗舰店",
            "vivo iQOO Neo3 5G手机全网通能良iqoonoe3新品5中国移动官旗",
            "OPPO Reno4 SE opporeno4se手机oppo手机官方旗舰店官网",
            "Huawei/华为 nova 7 5G 全面屏官方正品手机7Pro",
            "Gionee/金立 M2017 超长待机 6GB+128GB内存 全网通4G曲屏手机"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = { 8508, 6799, 5599, 5299, 3298, 2799, 2990,  2788};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.samsung_s, R.drawable.iphone_s, R.drawable.xiaomi_s, R.drawable.oneplus_s,
            R.drawable.vivo_s, R.drawable.oppo_s, R.drawable.huawei_s, R.drawable.gionee_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.samsung, R.drawable.iphone, R.drawable.xiaomi,R.drawable.oneplus,
            R.drawable.vivo, R.drawable.oppo, R.drawable.huawei,R.drawable.gionee
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
