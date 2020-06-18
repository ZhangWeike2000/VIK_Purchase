package csxt.jyx.controller;

import csxt.entity.DFile;
import csxt.jyx.service.DFileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DFile)表控制层
 *
 * @author makejava
 * @since 2020-06-18 10:28:11
 */
@RestController
@CrossOrigin
@RequestMapping("dFile")
public class DFileController {
    /**
     * 服务对象
     */
    @Resource
    private DFileService dFileService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public DFile selectOne(@PathVariable("id") String id) {
        return this.dFileService.queryById(id);
    }

}