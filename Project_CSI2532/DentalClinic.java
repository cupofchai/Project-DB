import java.sql.*;
import java.util.*;
import java.io.*;

public class DentalClinic{
	public static void main(String[] args) {
		DBfunctions db=new DBfunctions();
        Connection conn=db.connect_to_db("caitj090","caitj090","Slytherin18");
        db.createTable(conn, "Patient");
        db.insert_row(conn,"Patient","bubu", "123");
        db.search_by_name(conn, "Patient","bubu");

	}
}
