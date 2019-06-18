package com.talent.login;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;

 
public class AppUserMapper implements RowMapper<AppUser> {
 
    public static final String BASE_SQL //
            = "Select u.User_Id, u.User_Name, u.Encryted_Password From App_User u ";
 
    @Override
    public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {
 
        Long userId = rs.getLong("USER_ID");
        String userName = rs.getString("USER_NAME");
        String encrytedPassword = rs.getString("ENCRYTED_PASSWORD");
 
        return new AppUser(userId, userName, encrytedPassword);
    }
 
}
