package easy.tasks;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;


class Result {

    /*
     * Complete the 'getPhoneNumbers' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING country
     *  2. STRING phoneNumber
     * API URL: https://jsonmock.hackerrank.com/api/countries?name=<country>
     */
    public static String extract(String json) {
        String notFound = "-1";
        int index = json.indexOf("callingCodes");
        if (index == -1) {
            return notFound;
        }
        String callingCodesRaw = json.substring(index + 15, json.length());
        String codesWithQuotes = callingCodesRaw.substring(0, callingCodesRaw.indexOf("]"));
        String replaced = codesWithQuotes.replaceAll("\"", "");
        String[] codes = replaced.split(",");
        if (codes.length > 0) {
            String result = codes[codes.length - 1];
            return result == "" ? notFound : result;
        }
        return notFound;
    }


    public static String getPhoneNumbers(String country, String phoneNumber) throws IOException {
        String url = "https://jsonmock.hackerrank.com/api/countries";
        String charset = "UTF-8";
        String param = "name";
        String query = String.format(param + "=%s", URLEncoder.encode(country, charset));

        URLConnection con = new URL(url + "?" + query).openConnection();
        con.setRequestProperty("Accept-Charset", charset);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();
        String result = extract(content.toString());
        return result == "-1" ? result : "+" + result + " " + phoneNumber;
    }


    public class HttpReturnToTechAssesment {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String country = bufferedReader.readLine();

            String phoneNumber = bufferedReader.readLine();

            String result = Result.getPhoneNumbers(country, phoneNumber);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
