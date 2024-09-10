package qm.service;

/*******************************************************************
 * <pre></pre>
 * @文件名称： ITimeStampService.java
 * @包 路  径： qm.service
 * @Copyright：wy (C) 2024 *
 * @Description:
 * @Version: V1.0
 * @Author： wy
 * @Date： 2024/9/6 15:33
 * @Modify：
 */
public interface ITimeStampService {

    /**
     *  根据系统时间生成加密时间戳
      * @return 加密时间戳
     */
   String generateTimeStamp();


    /**
     * 根据加密时间戳解密出系统时间
     * @param timeStamp 加密时间戳
     * @return 系统时间
     */
   String resolveTimeStamp(String timeStamp);

    /**
     * 获取时间戳差值
     * @param timeStamp1 时间戳1
     * @param timeStamp2 时间戳2
     * @return 时间戳差值
     */
    String getTimeStampDifference(String timeStamp1, String timeStamp2);





}
