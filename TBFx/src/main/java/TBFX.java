import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TBFX {

    public String getForex() throws IOException {
        //https://rate.bot.com.tw/xrt/flcsv/0/day 當天連結
        //https://rate.bot.com.tw/xrt/flcsv/0/2022-01-22 歷史連結

        String line, ussell, usbuy, usFX;

        URL forexURL = new URL("https://rate.bot.com.tw/xrt/flcsv/0/day");
        BufferedReader in = new BufferedReader(new InputStreamReader(forexURL.openStream()));


        List<List<String>> records = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        while ((line = in.readLine()) !=null){
//            System.out.println(line);
            String[] values = line.split(",");
            records.add(Arrays.asList(values));

        }

//        for(List<String> record : records){
//            System.out.println(record);
//        }

        usbuy = "買進" + records.get(1).get(0) + " " + records.get(1).get(2);
        ussell = "賣出" + records.get(1).get(0) + " " + records.get(1).get(12);
//        System.out.println(records.get(0).indexOf("現金"));
//        System.out.println(ussell);

        usFX = usbuy + "    " + ussell;
        System.out.println(usFX);

    return usFX;
    }


}
