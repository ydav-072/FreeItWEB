import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.utis.ResourceUtil;
import org.junit.Test;

public class TestResurce {
    @Test
    public void getRes(){
        ResourceUtil resourceUtil = new ResourceUtil();
        System.out.println(resourceUtil.getDb_uri());
    }
}
