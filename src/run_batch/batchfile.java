package run_batch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class batchfile {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder(System.getProperty("user.dir")+ "/run.bat");
		Process process =pb.start();
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		StringBuilder builder = new StringBuilder();
		String line;
		while((line = reader.readLine()) != null)
		{
			builder.append(line + "\n");
		}
		System.out.println(builder);
	

	}

}
