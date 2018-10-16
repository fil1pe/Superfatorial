import superfatorial.*;
import java.math.BigInteger;
import junit.framework.TestCase;

public class TestesUnitarios extends TestCase {
    public void testSuperFatorial(SuperFatorial sf) throws InputException {
        BigInteger valorATestar;
        boolean ok;
        
        try{
            sf.getSuperFatorial(-1);
            ok = false;
        }catch(InputException e){
            ok = true;
        }
        assertTrue(ok);
        
        valorATestar = sf.getSuperFatorial(0);
        ok = valorATestar.equals(BigInteger.ONE);
        assertTrue(ok);
        
        valorATestar = sf.getSuperFatorial(1);
        ok = valorATestar.equals(BigInteger.ONE);
        assertTrue(ok);
        
        valorATestar = sf.getSuperFatorial(10);
        ok = valorATestar.equals(new BigInteger("6658606584104736522240000000"));
        assertTrue(ok);
        
        valorATestar = sf.getSuperFatorial(30);
        ok = valorATestar.equals(new BigInteger("57175569823282309673298891912264119180169338781118332321743291765076321254008144131396872292078960659959192198325482132911362592729947392123616011917207641789593790073387400532018296722819386985076346340934659795268591139042209969034895073212504395046756930539546289465059561315582970257772481700025401546634100853798576981016576000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
        assertTrue(ok);
    }
    
    public void testSuperFatorial() throws InputException {
        testSuperFatorial( new SuperFatorial() );
    }
    
    public void testSuperFatorialCached() throws InputException {
        testSuperFatorial( new SuperFatorialCached() );
    }
    
    public void testSuperFatorialFile() throws InputException {
        testSuperFatorial( new SuperFatorialFile() );
    }
}
