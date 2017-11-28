package pe.gob.inei.encuestahabilidades.parser;

import android.content.Context;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import pe.gob.inei.encuestahabilidades.pojos.Marco;
import pe.gob.inei.encuestahabilidades.pojos.Ubigeo;

/**
 * Created by otin016 on 28/08/2017.
 */

public class UbigeoPullParser {
    private static final String UBI_ID = "ID";
    private static final String UBI_ID_UBI = "ID_UBI";
    private static final String UBI_DISTRITO = "DISTRITO";

    private Ubigeo currentUbigeo = null;
    private String currentTag = null;
    ArrayList<Ubigeo> ubigeos = new ArrayList<Ubigeo>();

    public ArrayList<Ubigeo> parseXML(Context context){
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser xpp = factory.newPullParser();

            try {
                InputStream stream = context.getAssets().open("ubigeo.xml");
                xpp.setInput(stream,null);

                int eventType = xpp.getEventType();

                while(eventType != XmlPullParser.END_DOCUMENT){
                    if(eventType == XmlPullParser.START_TAG){
                        handleStarTag(xpp.getName());
                    }else if(eventType == XmlPullParser.END_TAG){
                        currentTag = null;
                    }else if(eventType == XmlPullParser.TEXT){
                        handleText(xpp.getText());
                    }
                    eventType = xpp.next();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        return ubigeos;
    }

    private void handleText(String text) {
        String xmlText = text;
        if(currentUbigeo!= null && currentTag != null){
            switch (currentTag){
                case UBI_ID: currentUbigeo.setID(xmlText);break;
                case UBI_ID_UBI: currentUbigeo.setID_UBI(xmlText);break;
                case UBI_DISTRITO: currentUbigeo.setDISTRITO(xmlText);break;
            }
        }
    }

    private void handleStarTag(String name) {
        if(name.equals("UBIGEO")){
            currentUbigeo = new Ubigeo();
            ubigeos.add(currentUbigeo);
        }else{
            currentTag = name;
        }
    }
}
