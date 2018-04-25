package LeetCode;

public class StudentAttendanceRecordEasy 
{
	public boolean checkRecord(String s) 
    {
        int a_count = 0;
        char[] c = s.toCharArray();
        int i=0;
        while (i<c.length)
        {
            if (c[i]=='A')
            {
                a_count+=1;
                if (a_count > 1)
                    return false;
                i+=1;
            }
            else if (c[i]=='L')
            {
                int l_count=1;
                i+=1;
                while (i<c.length && c[i]=='L')
                {
                    l_count+=1;
                    if (l_count > 2)
                        return false;
                    i+=1;
                }
            }
            else
                i+=1;
        }
        return true;
    }
}
