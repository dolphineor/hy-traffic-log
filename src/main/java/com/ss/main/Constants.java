package com.ss.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by dolphineor on 2015-3-18.
 */
public interface Constants {

    String DEV_MODE = "dev";
    String PROD_MODE = "prod";

    // Kafka Parameters
    String ZK_CONNECTOR = "zookeeper.connect";
    String KAFKA_BROKER = "metadata.broker.list";

    // HTTP Identifier
    String HTTP_PATH = "path";
    String HTTP_PREFIX = "http:";
    String WWW_PREFIX = "www.";
    String DOUBLE_SLASH = "://";
    String REAL_IP = "X-Forwarded-For";
    String REFERRER = "Referer";
    String DT = "dt";   // 浏览当前页面的时间

    // Redis key
    String ACCESS_MESSAGE = "access_message";
    String IP_AREA_INFO = "ip_area_information";    // ip地址缓存
    String TYPE_ID_PREFIX = "typeid:";  // 网站trackId
    String SITE_URL_PREFIX = "tsu:";    // 网站url

    String EMPTY_STRING = "";
    String PLACEHOLDER = "-";
    String DELIMITER = ":";
    String QUESTION_MARK = "?";
    String UNKNOWN_VALUE = "未知";
    String GARBLED_VALUE = "--";

    // Elasticsearch index prefix
    String ACCESS_PREFIX = "access-";

    @Deprecated
    String VISITOR_PREFIX = "visitor-";

    // Elasticsearch type suffix
    String ES_TYPE_EVENT_SUFFIX = "_event"; //事件转化
    String ES_TYPE_PAGE_SUFFIX = "_page";//页面转化
    String ES_TYPE_XY_SUFFIX = "_xy";   // xy坐标
    String ES_TYPE_PROMOTION_URL_SUFFIX = "_promotion_url"; // 推广URL
    String ES_TYPE_PAGE_CONVERSION_SUFFIX = "_pageConversion";
    String ES_TYPE_AD_TRACK = "_ad_track";  // 广告跟踪

    String ID = "_id";      // elasticsearch文档id
    String INDEX = "index"; // elasticsearch索引名称
    String TYPE = "_type";  // elasticsearch文档类型
    

    // Elasticsearch field
    String METHOD = "method";
    String VERSION = "version";
    String HOST = "Host";
    String REMOTE = "remote";       // IP
    String TRAFFIC_CATEGORY = "tc"; // 0->国内, 1->国外
    String REGION = "region";       // 地域信息(省份, 直辖市等)
    String CITY = "city";           // 城市
    String ISP = "isp";             // 网络提供商
    String CURR_ADDRESS = "loc";    // 当前访问的页面
    String UNIX_TIME = "utime";     // 当前系统时间
    String CLIENT_TIME = "ctime";   // 访问当前页面的时间
    String VISITOR_IDENTIFIER = "ct";   // 新老访客标识(0->新访客, 1->老访客)
    
    //Mongodb field
    String MONGODB_IS_NEW = "isNew";  // 是否为新访客(0->新访客, 1->老访客)
    String MONGODB_TYPE = "type"; // 业务：对应不同的客户。字段：对应elasticsearch文档类型
    String MONGODB_USER_ID = "userId"; // 对应VID。
    String MONGODB_PV = "pv"; // 对应VID。
    
    //Mongodb table prefix
    String MONGODB_PREFIX = "ga-";
    String MONGODB_PREFIX_WEEK = "ga-week-";
    String MONGODB_PREFIX_MONTH = "ga-month-";
    
    String MONGODB_EXIT_PREFIX = "exit-indicator-";
    
    //Mongodb constant
    String NEW_CUSTOMER = "0";
    

