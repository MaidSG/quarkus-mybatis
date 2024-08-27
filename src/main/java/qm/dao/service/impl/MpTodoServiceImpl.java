package qm.dao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.enterprise.context.ApplicationScoped;
import qm.dao.entity.Todo;
import qm.dao.mapper.TodoMapper;
import qm.dao.service.MpTodoService;

/*******************************************************************
 * <pre></pre>
 * @文件名称： MpTodoServiceImpl.java
 * @包 路  径： qm.dao.service.impl
 * @Copyright：wy (C) 2024 *
 * @Description:
 * @Version: V1.0
 * @Author： wy
 * @Date： 2024/8/26 23:40
 * @Modify：
 */
@ApplicationScoped
public class MpTodoServiceImpl extends ServiceImpl<TodoMapper, Todo> implements MpTodoService {
}
