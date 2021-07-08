import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.dao.UserDaoImpl;
import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.entity.User;
import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.utis.ConnectionUtil;
import org.junit.Before;
import org.junit.Test;

public class TestConnection {
    @Before
    public void getCon(){

    }
    @Test
    public void testCon(){
        ConnectionUtil.getConnection();
        System.out.println("ok");
    }
}
