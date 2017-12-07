package pe.gob.inei.encuestahabilidades.pojos;

import android.content.ContentValues;

import pe.gob.inei.encuestahabilidades.modelo.SQLConstantes;

/**
 * Created by jlavado on 10/08/2017.
 */

public class Control2 {
    private String CONTROL_ID;




    public Control2(){
        CONTROL_ID = "";

    }



    public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(54);

        return contentValues;

    }


}
