import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ServerController {

    @Autowired
    private ServerRepository repository;

    @GetMapping("/servers")
    public List<Server> getAllServers(@RequestParam(required = false) String name) {
        if (name != null)
            return repository.findByNameContaining(name);
        return repository.findAll();
    }
    
    @PutMapping("/servers")
    public Server putServer(@RequestBody Server server) {
        return repository.save(server);
    }
    
    @DeleteMapping("/servers/{id}")
    public void deleteServer(@PathVariable String id) {
        repository.deleteById(id);
    }

    @GetMapping("/servers/{id}")
    public Server getServer(@PathVariable String id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Server not found"));
    }
}
