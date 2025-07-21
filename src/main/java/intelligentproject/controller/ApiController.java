package intelligentproject.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "service", "intelligent-project");
    }

    @GetMapping("/info")
    public Map<String, Object> info() {
        return Map.of(
            "name", "intelligent-project",
            "version", "1.0.0",
            "description", "Create a nodejs for user management with PostgreSQL database, JWT authentication, JUnit testing, Docker containerization, and Kubernetes deployment",
            "owner", "backstage-user"
        );
    }
}