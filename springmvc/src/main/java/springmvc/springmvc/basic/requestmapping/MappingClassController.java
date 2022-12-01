package springmvc.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {
    /** /mapping
     * 회원 목록 조회 :   GET     "/users"
     * 회원 등록 :      POST    "/users"
     * 회원 조회 :      GET     "/users/{userId}"
     * 회원 수정 :      PATCH   "/users/{userId}"
     * 회원 삭제 :      DELETE  "/users/{userId}"
     */
    // http://localhost:8080/mapping/users
    // http://localhost:8080/mapping/users/userA

    @GetMapping
    public String user() { // 멤버 전체 조회
        return "get users";
    }

    @PostMapping
    public String addUser() { // 추가
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) { // 특정 회원 조회
        return "get userId = " + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "patch userId = " + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId = " + userId;
    }
}
