package xiaozhi.modules.sys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

/**
 * 用户管理
 */
@AllArgsConstructor
@RestController
@RequestMapping("/sys/user")
@Tag(name = "用户管理")
public class SysUserController {

}