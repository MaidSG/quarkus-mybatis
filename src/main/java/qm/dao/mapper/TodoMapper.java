package qm.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import qm.dao.entity.Todo;
import qm.dao.entity.User;

/*******************************************************************
 * <pre></pre>
 * @文件名称： TodoMapper.java
 * @包 路  径： qm.dao.mapper
 * @Copyright：wy (C) 2024 *
 * @Description:
 * @Version: V1.0
 * @Author： wy
 * @Date： 2024/8/26 23:39
 * @Modify：
 */
@Mapper
public interface TodoMapper extends BaseMapper<Todo> {
}
