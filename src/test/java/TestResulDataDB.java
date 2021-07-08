import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.entity.User;
import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.utis.ConnectionUtil;
import org.junit.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestResulDataDB {
    @Test
    public void testDataFromDB(){
        User user = new User();
        try {
            PreparedStatement preparedStatement = ConnectionUtil.getConnection().
                    prepareStatement("SELECT * FROM users");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("login"));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
