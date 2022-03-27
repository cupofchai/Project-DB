import java.sql.*;
import java.util.*;
import java.io.*;

public class DentalClinic{
	public static void main(String[] args) {
		DBfunctions db=new DBfunctions();
        Connection conn=db.connect_to_db("XXXXX","XXXXXX","XXXXXX");
        db.createTable(conn, "Patient");
        db.insert_row(conn,"Patient","Tay", "123");
        db.search_by_name(conn, "Patient","Tay");

	}
}
