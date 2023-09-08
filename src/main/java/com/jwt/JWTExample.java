package com.jwt;

import java.util.Base64;

public class JWTExample {
    public static void main(String[] args) {
        decodeJWT();
    }

    public static void decodeJWT(){
        //String jwtToken = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0Iiwicm9sZXMiOiJST0xFX0FETUlOIiwiaXNzIjoibXlzZWxmIiwiZXhwIjoxNDcxMDg2MzgxfQ.1EI2haSz9aMsHjFUXNVz2Z4mtC0nMdZo6bo3-x-aRpw";
        String jwtToken ="eyJraWQiOiIwNWU0ZjJkOS05MDY4LTQ5MGYtYTBmYy1jMTg4Y2NlODY5ZDciLCJhbGciOiJSUzI1NiJ9.eyJqdGkiOiI3bldpamZxY1llZlk5el9KZ2pfOF9kRURhMFV2YkQxRDJTMngiLCJpc3MiOiJodHRwczovL2FwaS1wcGUudGVzY28uY29tL2lkZW50aXR5L3Y0L2lzc3VlLXRva2VuIiwic3ViIjoiNzUxZjRhOWQtYjgwYi00ZGZjLWE3OTYtODA4YWQ4YTk4YTY2IiwiaWF0IjoxNjg2NjMxMjI1LCJuYmYiOjE2ODY2MzEyMjUsImV4cCI6MTY4NjYzNDgyNSwic2NvcGUiOiJpbnRlcm5hbCBwdWJsaWMiLCJjb25maWRlbmNlX2xldmVsIjoxMiwiY2xpZW50X2lkIjoiZTNhMGJlMWItZDVmYy00NTI1LWFmZjctZjU1MjI3YjU4N2Y3IiwidG9rZW5fdHlwZSI6ImJlYXJlciIsInNpZCI6IjAxSDJTR1c2SjBYSlRKWU1GMTlSWjRRU0RHLWQ1YWIzM2ZkLWZlOTItNDQ5OS1iN2Q4LWRkYjA5MjQ5ODRkNi1VcE9BeFB2d2JSMERhUF91clZORXdQUzJoUktGT2ZFNUJ3SDUifQ.fV9QsLzuzwUv7OlVS_dzjWptEkeHYB1yLSRDk6u6dBHcUngp6OK-fcxUrW6m-tQXk5Mrbl6xJTwJyRSjDlIcZZoEMYi3IrHt0oTfI8KJMeQGdvg7Rw-WPkmKVo_6nuxjrEZW5xoZGpLY5iPpw8Kb7yPAhPUWsL2sigFp65IM-0bi9ZBU1PTHeeVGeEnuBwnRlNg-1PV65pTdjRpAmnWqzsvdeBygyydJKGVv0kILfyWMtf62lLWqyz795jbU0TOCBU24OmyIjinUJLLdk1_GisiCiZv3qKhBg-LdvI8SSJ9Y8ARcwb_xeldOYVjirh4W1_gUMEijf_oX0ZvBtq6HSw";

        System.out.println("------------ Decode JWT ------------");
        String[] split_string = jwtToken.split("\\.");
        String base64EncodedHeader = split_string[0];
        String base64EncodedBody = split_string[1];
        String base64EncodedSignature = split_string[2];

        System.out.println("~~~~~~~~~ JWT Header ~~~~~~~");
        Base64.Decoder decoder = Base64.getDecoder();
        String header = new String(decoder.decode(base64EncodedHeader));
        System.out.println("JWT Header : " + header);


        System.out.println("~~~~~~~~~ JWT Body ~~~~~~~");
        String body = new String(decoder.decode(base64EncodedBody));
        System.out.println("JWT Body : "+body);
    }
}
