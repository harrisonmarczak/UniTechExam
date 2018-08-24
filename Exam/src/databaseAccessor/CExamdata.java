package databaseAccessor;

public class CExamdata 
{
	private int mIDSession;
	private int mIDCompany;
	private int mIDService;
	private int mStatus;
	private int mPart1ID;
	private int mPart2ID;
	private String mTime1;
	private String mTime1b;
	private String mTime2;
	private String mTime2b;
	private int mType1ID;
	private String mType2Name;
	private String mType2ID;
	private String mAddress1;
	private String mLocation1;
	private String mNotes;
	private String mData1;
	
	public CExamdata(int pIDSession, int pIDCompany, int pIDService, int pStatus, int pPart1ID, int pPart2ID, 
			String pTime1, String pTime1b, String pTime2, String pTime2b, int pType1ID, String pType2Name, String pType2ID,
			String pAddress1, String pLocation1, String pNotes, String pData1)
	{
		this.mIDSession = pIDSession;
		this.mIDCompany = pIDCompany;
		this.mIDService = pIDService;
		this.mStatus = pStatus;
		this.mPart1ID = pPart1ID;
		this.mPart2ID = pPart2ID;
		this.mTime1 = pTime1;
		this.mTime1b = pTime1b;
		this.mTime2 = pTime2;
		this.mType2Name = pType2Name;
		this.mTime2b = pType2ID;
		this.mAddress1 = pAddress1;
		this.mLocation1 = pLocation1;
		this.mNotes = pNotes;
		this.mData1 = pData1;
	}
	
	public String ToString()
	{
		return this.mLocation1;
	}
	
	public String ToJSON()
	{
		return "";
	}
}