    /**
     * 当天访问的ip重复标识符(依赖于trackId和ip)
     * 第一次出现: ip_dupli=1
     * 重复出现时: ip_dupli=0
     */
    String IP_DUPLICATE = "ip_dupli";
    String T = "t";         // trackId
    String TT = "tt";       // 访问次数标识符
    String VID = "vid";     // 访客唯一标识符
    String UCV = "_ucv";    // 访客数(UV)区分标识符
    String RF = "rf";       // Referrer
    String SE = "se";       // 搜索引擎名称
    String KW = "kw";       // 搜索词
    String RF_TYPE = "rf_type";     // 1. 直接访问, 2. 搜索引擎, 3. 外部链接
    String DOMAIN = "dm";           // 依据rf解析出的domain
    String PATHS = "paths";         // 访问当前页面的路径信息
    String ENTRANCE = "entrance";   // 入口页面(1->入口页面, 0->普通页面)
    String DESTINATION_URL = "des_url";     // 关键词推广URL
    String NEW_VISIT = "n";         // 是否一次新的访问
    String XY = "xy";               // xy坐标信息
    String DH = "dh";				// 页面高度
    String AD_TRACK = "atk";        // 广告跟踪流量标识
    String APP_IDENTIFIER = "app";  // (-1:非移动端标识, 0:未知, 1:移动浏览器, 2:App内置浏览器)
    /**
     * app的值:
     * -1: appn = {@link com.ss.main.Constants#PLACEHOLDER}
     * 0: appn = {@link com.ss.main.Constants#UNKNOWN_VALUE}
     * 1: appn的值为移动浏览器的名称(如: UC浏览器, 海豚浏览器), 同时br的值也设置成改值
     * 2: appn的值为移动App的名称(如: 微信, 新浪微博)
     */
    String APP_NAME = "appn";       // app名称
    String APP_OS_NUMBER = "os_num";// 移动端操作系统型号, 无法识别时标为"未知"
    String MOBILE_BRAND = "mobr";   // 移动品牌
    String MOBILE_MODEL = "momo";   // 移动品牌型号

    // Elasticsearch 推广URL字段信息
    String UT = "ut";
    String DMS = "dms";
    String LET = "let";
    String NETT = "nett";
    String NETD = "netd";
    String NTTP = "nttp";
    String SRV = "srv";

    String ET = "et";               // 事件跟踪
    String ET_CATEGORY = "et_category";    // 监控目标的类型名称
    String ET_ACTION = "et_action";    // 与目标的交互行为
    String ET_LABEL = "et_label";      // 事件的额外信息
    String ET_VALUE = "et_value";      // 事件的额外数值信息
    String ET_TARGET = "et_target";

    String PAGE_CONVERSION_NAME = "p_name";//页面转化目标名称
    String PAGE_CONVERSION_RECORD = "p_record";//页面转化记录方式
    String PAGE_CONVERSION_ORDERID = "p_orderid";//订单号
    String PAGE_CONVERSION_TYPE = "p_type";//页面转化类型
    String PAGE_CONVERSION_TYPETEXT = "p_typetext";
    String PAGE_CONVERSION_INCOME = "p_income";//页面转化预期收益
    String PAGE_CONVERSION_CONVERSIONRATE = "p_conversionrate";//预期转化率


    String KEYWORD_INFO_REQUEST_URL = "http://api.hy.best-ad.cn/sem/info/keyword?dm=%s&kwid=%s";

    String SEM_ACCOUNT_ID = "accountId";
    String SEM_CAMPAIGN_ID = "campaignId";
    String SEM_CAMPAIGN_NAME = "campaignName";
    String SEM_ADGROUP_ID = "adgroupId";
    String SEM_ADGROUP_NAME = "adgroupName";
    String SEM_KEYWORD_NAME = "keywordName";
    String SEM_KEYWORD_IDENTIFIER = "ca=";

    // Elasticsearch 推广信息的字段类型
    String ES_ACCOUNT_ID = "acid";      // 帐户id
    String ES_CAMPAIGN_ID = "cid";      // 推广计划id
    String ES_CAMPAIGN_NAME = "cpna";   // 推广计划名称
    String ES_ADGROUP_ID = "agid";      // 推广单元id
    String ES_ADGROUP_NAME = "agna";    // 推广单元名称
    String ES_KEYWORD_ID = "kwid";      // 推广关键词id
    String ES_KEYWORD_NAME = "kwna";    // 推广关键词名称

    // Elasticsearch 指定广告跟踪字段信息
    String AD_SOURCE = RF;              // 来源
    String AD_MEDIA = "media";          // 媒介
    String AD_CAMPAIGN = "cpna";        // 计划
    String AD_KEYWORD = "kwna";         // 关键词
    String AD_CREATIVE = "crt";         // 创意
    String AD_RF = "adsrf";              // 来源

    String VAL_RF_TYPE_DIRECT = "1";    // 直接访问标识
    String VAL_RF_TYPE_SE = "2";        // 搜索引擎访问标识
    String VAL_RF_TYPE_OUTLINK = "3";   // 外部链接访问标识

    DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    
	
	public static String DB_EXIT_NAME = "exit";
	public static String DB_CACHA_NAME = "cache";
	
	public static int EXIT_COUNT_INCREASE = 1;
	public static int EXIT_COUNT_DECREASE = -1;
	public static int EXIT_COUNT_ZERO = 0;
	
	

    // TEST CONSTANT
    String TEST_TRACK_ID = "1234567890";


    byte[] LOGO_IMG_BYTES = new byte[]{71, 73, 70, 56, 57, 97, 20, 0, 20, 0, -26, 118, 0, -3, -3, -3, -6, -6, -6, 3,
            -81, -17, 19, -76, -16, -17, -17, -17, -42, -14, -4, -14, -14, -14, -123, -40, -9, -100, -32, -7, 5, -81,
            -17, 8, -80, -17, -16, -16, -16, 2, -82, -17, -103, -33, -7, -4, -2, -1, 12, -79, -17, -2, -2, -2, 77, -58,
            -12, -52, -17, -4, 28, -73, -15, 11, -79, -16, 20, -76, -16, -12, -4, -2, 110, -47, -10, 4, -81, -17, 42,
            -69, -14, 21, -76, -16, 89, -54, -11, -3, -2, -1, 127, -42, -9, 122, -50, -19, 67, -61, -13, 94, -52, -11,
            -128, -42, -9, 11, -79, -17, -22, -13, -9, -10, -4, -2, 64, -63, -15, 46, -68, -15, -4, -4, -4, -108, -35,
            -8, -127, -42, -10, -71, -31, -15, -10, -10, -10, -92, -39, -19, -13, -5, -2, -90, -29, -7, -54, -20, -7,
            -111, -42, -16, -113, -37, -8, -121, -40, -10, -36, -12, -3, 92, -53, -11, 49, -69, -17, 103, -50, -11, -30,
            -20, -16, -67, -22, -5, -30, -16, -11, 71, -64, -18, 101, -52, -13, -21, -8, -3, -111, -36, -8, -8, -8, -8,
            -7, -7, -7, -59, -30, -19, 15, -78, -16, -112, -36, -8, 116, -46, -10, 44, -68, -14, 51, -66, -14, -65, -21,
            -5, -5, -2, -1, -5, -5, -5, -41, -14, -4, 10, -79, -16, 46, -69, -16, 28, -75, -17, 48, -67, -14, -35, -16,
            -9, 111, -47, -10, 54, -65, -14, -97, -31, -7, -66, -22, -5, 32, -74, -17, -18, -10, -7, -46, -15, -4, -92,
            -31, -9, 57, -64, -14, -115, -37, -8, -79, -27, -7, -27, -21, -18, 32, -72, -15, -11, -11, -11, 6, -81, -17,
            -124, -40, -9, 56, -65, -14, 3, -82, -17, 22, -76, -17, 60, -67, -18, 14, -78, -16, 42, -71, -17, -50, -20,
            -9, -12, -12, -12, -8, -6, -5, -11, -4, -2, -89, -29, -7, 98, -56, -18, 108, -48, -10, 7, -80, -17, -86,
            -28, -6, 114, -46, -10, 75, -58, -12, 41, -69, -14, 121, -45, -11, 95, -53, -12, 27, -74, -15, -1, -1, -1,
            1, -82, -17, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            33, -1, 11, 88, 77, 80, 32, 68, 97, 116, 97, 88, 77, 80, 60, 63, 120, 112, 97, 99, 107, 101, 116, 32, 98,
            101, 103, 105, 110, 61, 34, -17, -69, -65, 34, 32, 105, 100, 61, 34, 87, 53, 77, 48, 77, 112, 67, 101, 104,
            105, 72, 122, 114, 101, 83, 122, 78, 84, 99, 122, 107, 99, 57, 100, 34, 63, 62, 32, 60, 120, 58, 120, 109,
            112, 109, 101, 116, 97, 32, 120, 109, 108, 110, 115, 58, 120, 61, 34, 97, 100, 111, 98, 101, 58, 110, 115,
            58, 109, 101, 116, 97, 47, 34, 32, 120, 58, 120, 109, 112, 116, 107, 61, 34, 65, 100, 111, 98, 101, 32, 88,
            77, 80, 32, 67, 111, 114, 101, 32, 53, 46, 51, 45, 99, 48, 49, 49, 32, 54, 54, 46, 49, 52, 53, 54, 54, 49,
            44, 32, 50, 48, 49, 50, 47, 48, 50, 47, 48, 54, 45, 49, 52, 58, 53, 54, 58, 50, 55, 32, 32, 32, 32, 32, 32,
            32, 32, 34, 62, 32, 60, 114, 100, 102, 58, 82, 68, 70, 32, 120, 109, 108, 110, 115, 58, 114, 100, 102, 61,
            34, 104, 116, 116, 112, 58, 47, 47, 119, 119, 119, 46, 119, 51, 46, 111, 114, 103, 47, 49, 57, 57, 57, 47,
            48, 50, 47, 50, 50, 45, 114, 100, 102, 45, 115, 121, 110, 116, 97, 120, 45, 110, 115, 35, 34, 62, 32, 60,
            114, 100, 102, 58, 68, 101, 115, 99, 114, 105, 112, 116, 105, 111, 110, 32, 114, 100, 102, 58, 97, 98, 111,
            117, 116, 61, 34, 34, 32, 120, 109, 108, 110, 115, 58, 120, 109, 112, 77, 77, 61, 34, 104, 116, 116, 112,
            58, 47, 47, 110, 115, 46, 97, 100, 111, 98, 101, 46, 99, 111, 109, 47, 120, 97, 112, 47, 49, 46, 48, 47,
            109, 109, 47, 34, 32, 120, 109, 108, 110, 115, 58, 115, 116, 82, 101, 102, 61, 34, 104, 116, 116, 112, 58,
            47, 47, 110, 115, 46, 97, 100, 111, 98, 101, 46, 99, 111, 109, 47, 120, 97, 112, 47, 49, 46, 48, 47, 115,
            84, 121, 112, 101, 47, 82, 101, 115, 111, 117, 114, 99, 101, 82, 101, 102, 35, 34, 32, 120, 109, 108, 110,
            115, 58, 120, 109, 112, 61, 34, 104, 116, 116, 112, 58, 47, 47, 110, 115, 46, 97, 100, 111, 98, 101, 46, 99,
            111, 109, 47, 120, 97, 112, 47, 49, 46, 48, 47, 34, 32, 120, 109, 112, 77, 77, 58, 79, 114, 105, 103, 105,
            110, 97, 108, 68, 111, 99, 117, 109, 101, 110, 116, 73, 68, 61, 34, 120, 109, 112, 46, 100, 105, 100, 58,
            51, 68, 57, 54, 65, 51, 51, 55, 51, 52, 65, 56, 69, 52, 49, 49, 65, 66, 54, 68, 56, 50, 68, 49, 53, 54, 68,
            68, 49, 53, 68, 54, 34, 32, 120, 109, 112, 77, 77, 58, 68, 111, 99, 117, 109, 101, 110, 116, 73, 68, 61, 34,
            120, 109, 112, 46, 100, 105, 100, 58, 66, 70, 57, 54, 67, 48, 49, 48, 49, 50, 65, 57, 49, 49, 69, 53, 57,
            56, 55, 54, 68, 53, 55, 52, 66, 49, 49, 49, 70, 69, 50, 52, 34, 32, 120, 109, 112, 77, 77, 58, 73, 110, 115,
            116, 97, 110, 99, 101, 73, 68, 61, 34, 120, 109, 112, 46, 105, 105, 100, 58, 66, 70, 57, 54, 67, 48, 48, 70,
            49, 50, 65, 57, 49, 49, 69, 53, 57, 56, 55, 54, 68, 53, 55, 52, 66, 49, 49, 49, 70, 69, 50, 52, 34, 32, 120,
            109, 112, 58, 67, 114, 101, 97, 116, 111, 114, 84, 111, 111, 108, 61, 34, 65, 100, 111, 98, 101, 32, 80,
            104, 111, 116, 111, 115, 104, 111, 112, 32, 67, 83, 54, 32, 40, 87, 105, 110, 100, 111, 119, 115, 41, 34,
            62, 32, 60, 120, 109, 112, 77, 77, 58, 68, 101, 114, 105, 118, 101, 100, 70, 114, 111, 109, 32, 115, 116,
            82, 101, 102, 58, 105, 110, 115, 116, 97, 110, 99, 101, 73, 68, 61, 34, 120, 109, 112, 46, 105, 105, 100,
            58, 69, 55, 53, 52, 51, 56, 66, 51, 57, 51, 67, 56, 69, 52, 49, 49, 56, 65, 67, 70, 67, 56, 52, 50, 49, 65,
            65, 48, 65, 49, 69, 48, 34, 32, 115, 116, 82, 101, 102, 58, 100, 111, 99, 117, 109, 101, 110, 116, 73, 68,
            61, 34, 120, 109, 112, 46, 100, 105, 100, 58, 53, 57, 55, 65, 54, 54, 69, 55, 53, 56, 67, 56, 69, 52, 49,
            49, 66, 49, 70, 50, 67, 56, 50, 57, 54, 53, 52, 57, 50, 66, 68, 66, 34, 47, 62, 32, 60, 47, 114, 100, 102,
            58, 68, 101, 115, 99, 114, 105, 112, 116, 105, 111, 110, 62, 32, 60, 47, 114, 100, 102, 58, 82, 68, 70, 62,
            32, 60, 47, 120, 58, 120, 109, 112, 109, 101, 116, 97, 62, 32, 60, 63, 120, 112, 97, 99, 107, 101, 116, 32,
            101, 110, 100, 61, 34, 114, 34, 63, 62, 1, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15,
            -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30, -31, -32, -33, -34, -35, -36,
            -37, -38, -39, -40, -41, -42, -43, -44, -45, -46, -47, -48, -49, -50, -51, -52, -53, -54, -55, -56, -57,
            -58, -59, -60, -61, -62, -63, -64, -65, -66, -67, -68, -69, -70, -71, -72, -73, -74, -75, -76, -77, -78,
            -79, -80, -81, -82, -83, -84, -85, -86, -87, -88, -89, -90, -91, -92, -93, -94, -95, -96, -97, -98, -99,
            -100, -101, -102, -103, -104, -105, -106, -107, -108, -109, -110, -111, -112, -113, -114, -115, -116, -117,
            -118, -119, -120, -121, -122, -123, -124, -125, -126, -127, -128, 127, 126, 125, 124, 123, 122, 121, 120,
            119, 118, 117, 116, 115, 114, 113, 112, 111, 110, 109, 108, 107, 106, 105, 104, 103, 102, 101, 100, 99, 98,
            97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71,
            70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44,
            43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17,
            16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 33, -7, 4, 1, 0, 0, 118, 0, 44, 0, 0, 0, 0, 20,
            0, 20, 0, 0, 7, -9, -128, 118, -126, 118, 23, 20, 65, 31, 13, 22, -125, -117, -116, 118, 70, 117, -112,
            -112, 26, 88, 71, -115, -116, 52, -111, -103, 69, 5, -106, -126, 28, 3, -103, -103, 20, 105, -99, 85, -95,
            -95, 12, 7, -106, 46, -95, 34, 98, 58, 83, -111, 29, -115, 33, -111, 93, 30, 90, 11, 6, 6, 42, 100, -112,
            8, -116, 27, -112, 24, 44, 4, 92, 84, 47, 103, 1, 35, 75, 117, 10, 18, -117, 80, -112, 106, 4, 43, 39, 87,
            117, 32, 116, 0, 101, 2, 117, 68, 14, -125, 112, -112, 64, 102, 72, 51, -112, 19, 116, -37, 37, -112, 81,
            -125, 19, 117, 15, 4, 62, 16, 61, 117, 2, 8, -21, 116, 113, -112, 95, -125, 99, -22, -124, 89, 16, -128,
            -50, -101, 58, 108, -36, -96, 89, -105, 2, -110, -126, 65, -112, -64, -36, 8, 64, 66, 73, -92, 39, -21, -28,
            64, -86, 48, 40, 1, 36, 24, 63, 120, -40, 0, 85, -89, 1, 29, 11, 21, 32, 69, 24, -92, 1, 18, -109, 28, 0,
            -24, 56, -112, 32, 101, -35, -112, 72, 56, 6, 101, -120, 84, -61, 9, -124, 125, 28, 14, 48, -128, 116, 97,
            81, -124, 76, 15, 118, 88, -55, 34, -61, 68, -92, 53, -116, -68, -100, 10, 53, -89, 77, -93, 2, -34, -90,
            102, 64, -47, -94, -109, -112, 45, 9, 48, 12, 104, -78, 33, 70, -110, 78, -127, 0, 0, 59};

}
