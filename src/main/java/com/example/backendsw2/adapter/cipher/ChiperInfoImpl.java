package com.example.backendsw2.adapter.cipher;
import com.example.backendsw2.usecase.port.CipherInfo;
import org.apache.commons.codec.digest.DigestUtils;


public class ChiperInfoImpl implements CipherInfo {
    @Override
    public String encrypt(String text) {
        return DigestUtils.sha256Hex(text);
    }
}
