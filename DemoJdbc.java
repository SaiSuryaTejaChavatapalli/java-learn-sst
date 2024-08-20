import java.sql.*; //import

public class DemoJdbc {
    public static void main(String[] args) throws  Exception{
        /*    import the package
              load and register
              create connection
              create statement
              execute statement
              process the results
              close

        */


        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="1234";
        String query="select * from student";
        String insertQuery="insert into student values (5,'Harshi',66)";
        String updateQuery="update student set sname='Max' where sid=5";
        String deleteQuery="delete from student where sid=5";
        // Load and register
        Class.forName("org.postgresql.Driver"); // Optional
        Connection con=DriverManager.getConnection(url,uname,pass); // Creating connection
        System.out.println("Connection establsihed");
      //  Statement st=con.createStatement(); // Create Statement
       // ResultSet rs=st.executeQuery(query); // Execute statement
//        System.out.println(rs.next());
//        String name=rs.getString("sname");
//        System.out.println("Name of the student is:"+name);
//        while (rs.next()){
//            System.out.print(rs.getInt(1)+" - ");
//            System.out.print(rs.getString(2)+" - ");
//            System.out.print(rs.getInt(3));
//            System.out.println( );
//        }

    //INSERT:
//       boolean inserStatus= st.execute(insertQuery);
//        System.out.println("InsertStatus:"+inserStatus);



        //UPDATE:
//        st.execute(updateQuery);

        //DELETE:

//        st.execute(deleteQuery);

        // PREPARED STATEMENT:
        int sid=101;
        String sname="Prepared";
        int marks=99;
        String preparedQuery="insert into student values(?,?,?)";
        PreparedStatement st=con.prepareStatement(preparedQuery);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);
        st.execute();
        con.close();
        System.out.println("Connection closed");
    }
}
