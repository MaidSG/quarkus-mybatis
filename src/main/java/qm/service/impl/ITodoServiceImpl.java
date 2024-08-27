package qm.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import qm.dao.entity.Todo;
import qm.dao.mapper.TodoMapper;
import qm.dao.service.MpTodoService;
import qm.service.ITodoService;

/*******************************************************************
 * <pre></pre>
 * @文件名称： ITodoServiceImpl.java
 * @包 路  径： qm.service.impl
 * @Copyright：wy (C) 2024 *
 * @Description:
 * @Version: V1.0
 * @Author： wy
 * @Date： 2024/8/26 23:53
 * @Modify：
 */
@ApplicationScoped
public class ITodoServiceImpl implements ITodoService {

    @Inject
    TodoMapper todoMapper;


    /**
     * 获取待办事项列表分页
     * @param page 页码
     * @param size  每页大小
     * @return 待办事项列表
     */
    @Override
    public Page<Todo> getTodoList(int page, int size) {
        return todoMapper.selectPage(new Page<>(page, size),null);
    }
}
