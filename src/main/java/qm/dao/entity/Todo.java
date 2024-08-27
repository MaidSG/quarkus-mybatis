package qm.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/*******************************************************************
 * <pre></pre>
 * @文件名称： Todo.java
 * @包 路  径： qm.dao.entity
 * @Copyright：wy (C) 2024 *
 * @Description:
 * @Version: V1.0
 * @Author： wy
 * @Date： 2024/8/26 23:19
 * @Modify：
 */
@TableName("m_todo")
public class Todo extends Model<User> {

    private Integer id;

    private String title;

    private boolean completed;

    public Todo() {
    }

    public Todo(Integer id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
