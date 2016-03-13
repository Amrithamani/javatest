import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebAssert;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;


public class SimpleTest {
		
	public static void main(String[] args) {
		try{
			WebClient myweb = new WebClient();
			HtmlPage mypage = myweb.getPage("http://resume.amrithamani.com/");
			WebAssert.assertTitleEquals(mypage,"Amritha Mani");
			WebAssert.assertTextPresent(mypage,"development");
			WebAssert.assertTextPresentInElement(mypage,"development","wrapper");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
