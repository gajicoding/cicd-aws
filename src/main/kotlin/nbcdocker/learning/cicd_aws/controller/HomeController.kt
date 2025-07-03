package nbcdocker.learning.cicd_aws.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(
    @Value("\${DB_USERNAME}") private val username: String,
) {

    @GetMapping("/")
    fun home(): String {
        return "home-aws $username"
    }

    @GetMapping("/healthz")
    fun healthz(): String {
        return "healthz-aws"
    }
}
