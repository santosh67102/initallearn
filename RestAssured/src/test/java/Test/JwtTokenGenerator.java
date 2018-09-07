package Test;
import com.fmr.eca.greenfield.common.jsonwebtoken.JWTGeneratorUtils;
import com.fmr.eca.greenfield.common.jsonwebtoken.TokenPojo;


public class JwtTokenGenerator{

	public static void main(String[] args) {
		
		TokenPojo t=new TokenPojo();
		t.setRequestorId("010323383");//9 digit requestor id
		t.setExpirationTime(300000L);//expiration time in ms
		String jwtToken = JWTGeneratorUtils.generateJWT(t, "sit");
		System.out.println(jwtToken);
				
	}

}
