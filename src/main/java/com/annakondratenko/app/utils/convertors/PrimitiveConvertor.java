package com.annakondratenko.app.utils.convertors;

/**
 * Created by annak on 21.01.2017.
 */

public class PrimitiveConvertor {
    public char floatToChar(float fVar){
        char cVar = (char) fVar;
        System.out.println("Input float value is " + fVar + ". Output char value is " + cVar);
        return cVar;
    }

    public char intToChar (int iVar){
        char cVar2 = (char) iVar;
        System.out.println("Input int value is " + iVar + ". Output char value is " + cVar2);
        return cVar2;
    }

    public int charToInt(char cVar3){
        int iVar2 = (int)cVar3;
        System.out.println("Input char value is " + cVar3 + ". Output int value is " + iVar2);
        return iVar2;
    }

}
