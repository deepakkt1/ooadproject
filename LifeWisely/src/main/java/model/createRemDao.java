package model;
import spring.controllers.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.core.JdbcTemplate;
public class createRemDao extends CreateRem {
        private DataSource dataSource;

        public void setDataSource(DataSource ds) {
                dataSource = ds;
        }

        public void create(CreateRem obj) {
                JdbcTemplate insert = new JdbcTemplate(dataSource);
                insert.update("INSERT INTO Reminder (owner,name,category,frequency,notifmode,starttime,endtime,rewardpoints,iscompleted,title) VALUES(?,?,?,?,?,?,?,?,false,?)",
                                new Object[] { obj.getOwner(), obj.getName(),obj.getCategory(),obj.getFrequency(),obj.getNotifMode(),obj.getStartTime(),obj.getEndTime(),obj.getRewardPoints(),obj.getTitle() });
        }
        
        public int createAndGetId(final CreateRem obj) {
        	final String sql="INSERT INTO Reminder (owner,name,category,frequency,notifmode,starttime,endtime,rewardpoints,iscompleted,title) VALUES(?,?,?,?,?,?,?,?,false,?)";
        	KeyHolder keyHolder = new GeneratedKeyHolder();
        	JdbcTemplate jdbc=new JdbcTemplate(dataSource);
        	
        	jdbc.update(
        		 new PreparedStatementCreator(){   
                     public PreparedStatement createPreparedStatement(Connection conn) throws SQLException{   
                         int i = 0;   
                         java.sql.PreparedStatement ps = conn.prepareStatement(sql);    
                         ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);   
                         ps.setString(++i, obj.getOwner());   
                         ps.setString(++i,obj.getCategory());   
                         ps.setString(++i, obj.getFrequency());
                         ps.setString(++i, obj.getNotifMode());
                         ps.setString(++i, obj.getStartTime());
                         ps.setString(++i, obj.getEndTime());
                         ps.setInt(++i, obj.getRewardPoints());
                         ps.setInt(++i, obj.getisCompleted());
                         ps.setString(++i, obj.getTitle());
                         return ps;   
                     }  
        	 }, keyHolder);
        	return keyHolder.getKey().intValue();   
        }
        
        public void update(CreateRem obj) {
            JdbcTemplate insert = new JdbcTemplate(dataSource);
            insert.update("UPDATE Reminder set frequency = ? ,notifmode = ?,starttime = ?,endtime =?,rewardpoints=?,iscompleted=? WHERE id = ?",
                            new Object[] { obj.getFrequency(),obj.getNotifMode(),obj.getStartTime(),obj.getEndTime(),obj.getRewardPoints(),obj.getisCompleted(),obj.getID() });
    }
        public List<CreateRem> selectAll(String username) {
            JdbcTemplate select = new JdbcTemplate(dataSource);
            return select.query("select owner,name,category,frequency,notifmode,starttime,endtime,rewardpoints,iscompleted,id,title from Reminder where owner='"+username+"' and iscompleted='0'",
                            new CreateRemRowMapper());
        }
        public List<CreateRem> select(String username, int reminderId){
        	CreateRem userExists = new CreateRem();
    		JdbcTemplate select= new JdbcTemplate(dataSource);
    		 return select.query("select owner,name,category,frequency,notifmode,starttime,endtime,rewardpoints,iscompleted,id,title from Reminder where owner='"+username+"' and id='"+reminderId+"' and iscompleted='0'",
                     new CreateRemRowMapper());
    		       
 }
        public void delete(String username, int reminderId){
        	JdbcTemplate select= new JdbcTemplate(dataSource);
    		 select.update("DELETE from Reminder where owner='"+username+"' and id='"+reminderId+"'");
    		       
 }        
}

/*
		   public List<Person> selectAll() {
    JdbcTemplate select = new JdbcTemplate(dataSource);
    return select.query("select FIRSTNAME, LASTNAME from PERSON",
                    new PersonRowMapper());
}

public void deleteAll() {
    JdbcTemplate delete = new JdbcTemplate(dataSource);
    delete.update("DELETE from PERSON");
}

public void delete(String firstName, String lastName) {
    JdbcTemplate delete = new JdbcTemplate(dataSource);
    delete.update("DELETE from PERSON where FIRSTNAME= ? AND LASTNAME = ?",
                    new Object[] { firstName, lastName });
}
*/
