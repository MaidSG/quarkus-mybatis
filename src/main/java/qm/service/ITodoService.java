package qm.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import qm.dao.entity.Todo;

/*******************************************************************
 * <pre></pre>
 * @文件名称： ITodoService.java
 * @包 路  径： qm.service
 * @Copyright：wy (C) 2024 *
 * @Description:
 * @Version: V1.0
 * @Author： wy
 * @Date： 2024/8/26 23:16
 * @Modify：
 */
public interface ITodoService {

    /**
     * 获取待办事项列表分页
     * @param page 页码
     * @param size  每页大小
     * @return 待办事项列表
     */
    Page<Todo> getTodoList(int page, int size);



}
