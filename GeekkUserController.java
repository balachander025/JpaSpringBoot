import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeekUserController {
    @Autowired private GeekUserService userService;

    @RequestMapping("/")
    public List<GeekUserRecord> getAllUser()
    {
        return userService.getAllGeekUser();
    }
    @RequestMapping(value="/add-geekuser",method= RequestMethod.POST)
    public void

    addUser(@RequestBody GeekUserRecord userRecord)
    {
        userService.addGeekUser(userRecord);
    }


}
