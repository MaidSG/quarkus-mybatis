package qm.resource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import qm.entity.User;
import qm.mapper.UserMapper;

/*******************************************************************
 * <pre></pre>
 * @文件名称： MyBatisResrouce.java
 * @包 路  径： qm.resource
 * @Copyright：wy (C) 2024 *
 * @Description:
 * @Version: V1.0
 * @Author： wy
 * @Date： 2024/8/21 10:05
 * @Modify：
 */
@Path("/mybatis")
public class MyBatisResource {

    @Inject
    UserMapper userMapper;

    @Path("/user/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("id") Integer id) {
        return userMapper.selectById(id);
    }

    @Path("/user")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Integer createUser(@FormParam("id") Integer id, @FormParam("name") String name) {
        return userMapper.insert(new User(id, name));
    }

    @Path("/user/{id}")
    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public Integer removeUser(@PathParam("id") Integer id) {
        return userMapper.deleteById(id);
    }

    @Path("/user/page/{page}/{size}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Page<User> getUserPage(@PathParam("page") Integer page, @PathParam("size") Integer size) {
        return userMapper.selectPage(new Page<>(page, size), null);
    }

}
