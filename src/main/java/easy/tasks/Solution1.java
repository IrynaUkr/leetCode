package easy.tasks;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Solution1 {
//    public static void main(String[] args) {
//        String json = "{\"page\":1,\"per_page\":10,\"total\":1,\"total_pages\":1,\"data\":[{\"name\":\"Afghanistan\",\"nativeName\":\"افغانستان\",\"topLevelDomain\":[\".af\"],\"alpha2Code\":\"AF\",\"numericCode\":\"004\",\"alpha3Code\":\"AFG\",\"currencies\":[\"AFN\"],\"callingCodes\":[],\"capital\":\"Kabul\",\"altSpellings\":[\"AF\",\"Afġānistān\"],\"relevance\":\"0\",\"region\":\"Asia\",\"subregion\":\"Southern Asia\",\"language\":[\"Pashto\",\"Dari\"],\"languages\":[\"ps\",\"uz\",\"tk\"],\"translations\":{\"de\":\"Afghanistan\",\"es\":\"Afganistán\",\"fr\":\"Afghanistan\",\"it\":\"Afghanistan\",\"ja\":\"アフガニスタン\",\"nl\":\"Afghanistan\",\"hr\":\"Afganistan\"},\"population\":26023100,\"latlng\":[33,65],\"demonym\":\"Afghan\",\"borders\":[\"IRN\",\"PAK\",\"TKM\",\"UZB\",\"TJK\",\"CHN\"],\"area\":652230,\"gini\":27.8,\"timezones\":[\"UTC+04:30\"]}]}";
//
//        System.out.println(extract(json));
//        URLEncoder.encode(param1, charset);
//        URLConnection con = new URL(url + "?" + query).openConnection();
//
//
//    }

    private static String extract(String json) {
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
        URL url = new URL("https://jsonmock.hackerrank.com/api/countries");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes("name="+country);
        out.flush();
        out.close();
        con.setRequestProperty("Content-Type", "application/json");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        return extract(content.toString());

    }


}
