package qm.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import qm.service.ITimeStampService;

/*******************************************************************
 * <pre></pre>
 * @文件名称： ITimeStampServiceImpl.java
 * @包 路  径： qm.service.impl
 * @Copyright：wy (C) 2024 *
 * @Description:
 * @Version: V1.0
 * @Author： wy
 * @Date： 2024/9/6 15:33
 * @Modify：
 */
@ApplicationScoped
public class ITimeStampServiceImpl implements ITimeStampService {
    @Override
    public String generateTimeStamp() {
        return null;
    }

    @Override
    public String resolveTimeStamp(String timeStamp) {
        return null;
    }

    @Override
    public String getTimeStampDifference(String timeStamp1, String timeStamp2) {
        return null;
    }
}
