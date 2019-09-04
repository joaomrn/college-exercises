
package com.searchengine.app.model.service;

import com.searchengine.app.model.MyDocument;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author guilherme
 */
public class CollectorService {
 
    public MyDocument start() {
        URL url;
        MyDocument d = new MyDocument();
        
        try {
            url = new URL("http://journals.ecs.soton.ac.uk/java/tutorial/networking/urls/readingWriting.html");
            Document doc = Jsoup.connect (url.toString ()).get ();
            Elements links = doc.select ("a[href]");
        
            d.setUrl (url);
            d.setText (doc.html ());
            d.setView (doc.text ());

            List<String> urls = new LinkedList ();

            for (Element link : links)
                if ((! link.attr("abs:href").equals ("") && (link.attr("abs:href") != null)))
                    urls.add (link.attr("abs:href"));        
            d.setUrls (urls);

            System.out.println
            ("\n\n\n=================================================");
            System.out.println (">>> URL:");
            System.out.println ("=================================================");
            System.out.println (d.getUrl ());

            System.out.println
            ("\n\n\n=================================================");
            System.out.println (">>> Página:");
            System.out.println ("=================================================");
            System.out.println (d.getText ());

            System.out.println
            ("\n\n\n=================================================");
            System.out.println (">>> Visão:");
            System.out.println ("=================================================");
            System.out.println (d.getView ());
            System.out.println
            ("\n\n\n=================================================");
            System.out.println (">>> URLs:");
            System.out.println ("=================================================");
            
            urls = d.getUrls ();
            
            for (String u: urls)
                System.out.println (u);
        } catch (Exception e) {
            System.out.println ("Erro ao coletar a página.");
            e.printStackTrace ();
        }
        return d;
    }    
    
}
