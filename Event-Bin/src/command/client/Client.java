package command.client;
import command.entity.Command;
import command.invoker.Invoker;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import  org.yaml.snakeyaml.Yaml;
public class Client {
    public void createComment(){
        Command command = new Command();
        this.setReceiver(command);
    }
    public void setReceiver(Command command){
        Map<String, Object> configInformation = this.getConfigFiles();
        ArrayList<String> receiverList = (ArrayList<String>) configInformation.getOrDefault("receiver",new ArrayList<String>());
        command.setReceiver(receiverList);
        Invoker invoker = new Invoker(command);
    }
    private  Map<String,Object>  getConfigFiles()   {
        try {
            Yaml yaml = new Yaml();
            InputStream inputStream = new FileInputStream("./src/config/commandconfig.yml");
            Map<String, Object> configInformation = yaml.load(inputStream);
            return configInformation;
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    @Test
    public void unTest()   {
        this.getConfigFiles();
    }
}
