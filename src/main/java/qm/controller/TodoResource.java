package qm.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.metrics.annotation.Counted;
import qm.dao.entity.Todo;
import qm.dao.entity.User;
import qm.dao.mapper.TodoMapper;
import qm.dao.service.MpTodoService;
import qm.service.ITodoService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*******************************************************************
 * <pre></pre>
 * @文件名称： TodoResource.java
 * @包 路  径： qm.controller
 * @Copyright：wy (C) 2024 *
 * @Description:
 * @Version: V1.0
 * @Author： wy
 * @Date： 2024/8/26 23:13
 * @Modify：
 */
@Path("/todos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TodoResource {

    private static final ExecutorService executor = Executors.newFixedThreadPool(10);

    @Inject
    TodoMapper todoMapper;

    @Inject
    MpTodoService mpTodoService;


    @Inject
    ITodoService iTodoService;

    @GET
    @Path("/list/{page}/{size}")
    public Page<Todo> getTodoPageList(@PathParam("page") Integer page, @PathParam("size") Integer size){
        return todoMapper.selectPage(new Page<>(page, size), null);
    }

    @GET
    @Path("/list/m/{page}/{size}")
    public Page<Todo> getMTodoPageList(@PathParam("page") Integer page, @PathParam("size") Integer size){
        return mpTodoService.page(new Page<>(page, size), null);
    }

    @GET
    @Path("/list/i/{page}/{size}")
    public Page<Todo> getITodoPageList(@PathParam("page") Integer page, @PathParam("size") Integer size){
        return iTodoService.getTodoList(page, size);
    }

    @POST
    @Path("/add")
    @Counted(name = "addTodo", description = "How many times the addTodo method has been invoked")
    @RunOnVirtualThread
    public Todo add(Todo todo){
//        CompletableFuture.runAsync(() -> todoMapper.insert(todo), executor);
        todoMapper.insert(todo);
        return todo;
    }





}
