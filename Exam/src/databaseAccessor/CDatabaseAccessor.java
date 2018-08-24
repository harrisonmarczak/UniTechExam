package databaseAccessor;

import java.util.*;

import javax.naming.*;
import javax.sql.DataSource;
//import javax.json;

import java.sql.*;

public class CDatabaseAccessor 
{
	private final String mInitialContextString = "java:/examdata";
	private final String mConnectionUser = "root";
	private final String mConnectionPassword = "admin";
	
	private static DataSource mDataSource;
	private static Connection mAccessor;
	
	public boolean GetAccessor()
	{
		try
		{
			InitialContext initialContext = new InitialContext(); 
			CDatabaseAccessor.mDataSource = (DataSource)initialContext.lookup(this.mInitialContextString);
			CDatabaseAccessor.mAccessor = CDatabaseAccessor.mDataSource.getConnection(this.mConnectionUser, this.mConnectionPassword);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public String GetDataByPartID2(int pPartID2) throws SQLException
	{
		assert pPartID2 >= 0;
		
		PreparedStatement sql = CDatabaseAccessor.mAccessor.prepareStatement("SELECT * FROM examdata");
		ResultSet sqlResult = sql.executeQuery();
		
		List<CExamdata> examdataCollection = new ArrayList<CExamdata>();
		
		while(sqlResult.next())
		{
			CExamdata examdataResult = new CExamdata(sqlResult.getInt("idsession"),
														sqlResult.getInt("idcompany"),
														sqlResult.getInt("idservice"),
														sqlResult.getInt("status"),
														sqlResult.getInt("part1id"),
														sqlResult.getInt("part2id"),
														sqlResult.getString("time1"),
														sqlResult.getString("time1b"),
														sqlResult.getString("time2"),
														sqlResult.getString("time2b"),
														sqlResult.getInt("type1id"),
														sqlResult.getString("type2name"),
														sqlResult.getString("type2id"),
														sqlResult.getString("address1"),
														sqlResult.getString("location1"),
														sqlResult.getString("notes"),
														sqlResult.getString("data1")
														);
			
			examdataCollection.add(examdataResult);
		}
		
		int examCollectionCount = examdataCollection.size();
		String jsonResult = "";
		
		for (int i = 0; i < examCollectionCount; i++)
			jsonResult += (examdataCollection.get(i) + "\n");
		
		sql.close();
		sqlResult.close();
		
		return jsonResult;
	}
}
