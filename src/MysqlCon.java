import java.sql.*;
public class MysqlCon {
   
        private Connection con;
        private Statement st;
        private ResultSet rs;
        
        public MysqlCon(){
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/IDCARD","root","");
            st = con.createStatement();
            
            }catch(Exception ex){
                System.out.println("Error: " + ex);
            }
        }
         public void insertData(){
             String query = "insert into idcard_details()";
                
            }

}
